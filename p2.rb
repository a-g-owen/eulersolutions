f = [0,1]
total = 0
while f[1] < 4000000
    f2 = f[0] + f[1]
    f[0] = f[1]
    f[1] = f2
    total += f2 if f2 % 2 == 0
end
puts total