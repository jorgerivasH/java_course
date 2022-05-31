package chapter9;

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee(){
        //We use super to call specific constructor and this line should be the first one
        super("Jorge");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
