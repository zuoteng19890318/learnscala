import scala.collection.mutable.ArrayBuffer

object ScalaStudy008 {
  def main(args: Array[String]): Unit = {
    //数组操作之数组转换
    //使用yield和函数式编程转换数组
    val a = Array(1,2,3,4,5)
    val b = for(e<-a)yield e*e
    println(a.mkString(" "))
    println(b.mkString(" "))

    val a1 = ArrayBuffer[Int]()
    a1+=(1,2,3,4,5)
    val b1 = for(e<-a1) yield e*e
    val b2 = for(e<-a1 if e%2==0)yield e*e
    println(a1.mkString(" "))
    println(b1.mkString(" "))
    println(b2.mkString(" "))

    val b3 = a1.filter(_%2==0).map(_*2)
    println(b3.mkString(" "))

    //算法案例：移除一个负数之后的所有负数
    removeNegative()
    removeNegative2()
  }

  def removeNegative(): Unit ={
    val a = ArrayBuffer[Int]()
    a += (1,2,3,4,5,-1,-2,-3,-4,2,3,4,5)
    var findNegative = false
    var index = 0
    var length = a.length

    while(index<length){
      if(a(index)>0){
        index +=1
      }else{
        if(findNegative==false){
          findNegative=true;
          index+=1
        }else{
          a.remove(index)
          length-=1
        }
      }
    }
    println(a.mkString(" "))

  }

  def removeNegative2(): Unit ={
    val a = ArrayBuffer[Int]()
    a+=(1,2,3,4,5,-1,-2,-3,-4,-5,2,3,4,5)
    var findNegative = false
    val keepIndex = for(e<-a if(!findNegative||e>0)) yield {
      if(e<0)findNegative = true
      e
    }

    println(keepIndex.mkString(" "))

  }

}
