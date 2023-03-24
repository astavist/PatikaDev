package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut Hoca", "TRH", "9050000000");
        Teacher teacher2 = new Teacher("Graham Bell", "FZK", "9060000000");
        Teacher teacher3 = new Teacher("Külyutmaz", "BIO", "9070000000");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(teacher1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(teacher2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(teacher3);

        Student student1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        student1.addBulkExamNote(90, 95, 78, 85, 50, 60);
        student1.isPass();

        Student student2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
        student2.addBulkExamNote(50, 55, 30, 40, 70, 75);
        student2.isPass();
    }
}
