import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

    val numbers = List(10) { Random.nextInt(1, 300) }
    println("random numbers $numbers")
    val values = mutableListOf<Int>()

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
//    } else println("theres no three-digit numbers that divided by 3 with 1 remained and by 4 remained with 2")
//
//    val valuesProducts = mutableListOf<Int>()
//    for (i in values.indices) {
//        if (i == values.size - 1) break
//        else valuesProducts.add(values[i] * values[i + 1])
//    }
//    if (values.size > 1) println("the product of numbers is $valuesProducts")
//    else false

}

