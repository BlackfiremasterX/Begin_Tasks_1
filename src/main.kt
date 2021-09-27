fun main()
{
    println("Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a.")
    print("Введите сторону квадрата а:")
    var a = readLine()!!.toInt()
    var P=4*a
    print("Периметр квадрата со стороной а = $a: $P")
}