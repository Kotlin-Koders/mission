package controller

import domain.*
import repository.CalculationRepository

class InquiryController(): Controller {

    override fun run() {
        val calculationResults: List<CalculationResult> = CalculationRepository.findAll()
        for (calculationResult in calculationResults) {
            println(calculationResult.expression + " = " + calculationResult.result)
        }
    }
}