﻿# Calculadora ED
Proyecto
Estructuras de Datos
enero – mayo 2024
Hacer una calculadora que pueda realizar operaciones aritméticas sobre números reales,
tanto negativos como positivos, y que cuente con una interfaz gráfica amigable para el
usuario. El usuario indica las operaciones a realizar a través de expresiones en notación
infija las cuales pueden incluir suma, resta, multiplicación, división y potencia. Además,
pueden tener paréntesis para alterar el orden estándar de ejecución de los operadores. La
interfaz necesita contar con botones para las cinco operaciones mencionadas
anteriormente y los dos paréntesis (izquierdo y derecho), también debe tener un botón
para cada uno de los diez dígitos 0-9, uno para el punto decimal, uno para indicar
“cambio de signo” (para poder expresar valores negativos), y uno con el símbolo = para
que el programa comience a evaluar la expresión que el usuario haya ingresado. Puede
ser conveniente que la calculadora también tenga un botón para “limpiar el contenido”
de la ventana de despliegue (y así pueda el usuario empezar a indicar una nueva
expresión a evaluar).
Cuando el usuario apriete el botón = se deben realizar tres pasadas sobre la expresión
que ingresó:
1) Verificar su validez (por ejemplo, asegurarse de que los paréntesis estén
balanceados, asegurarse de que no se hayan puesto dos operadores seguidos
como “1+*53.2”, y filtrar otros posibles errores sintácticos parecidos a éste).
2) Convertir la expresión (que ahora se sabe que es sintácticamente válida, y que
está en notación infija) a su equivalente en notación postfija.
3) Evaluar la expresión en notación postfija para conocer su resultado global. El
resultado debe mostrarse en la ventana de despliegue de la calculadora (la cual
también debe utilizarse para irle mostrando al usuario los botones que ha ido
apretando antes de apretar el botón = y para mostrar cualquier mensaje de error
que pueda ser necesario desplegar).
