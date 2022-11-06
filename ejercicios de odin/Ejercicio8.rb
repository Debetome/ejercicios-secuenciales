# Area base= π (r ** 2)
# Area lateral= 2π x r x h
# Area total= 2 x Area base x Area lateral

puts "[*] Radio: "
Radio= gets.chomp.to_i
puts "[*] Altura: "
Altura= gets.chomp.to_i

Areabase = Math::PI * (Radio ** 2)
Arealateral = (2 * Math::PI) * Radio * Altura
Areatotal = 2 * (Areabase * Arealateral)

puts "[*] Area base = #{Areabase}"
puts "[*] Area lateral = #{Arealateral}"
puts "[*] Area total = #{Areatotal}"