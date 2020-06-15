p = int(input('Enter the value of p = '))
q = int(input('Enter the value of q = '))
no = int(input('Enter the value of text = '))
e = int(input('Enter the value of e = '))
n = p*q
phi = (p-1)*(q-1)
for i in range(1,10):
    x = 1 + i*phi
    if x % e == 0:
        d = int(x/e)
        break
ctt =pow(no,e)
ct = ctt % n

dtt = pow(ct,d)
dt = dtt % n

print('n:',n)
print('Encryption key is:',e)
print('Phi is:',phi)
print('Decryption key is:',d)
print('Cipher Text:',ct)
print('Decrypted Text:',dt)
