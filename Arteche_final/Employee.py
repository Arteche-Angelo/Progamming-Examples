#Angelo Arteche
#creates a class called employee
class employee:
    #initalize the name and salary
    def __init__(self,last,first,salary):
        self.lastname=last
        self.firstname=first
        self.salary=salary
        self.fullname=self.firstname+" "+self.lastname


    #prints out the employee's salary
    def get_salary(self):
        print(self.fullname +"'s salary is $"+str(self.salary))
    #prints out the employee's name
    def get_full_name(self):
        print("the employee's name is "+self.fullname)
    def print_employee(self):
        print(self.lastname+" "+self.firstname+" $"+self.salary)