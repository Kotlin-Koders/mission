package repository

import domain.CalculationResult

object CalculationRepository {

    val store: MutableList<CalculationResult> = mutableListOf()

    fun save(calculationResult: CalculationResult) {
        store.add(calculationResult)
    }

    fun findAll(): List<CalculationResult> {
        return store.toList()
    }
}