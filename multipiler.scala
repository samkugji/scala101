object Test {
    def main(args: Array[String]){
        println("multiplier(1) value = " + multiplier(1) )
        println("multiplier(2) value = " + multiplier(2) )
        factor = 10 // 자바에서는 클래스 생성 후 사용해야 하는데 스칼라는 가능 
        println("after factor reassign multiplier(2) value = " + multiplier(2) )
    }

    var factor = 3;
    val multiplier = (i:Int) => i*factor
}
