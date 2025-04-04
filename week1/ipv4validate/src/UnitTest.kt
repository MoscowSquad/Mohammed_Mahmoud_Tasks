fun main(){

    test(
        name = "when given Standard valid IPv4 address should return true",
        result = isValidIPv4("192.168.2.1"),
        currectResult = true
    )

    test(
        name = "when given minimum values non routing address should return true",
        result = isValidIPv4("0.0.0.0"),
        currectResult = true
    )

    test(
        name = "when given Valid address with single digit segments should return true",
        result = isValidIPv4("8.8.8.8"),
        currectResult = true
    )
    test(
        name = "when given maximum values broadcast should return true",
        result = isValidIPv4("255.255.255.255"),
        currectResult = true
    )

    test(
        name = "when given less then Four segments should return false",
        result = isValidIPv4("192.168.1"),
        currectResult = false
    )

    test(
        name = "when given more then Four segments should return false",
        result = isValidIPv4("192.168.3.2.1"),
        currectResult = false
    )


    test(
        name = "when gives Out of range number should return false",
        result = isValidIPv4("256.1.2.3"),
        currectResult = false
    )

    test(
        name = "when given negative number should return false",
        result = isValidIPv4("-1.2.3.4"),
        currectResult = false
    )

    test(
        name = "when given starting zeros should return false",
        result = isValidIPv4("01.2.3.4"),
        currectResult = false
    )

    test(
        name = "when given Empty segment should return false",
        result = isValidIPv4("192.168..1"),
        currectResult = false
    )

    test(
        name = "when given Non-numeric characters should return false",
        result = isValidIPv4("a.b.c.d"),
        currectResult = false
    )


    test(
        name = "when given Wrong separator should return false",
        result = isValidIPv4("192,168,1,1"),
        currectResult = false
    )

    test(
        name = "when given Empty string should return false",
        result = isValidIPv4(""),
        currectResult = false
    )

    test(
        name = "when given  only dots should return false",
        result = isValidIPv4("..."),
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
