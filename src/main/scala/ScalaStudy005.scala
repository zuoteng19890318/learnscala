object ScalaStudy005 {
  def main(args: Array[String]): Unit = {
    //变长参数
    println(sum(1,2,3,4,5,6,7,8,9,10))

    //使用序列调用变长参数

    println(sum(1 to 10:_*))

    println(sum2(1 to 10 :_*))
  }

  def sum(nums:Int*):Int ={
    var res = 0
    for(num<-nums){
      res += num
    }
    res
  }

  def sum2(nums:Int*):Int= {
    if(nums.length==0) 0
    else nums.head + sum2(nums.tail:_*)
  }
}
