import sun.security.util.Length

object ScalaStudy007 {
  def main(args: Array[String]): Unit = {
    //数组操作 Array ArrayBuffer 以及便利

    //Array:不可变，有默认值，类似Java中的数组
    val arr1 = crtArray(10)
    showArray(arr1)
    println(arr1(0))
    arr1(0) = 1
    showArray(arr1)

    val arr2 = Array("hello","world")
    showArray(arr2)
    arr2(0) = "hi"
    showArray(arr2)

    val arr3 = Array("Leo",30)
    showArray(arr3)
    arr3(0)="mike"
    arr3(1)="50"
    showArray(arr3)
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
