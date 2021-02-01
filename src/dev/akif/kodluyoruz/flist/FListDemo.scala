package dev.akif.kodluyoruz.flist

object FListDemo {
  def main(args: Array[String]): Unit = {
    val list = (1 to 100 by 2).toList
    val flist1 = FList(1, 2, 3)
    val flist2 = FList(list)
    val flist3 = FList("hello", "world")
    
    //Append test
    println(flist1.append(4).append(5))
    
    //Prepend test 
    println(flist1.prepend(0).prepend(10))

    //Concat test
    println(flist2.concat(flist1))

    //Filter test
    println(flist1.filter(_ > 2))
   
    //Size test
    println(flist3.size)
    
    
  }
}
