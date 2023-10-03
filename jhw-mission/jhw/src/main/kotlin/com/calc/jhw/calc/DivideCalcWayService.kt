package com.calc.jhw.calc

import java.lang.IllegalStateException
import java.util.IllegalFormatException

/**
 * packageName    : com.calc.jhw.calc
 * fileName       : DivideCalcService
 * author         : jhw1015
 * date           : 2023/09/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/13           jhw1015           최초 생성
 */
class DivideCalcWayService : CalcWayService {
    override fun calc(num1: Int, num2: Int): Int  {
        try
        {
            return num1 / num2
        }catch (e: Exception) {
            throw IllegalStateException("0으로 나눌 수 없음")
        }
    }
}