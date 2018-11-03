import java.io.IOException

import io.Source._
object ScalaStudy006 {
  def main(args: Array[String]): Unit = {
    //过程 lazy值 异常
    //过程：在定义函数时如果函数体直接包裹在花括号里而没有使用=连接 则函数的返回类型时unit，这样的函数就称为过程
    println("sayHello1:"+sayHello1())//这是个函数
    println("sayHello2:"+sayHello2())
    println("sayHello3:"+sayHello3())

    //lazy:定义出来是不作处理的，只有当使用的时候才真正处理
    lazy val line = fromFile("/Users/kepler/Documents/src_event_log_test.log").mkString
    println(line)

    //异常：采用模式匹配的方式
    catchException()
    catchException2()

  }

  def sayHello1() = "hello world"
  def sayHello2(){
    println("hello world")
  }
  def sayHello3()={println("hello world")}

  def catchException(): Unit ={
    try {
      throw new IllegalArgumentException("IllegalArgumentException")
    }catch {
      case _:IllegalArgumentException=>println("error!")
    }finally {
      println("release resource")
    }
  }

  def catchException2(): Unit ={
    try {
      throw new IOException("IOException")
    }catch {
      case e1:IllegalArgumentException=>println("IllegalArgumentException!")
      case e2:IOException=>println("IOException!")
    }finally {
      println("release resource")
    }
  }
}
