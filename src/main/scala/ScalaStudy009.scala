import scala.collection.{SortedMap, mutable}

object ScalaStudy009 {
  def main(args: Array[String]): Unit = {
    /**map和tuple*/
    val map1 = Map("leo"->30,"mike"->20,"jack"->23)//1 创建不可变的Map
    println(map1("leo"))

    val map2 = scala.collection.mutable.Map("leo"->30,"mike"->20,"jack"->23)//2 创建可变的map
    println(map2("leo"))
    map2("leo") = 35
    println(map2("leo"))

    val map3 = Map(("leo",30),("mike",20),("jack",23))//3 使用(key,value)的方式创建Map
    println(map3("leo"))

    val map4 = new mutable.HashMap[String,Int]//4 创建空HashMap

    /**访问Map的元素*/
    //如果key不存在会报错
    println(map1("leo"))

    //使用contains判断
    println(
      if(map1.contains("Leo"))
        map1("Leo")
      else
        0
    )

    //getOrElse函数
    println(map1.getOrElse("judy",0))

    /**修改Map的元素*/
    //更新Map的元素
    map2("jack")=40
    println(map2("jack"))

    //增加多个元素
    map2+=("judy"->13)

    //移除元素
    map2-=("jack")
    println("map2")
    for(tuple<-map2)println(tuple._1+":"+tuple._2)

    //更新不可变的map
    val map5 = map1+("leo"->13)//原理上是生成新的集合
    println("map5")
    for(tuple<-map5)println(tuple._1+":"+tuple._2)

    //移除不可变的map的元素
    val map6 = map1 - "jack"
    println("map6")
    for(tuple<-map6)println(tuple._1+":"+tuple._2)

    /**遍历Map*/
    //遍历entry set
    for((k,v)<-map5)println(k+" "+v)
    //遍历key
    for(k<-map5.keySet)println(k)
    //遍历value
    for(v<-map5.values)println(v)
    //反转k v
    val map7 = for((k,v)<-map5)yield (v,k)
    for((k,v)<-map7)println(k+" "+v)

    /**SortedMap乐意自动对map的key排序*/
    val sortedMap = SortedMap("Marry"->20,"Frank"->40,"Richarl"->35)
    println("/**SortedMap乐意自动对map的key排序*/")
    for(k<-sortedMap.keys)println(k)

    /**LinkedHashMap可以记住插入的顺序*/
    val linkedMap = new mutable.LinkedHashMap[String,Int]
    linkedMap("Tez") = 20
    linkedMap("Messi") = 20
    linkedMap("C.R") = 20
    linkedMap("Ozil") = 20
    println("/**LinkedHashMap可以记住插入的顺序*/")
    for ((k,v)<-linkedMap)println(k,v)

    /**Map的元素类型Tuple*/
    val tuple = ("leo",30,"male")//创建
    println(tuple._1,tuple._2,tuple._3)//访问

    /**zip操作*/
    val names = Array("jack","leo","mike")
    val ages = Array(30,20,24)
    val zip = names.zip(ages)
    println("/**zip操作*/")
    for(e<-zip)println(e._1,e._2)

  }
}
