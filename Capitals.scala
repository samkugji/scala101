object Capitals {
    def useImmut(){
        // val capital = Map("US"->"Washington", "France"->"Paris")
        var capital = Map("US"->"Washington", "France"->"Paris")
        capital += ("Japan"->"Tokyo") // var로 선언하면 immutable map도 추가는  가능
        println(capital("France"));
        println(capital("Japan"));
    }

    def useMut(){
        import scala.collection.mutable.Map // only change needed!
        val capital = Map("US"->"Washington", "France"->"Paris")
        capital += ("Japan"->"Tokyo")
        println(capital("France"))
        println(capital("Japan"))
    }

    def main(args: Array[String]){
        useImmut();
        useMut();
    }
}
