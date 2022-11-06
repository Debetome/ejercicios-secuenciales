# Desarrolle el programa que permite obtener el número al revés

puts "Escribe un numero de 4 digitos"
numero = gets.chomp

suma = numero[3] + numero[2] + numero[1] + numero[0]
puts "[*] Resultado: #{suma}"