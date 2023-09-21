package controller

import domain.*
import repository.CalculationRepository

class CalculationController: Controller {

    override fun run() {
        val readLine = readLine()
        val strings: List<String> = readLine?.split(" ")!!

        val startNumber: Int = strings[0].toInt()
        var expression: Expression = EmptyExpression();
        for (index in strings.size-1 downTo 2 step 2) {
            expression = CalculateExpression(strings[index].toInt(), Operator.of(strings[index-1]), expression)
        }
        val result = expression.calculate(startNumber)
        CalculationRepository.save(CalculationResult(strings.joinToString(" "), result.toString()))
        println(result)
    }
}
