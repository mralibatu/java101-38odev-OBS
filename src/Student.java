public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    void addBulkSozluNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100) {
            this.c1.sozlu = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.sozlu = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.sozlu = note3;
        }
    }
    void printNote() {
        System.out.println(this.c1.name + " Sinav Notu : " + " " + this.c1.note);
        System.out.println(this.c2.name + " Sinav Notu : " + " " + this.c2.note);
        System.out.println(this.c3.name + " Sinav Notu : " + " " + this.c3.note);
        System.out.println(this.c1.name + " Sozlu Notu : " + " " + this.c1.sozlu);
        System.out.println(this.c2.name + " Sozlu Notu : " + " " + this.c2.sozlu);
        System.out.println(this.c3.name + " Sozlu Notu : " + " " + this.c3.sozlu);
    }

    void isPass(){
        this.avarage = ((((this.c1.note + this.c2.note + this.c3.note) / 3) * 8) + ((this.c1.sozlu + this.c2.sozlu + this.c3.sozlu) / 3) * 2) / 10;
        if(this.avarage > 55){
            System.out.println("Sinif basariyla gecildi");
            boolean isPass = true;
        }else{
            System.out.println("Sinifta kalindi");
            boolean isPass = false;
        }
        System.out.println("Ortalama : " + this.avarage);
    }
}
