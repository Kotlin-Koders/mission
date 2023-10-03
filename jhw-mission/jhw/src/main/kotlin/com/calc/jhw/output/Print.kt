package com.calc.jhw.output

import com.calc.jhw.calc.CalcContainer

/**
 * packageName    : com.calc.jhw.output
 * fileName       : Print
 * author         : jhw1015
 * date           : 2023/09/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/15           jhw1015           최초 생성
 */
class Print {
    companion object {
        fun getResultAll() {
            CalcContainer.get().forEach { key, value ->
                println("${key} = ${value}")
            }
        }
            fun calcResult(result: Int) {
                println("결과 : ${result}")
            }
        }
    }
