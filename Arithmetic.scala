class Arithmetic(val p1:Int){
    def + (that:Int):Int = {}
}

object Main{
    def main(args: Array[String]){
        
        val x = new Arithmetic(1);
        val y = new Arithmetic(2);
        println(x+y);
    }
}

