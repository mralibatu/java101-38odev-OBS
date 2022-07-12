public class Obs {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Amy Hoca", "ENG", "+12345678900");
        Teacher t2 = new Teacher("Faruk Oz","FIZ","+9050505050505");
        Teacher t3 = new Teacher("Batuhan","SOF","+90535535353535");

        Course ingilizce = new Course("Ingilizce","101","ENG");

        Course fizik = new Course("Fizik","102","FIZ");

        Course software = new Course("Software Engineering","104","SOF");

        Student s1 = new Student("Churchill Zeynep","281004", "1",ingilizce,fizik,software);
        s1.addBulkExamNote(90,75,100);
        s1.addBulkSozluNote(75,85,100);
        s1.printNote();
        s1.isPass();
    }
}
