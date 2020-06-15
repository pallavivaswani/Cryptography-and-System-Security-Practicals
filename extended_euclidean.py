a = int(input("Enter Number in which set, Inverse is to be found: "))
b = int(input("Enter Number whose Inverse is to be found: "))
print("\n** PERFORMING EXTENDED EUCLIDEAN ALGORITHM **\n")
r1 = a
r2 = b
t1 = 0
t2 = 1
t = 0
q = 0
r = r1
print("\t q \t\t r1 \t\t r2 \t\t r \t\t t1 \t\t t2 \t\t t")
print("________________" * 7)
while(r2 > 0):
    print("\t", q , "\t|\t" , r1 , "\t|\t" , r2 , "\t|\t" , r , "\t|\t" , t1, "\t|\t", t2, "\t|\t", t)
    q = int(r1 / r2)
    r = r1 - (q * r2)
    r1 = r2
    r2 = r
    t = t1 - (q * t2)
    t1 = t2
    t2 = t
if (r1 == 1):    
    print("\nInverse = ", t1)
    if (t1 < 0):
        print("Positive Inverse = ", (26 + t1))
