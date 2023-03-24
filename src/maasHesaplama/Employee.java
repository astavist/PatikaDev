package maasHesaplama;

public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee() {
    }

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax() {
        if (salary > 1000) {
            return (salary * 3) / 100;
        }
        return 0;
    }

    public int bonus() {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public int raiseSalary() {
        if ((2023 - hireYear) < 9) {
            int raise = (salary * 5) / 100;
            return raise;
        } else if ((2023 - hireYear) >= 9 && (2023 - hireYear) < 19) {
            int raise = (salary * 10) / 100;
            return raise;
        } else {
            int raise = (salary * 15) / 100;
            return raise;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String toString() {
        return "Çalışanın adı:" + name + "\n"
                + "Maaşı: " + salary + "\n"
                + "Çalışma saati: " + workHours + "\n"
                + "Başlangıç yılı: " + hireYear + "\n"
                + "Ödeyeceği vergi: " + tax() + "TL \n"
                + "Alacağını bonus: " + bonus() + "TL \n"
                + "Maaş zammı: " + raiseSalary() + "TL \n"
                + "Bonuslar ve vergili maaşı: " + ((salary - tax()) + bonus()) + "TL \n"
                + "Her şey dahil maaş: " + ((salary - tax()) + bonus() + raiseSalary()) + "TL \n"
                + "------------------------------"
                ;

    }
}
