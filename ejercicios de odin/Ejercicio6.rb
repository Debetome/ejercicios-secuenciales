# Area= 2πr(r+h)
# Volumen= πr^2h

puts "[*] Radio: "
Radio = gets.chomp.to_i
puts "[*] Altura: "
Altura = gets.chomp.to_i

Area = 2 * Math::PI * Radio * (Radio + Altura)
Volumen = Math::PI * (Radio ** 2) * Altura

puts "[*] Area: #{Area}"
puts "[*] Volumen: #{Volumen}"