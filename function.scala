object Hello{
	def main (args:Array[String]){
		println(max(10,20))
		greet();
	}
	def greet() = println("Hello World")

	def max(x:Int, y:Int): Int = {
		if(x>y) x
		else y
	}
}

