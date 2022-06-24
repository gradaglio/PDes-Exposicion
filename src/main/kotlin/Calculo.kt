class Calculo {

    companion object {
        fun potencia(numero1: Int, numero2: Int): Any {
            var res = 1
            if ((numero1 == 0) && (numero2 == 0)) {
                return ("No tiene resultado, es indefinida")
            } else if (numero2 < 0) {
                return ("La potencia debe ser un número mayor o igual a 0")
            } else {
                for (i in 1..numero2) {
                    res = res * numero1
                }
                return (res)
            }
        }

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