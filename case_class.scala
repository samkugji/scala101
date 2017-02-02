object Demo {
    def main(args: Array[String]) {
        // 
        val alice = Person("Alice", 25);
        val bob = Person("Bob", 32);
        val charlie = Person("Charli", 32);
        val whoami = "Nobody"

        for(person <- List(alice, bob, charlie, whoami)){
            person match {
                case Person("Alice", 25) => println("Hi, Alice");
                case Person("Bob", 32) => println("Hi, Bob!");
                case Person(name, age) => println("Age:" + age + " year, name: " + name + "?");
                case _ => println("else");
            }
        }
    }    
    case class Person(name:String, age:Int)
}
