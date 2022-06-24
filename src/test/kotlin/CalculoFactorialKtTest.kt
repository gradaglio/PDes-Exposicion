import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculoFactorialKtTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `El factorial de 4 es 24`(){
        Assert.assertEquals(24, CalculoFactorial.factorial(4))
    }

    @Test
    fun `El factorial -2 no tiene solucion`(){
        Assert.assertEquals("En número debe ser mayor a 0", CalculoFactorial.factorial(-2))
    }
}