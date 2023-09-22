/* Create class University, which has data members- name and ranking. Create class Faculty that extends University class has data member- name and method- Details(). Create a new class Department which is derived from Faculty and has data member- name, chairman and method Details() and Display() where Display() method calls Details() methods of both Faculty and Department class in its body. Create an object of Department class to Display() method and University ranking. */

package Question2;

public class w9q2 {
    public static void main(String[] args) {
        System.out.println();
        Department newDepartment = new Department("Aligarh Muslim University",
                5, "Faculty of Science",
                "Computer Science",
                "Prof. Mohammed Nadeem");
        newDepartment.display();
    }
}
