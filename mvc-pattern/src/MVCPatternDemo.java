public class MVCPatternDemo
{
    public static void main(String[] args)
    {

        Student model = retriveStudentFromDatabase();

        // create a viewer
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}