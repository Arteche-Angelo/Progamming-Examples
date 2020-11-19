#creates a class calle employee
class employee:
    #initalize the name salary and experince attributes
    def __init__(self,name,salary,exp):
        self.name=name
        self.salary=salary
        self.exp = exp
    #prints out the employee's salary
    def get_salary(self):
        print(self.name +"'s salary is $"+str(self.salary))
    #prints out the employee's name
    def get_name(self):
        print("the employee's name is "+self.name)
    #prints out how long the employee has been employed
    def get_exp(self):
        print(self.name+" has been working here for "+str(self.exp)+" years")
#creates an instance of employee with name angelo salart of 12000 and 10 years of experince
employee1 = employee("Angelo",12000,10)
#creats an instance of employee with name alex salary 15000 and 13 years of experince
employee2 = employee("Alex",15000,13)
#prints out attributes for both employee's
print(employee1.name)
print(employee1.salary)
print(employee1.exp)
print(employee2.name)
print(employee2.salary)
print(employee2.exp)
#calls functions for employee1
employee1.get_name()
employee1.get_salary()
employee1.get_exp()
#calls functions for employee2
employee2.get_name()
employee2.get_salary()
employee2.get_exp()

