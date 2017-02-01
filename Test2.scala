object Test22{

  abstract class Element{

  def contents : Array[String]
  val height = contents.length
  val width = if(height == 0 ) 0 else contents(0).length

}

 class ArrayElement(conts : Array[String]) extends Element {

  def contents : Array[String] = conts
 }

 def main(args:Array[String]){
  val arrayElem = new ArrayElement(Array("foo"))
  println("arrayElem ["+ arrayElem +"]")

   val a123 = Array(1,2,3).toString
   val a123A = List(1,"ffff",3)
   val abcLen = "abc".length
   val helloLen = "hello".length
   val e : Element = new ArrayElement(Array("hellp"))

   println( a123 + ": a123")
   println( a123A + ": a123A")
   println( abcLen+ ": abcLen")
   println( helloLen + " : helloLen ")
   println( "["+ e + "] e")
  }

}
