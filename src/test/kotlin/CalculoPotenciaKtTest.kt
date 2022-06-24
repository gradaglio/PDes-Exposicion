import org.junit.Assert
import org.junit.Before
import org.junit.Test


class CalculoPotenciaKtTest(){


    @Before
    fun setUp() {
    }

    @Test
    fun `calcular la potencia cuadrada de 4 es 16`(){

        Assert.assertEquals(16, CalculoDePotencia.potencia(4,2))
    }

    @Test
    fun `La potencia cubica de -2 es -8`(){

        Assert.assertEquals(-8, CalculoDePotencia.potencia(-2,3))
    }

    @Test
    fun `calcular la potencia cero de cero es indefinida`(){

        Assert.assertEquals("No tiene resultado, es indefinida", CalculoDePotencia.potencia(0,0))
    }

    @Test
    fun `La potencia cuyo exponente es negativo no tiene solución`(){

        Assert.assertEquals("La potencia debe ser un número mayor o igual a 0", CalculoDePotencia.potencia(2,-1))
    }

}


