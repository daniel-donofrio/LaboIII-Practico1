## Ejercicio 2

La plataforma Java es el entorno para desarrollar y gestionar applets y aplicaciones Java. Consta de tres componentes principales: el lenguaje Java, los paquetes Java y la máquina virtual Java.
El lenguaje Java y los paquetes son similares a C++ y sus bibliotecas de clases. Los paquetes Java contienen clases, que están disponibles en cualquier implementación Java compatible. La interfaz de programación de aplicaciones (API) debe ser la misma en cualquier sistema que soporte Java.
Java difiere de un lenguaje tradicional, como C++, en la forma en que compila y ejecuta. En un entorno de programación tradicional, usted escribe y compila el código fuente de un programa en código objeto para un sistema operativo y un hardware específicos. El código objeto se enlaza con otros módulos de código objeto para crear un programa en ejecución. El código es específico con respecto a un conjunto determinado de hardware de sistema y no funciona en otros sistemas si no se realizan cambios.


## Ejercicio 3

Java Runtime Environment, o JRE , es una capa de software que se ejecuta sobre el software del sistema operativo de una computadora y proporciona las clases de bibliotecas y otros recursos que un programa Java específico necesita para ejecutarse.

JDK (Java Development Kit) es un paquete de herramientas de desarrollo de software y bibliotecas de soporte combinadas con Java Runtime Environment (JRE) y Java Virtual Machine (JVM).
Es un entorno de desarrollo para crear aplicaciones, subprogramas y componentes utilizando el lenguaje de programación Java. Contiene varias herramientas y recursos esenciales para desarrollar aplicaciones utilizando el lenguaje de programación Java. Dentro de sus componentes clave se encuentra el compilador de Java que traduce el código fuente de Java en bytecode que puede ejecutarse en cualquier plataforma con una máquina virtual Java (JVM).

La diferencia es que el JDK es algo que se utiliza para desarrollar aplicaciones java , como su nombre lo indica es un kit de desarrollo para Java, mientra que el JRE es el entorno de ejecución, es algo que necesita instalar en su computadora para poder ejecutar aplicaciones Java después de que hayan sido desarrolladas y compiladas en un JDK.

## Ejercicio 4

JVM es el núcleo del ecosistema Java, permitiendo al software basado en esta tecnología seguir el enfoque "escríbelo una sola vez, ejecútalo en cualquier parte (write once, run anywhere)". Puedes escribir código Java en un tipo de máquina concreto, y ejecutarlo en cualquier otro tipo de máquina usando la JVM. Una máquina virtual es la representación virtual de un ordenador físico. Normalmente, se llama huésped (guest) a la máquina virtual, mientras que al ordenador físico en que se ejecuta, se le suele llamar anfitrión (host). El código es compilado a bytecode (un formato binario independiente del hardware y del sistema operativo, que representa instrucciones de la JVM) generando un fichero con formato class. Este fichero class es interpretado por la JVM en la plataforma anfitriona. Un mismo fichero class puede ser ejecutado por la JVM en cualquier plataforma y sistema operativo.
De manera similar a las máquinas virtuales, la JVM crea un espacio aislado en la máquina anfitriona. Este espacio se usa para ejecutar programas Java sea cual sea la plataforma o el sistema operativo de dicha máquina.

## Ejercicio 5

Java tiene varios tipos de datos integrados, que se dividen en dos categorías principales: tipos de datos primitivos y tipos de datos de referencia.
Los tipos de datos primitivos son los tipos de datos básicos que proporciona el lenguaje Java. Incluyen:
    - Enteros:
            - byte: es un tipo de datos de 8 bits que almacena valores enteros en el rango de -128 a 127.
            - short: es un tipo de datos de 16 bits que almacena valores enteros en el rango de -32768 a 32767.
            - int: es un tipo de datos de 32 bits que almacena valores enteros en el rango de -2147483648 a 2147483647.
            - long: es un tipo de datos de 64 bits que almacena valores enteros en el rango de -9223372036854775808 a 9223372036854775807.
    - Punto flotante:
            - float: es un tipo de datos de 32 bits que almacena valores de punto flotante con precisión simple.
            - double: es un tipo de datos de 64 bits que almacena valores de punto flotante con precisión doble.
    - Caracteres:
            - char: es un tipo de datos de 16 bits que almacena un carácter en el rango de 0 a 65535.
    - Booleanos:
            - boolean: es un tipo de datos de 1 bit que almacena valores lógicos, es decir, true o false.

## Ejercicio 6

 En Java existen tres tipos de variables: locales, de instancia y estáticas:
    - Variables locales: se declaran dentro de un método o bloque de código. Solo son accesibles dentro de ese ámbito y se eliminan al finalizar su ejecución.
    - Variables de instancia: se declaran dentro de una clase, pero fuera de cualquier método. Se asocian a cada objeto creado a partir de la clase y se mantienen durante toda la vida útil del objeto. 
    - Variables estáticas: se declaran con la palabra clave static, son compartidas por todos los objetos de la clase.

La diferencia entre una variable local y una de instancia es que las variables locales son solo accesibles dentro del ámbito en el que se declaró y se eliminan al finalizar la ejecución de dicho bloque de código, mientras que las variables de instancia se asocian a cada objeto creado a partir de la clase en la que fueron declaradas y se mantienen durante toda la vida útil de dicho objeto. 

## Ejercicio 7

En Java, el "heap" se refiere a la región de memoria donde se almacenan los objetos creados durante la ejecución de un programa. Es una parte crucial del modelo de administración de memoria en Java y juega un papel fundamental en el manejo de objetos y la gestión de la memoria.
La memoria heap es crucial para Java ya que: 
    - Permite la asignación dinámica de memoria para objetos, sin necesidad de preocuparse por la gestión manual de la memoria.
    - Facilita el manejo de objetos y referencias, ya que todas las variables de referencia apuntan a objetos en el heap.
    - El recolector de basura de Java gestiona automáticamente la memoria en el heap, previniendo fugas de memoria y garantizando un uso eficiente de los recursos.
    - El tamaño del heap puede ajustarse para satisfacer las necesidades específicas de la aplicación, lo que puede mejorar el rendimiento y prevenir problemas de falta de memoria.

## Ejercicio 8 y 9

Los modificadores de acceso determinan la visibilidad de una función en relación con otras clases y objetos.

    - Public: La función es accesible desde cualquier clase.
    - Private: La función sólo es accesible dentro de la misma clase en la que se define.
    - Protected: La función es accesible dentro de la misma clase y sus subclases.
    - Sin modificador (por defecto): La función es accesible dentro del mismo paquete.

## Ejercicio 10

Un Paquete en Java es un contenedor de clases que permite agrupar las distintas partes de un programa y que por lo general tiene una funcionalidad y elementos comunes, definiendo la ubicación de dichas clases en un directorio de estructura jerárquica.
Los paquetes permiten poner en su interior casi cualquier cosa como: clases, interfaces, archivos de texto, entre otros.
Para utilizar los elementos de un paquete es necesario importar este en el módulo de código en curso, usando para ello la sentencia import.

## Ejercicio 11

En Java, el alcance de una variable local se limita al bloque en el que se declara. Un bloque puede ser un método, un bucle, una declaración condicional (como un if o un else), o cualquier conjunto de llaves {} que delimiten un área de código.

Se declaran de la siguiente manera:
tipoDeDato nombreDeVariable;

## Ejercicio 12

Al igual que en todos los lenguajes, el método main() en Java es el punto de entrada principal para la ejecución de un programa Java. Cuando ejecutas un programa Java, el sistema busca el método main() y lo utiliza como punto de inicio para ejecutar el programa.
Su propósito es ser el punto desde el cual comienza la ejecución del programa. El sistema Java invoca este método cuando se inicia la ejecución del programa.El método main(), además puede contener la lógica inicial del programa, incluyendo la inicialización de variables, la interacción con el usuario y la invocación de otros métodos necesarios para comenzar la ejecución del programa. Por último, cuando ejecutas un programa Java desde la línea de comandos, se pueden pasar argumentos al programa. El método main() puede recibir estos argumentos como un arreglo de cadenas (String[] args) y utilizarlos según sea necesario.

## Ejercicio 13

Un constructor sirve para inicializar el objeto y establecer sus propiedades y valores predeterminados. Tiene el mismo nombre que la clase y no cuenta con ningún valor de retorno, ya que su función principal es inicializar el objeto y no devolver ningún valor.

## Ejercicio 17

No consideramos que el código sea correcto ya que de la forma que se encuentra planteado cualquiera podría acceder al estado del objeto.

## Ejercicio 18

El resultado que se presenta en consola será 099 ya que se inicializa la variable “i” en 99 y luego en el ciclo for se inicializa una variable local “i” en 0. Luego se imprime el 0 de la variable local sin un salto de linea y se corta el ciclo mediante un break, para finalmente imprimir el valor de la variable global “i” el cual era 99.

# Ejercicio 19

Para declarar un atributo que permanecerá inmutable a lo largo de toda la ejecución de un programa, se utiliza el modificador final. Cuando se marca una variable como final, significa que su valor no puede ser cambiado una vez que ha sido inicializado.

## Ejercicio 20

La respuesta correcta es 4 4, ya que la suma no se hace efectiva en la asignación, por lo tanto a “i” se le va a asignar el valor de x que es 4 y luego se sumará 1 a x pasando a ser 5, pero como la suma del último valor de x no afecta a la asignación previa de x a i, se mostrará 4.

## Ejercicio 21

El código imprimira en la consola los siguientes números:
4
0
4
5
0
4
9
