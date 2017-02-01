object Test {
    def main(args:Array[String]){
        
        // 아래 4개 함수는 동일하게 작동
        args.foreach(arg=>println(arg))
        args.foreach((arg:String) => println(arg))
        args.foreach(println) // 함수의 주소값을 넘겨준다
        for (arg <- args)
            println(arg)
    }
}
