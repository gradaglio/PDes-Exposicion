
class CalculoPotencia {
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


    }
}

