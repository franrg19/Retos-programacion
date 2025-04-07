"""
1 ENUNUCIADO: Desarrolla un algoritmo que, dado un número decimal, devuelve su resultado entero redondeado siguiendo estas normas:
Todos los números decimales por debajo de ,5 se redondean a la baja.
Los que tengan decimales desde ,5 a superior, se redondean al alza.
"""
nota = float(input("¿cual es la nota del alumno con dos decimales separados por comas?"))
nota_redondeada = round(nota)
print("tu nota final es: " , nota_redondeada)

