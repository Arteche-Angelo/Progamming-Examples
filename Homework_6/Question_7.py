#creats function that takes arbitary keyword arguments and prints them
def company_name(**names):
    print(names)
#calls fucntion and assigns keyword arguments
company_name(num_comps=2,name1="Costco",name2="Krogers")
company_name(num_comps=3,name1="CVS",name2="Walgreens",name3="Rite-Aid")