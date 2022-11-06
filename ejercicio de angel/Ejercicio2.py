#2.	Desarrolle el programa que permite convertir una cantidad dada en metros a su equivalente en centímetros, pulgadas, pies y yardas.Considere los siguientes factores de conversión : 1 metro = 100 cm, 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm

print("Haciendo converciones...")

met = int(input("ingrese la cantidad en metros: "))
cent = met * 100
print("la cantidad en centimetros es: ",cent)

pie = int(input("ingrese la cantidad en pies: "))
pulg = pie * 12 / 1
print("la cantidad en pulgadas es: ",pulg)

yard = int(input("ingrese la cantidad en yardas: "))
pies = yard * 3 / 1
print("la cantidad en pies es:",pies)

pulga = int(input("ingrese la cantidad en pulgadas: "))
centi = pulga * 2.54 / 1
print("la cantidad en centimetros es: ",centi)