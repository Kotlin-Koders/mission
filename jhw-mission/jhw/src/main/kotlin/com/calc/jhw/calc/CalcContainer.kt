package com.calc.jhw.calc

import com.calc.jhw.output.Print
import java.util.TreeMap

/**
 * packageName    : com.calc.jhw.calc
 * fileName       : CalcContainer
 * author         : jhw1015
 * date           : 2023/09/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/13           jhw1015           최초 생성
 */
class CalcContainer {

    companion object {
        val container = LinkedHashMap<String, Int>()
        fun put(key: String, value: Int) {
            container.put(key, value)
        }

        fun get(): Map<String, Int> = container
    }
}
