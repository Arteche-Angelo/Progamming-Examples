/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteche_hwk5;

/**
 *
 * @author angelo
 */
public class Employee {

    private static int count;
    private String fullname;
    private DeptName aDept;
    private String empDept;
    private String location;
    private String id;

    public Employee(String last, String first, String dpt) {
        fullname = last + " " + first;
        aDept = new DeptName(dpt);
        empDept = aDept.getDepartment();
        location = aDept.getLocation();
        id = "A00" + count;
        count++;

    }

    public String ToString() {
        String F;
        F = "Name: " + fullname
                + "\nID: " + id
                + "\nDepartment: " + empDept
                + "\nLocation: " + location;
        return F;

    }

    public String getLocation() {
return location;
    }

    public String getDept() {
return empDept;
    }

    public String getName() {
return fullname;
    }
}
