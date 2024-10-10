package Programming_In_Java_COP2800_3.Module_5.Hands_On_Project;

public class CollegeStudent {
    private String studentID;
    private CollegeCourse[] courses;

    public CollegeStudent() {
        courses = new CollegeCourse[5];
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new CollegeCourse();
        }
    }

    // Get and set methods for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Get method for a specific CollegeCourse
    public CollegeCourse getCourse(int index) {
        if (index >= 0 && index < courses.length) {
            return courses[index];
        } else {
            return null;
        }
    }

    // Set method for a specific CollegeCourse
    public void setCourse(CollegeCourse course, int index) {
        if (index >= 0 && index < courses.length) {
            courses[index] = course;
        }
    }
}
