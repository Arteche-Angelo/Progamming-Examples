#Angelo Arteche
#import statement
import Employee
#creates function to add employees to the emp_list
def add_employee(lastname,firstname,salary):
        emply =Employee.employee(lastname,firstname,salary)
        emp_list.append(emply)
#creats funtion that takes an arbitary amount of names
def Employees_of_Month(*names):
    print("Employees of the month are:")
    for name in names:
        print(name)
#creats list to store employee class instances
emp_list =[]
#try statement that checks if the file exists
try:
    #reads from the file containgn employee info and creats class instances and appends them to the emp_list
    with open("Emp.txt") as fileobject:
        for line in fileobject:
            strped_line=line.split( )
            emply = Employee.employee(strped_line[0],strped_line[1],strped_line[2])
            emp_list.append(emply)
except FileNotFoundError:
    print("file Not found")
#calls imported function to print employee info
for employees in emp_list:
    employees.print_employee()
print()
#calls imported fucntion to get the employees full name
for employees in emp_list:
    employees.get_full_name()
print()
#calls imported function to get employees salary
for employees in emp_list:
    employees.get_salary()
print()
#modifies the 4 attributes of a class instance
emp_list[0].firstname="Barrack"
emp_list[0].lastname="Obama"
emp_list[0].salary="420000"
emp_list[0].fullname=emp_list[0].firstname+" "+emp_list[0].lastname
print()
#adds employees to emp_list
add_employee(lastname="Paul",firstname="Jake",salary=str(12000))
add_employee(lastname="Eaton",firstname="Lyla",salary=str(40000))
add_employee(lastname="Hendrix",firstname="Lainey",salary=str(8000))
add_employee(lastname="Morgan",firstname="Arthur",salary=str(76000))
add_employee(lastname="Blair",firstname="Ikra",salary=str(45000))
print()

for employees in emp_list:
    employees.print_employee()
print()
#calls the function that takes arbitary amount of arguments
Employees_of_Month(emp_list[0].fullname)
Employees_of_Month(emp_list[1].fullname,emp_list[0].fullname)
#writes the updated list of employees into a file
filename="updated.txt"
with open(filename,"w") as fileobject:
    for employees in emp_list:
        fileobject.writelines(employees.lastname+" "+employees.firstname+" "+employees.salary+"\n")