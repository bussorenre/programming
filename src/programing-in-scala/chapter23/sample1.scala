case class Person(
  name: String,
  isMale: Boolean,
  children: Person*
)

val lara = Person("Lara", false)
val bob = Person("Bob", true)
val julie = Person("Julie", false, lara, bob)
val persons = List(lara, bob, julie)

// filter とmap で頑張る
persons filter( p => !p.isMale) flatMap(p => (p.children map (c => (p.name, c.name))))

// 同じことをfor でやる
for ( p <- persons; if !p.isMale; c <- p.children)
  yield (p.name, c.name)
