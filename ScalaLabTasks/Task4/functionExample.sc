object functionExamples {
  println("Welcome to the Scala worksheet!")
  def abs(x:Int): Int=if(x<0) -x else x
  abs(-5)

  def fact(n:Int): Int = {
    if(n==1)
      return 1
    n*fact(n-1)
  }
  fact(5)


  def printName(left:String="[",firstName:String,lastName:String,right:String="]") {
    println(left+firstName+" "+lastName+right)
  }
  printName(lastName="Fisher",firstName="Peggy")

  def sum(args:Int*): Int = {
    var result=0
    for(arg <- args) result += arg
    result
  }
  sum(1,2,3,4,5)
}