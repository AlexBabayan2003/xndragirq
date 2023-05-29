fun main() {
    val matrix = listOf(
        listOf(1.0, -1.1, 1.2),
        listOf(2.0, -2.1, -2.2),
        listOf(-3.0, 3.1, 3.2)
    )


}

fun Double.square(): Double = this * this


//Skhala resulty tali, reduce() na hastat xndiry vonc chisht anem?

fun ex460(matrix: List<List<Double>>): Double{
    val values = mutableListOf<Double>()
    matrix.forEach { row ->
        row.forEach { element ->
            if (element % 2.0 == 0.0) values.add(element)
        }
    }

    return values.reduce { a, b -> a.square() * b.square() }
}

fun ex459(matrix: List<List<Double>>) {
    val negativeValues = mutableListOf<Double>()
    matrix.forEach { row ->
        row.forEach { element ->
            if (element < 0) negativeValues.add(element)
        }
    }
    if (negativeValues.isEmpty()) {
        println("there is no negative numbers in the matrix")
    } else println(negativeValues.reduce { a, b -> a * b })
}

fun ex458(matrix: List<List<Double>>) {
    val k = 2.1
    matrix.forEach { row -> row.forEach { element -> if (element > k) println(element) } }
}

//chem karum chisht stugem chishtem arel te che :d
fun ex457(matrix: List<List<Double>>): MutableList<Double> {
    val values = mutableListOf<Double>()
    matrix.forEach { row -> row.forEach { element -> if (element % 2.0 == 1.0) values.add(element) } }
    return values
}

//ex456?

fun ex455(matrix: List<List<Double>>): Double {
    val diagonal = List(matrix.size) { matrix[it][it] }
    val antiDiagonal = List(matrix.size) { matrix[it][matrix.size - it - 1] }

    val diagonalProduct = diagonal.reduce { acc, value -> acc * value }
    val antiDiagonalProduct = antiDiagonal.reduce { acc, value -> acc * value }

    return diagonalProduct * antiDiagonalProduct
}

fun ex454(matrix: List<List<Double>>): Double {
    var product = 1.0
    for (row in matrix) {
        for (element in row) {
            val square = element.square()
            product *= square
        }
    }
    return product
}

fun ex453(matrix: List<List<Double>>): Double {
    val a = 0.2
    val b = 2.1

    var sum = 0.0
    var shouldSum = false

    for (row in matrix) {
        for (element in row) {
            if (element == a) {
                shouldSum = true
            }
            if (shouldSum) {
                sum += element
            }
            if (element == b) {
                shouldSum = false
                break
            }
        }
    }
    return sum
}

fun ex452(matrix: List<List<Double>>): Double {
    val firstElement = matrix.first().first().square()
    val lastElement = matrix.last().last().square()
    return firstElement + lastElement
}

fun ex451(matrix: List<List<Double>>): Double {
    val diagonal = List(matrix.size) { i -> matrix[i][i] }
    val antiDiagonal = List(matrix.size) { i -> matrix[i][matrix.size - i - 1] }
    return (diagonal.sum() + antiDiagonal.sum()) / (diagonal.size + antiDiagonal.size)
}

