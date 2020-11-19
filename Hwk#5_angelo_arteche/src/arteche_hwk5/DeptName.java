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
public class DeptName {

    private String department;
    private String location;

    public  DeptName(String dpt) {
        department = dpt;
        switch (dpt) {
            case ("HMR"):
                department = "Human Resources";
                location = "Lansing";
                break;
            case ("MNG"):
                department = "Managerial";
                location = "Macomb";
                break;
            case ("STF"):
                department = "Staff";
                location = "Rochester Hills";
                break;
            default:
                department = "invalid";
                location = "invalid";
                break;

        }

    }

    public String getDepartment() {
        return department;
    }

    public String getLocation() {
        return location;
    }

}
