public class Main2 {
    public static void main(String[] args) {
        Person person = new Person("Maritza Angel", "Byll 07");
        Student student = new Student("Angelina Az Zahra", "Jgjj 08", "Computer Science", 2023, 5000.00);
        Staff staff = new Staff("Maritza Az Zahra", "Byll Jgjj 0708", "UGM", 100000.00);

        System.out.println(person.toString());
        System.out.println();

        System.out.println(student.toString());
        System.out.println();

        System.out.println(staff.toString());
    }
}