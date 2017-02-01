val greetStrings = new Array[String] (3)
greetStrings(0) = "Hello"; //실제로는 greetStrings.updates("0.Hello") 호출
greetStrings(1) = ",";
greetStrings(2) = "World\n";
// greetStrings(3) = "불가";

for (i <- 0 to 2)
	println(greetStrings(i));
