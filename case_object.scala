object test{
    def unapply(a:Int) : Boolean = {
      if(a<10){true}
      else{false}
    }
  }

object test2{
    def unapply(a:Int) : Option[(Int, String)] = {
         if(a>30 && a<41) {Some(a/10, "from test2")}
         else {None}
     }
  }

class Example {

   def method(target: Int){
       target match {
             case test() => println("matched to test")
             case test2(n @ test(), m) => println("result : " + n + " " + m)
             case 120 => println("match to 120")
             case _ => println("out of bound")
         }
      }
   }


val t = new Example
t.method(5)
t.method(40)
t.method(50)
t.method(120)
