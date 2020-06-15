p, g = input("Enter Values of Public Keys: ").split()
p = int(p)
g = int(g)
x = int(input("Enter Value of x chosen by 1st User: "))
y = int(input("Enter Value of y chosen by 2nd User: "))

# calculating R1 and R2
R1 = pow(g, x, p)
print("1st User transmits R1 ({}) to 2nd User".format(R1))
R2 = pow(g, y, p)
print("2nd User transmits R2 ({}) to 1st User".format(R2))

# calculating Shared Secret Key K
print("\nBoth user generate Shared Secret Key\n")
K1 = pow(R2, x, p)
K2 = pow(R1, y, p)
if K1 == K2:
	print("Shared Secret Key, K = {}".format(K1))
else:
	print("Shared Secret Key not generated.")
