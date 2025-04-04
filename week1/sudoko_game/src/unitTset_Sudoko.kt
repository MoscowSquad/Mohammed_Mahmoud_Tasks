fun main() {
    //sudokkkkko checker
    test(
        name = "when given Empty sudoku should return true",
        result = isValidSudoku(List(9) { List(9) { '-' } }),
        currectResult = true
    )

    test(
        name = "when given Valid completed sudoku is should return true",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        currectResult = true
    )

    test(
        name = "when given a Valid incomplete sudoku is should return true",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        currectResult = true
    )

    test(
        name = "when given a Sudoku with duplicate in row is should return False",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        currectResult = false
    )

    test(
        name = "when given a Sudoku with duplicate in column is should return False",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '7', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        currectResult = false
    )

    test(
        name = "when given a Sudoku with duplicate in subgrid is should return False",
        result = isValidSudoku(
            listOf(
                listOf('4', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '4', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        currectResult = false
    )

    test(
        name = "when gives an invalid character makes sudoku should return False",
        result = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', 'X', '-', '8', '-', '-', '7', '9')
            )
        ),
        currectResult = false
    )

    test(
        name = "when given a 4x4 sudoku valid should return true",
        result = isValidSudoku(
            listOf(
                listOf('1', '2', '3', '4'),
                listOf('3', '4', '1', '2'),
                listOf('2', '1', '4', '3'),
                listOf('4', '3', '2', '1')
            ), 2
        ),
        currectResult = true
    )

    test(
        name = "when given a 4x4 sudoku invalid should return False",
        result = isValidSudoku(
            listOf(
                listOf('1', '2', '3', '4'),
                listOf('3', '4', '1', '2'),
                listOf('2', '1', '4', '3'),
                listOf('4', '3', '1', '2')
            ), 2
        ),
        currectResult = false
    )

    test(
        name = "when given a 4x4, character makes sudoku should return False",
        result = isValidSudoku(
            listOf(
                listOf('1', '2', '3', '4'),
                listOf('3', '4', '1', '2'),
                listOf('2', '1', '4', '3'),
                listOf('4', '3', 'X', '2')
            ), 2
        ),
        currectResult = false
    )
}

fun test(name: String, result: Boolean, currectResult: Boolean) {
    if (result == currectResult) {
        println("Success: $name")
    } else {
        println("Failed: $name")
    }
}
