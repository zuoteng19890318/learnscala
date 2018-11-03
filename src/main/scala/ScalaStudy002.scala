import util.control.Breaks._
object ScalaStudy002 {
  def main(args: Array[String]): Unit = {
    /**
      * 条件控制与循环
      */
    //if表达式
    val age = 30
    println(if(age>18) 1 else 0)

    //表达式可以为变量赋值
    var isAdult = if(age>18) true else false
    println(isAdult)

    //当if表达式的返回值不是同一类型时，取公共父类型

    //if语句没有else时 else默认Unit类型
    println("--------------------------------")

    //语句终结符，一行只有一条语句时不用分号 多条语句时需要分号隔开
    var a,b,c = 0
    println(a,b,c)
    if(a<10){
      b=b+1;c=c+1
    }
    println(a,b,c)

    println("--------------------------------")
    //块表达式：{}中的值，当{}中有多条语句时最后一个语句的值就是块表达式的返回值
    //最后一句时赋值语句时无效
    var d = if(a<10){
      b=b+1
      c=c+1
      b+c
    }
    println(a,d)
    println("--------------------------------")
    //输入和输出
//    println("HELLO WORLD")
//    printf("hello,my name is %s,I am %d years old ","Leo",30)
//    println()
//
//    var input = readLine("input something:")
//    println(input)
//
//    var name = readLine("please tell me your name:")
//    printf("welcome ,%s,then please tell me your age:",name)
//    val age1 = readInt()
//    if(age1 <18){
//      printf("hi %s,you are %d years old,so you are illegal to come here",name,age1)
//    }else{
//      printf("hi %s,you are %d years old,so you are legal to come here",name,age1)
//    }
//    println()
//    println("--------------------------------")

    //循环
    var n = 10
    while (n>0){
      print(n+" ")
      n -= 1
    }
    println()
    n = 10
    for(i<-1 to n) print(i+" ")
    println()
    for(i<-1 until n) print(i+" ")
    println()
    for(c<-"hello world")print(c+" ")
    println()


    n = 10
    breakable{
      for(c<-"helloyouandme"){
        print(c)
        if(n==5)break
        n-=1
      }
    }
    println()

    n = 10
    for(c<-"helloyouandme"){
      breakable{
        if(n==5)break
        print(c)

      }
      n-=1
    }
    println()

    n = 10
    for(c<-"1234567890"){
      breakable{
        if(n==5)break
        print(c)
      }
      n-=1
    }

    println()

    println("--------------------------------")
    //多重循环
    for(i<-1 to 9;j<- i to 9){
      if(j==9)println(i+"*"+j+"="+i*j)
      else print(i+"*"+j+"="+i*j+ "  ")
    }
    //守卫循环
    for(i<-1 to 20;if(i%2==0))println(i)
    //推导式
    val arr = for(i<- 1 to 20 if(i%2==1 )) yield i
    for (i<-arr)println(i)
  }
}
