package Question2;

public class Faculty extends University {
    private String facultyName;

    public Faculty(String universityName, int universityRank, String facultyName) {
        super(universityName, universityRank);
        this.facultyName = facultyName;
    }

    public void details() {
        System.out.println("University Name: " + getUniversityName());
        System.out.println("University Rank: " + getUniversityRank());
        System.out.println("Faculty Name: " + facultyName);
    }
    
}
