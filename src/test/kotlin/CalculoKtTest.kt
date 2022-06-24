import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculoKtTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `calcular la potencia cuadrada de 4 es 16`(){

        Assert.assertEquals(16, Calculo.potencia(4,2))
    }

    @Test
    fun `La potencia cubica de -2 es -8`(){

        Assert.assertEquals(-8, Calculo.potencia(-2,3))
    }

    @Test
    fun `calcular la potencia cero de cero es indefinida`(){

        Assert.assertEquals("No tiene resultado, es indefinida", Calculo.potencia(0,0))
    }

    @Test
    fun `La potencia cuyo exponente es negativo no tiene solucion`(){

        Assert.assertEquals("La potencia debe ser un número mayor o igual a 0", Calculo.potencia(2,-1))
    }

    @Test
    fun `El factorial de 4 es 24`(){
        Assert.assertEquals(24, Calculo.factorial(4))
    }

    @Test
    fun `El factorial -2 no tiene solucion`(){
        Assert.assertEquals("En número debe ser mayor a 0", Calculo.factorial(-2))
    }


}