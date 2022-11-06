# que lea un número entero 
# determine la suma de sus cifras

puts "Escribe un numero de cuatro digitos"
numero = gets.chomp

suma = numero[0].to_i + numero[1].to_i + numero[2].to_i + numero[3].to_i
puts "[*] Resultado: #{suma}"