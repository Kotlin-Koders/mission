package domain

class EmptyExpression : Expression {
    override val number: Int
        get() = 0
    override val operator: Operator
        get() = Operator.ADDITION

    override val isEnd: Boolean = true

    override fun calculate(number: Int): Int {
        return number
    }
}
