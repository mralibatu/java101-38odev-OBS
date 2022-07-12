public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if(teacher.branch.equals(this.prefix)){
        this.teacher = teacher;
        System.out.println("Ogretmen basariyla atandi");
        printTeacherInfo();
    }else{
            System.out.println("Ders ve ogretmen bolumleri uyusmuyor");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}
