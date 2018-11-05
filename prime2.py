n=eval(input("please input a number: "))

ls=[]
ls.append(2)
for a in range(3,n):
	b=False
	for b in ls:
		if a%b==0:
			b=False
			break
		else:
			b=True

	if b==True:
		ls.append(a)
	
print(ls)
