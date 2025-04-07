meses = [
    "enero", "febrero", "marzo", "abril", "mayo", "junio",
    "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
]

dias_por_mes = [31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31]

for i in range(len(meses)):
    print("Mes:", meses[i])

    dias = dias_por_mes[i]
    semanas = (dias + 6) // 7  # Redondear hacia arriba

    for semana in range(1, semanas + 1):
        print(f"  Semana {semana}")

    print()  # Línea en blanco entre meses
