import kotlin.streams.toList

class ConsoleModule { // todo 유틸 클래스로???
    fun menu() {
        println("1. 조회\n2. 계산\n")
        print("선택 : ")
    }

    fun input(): String {
        return readln()
    }

    fun output(message: String) {
        println(message)
        println()
    }

    fun output(message: CalculateRecodes) {
        println(message.recodes.stream().map { it.recode }.toList().joinToString("\n"))
    }

}