import random
directions =["North","South","East", "West"] #creates the list
int= random.randint(1,4) # makes a random int and stores int as a variable
print(int) #print the int
decision = input("would you like to continue enter 'y' for yes and 'n' for no \n") #ask user and store input

while(decision!="n"): #im assuming the only inputs are going to be "n" or "y"
    print("you decided to go "+directions[int-1]) #i subrtracted 1 so that way i dont go out of the list indexs
    int= random.randint(1,4)
    print(int)
    decision = input("would you like to continue enter 'y' for yes and 'n' for no \n")