import org.junit.Assert
import org.junit.Before
import org.junit.Test


class CalculoPotenciaKtTest(){


    @Before
    fun setUp() {
    }

    @Test
    fun `calcular la potencia cuadrada de 4 es 16`(){

        Assert.assertEquals(16, CalculoPotencia.potencia(4,2))
    }

    @Test
    fun `La potencia cubica de -2 es -8`(){

        Assert.assertEquals(-8, CalculoPotencia.potencia(-2,3))
    }

    @Test
    fun `calcular la potencia cero de cero es indefinida`(){

        Assert.assertEquals("No tiene resultado, es indefinida", CalculoPotencia.potencia(0,0))
    }

    @Test
    fun `La potencia cuyo exponente es negativo no tiene solucion`(){

        Assert.assertEquals("La potencia debe ser un número mayor o igual a 0", CalculoPotencia.potencia(2,-1))
    }

}


