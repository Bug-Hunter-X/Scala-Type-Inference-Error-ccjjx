```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main extends App {
  val intInstance = new MyClass(10)
  val stringInstance = new MyClass("Hello")

  intInstance.printValue() //Prints 10
  stringInstance.printValue() //Prints Hello

  val anyInstance = new MyClass[Any](10) // Correct compilation and runtime, type Any accepts all types
  anyInstance.printValue() // Prints 10

  val anyInstance2 = new MyClass[Any]("Hello") // Correct compilation and runtime, type Any accepts all types
  anyInstance2.printValue() // Prints Hello

  //val wrongInstance = new MyClass[Int]("Hello") // This line will not compile because the type parameter T is inferred as Int and "Hello" is a string
}
```