object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")

    var firstName:String = "Peggy"
    val age:Int = 21
    println(firstName + ", is \n"+age+" years ago")
    var sum = 10 +
      25
    println("Sum is = " +sum)
    def function1:Unit = {
      println("This is function1")
    }
    function1
  }

}
