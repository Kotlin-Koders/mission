package com.calc.jhw.calc

/**
 * packageName    : com.calc.jhw.calc
 * fileName       : CalcResult
 * author         : jhw1015
 * date           : 2023/09/20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/20           jhw1015           최초 생성
 */
class CalcResult {

    companion object {
        val BLANK = " "

        fun result(
            calcFormula: String,
            num1: String,
            num2: String,
            operator: String,
            calcWayService: CalcWayService
        ): String {
           return calcFormula.replaceFirst(
               num1 + BLANK + operator + BLANK + num2,
               calcWayService.calc(num1.toInt(),num2.toInt()).toString()
            )

        }
    }
}