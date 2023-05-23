import kotlin.math.sqrt
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.math.pow
import kotlin.math.cbrt

fun main() {

//    val numbers = List(10) { Random.nextInt(1, 999) }
//    println("random numbers $numbers")
    val values = mutableListOf<Int>()
    
}


//
//151
//    val n = 10
//    numbers.forEach {
//        if (n % it == 0) values.add(it)
//    }
//    if (values.isEmpty()) {
//        println("No matched values founded")
//    } else if (values.size == 1) {
//        println("1 matched value founded - ${values[0]}")
//    } else {
//        println("Sum of founded values - ${values.sum()}")
//    }
//
//

//    //152

//    val n = 10
//    val valuesProduct = mutableListOf<Int>()
//    for (i in values.indices){
//        if (i == values.size - 1) break
//        valuesProduct.add(values[i] * values[i + 1])
//    }
//    if (values.size == 1) {println("the only values $values")}
//    else println("sum of values product ${valuesProduct.sum()}")

//    //153

//    val n = 10
//    numbers.forEach {
//        if (n % it == 2) values.add(it)
//    }
//    if (values.isEmpty()) println("no matched values founded")
//    else if (values.size == 1){
//        println("one matched values founded")
//    } else println("Sum of founded values - ${values.sum()}")

//154

//    val n = 10
//    val valuesProduct = mutableListOf<Int>()
//    numbers.forEach {
//        if (n % it == 3) values.add(it)
//    }
//        for (i in values.indices){
//        if (i == values.size - 1) break
//        valuesProduct.add(values[i] * values[i + 1])
//    }
//    if (values.size == 1) {println("the only value is ${values[0]}")}
//    else println("sum of values product ${valuesProduct.sum()}")

//155

//    numbers.forEach { if (it % 2 == 0) values.add(it) }
//    if (values.isEmpty()) println("no even numbers found")
//    else println("even numbers $values")
//    val evenValuesProduct = mutableListOf<Int>()
//    if (values.isNotEmpty()) {
//        values.forEach {
//            if (it % 3 == 0) {
//                evenValuesProduct.add(it)
//                println(
//                    "sum of even numbers that divide to 3 without \n" +
//                            "remainder`s product: ${evenValuesProduct.sum()}"
//                )
//            }
//        }
//
//    } else if (evenValuesProduct.isEmpty()) println(
//        "no even numbers found that" +
//                " divide to 3 without remainder"
//    )

//156

//    numbers.forEach { if (it in 10..99 && (it % 3 == 0) && (it % 5 == 0)) values.add(it) }
//    if (values.isNotEmpty()) println("two digit number that divide by 3 and 5 without remainder $values")
//    else println("no values found that divide by 3 and 5 without remainder")
//    val product = mutableListOf<Int>()
//    for (i in values.indices){
//        if (i == values.size - 1) break
//        product.add(values[i] * values[i + 1])
//    }
//    if (values.size > 1) {
//        println("product of numbers that divide by 3 and 5 is \"$product\"")
//    }

//157

//    numbers.forEach { if (it in 100..999 && it % 5 != 0) values.add(it) }
//    println("three digit numbers that have remainder by dividing by 5: $values")
//    if (values.isNotEmpty()){
//        println("sum of the three-digit numbers that divide by 5 with remainder: ${values.sum()}")
//    }
//    if (values.isEmpty()) println("couldn't find the matched values that" +
//            "are three digit and have no remainder by dividing by 5 :(")

//    //158

//    numbers.forEach { if (it in 100..999 && it % 2 != 0 && it % 3 != 0) values.add(it) }
//    println("numbers that are three-digit and don`t divide by 2 and 3 $values")
//    val valuesProducts = mutableListOf<Int>()
//    for (i in values.indices) {
//        if (i == values.size - 1) break
//        else (valuesProducts.add(values[i] * values[i + 1]))
//    }
//    if (values.size > 1) println("the product of the number: $valuesProducts")
//        //ereq kam aveli "value" i depqum mekic avel produkt kstananq voroncic amen arjeqy klni value[i] * value[i+1]

//    //159

//    numbers.forEach { if (it in 100..999 && it % 3 == 1 && it % 4 == 2) values.add(it) }
//    if (values.isNotEmpty()) {
//        println("three-digit numbers that divided by 3 with 1 remained and by 4 remained with 2 values: $values")
//    } else println("there`s no three-digit numbers that divided by 3 with 1 remained and by 4 remained with 2")
//
//    val valuesProducts = mutableListOf<Int>()
//    for (i in values.indices) {
//        if (i == values.size - 1) break
//        else valuesProducts.add(values[i] * values[i + 1])
//    }
//    if (values.size > 1) println("the product of numbers is $valuesProducts")
//    else false

//160 - 163 :? = null

//    numbers.forEach { if (it in 100..999) values.add(it) }
//    val sorted = values.sorted()
//    println("three-digit sorted numbers $sorted")
//    var foundNumber: Int? = null
//
//    for (i in sorted.indices){
//        if ((sorted[i] * 16) == (sqrt(sorted[i].toDouble()).toInt())){
//            foundNumber = sorted[i]}
//            break
//    }
//    if (foundNumber != null) println(foundNumber)
//    else println("didn`t found the number to product by 16 and equals square of natural number")

//164: exception on (sqrt(sorted[i].toDouble()).toInt() > n)

//val n = {Random.nextInt(1,200)}
//numbers.forEach { if (it in 100..999) values.add(it) }
//val sorted = values.sorted()
//for (i in sorted.indices){
//    if (sqrt(sorted[i].toDouble()).toInt() > n) println("the square root of ${sorted[i]} is higher than $n")
//}

//165

//fun Int.cube(): Int {
//    return this * this * this
//}
//val n = Random.nextInt(1,300)
//var f = false
//if (n == n.cube()) f = true

//166
//
//    var y = 0
//
//    val n = Random.nextInt(1,300)
//    println(n)
//
//    val result = sqrt(sqrt(n.toDouble()))
//
//    if (result % 1.0 == 0.0) {
//        val naturalResult = result.toInt()
//        y =1
//        println("√√$n equals $naturalResult: y - $y")
//    } else {
//        println("√√$n isn`t a natural number: y - $y")
//    }

//167

//    var y = false
//    val x = 1
//    for (x in 2 until 30) {
//        if (x < 0) y = true
//    }
//    println(message = y)
//}

//168**

//    fun isPrime(n: Int): Boolean {
//        if (n <= 1) return false
//        for (i in 2 until n) {
//            if (n % i == 0) return false
//        }
//        return true
//    }
//
//    val n = Random.nextInt(2, 300)
//    println(n)
//    var p = false
//    val primeNum = isPrime(n)
//    if (primeNum) {
//        p = true
//        println("is $n prime number?: $p")
//    }
//    else {
//        p = false
//        println("is $n prime number?: $p")
//    }

//169

//    fun isPrime(n: Int): Boolean {
//        if (n <= 1) return false
//        for (i in 2 until n) {
//            if (n % i == 0) return false
//        }
//        return true
//    }
//
//    val x = Random.nextInt(1, 300)
//    val y = Random.nextInt(1, 300)
//    var z = 5
//    val primeNum = isPrime(x + y)
//    if (primeNum) println(z)
//    else {
//        z = 6
//        println(z)
//    }

// 170 *grelem gpt i ognutyamb

//    val n = Random.nextInt(1, 300)
//    println("n = $n")
//
//    var number = n + 1
//    val squareRoot = sqrt(number.toDouble())
//    var smallestNumber: Int? = null
//
//    while (smallestNumber == null) {
//        if (squareRoot % 1 == 0.0) {
//            smallestNumber = number
//        }
//        number++
//    }
//
//    println("smallest number that higher than $n and being a square of natural number is $smallestNumber")

//171

//val n = Random.nextInt(3, 11)
//println(n)
//var factorial: Int = 1
//
//for (i in 1..n) {
//    factorial *= i
//}
//
//println("$n's factorial: $factorial")

////172

//val n = Random.nextInt(4, 12)
//var eFactorial = 1
//var oFactorial = 1
//if (n % 2 == 0){
//    for (i in 2..n step 2){
//        eFactorial *= i
//    }
//    println("double factorial of $n is $eFactorial")
//}else {
//    for (i in 1..n step 2){
//        oFactorial *= i
//    }
//    println("double factorial of $n is $oFactorial")
//}

//173 - 179?
