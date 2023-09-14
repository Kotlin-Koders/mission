import controller.CalculationController
import controller.EndController
import controller.InquiryController

fun main(args: Array<String>) {

    val inquiryController = InquiryController()
    val calculationController = CalculationController()
    val endController = EndController()

    running@ while (true) {
        when (choiceController()) {
            1 -> inquiryController.run()
            2 -> calculationController.run()
            3 -> {
                endController.run()
                break@running
            }
            else -> {
                println("해당 번호에 맞는 기능이 없습니다. 다시 입력해주세요.")
                inquiryController.run()
            }
        }
    }
}

fun choiceController(): Int {
    print(
        """
        1. 조회
        2. 계산
        3. 종료
        선택 : 
    """.trimIndent()
    )

    return readln().toInt()
}
