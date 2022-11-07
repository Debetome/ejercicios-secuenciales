#2.	Desarrolle el programa que permite convertir una cantidad dada en metros a su equivalente en centímetros, pulgadas, pies y yardas.Considere los siguientes factores de conversión : 1 metro = 100 cm, 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm

print("Haciendo converciones...")

met = int(input("ingrese la cantidad en metros: "))
 centi = met * 100 
 pulga = centi / 2.54
 pies = pulga / 12
 yardas = pies / 3

 print(("Centimetros: ",format(centi,".2f")),"cm")
 print(("Pulgadas: ",format(pulga,".2f")),"in")
 print(("Pies: ",format(pies,".2f")),"ft")
 print(("Yardas: ",format(yardas,".2f")),"yd")
 