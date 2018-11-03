
object ScalaStudy001 {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    println("--------------------------------")
    println("hello".toUpperCase)
    println("--------------------------------")

    /**
      * 自动推断数据类型
      * var可变
      * val不可变
      * 基本数据类型
      * 类型的加强类型，比如：StringOps
      */

    println(1.to(10))
    println(1 to 10)
    println("--------------------------------")
    var count  = 1
    count += 1
    println(count)
    println("--------------------------------")

    println(scala.math.sqrt(2))
    println(scala.math.min(2,4))
    println("--------------------------------")

    /**
      * scala中object里可以声明apply函数，调用方式有两种：
      * 类名.apply() = 类名()
      */
    println("Hello World"(6))
    println("Hello World".apply(6))

    println(Array(1,2,3,4,5))
    println(Array.apply(1,2,3,4,5))



    println("--------------------------------")

  }
}
