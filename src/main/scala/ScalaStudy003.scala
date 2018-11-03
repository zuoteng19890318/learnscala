object ScalaStudy003 {
  def main(args: Array[String]): Unit = {
    //函数入门
    var age = sayHello("mike",12)
    println(age)

    println("------------------------------")

    println(sum(100))
    println("------------------------------")
    println(fab(6))
  }

  //定义函数def
  def sayHello(name:String,age:Int) ={
    if(age>18){
      printf("hi %s,you are a big boy",name)
    }else{
      printf("hi %s,you are a child",name)
    }
    println()
    age
  }

  def sum(n:Int) = {
    var total = 0
    for(i<-1 to n){
      total += i
    }
    total
  }

  /**
    * 斐波那且数列，第几位上的数字是多少
    * @param index 从1开始
    * @return
    */
  def fab(index:Int):Int={
    if(index<=2)1
    else fab(index-1)+fab(index-2)
  }


}
