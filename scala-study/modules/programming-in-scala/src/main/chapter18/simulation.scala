abstract class Simulation {
  type Action = () => Unit
  case class WorkItem(time: Int, action: Action)

  private var current_time = 0
  def currentTime: Int = current_time

  private var agenda: List[WorkItem] = List()
  private def insert(ag: List[WorkItem], item: WorkItem): List[WorkItem] = {
    if(ag.isEmpty || item.time < ag.head.time) item :: ag
    else ag.head :: insert(ag.tail, item)
  }

  def afterDelay(delay: Int)(block: => Unit) = {
    val item = WorkItem(currentTime + delay, () => block)
    agenda = insert(agenda, item)
  }

  private def next() = {
    (agenda: @unchecked) match {
      case item :: rest =>
        agenda = rest
        current_time = item.time
        item.action()
    }
  }

  def run() = {
    afterDelay(0) {
      println("*** simluation started, time = " + currentTime + " ***")
    }
    while(!agenda.isEmpty) next()
  }
}

abstract class BasicCircuitSimulation extends Simulation {
  def inverterDelay: Int 
  def AndGateDelay: Int
  def OrGateDelay: Int

  class Wire {
    private var sigVal = false
    private var actions: List[Action] = List()
    def signal = sigVal
    def signal_= (s: Boolean) = {
      if (s != sigVal) {
        sigVal = s
        actions foreach (_ ())
      }
    }
    def addAction(a: Action) = {
      actions = a:: actions
      a()
    }
  }

  def inverter(input: Wire, output: Wire) = {
    def invertAction() = {
      val inputSig = input.signal
      afterDelay(inverterDelay) {
        output.signal = !inputSig
      }
    }
    input.addAction(invertAction)
  }
  def andGate(input1: Wire, input2: Wire, output: Wire) = {
    def andAction() = {
      val input1Sig = input1.signal
      val input2Sig = input2.signal
      afterDelay(AndGateDelay) {
        output.signal = input1Sig & input2Sig
      }
    }
    input1.addAction(andAction)
    input2.addAction(andAction)
  }
  def orGate(input1: Wire, input2: Wire, output: Wire) = {
    def orAction() = {
      val input1Sig = input1.signal
      val input2Sig = input2.signal
      afterDelay(AndGateDelay) {
        output.signal = input1Sig | input2Sig
      }
    }
    input1.addAction(orAction)
    input2.addAction(orAction)
  }

  // なんだこれは
  def probe(name: String, wire: Wire) = {
    def probeAction() = {
      println(name + " " + currentTime + " new-value = " + wire.signal)
    }
    wire.addAction(probeAction)
  }
}

abstract class CircuitSimulation extends BasicCircuitSimulation {
  def halfAdder(a: Wire, b: Wire, s: Wire, c: Wire) = {
    val d, e = new Wire
    orGate(a, b, d)
    andGate(a, b, c)
    inverter(c, e)
    andGate(d, e, s)
  }

  def fullAdder(a: Wire, b: Wire, cin: Wire, sum: Wire, cout: Wire) = {
    val s, c1, c2 = new Wire
    halfAdder(a, cin, s, c1)
    halfAdder(b, s, sum, c2)
    orGate(c1, c2, cout)
  }
}

object MySimulation extends CircuitSimulation {
  def inverterDelay = 1
  def AndGateDelay = 3
  def OrGateDelay = 4
}