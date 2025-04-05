numero = float(input("introduce un numero decimal: "))
if(numero - int(numero)> 0.5):
    print (int(numero)+1)
else: print (int(numero))



# 2.Lista de los meses del año con su respectivo número de días
meses = [
    ("Enero", 31), ("Febrero", 28), ("Marzo", 31), ("Abril", 30),
    ("Mayo", 31), ("Junio", 30), ("Julio", 31), ("Agosto", 31),
    ("Septiembre", 30), ("Octubre", 31), ("Noviembre", 30), ("Diciembre", 31)
]

# Iterar los meses del año
for mes, dias in meses:
    print(f"{mes}:\n")
    
    # Cabecera de las semanas
    print("Lun Mar Mié Jue Vie Sáb Dom")
    
    # Variable para rastrear el día de la semana
    dia_semana = 1  # 1 = lunes
    
    # Imprimir los espacios iniciales si el mes no empieza el lunes
    for _ in range(dia_semana - 1):
        print("    ", end="")
    
    # Iterar los días del mes
    for dia in range(1, dias + 1):
        print(f"{dia:>3}", end=" ")  # Imprimir día con 3 caracteres
        dia_semana += 1
        
        # Salto de línea cada vez que termina una semana
        if dia_semana > 7:
            print()
            dia_semana = 1
    
    print("\n")  # Espacio al final de cada mes