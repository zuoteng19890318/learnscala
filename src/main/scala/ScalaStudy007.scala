import scala.collection.mutable.ArrayBuffer

object ScalaStudy007 {
  def main(args: Array[String]): Unit = {
    //数组操作 Array ArrayBuffer 以及遍历

    //Array:不可变，有默认值，底层就是Java中的数组
    val arr1 = crtArray(10)//创建array
    showArray(arr1)
    println(arr1(0))//访问array中的元素
    arr1(0) = 1//为元素赋值
    showArray(arr1)

    println(arr1.sum)//求元素之和
    println(arr1.max)//求最大元素
    scala.util.Sorting.quickSort(arr1)//排序
    println(arr1.mkString)//mkString方法
    println(arr1.toString)//toString方法
    println(arr1.toBuffer.toString())//ArrayBuffer的toString
    println(arr1.mkString(","))//mkString可以拼接使用字符拼接
    println(arr1.mkString("(",",",")"))//还可以指定首尾字符



    val arr2 = Array("hello","world")
    showArray(arr2)
    arr2(0) = "hi"
    showArray(arr2)

    val arr3 = Array("Leo",30)
    showArray(arr3)
    arr3(0)="mike"
    arr3(1)="50"
    showArray(arr3)

    //ArrayBuffer是长度可变的集合类
    val b = ArrayBuffer[Int]()//ArrayBuffer的声明
    b += 1 //添加一个元素
    println(b.mkString(","))
    b += (2,3,4,5)//添加多个元素,默认添加到尾部
    println(b.mkString(","))
    b ++= Array(6,7,8,9,10) //添加其他Array,默认添加到尾部
    println(b.mkString(","))
    b.trimEnd(5)//去掉末尾5个元素
    println(b.mkString(","))
    b.insert(5,6)//在index=5的位置上插入元素6
    println(b.mkString(","))
    b.remove(1)//移除index=1上的元素
    println(b.mkString(","))
    b.remove(1,3)//从index=1开始移除3个元素
    println(b.mkString(","))

    //Array和ArrayBuffer的互换
    b.toArray
    arr1.toBuffer

    //遍历
    for(i<-0 until b.length)println(b(i))
    for(i<-0 until (b.length,2)) println(b(i))
    for(i<-(0 until(b.length)).reverse)println(b(i))
    for(e<-b)println(e)

  }

  def crtArray(length:Int): Array[Int] ={
    new Array[Int](length)
  }

  def showArray(array: Array[Int]): Unit ={
    for(a<-array){
      print(a+" ")
    }
    println()
  }
  def showArray(array: Array[String]): Unit ={
    for(a<-array){
      print(a+" ")
    }
    println()
  }
  def showArray(array: Array[Any]): Unit ={
    for(a<-array){
      print(a+" ")
    }
    println()
  }

}
