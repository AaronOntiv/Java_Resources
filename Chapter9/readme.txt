9.14 En este ejercicio, creará una superclase Empleado más general que extraiga los atributos y comportamientos
de la clase EmpleadoPorComision que son comunes para todos los objetos Empleado. Los atributos y
comportamientos comunes de todos los objetos Empleado son: primerNombre, apellidoPaterno, numeroSeguro-
Social, obtenerPrimerNombre, obtenerApellidoPaterno, obtenerNumeroSeguroSocial y una parte del método
toString. Cree una nueva superclase Empleado que contenga estas variables y métodos de instancia, además de un
constructor. A continuación, vuelva a escribir la clase EmpleadoPorComision de la sección 9.4.5 como una subclase
de Empleado. La clase EmpleadoPorComision debe contener sólo las variables y métodos de instancia que no
se declaren en la superclase Empleado. El constructor de la clase EmpleadoPorComision debe invocar al constructor
de la clase Empleado y el método toString de EmpleadoPorComision debe invocar al método toString de Empleado.
Una vez que complete estas modificaciones, ejecute las aplicaciones PruebaEmpleadoPorComision y PruebaEmpleado-
BaseMasComision usando estas nuevas clases para asegurar que las aplicaciones sigan mostrando los mismos
resultados para un objeto EmpleadoPorComision y un objeto EmpleadoBaseMasComision, respectivamente.

9.14 In this exercise, you will create a more general superclass Employee that extracts the attributes and
behaviors from the CommissionEmployee class that are common to all Employee objects. The common attributes
and behaviors for all Employee objects are: firstName, lastName, socialSecurityNumber, getFirstName,
getLastName, getSocialSecurityNumber, and part of the toString method. Create a new superclass Employee
that contains these instance variables and methods, along with a constructor. Then rewrite the CommissionEmployee
class from section 9.4.5 as a subclass of Employee. The CommissionEmployee class should contain only the instance
variables and methods that are not declared in the Employee superclass. The constructor of the CommissionEmployee
class should invoke the constructor of the Employee class, and the toString method of CommissionEmployee should
invoke the toString method of Employee. Once you complete these modifications, run the TestCommissionEmployee and
TestBasePlusCommissionEmployee applications using these new classes to ensure that the applications continue to
display the same results for a CommissionEmployee object and a BasePlusCommissionEmployee object, respectively.





