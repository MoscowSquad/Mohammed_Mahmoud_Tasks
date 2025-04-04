fun main() {
    val currentgrid = List(16) { List(16) { '-' } } // Create 16x16 empty grid
    println(isValidSudoku(currentgrid, 4)) // Validate 16x16 Sudoku with 4x4 subgrids
}

fun isValidSudoku(grid: List<List<Char>>, subgridSize: Int = 3): Boolean {
    val size = grid.size
    return areRowsValid(grid) && areColumnsValid(grid, size) && areSubgridsValid(grid, size, subgridSize)
}

// Valid if cell is '-' or digit 1–9 (excluding 0)
private fun isValidCell(cell: Char): Boolean {
    return cell == '-' || (cell.isDigit() && cell != '0')
}

// Rows must have unique valid characters (excluding '-')
private fun areRowsValid(grid: List<List<Char>>): Boolean {
    return grid.all { row ->
        val seenNumbers = mutableSetOf<Char>()
        row.all { cell -> isValidCell(cell) && (cell == '-' || seenNumbers.add(cell)) }
    }
}

// Columns must have unique valid characters (excluding '-')
private fun areColumnsValid(grid: List<List<Char>>, size: Int): Boolean {
    for (col in 0 until size) {
        val seen = mutableSetOf<Char>()
        for (row in 0 until size) {
            val cell = grid[row][col]
            if (!isValidCell(cell) || (cell != '-' && !seen.add(cell))) return false
        }
    }
    return true
}

// Subgrids must have unique valid characters (excluding '-')
private fun areSubgridsValid(grid: List<List<Char>>, size: Int, boxes: Int): Boolean {
    for (external_row in 0 until size step boxes) {
        for (external_col in 0 until size step boxes) {
            val seen = mutableSetOf<Char>()
            for (internal_row in 0 until boxes) {
                for (internal_col in 0 until boxes) {
                    val cell = grid[external_row + internal_row][external_col + internal_col]
                    if (!isValidCell(cell) || (cell != '-' && !seen.add(cell))) return false
                }
            }
        }
    }
    return true
}
