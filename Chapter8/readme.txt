8.10 Escriba un tipo enum llamado LuzSemaforo, cuyas constantes (ROJO, VERDE, AMARILLO) reciban un parámetro:
la duración de la luz. Escriba un programa para probar la enum LuzSemaforo, de manera que muestre las constantes de la
enum y sus duraciones.

8.10 Write an enum type called TrafficLight whose constants (RED, GREEN, YELLOW) each have a parameter representing
the duration of the light. Write a program to test the TrafficLight enum by displaying the constants
and their durations.
EnumTest.java






8.11 (Números complejos) Cree una clase llamada Complejo para realizar operaciones aritméticas con números
complejos. Estos números tienen la forma
parteReal + parteImaginaria * i
en donde i es sqrt(–1) Escriba un programa para probar su clase. Use variables de punto flotante para representar los datos private de la
clase. Proporcione un constructor que permita que un objeto de esta clase se inicialice al declararse. Proporcione un
constructor sin argumentos con valores predeterminados, en caso de que no se proporcionen inicializadores. Ofrezca
métodos public que realicen las siguientes operaciones:
a) Sumar dos números Complejo: las partes reales se suman entre sí y las partes imaginarias también.
b) Restar dos números Complejo: la parte real del operando derecho se resta de la parte real del operando
izquierdo, y la parte imaginaria del operando derecho se resta de la parte imaginaria del operando izquierdo.
c) Imprimir números Complejo en la forma (parteReal, parteImaginaria).

8.11(Complex Numbers) Create a class called Complex to perform arithmetic operations with complex numbers.
These numbers have the form realPart + imaginaryPart * i, where i is the imaginary unit defined as √(-1).
Write a program to test your class. Use floating-point variables to represent the private data
members of the class. Provide a constructor that allows an object of this class to be initialized
upon declaration. Provide a default constructor with default values in case no initializers are provided.
Offer public methods that perform the following operations:
a) Add two Complex numbers: add their real parts together and their imaginary parts together.
b) Subtract two Complex numbers: subtract the real part of the right operand from the real part of the
left operand, and subtract the imaginary part of the right operand from the imaginary part of the left
operand.
c) Print Complex numbers in the form (realPart, imaginaryPart).
ComplexNumer.java
ComplexNumberText.java
