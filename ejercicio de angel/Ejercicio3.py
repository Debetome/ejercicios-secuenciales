#3.	Una persona ha recorrido tres tramos de una carretera. La longitud del primer tramo está dada en kilómetros, el segundo tramo en pies y el tercer tramo en millas. Desarrolle el programa que determine la longitud total recorrida en metros y en yardas. Considere los siguientes factores de conversión: 1 metro = 3.2808 pies, 1 milla = 1609 metros.


kilom = float(input("ingrese la longitud del primer tramo(kilometros): "))
pies = float(input("ingrese la longitud del segundo tramo(pies): "))
millas = float(input("ingrese la longitud del tercer tramo(millas): "))

tramo_uno = kilom * 1000
tramo_dos = pies / 3.2808
tramo_tres = millas * 1609
total_metr = tramo_uno + tramo_dos + tramo_tres
total_yardas = ((total_metr * 3.2808) / 3)

print("El total de metros: ",format(total_metr,".2f"),"m")
print("El total en yardas: ",format(total_yardas,"2f"),"yd")
