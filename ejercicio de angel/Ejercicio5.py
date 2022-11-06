#5.	Desarrolle el programa que dada la capacidad de un disco duro en gigabytes, lo convierta a megabytes, kilobytes y bytes. 1 KB = 1024 bytes, 1 MB = 1024 KB, 1 GB = 1024 MB.

gigaby = int(input("ingrese capacidad de disco en GB: "))

megaby = gigaby * 1024
kiloby = megaby * 1024
cbytes = kiloby * 1024

print("La capacidad del disco duro es: ",gigaby,"GB")
print("En Megabytes es: ",kiloby,"KB")
print("En bytes es: ",cbytes,"B")