import java.util.Arrays

class CalculateService {

    private val calculateRecodes = CalculateRecodes()
    private val consoleModule = ConsoleModule()
    private val calculator = PolynomialCalculate()

    fun run() {
        var t = true
        while (t) {
            consoleModule.menu()
            var choice = consoleModule.input().toInt()

            if (choice == 1) {
                consoleModule.output(calculateRecodes)
            } else if (choice == 2) {
                var input = consoleModule.input()
                var result =  calculator.calculateByString(input)
                consoleModule.output(result.result)
                calculateRecodes.recodes.add(result)
            } else {
                t = false
                consoleModule.output("안녕히가쇼")
            }
        }
    }
}