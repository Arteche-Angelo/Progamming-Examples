#creates fucntion that takes a positonal arguement then arbitary arguements
def company_names(num_comps,*names):
    #prints the positional arguement
    print("There is "+str(num_comps)+" companies. They are:")

    #prints the arbitary arguements
    for name in names:
        print(name)
#calls the fucnton with 4 total arguements, one postional and 3 arbitary
company_names(3,"Tesla","GM","Chrysler")
#calls the function with 3 total arguements, one postional and 2 arbitary
company_names(2,"Nio","Ford")