#4.	En países de habla inglesa, es común dar la estatura de una persona como la suma de una cantidad de pies, más una cantidad de pulgadas, por ejemplo 3’ 2”. Desarrolle el programa que determine la estatura en metros dada su estatura en el formato inglés.

print("Calculando la estatura de las personas de pies a metros...")

pies = float(input("Pies: "))
pulgadas = float(input("Pulgadas: "))

estatura = (((pies * 12) + pulgadas) * 2.54) / 100

print("La estatura en metros es: ",format(estatura,".2f"),"m")