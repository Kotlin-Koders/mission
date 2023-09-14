package domain

import java.util.*

enum class Operator(val orderNumber: Int, val symbol: String) {

    ADDITION(0, "+") {
        override fun operate(number1: Int, number2: Int): Int {
            return number1 + number2
        }
    },
    SUBSTRACTION(0, "-") {
        override fun operate(number1: Int, number2: Int): Int {
            return number1 - number2
        }
    },
    MULTIPLICATION(1, "*") {
        override fun operate(number1: Int, number2: Int): Int {
            return number1 * number2
        }
    },
    DIVISION(1, "/") {
        override fun operate(number1: Int, number2: Int): Int {
            return number1 / number2
        }
    }
    ;

    abstract fun operate(number1: Int, number2: Int): Int
    fun isPrecede(other: Operator): Boolean {
        return orderNumber > other.orderNumber
    }

    companion object {
        fun of(symbol: String): Operator {
            return entries.first { it.symbol == symbol }
        }
    }
}