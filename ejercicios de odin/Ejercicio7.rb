# Area= b x h
# Perimetro= 2(b + h)

puts "[*] Base: "
Base = gets.chomp.to_i
puts "[*] Altura: "
Altura = gets.chomp.to_i

Area = Base * Altura
Perimetro = 2 * ( Base + Altura )

puts "[*] Area: #{Area}"
puts "[*] Perimetro: #{Perimetro}"