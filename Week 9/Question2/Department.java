package Question2;

public class Department extends Faculty {
    private String departmentName;
    private String departmentChairperson;

    public Department(String universityName, int universityRank, String facultyName, String departmentName,
            String departmentChairperson) {
        super(universityName, universityRank, facultyName);
        this.departmentName = departmentName;
        this.departmentChairperson = departmentChairperson;
    }

    @Override
    public void details() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Chairperson: " + departmentChairperson);
    }

    public void display() {
        super.details();
        details();
    }

}
