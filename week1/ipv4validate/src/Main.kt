fun main() {
    isValidIPv4("0.0.0.0") // Call the function to check if the IP is valid (this call does nothing with the result, consider printing it)
}

fun isValidIPv4(ip: String): Boolean {
    val segments = ip.split('.') // Split the IP string into parts by "."

    // Check if there are exactly 4 segments and exactly 3 dots
    if (segments.size != 4 || ip.count { it == '.' } != 3) return false

    for (segment in segments) {
        // Validate each segment:
        // - Not empty
        // - Only digits
        // - No leading zeros (except for "0" itself)
        // - Value is between 0 and 255
        if (segment.isEmpty() ||
            segment.filter { it.isDigit() }.length != segment.length ||
            (segment.length > 1 && segment[0] == '0') ||
            segment.toInt() !in 0..255
        ) {
            return false // Invalid segment
        }
    }

    return true // All segments are valid
}