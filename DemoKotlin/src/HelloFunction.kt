fun main(args: Array<String>) {
    print(callMe())
}

fun callMe(s: String = "CallMeDefault"): String {  //can set default value
    return "Function $s Called"
}
