public class DaoPatternDemo
{
    public static void main(String[] args)
    {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        // update data
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        // get student data
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}