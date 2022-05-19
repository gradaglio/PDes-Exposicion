import math


def is_prime(n):
    #if n < 0:
    #    return 'no existen números primos negativos'

    if n<= 1:
        return 'Los números primos son naturales mayores a 1'

    if n == 2:
        return True

    if n % 2 == 0:
        return False

    prime = True
    for i in range(3,n-1):
        if n % i == 0:
            prime = False
    return prime

def cubic(a):
    return a*a*a

def potencia(a,e):
    potencia_de_a = 1
    for i in range (1,e+1):
        potencia_de_a = potencia_de_a * a
    return potencia_de_a

def say_hello(name):
    return "Hello, " + name


