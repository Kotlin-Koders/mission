package com.calc.jhw

import com.calc.jhw.calc.CalcContainer
import com.calc.jhw.calc.CalcExceed
import com.calc.jhw.input.InputService
import com.calc.jhw.output.Print
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class JhwApplication

fun main(args: Array<String>) {
    while (true) {
        println("""
            1. 계산
            2. 조회
            3. 종료
        """.trimIndent())
        val inputOption = InputService.inputOption()
        if(inputOption == 3) {
            break
        }
        if(inputOption == 1) {
            val calculationFormula = InputService.calculationFormula()
            val result = CalcExceed.result(calculationFormula)
            Print.calcResult(result)
            CalcContainer.put(calculationFormula,result)
        }else {
            Print.getResultAll()
        }
    }
}
