package ogrenciBilgiSistemi;

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

    void addBulkExamNote (int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3) {
        if ((note1 >= 0 && note1 <= 100) && (verbalNote1 >= 0 && verbalNote1 <= 100)) {
            this.c1.note = note1;
            this.c1.verbalNote = verbalNote1;
        }
        if ((note2 >= 0 && note2 <= 100) && (verbalNote2 >= 0 && verbalNote2 <= 100)) {
            this.c2.note = note2;
            this.c2.verbalNote = verbalNote2;
        }
        if ((note3 >= 0 && note3 <= 100) && (verbalNote3 >= 0 && verbalNote3 <= 100)) {
            this.c3.note = note3;
            this.c3.verbalNote = verbalNote3;
        }
    }

    void isPass() {
        System.out.println();
        printStudentName();
        this.avarage = (((this.c1.note*0.70) + (this.c1.verbalNote*0.30)) + ((this.c2.note*0.80) + (this.c2.verbalNote*0.20)) + ((this.c3.note*0.75) + (this.c3.verbalNote*0.25))) / 3.0;
        printNote();
        if (this.avarage >= 55) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız!");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Sınav Notu\t: " + this.c1.note + "\t" + this.c1.name + " Sözlü Notu\t: " + this.c1.verbalNote);
        System.out.println(this.c2.name + " Sınav Notu\t: " + this.c2.note + "\t" + this.c2.name + " Sözlü Notu\t: " + this.c2.verbalNote);
        System.out.println(this.c3.name + " Sınav Notu : " + this.c3.note + "\t" + this.c3.name + " Sözlü Notu : " + this.c3.verbalNote);
        System.out.println("Ortalamanız\t\t\t: " + this.avarage);
    }

    void printStudentName() {
        System.out.println("Öğrenci Adı\t\t\t: " + this.name);
    }
}
