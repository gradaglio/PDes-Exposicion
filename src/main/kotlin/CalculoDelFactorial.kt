class CalculoDelFactorial {
    companion object {
        fun factorial(numero: Int): Any {
            var res = 1

            if (numero < 1){
                return "En número debe ser mayor a 0"
            } else {
                res = calculoFactorial(numero)
            }
            return (res)
        }

        fun calculoFactorial(numero: Int): Int {
            var factorial = 1
            for (i in 1..numero) factorial *= i
            return (factorial)
        }
    }
}