```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

object Main {
  implicit val intOrdering: Ordering[Int] = Ordering.Int
  implicit val stringOrdering: Ordering[String] = Ordering.String

  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    val result1 = myInt.myMethod
    println(s"Result 1: $result1")

    val myString = new MyClass("Hello")
    val result2 = myString.myMethod
    println(s"Result 2: $result2")
  }
}
```