
case class Employee(name: String, department: String)

def lookupByName(name: String): Option[Employee] = ???

def joeDepartment: Option[String] = lookupByName("joe").map(_.department)

def parseInsuranceRateQuote(
    age: String,
    numberOfSpeedingTickets: String): Option[Double] = {
        val optAge: Option[Int] = Try(age.toInt)
        val optTickets: Option[Int] = Try(numberOfSpeedingTickets.toInt)
    }
)

def Try[A](a: => A): Option[A] = try Some(a) catch{ case e: Exception => None}

