7.10 (Comisión por ventas)Utilice un arreglo unidimensional para resolver el siguiente problema: una compañía
paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa
semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, recibirá $200 más el 9% de $5,000,
o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores
recibieron salarios en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una cantidad
entera):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f ) $700-799
g) $800-899
h) $900-999
i) $1,000 en adelante

7.10 (Sales Commission) Use a one-dimensional array to solve the following problem: a company pays its salespeople on
commission. Salespeople receive $200 per week plus 9% of their total sales for that week. For example, a salesperson
 who accumulates $5,000 in sales in a week will receive $200 plus 9% of $5,000, totaling $650. Write an application
 (using an array of counters) that determines how many salespeople received salaries in each of the following ranges
 (assume each salesperson's salary is truncated to an integer amount):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f) $700-799
g) $800-899
h) $900-999
i) $1,000 and above
-Seller.java
-SellerTest.java

7.12 (Eliminación de duplicados) Use un arreglo unidimensional para resolver el siguiente problema: escriba
una aplicación que reciba como entrada cinco números.
A medida que se lea cada número, muéstrelo solamente si no es un duplicado de un número que ya se haya leído.
Prepárese para el “peor caso”, en el que los cinco números son diferentes. Use el arreglo más pequeño que sea posible
para resolver este problema. Muestre el conjunto completo de valores únicos introducidos, después de que el
usuario introduzca cada nuevo valor.
-RemovalDuplicates.java

7.12 (Eliminación de duplicados) Use a one-dimensional array to solve the following problem: write an application
that receives five numbers as input. As each number is read, display it only if it is not a duplicate of a number
that has already been read. Prepare for the "worst case" scenario, where all five numbers are different.
Use the smallest array possible to solve this problem. Show the complete set of unique values entered after the
user inputs each new value.
-RemovalDuplicates.java



7.19 (Sistema de reservaciones de una aerolínea) Una pequeña aerolínea acaba de comprar una computadora
para su nuevo sistema de reservaciones automatizado. Se le ha pedido a usted que desarrolle el nuevo sistema. Usted
escribirá una aplicación para asignar asientos en cada vuelo del único avión de la aerolínea (capacidad: 10 asientos).
Su aplicación debe mostrar las siguientes alternativas: Por favor escriba 1 para Primera Clase y Por favor
escriba 2 para Economico. Si el usuario escribe 1, su aplicación debe asignarle un asiento en la sección de primera
clase (asientos 1 a 5). Si el usuario escribe 2, su aplicación debe asignarle un asiento en la sección económica (asientos
6 a 10). Su aplicación deberá entonces imprimir un pase de abordar, indicando el número de asiento de la persona y
si se encuentra en la sección de primera clase o clase económica.
Use un arreglo unidimensional del tipo primitivo boolean para representar la tabla de asientos del avión.
Inicialice todos los elementos del arreglo con false para indicar que todos los asientos están vacíos. A medida que se
asigne cada asiento, establezca el elemento correspondiente del arreglo en true para indicar que ese asiento ya no está
disponible.
Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. Cuando esté llena la sección económica,
su programa deberá preguntar a la persona si acepta ser colocada en la sección de primera clase (y viceversa). Si
la persona acepta, haga la asignación de asiento apropiada. Si no, imprima el mensaje “El proximo vuelo sale en 3
horas”.
7.19 (Airline Reservation System) A small airline has just purchased a computer for its new automated reservation system.
You have been asked to develop the new system. You will write an application to assign seats on each flight of the
airline's only plane (capacity: 10 seats). Your application should display the following options:
Please enter 1 for First Class and Please enter 2 for Economy. If the user enters 1, your application should assign a
seat in the first-class section (seats 1 to 5). If the user enters 2, your application should assign a seat in the
economy section (seats 6 to 10). Your application should then print a boarding pass, indicating the seat number of
the person and whether they are in the first-class or economy section.
Use a one-dimensional array of the primitive type boolean to represent the plane's seat chart. Initialize all elements
of the array to false to indicate that all seats are empty. As each seat is assigned, set the corresponding element of
the array to true to indicate that the seat is no longer available.
Your application should never assign a seat that has already been assigned. When the economy section is full,
your program should ask the person if they accept being placed in the first-class section (and vice versa).
If the person accepts, make the appropriate seat assignment. If not, print the message "The next flight leaves in 3 hours."