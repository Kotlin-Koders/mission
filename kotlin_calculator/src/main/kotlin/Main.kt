fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    var calculateService = CalculateService()
    calculateService.run()
}