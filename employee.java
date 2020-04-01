public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee()
    {
        System.out.println("-- Employee Entry Form --");
        System.out.println("Enter name");
        System.out.println("Enter ID");
        System.out.println("Enter department");
        System.out.println("Enter position");

        name = ("Bill Gates\t");
        idNumber = (1234);
        department = ("Engineering\t");
        position = ("Engineer\t");
    }

    public Employee(String employee, int id)
    {

        name = employee;
        idNumber = id;


    }

    public Employee(String employee, int id, String depart, String pos)
    {
        name = employee;
        idNumber = id;
        department = depart;
        position = pos;
    }


    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getPosition()
    {
        return position;
    }

    public int getIdNumber()
    {
        return idNumber;
    }
}
