object ScalaStudy004 {
  def main(args: Array[String]): Unit = {
    //默认参数
    sayHello("leo")
    sayHello("leo",30)
    println("---------------------------------")

    //带名参数
    sayHello2("Tom",lastName = "Scott",middleName = "Micheal")


  }

  def sayHello(name:String,age:Int = 20): Unit ={
    println(name+" is "+age+" years old")
  }

  def sayHello2(firstName:String,middleName:String="william",lastName:String = "Croft"): Unit ={
    println("Hello "+firstName+" "+middleName+" "+lastName)
  }

}
