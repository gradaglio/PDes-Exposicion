# tests.py
import math
import unittest

from src.math import is_prime, cubic, say_hello, potencia


class TestMath(unittest.TestCase):
    def test_is_prime(self):
        self.assertFalse(is_prime(4))
        self.assertTrue(is_prime(2))
        self.assertTrue(is_prime(3))
        self.assertFalse(is_prime(8))
        self.assertFalse(is_prime(10))
        self.assertTrue(is_prime(7))
        self.assertEqual(is_prime(-3), 'Los números primos son naturales mayores a 1')
        self.assertEqual(is_prime(1), 'Los números primos son naturales mayores a 1')

    def test_cubic(self):
        self.assertEqual(cubic(2), 8)
        self.assertEqual(cubic(-2), -8)
        self.assertNotEqual(cubic(2), 4)
        self.assertNotEqual(cubic(-3), 27)
        self.assertEqual(cubic(0), 0)
        self.assertEqual(cubic(1.5), 3.375)

    def test_say_hello(self):
        self.assertEqual(say_hello("Geekflare"), "Hello, Geekflare")
        self.assertEqual(say_hello("Chandan"), "Hello, Chandan")
        self.assertNotEqual(say_hello("Chandan"), "Hi, Chandan")
        self.assertNotEqual(say_hello("Hafeez"), "Hi, Hafeez")


    def test_potencia_de_a(self):
        self.assertEqual(potencia(2,5), 32)
        self.assertNotEqual(potencia(-2, 5), 32)
        self.assertEqual(potencia(-2, 3), -8)
        self.assertEqual(potencia(25, 1), 25)
        self.assertEqual(potencia(2, 5), 32)



    if __name__ == '__main__':
        unittest.main()

