a = int(input("Enter First Number: "))
b = int(input("Enter Second Number: "))
print("\n** PERFORMING EUCLIDEAN ALGORITHM **\n")
r1 = a
r2 = b
q = 0
r = r1
print("\t q \t\t r1 \t\t r2 \t\t r")
print("_____________" * 5)
while(r2 > 0):
    print("\t", q , "\t|\t" , r1 , "\t|\t" , r2 , "\t|\t" , r)
    q = int(r1 / r2)
    r = r1 - (q * r2)
    r1 = r2
    r2 = r
print("\nGCD = " , r1)
