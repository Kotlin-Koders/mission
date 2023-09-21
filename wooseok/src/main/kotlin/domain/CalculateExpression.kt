package domain

open class CalculateExpression(
    override val number: Int,
    override val operator: Operator,
    val nextExpression: Expression = EmptyExpression(),
    override val isEnd: Boolean = false
) : Expression {

    override fun calculate(number: Int): Int {
        if (nextExpression.isEnd) {
            return operator.operate(number, this.number)
        }
        if (operator.isPrecede(nextExpression.operator)) {
            return nextExpression.calculate(operator.operate(number, this.number))
        }
        return operator.operate(number, nextExpression.calculate(this.number))
    }
}
