import random

num=[ ]#creates list
for values in range(0,10):#appeds a random int between 0 and 100 to the list 10 times creating a list with 10 rand ints between 0 and 100
    num.append(random.randint(0,100))
print(num)#prints list
print(min(num))#prints min of list
print(max(num))#prints max of list
print(sum(num)/10)#prints the average if the list by getting the sum and dividning it by the number of elemets which is 10
num.sort()#sorts list
print(num)#prints sorted list
print ((num[5] + num[4])/2)#adds the 4 and 5 element of the list then finds the average to find the median