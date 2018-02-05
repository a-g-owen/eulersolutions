total = 0
1.upto(999) do |i|
    total += i if i % 3 == 0 or i % 5 == 0
end
puts total