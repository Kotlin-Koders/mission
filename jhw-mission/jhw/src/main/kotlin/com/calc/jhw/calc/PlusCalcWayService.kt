package com.calc.jhw.calc

/**
 * packageName    : com.calc.jhw.calc
 * fileName       : PlusCalc
 * author         : jhw1015
 * date           : 2023/09/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/13           jhw1015           최초 생성
 */
class PlusCalcWayService : CalcWayService {
    override fun calc(num1: Int, num2: Int): Int = num1 + num2
}
