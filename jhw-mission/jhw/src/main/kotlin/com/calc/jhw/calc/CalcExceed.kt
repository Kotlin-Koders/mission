package com.calc.jhw.calc

/**
 * packageName    : com.calc.jhw.calc
 * fileName       : CalcExceed
 * author         : jhw1015
 * date           : 2023/09/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/14           jhw1015           최초 생성
 */
class CalcExceed {
    companion object {
        val PLUS = "+"
        val MINUS = "-"
        val DIVIDED = "/"
        val MULTIPLY = "*"
        fun result(calcFormula: String): Int {
            var resultCalc = ""
            val calcSplit = calcFormula.split(" ")
            if (calcSplit.size == 1) {
                return calcFormula.toInt()
            }
            for (i in 1 until calcSplit.size step 2) {
                if (calcFormula.contains(DIVIDED) || calcFormula.contains(MULTIPLY)) {
                    if (calcSplit[i].equals(DIVIDED)) {
                        resultCalc = CalcResult.result(calcFormula,calcSplit[i-1],calcSplit[i+1],
                            DIVIDED,DivideCalcWayService())
                        break
                    } else if (calcSplit[i].equals(MULTIPLY)) {
                        resultCalc = CalcResult.result(calcFormula,calcSplit[i-1],calcSplit[i+1],
                            MULTIPLY,MultiCalcWayService())
                        break
                    }
                } else {
                    if (calcSplit[i].equals(PLUS)) {
                        resultCalc = CalcResult.result(calcFormula,calcSplit[i-1],calcSplit[i+1],
                            PLUS,PlusCalcWayService())
                        break
                    } else if (calcSplit[i].equals(MINUS)) {
                        resultCalc = CalcResult.result(calcFormula,calcSplit[i-1],calcSplit[i+1],
                            MINUS,MinusCalcWayService())
                        break
                    }
                }
            }
            return result(resultCalc)
        }
    }
}