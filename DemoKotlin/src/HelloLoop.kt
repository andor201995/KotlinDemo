fun main(args: Array<String>) {
    item1loop@ for (item1 in 1..10) {
        println(item1)

        item2loop@ for (item2 in 1..5) {
            if (item2 % 2 == 0) {
                print(item2)
                continue@item2loop
            } else if (item1 > 5) {
                break@item1loop
            }

        }
        println();
    }
}