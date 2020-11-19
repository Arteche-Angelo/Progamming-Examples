#Angelo arteche
#creates dictionary
Video_Games = {
'Mordhau' : 5,
'Kingdom Come Deliverence': 4,
'Rimworld' : 2,
'Phasmophobia':3,
'Rising Storm 2 Vietnam':1,
}

#functions one-seven represnt the code that will run when the user selects the corresponding option in the user menu

#notifies user of end of program
def zero():
    print("exiting program...")
#prints the dictionary Video_Games
def one():
    print("Dictionary: ")
    print(Video_Games)
#prints the keys inside Video_Games
def two():
    print("Keys in dictionary")
    for key in Video_Games.keys():
        print("key: " + str(key))
#Prints the values inside Video_Games
def three():
    print("Values in dictionary")
    for value in  Video_Games.values():
        print("value: " + str(value))
#stores user input and then checks if theres a key that matches that input. if no match prints no value assigend
def four():
    print("enter the key you want to access")
    key=input()
    print("Value for " + key )
    print(Video_Games.get(key,"no value assigned"))
#stores user input for a key-value pair then checks if the key already exists
#if the key already exisits the user is asked if they want to overwrite the value
#if user says yes then it overwrites the value and prints dictionary
#if user says no or anything other than yes the value is preserved
def five():
    print("enter the key you want to add: ")
    key=input()
    print("enter the value you want to add: ")
    value=input()
    if key in Video_Games.keys():
        print("Key alredy exists, would you like to overwrite? y/n")
        ovr=input()
        if ovr == "y":
            Video_Games[key]= value
            print(Video_Games)
        else:
            print("key-value Preserved")

#stores user input for desired key to delete
#if the key is present then its deleted and dictionary is printed
#if its not present then the user is notified
def six():
    print("enter the key you want to delete: ")
    key=input()
    if key in Video_Games.keys():
        del Video_Games[key]
        print("updated dictionary: " )
        print(Video_Games)
    else:
        print("key not in dictionary")
#prints the number of key-Value pairs in Video_Games
def seven():
    print("number of key-value pairs: ")
    print(len(Video_Games))
#the menu the user is presented with
def menu():
    print('\nplease select an option:')
    print('0:exit')
    print('1:print dictionary')
    print('2:print keys')
    print('3:print values')
    print('4:enter key and print asscociated vaule')
    print('5:add new key-value and print dictionary')
    print('6:remove key-value and print dictionary')
    print('7:print number of key-value pairs')
#calls the menu, displying it to the user
menu()
#gets users input
option = input("\n")

while True:
    #checks the users selected option and runs the corresponding fucntion
    if option == '0':
        zero()
        break
    elif option == '1':
        one()
    elif option =='2':
        two()
    elif option == '3':
        three()
    elif option == '4':
        four()
    elif option =='5':
        five()
    elif option == '6':
        six()
    elif option == '7':
        seven()
    else:
        print("option not valid. please select a valid option.")
    #re displays the menu to user and getting user input
    menu()
    option =input("\n")