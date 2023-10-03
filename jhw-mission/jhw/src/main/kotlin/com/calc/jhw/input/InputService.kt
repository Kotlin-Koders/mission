package com.calc.jhw.input

import java.util.Scanner

/**
 * packageName    : com.calc.jhw.input
 * fileName       : InputService
 * author         : jhw1015
 * date           : 2023/09/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/14           jhw1015           최초 생성
 */
class InputService {

    companion object {
        val sc = Scanner(System.`in`)
        fun calculationFormula() : String = sc.nextLine()
        fun inputOption() : Int = sc.nextLine().toInt()
    }
}