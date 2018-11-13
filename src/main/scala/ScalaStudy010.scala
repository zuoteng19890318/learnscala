object ScalaStudy010 {
  def main(args: Array[String]): Unit = {

    val helloWord = new HelloWord
    helloWord.sayHello()
    println(helloWord.getName)//如果定义方法时没有括号，调用旧不能家括号；如果有括号调用时有没有括号都行

    val leo = new Student1
    println(leo.name)
    leo.name = "leo1"
    println(leo.name)

    val leo2 = new Student2
    println(leo2.getName)
    leo2.name_=("jack")
    println(leo2.getName)

  }
}

/**
  * 定义一个简单的类
  */
class HelloWord{
  private var name = "leo"
  def sayHello(): Unit ={
    println("hello "+ name )
  }
  def getName() = name
}

class Student1{
  // 定义不带private的var field，此时scala生成的面向JVM的类时，会定义为private的name字段，并提供public的getter和setter方法
  // 而如果使用private修饰field，则生成的getter和setter也是private的
  // 如果定义val field，则只会生成getter方法
  // 如果不希望生成setter和getter方法，则将field声明为private[this]
  var name = "leo"
}
class Student2{
  // 如果只是希望拥有简单的getter和setter方法，那么就按照scala提供的语法规则，根据需求为field选择合适的修饰符就好：var、val、private、private[this]
  // 但是如果希望能够自己对getter与setter进行控制，则可以自定义getter与setter方法
  // 自定义setter方法的时候一定要注意scala的语法限制，签名、=、参数间不能有空格
  private var myName = "leo"
  def getName =myName
  def name_=(newValue:String): Unit ={
    myName=newValue
  }
}

