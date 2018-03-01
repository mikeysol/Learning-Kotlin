import kotlin.system.measureNanoTime

fun stringChanger(input: String) : String{
    val str = StringBuilder()
    input.forEach{

        str.append(if(it == 'z') 'a' else it.inc())
    }
    return str.toString()
}
fun stringChanger2(input: String): String {
    return input.fold(""){ str, c -> str + if(c == 'z') 'a' else c.inc()
    }
}
fun stringChanger3(input: String) = input.fold(""){ str, c -> str + if(c == 'z') 'a' else c.inc() }

fun main(args: Array<String>){

    println("stringChanger and print is ${measureNanoTime {println(stringChanger("Mikez"))}}ns")
    println("stringChanger2 and print is ${measureNanoTime {println(stringChanger2("Mikez"))}}ns")
    println("stringChanger3 and print is ${measureNanoTime {println(stringChanger3("Mikez"))}}ns")
    println("""stringChanger3 and print is ${measureNanoTime { println(stringChanger3("Mikez")) } / 1e6}ms""")
}