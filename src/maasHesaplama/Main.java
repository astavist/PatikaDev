package maasHesaplama;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Samet",800,46,2021);
        Employee employee2 = new Employee("Mehmet",9000,42,2002);
        Employee employee3 = new Employee("Meral",7000,32,2003);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }
}
