import java.util.Stack

class Calculator { // todo 코틀린 컨벤션은 -> 자바와 동일하게 대문자 클래스

    fun calculate(a: Int, b: Int, operator: String): Int {

        return if (operator == "+") {
            plus(a, b)
        } else if (operator == "-") {
            minus(a, b)
        } else if (operator == "*") {
            multiply(a, b)
        } else {
            divide(a, b)
        }
    }

    private fun plus(a: Int, b: Int) = a + b

    private fun minus(a: Int, b: Int) = a - b

    private fun multiply(a: Int, b: Int) = a * b

    private fun divide(a: Int, b: Int): Int {
        return if (a == 0) {
            0
        } else if (b == 0) {
            error("0으로는 나눌 수 없습니다.") // todo 코틀린 에러처리?
        } else {
            a / b
        }
    }
}

enum class OperatorPriory(private val order: Int, val operator: List<String>) { // todo 접근재한자 안붙이면 안됌 왜??
    FIRST(1, listOf("+", "-")),
    SECOND(2, listOf("*", "/"));

    companion object { // static
        fun maxOrder(): Int {
            return entries.toTypedArray().maxOf { it.order } //todo entries?
        }

        fun getByOrder (order: Int) : List<String>{
            return entries.toTypedArray().first { it.order == order }.operator
        }
    }
}

class PolynomialCalculate() {
    var calculate = Calculator()
    fun calculateByString(value: String): CalculateRecode {
        validateInput(value)
        var inputList = convertInput(value)
        val maxOrder = OperatorPriory.maxOrder()
        val stack = Stack<String>()
        for (i in maxOrder downTo 1) {
            val operators = OperatorPriory.getByOrder(i)
            for (j in inputList.indices){
                if (j != 0 && operators.contains(inputList[j-1])){
                    val operator = stack.pop()
                    stack.add(calculate.calculate(stack.pop().toInt(),inputList[j].toInt(),operator).toString())
                }else {
                    stack.add(inputList[j])
                }
            }
            if (i != 1){
                inputList = ArrayList(stack)
                stack.clear()
            }
        }
        return CalculateRecode(value, stack[0])
    }

    private fun validateInput(value: String) {

        val regex = Regex("^[+\\-*/\\d ]*$")
        if (!value.matches(regex)) {
            error("올바른 입력값이 아닙니다.")
        }
    }

    private fun convertInput(value: String): List<String> {
        var value = value.replace("\\s+".toRegex(), "")
        var toList = mutableListOf<String>()
        var temp = ""
        for (s in value) {
            if (s.toString().matches(Regex("[+\\-*/]"))) {
                toList.add(temp)
                toList.add(s.toString())
                temp = ""
            }else{
                temp += s.toString()
            }
        }
        toList.add(temp)
        return toList
    }
}

// 같은 모듈로 묵는 기준
// 최상위 method를 만드는 경우는? -> static 메소드로 만들고 싶을때?