import scala.collection.mutable.Map

class ChecksumAccumulator {
	private var sum = 0;
	def add(b : Byte) { sum += b }
	def checksum() : Int = ~(sum & 0xFF) + 1 // 8bit Masking
}

object ChecksumAccumulator {
	private val cache = Map[String, Int]()
	def calculate(s:String) : Int = 
		if (cache.contains(s))
			cache(s)
		else{
			val acc = new ChecksumAccumulator
			for (c <- s)
				acc.add(c.toByte)
			val cs = acc.checksum()
			cache += (s -> cs) //s 가 key cs가 value로 묶어주는 tuple
			cs
	}
}

// println(ChecksumAccumulator.calculate("Every value is an object"))
