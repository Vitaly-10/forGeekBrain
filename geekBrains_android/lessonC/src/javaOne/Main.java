package javaOne;

public class Main {

    public static void salaryIncrease(Employee[] arrEmployee) {
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getAge() > 45){
                arrEmployee[i].setSalary(arrEmployee[i].getSalary() + 5000);
            }
        }
    }

    public static void main(String[] args) {

        Employee employee0 = new Employee ("Vasya", 10000, 40);
        System.out.println(employee0.getName() +" "+ employee0.getAge());
        System.out.println();

        Employee employee1,employee2,employee3,employee4,employee5;
        Employee[] arrEmployee = {
                employee1 = new Employee ("Petya", 12000, 45),
                employee2 = new Employee ("Kolya", 18000, 35),
                employee3 = new Employee("Lena", 20000,30),
                employee4 = new Employee("Svetlana", 25000, 50),
                employee5 = new Employee("Roma", 15000,25)
        };

        System.out.println("Перепись мамонтов:");

        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getAge() > 40) {
                System.out.println(arrEmployee[i].getName() + " "
                        + arrEmployee[i].getSalary() + " " + arrEmployee[i].getAge());
            }
        }

        System.out.println();

        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getAge() > 45) {
                System.out.println(arrEmployee[i].getName() + " "
                        + arrEmployee[i].getSalary() + " " + arrEmployee[i].getAge());
            }
        }

        System.out.println("Небывалая удача. Зарплата выросла! Но не у всех...");
        salaryIncrease(arrEmployee);

        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getAge() > 45) {
                System.out.println(arrEmployee[i].getName() + " "
                        + arrEmployee[i].getSalary() + " " + arrEmployee[i].getAge());
            }
        }
        System.out.println();
        System.out.println("Средняя температура по больнице:");

        double sumAllSalaries = 0;
        double sumAllAges = 0;

        for (int i = 0; i < arrEmployee.length; i++) {
            sumAllAges = sumAllAges + arrEmployee[i].getAge();
            sumAllSalaries = sumAllSalaries + arrEmployee[i].getSalary();
        }
        System.out.println("Средняя зарплата: " + sumAllSalaries / (arrEmployee.length + 1));
        System.out.println("Средний возраст: " + sumAllAges / (arrEmployee.length + 1));

        System.out.println();
        for (int i = 0; i < arrEmployee.length; i++) {
                System.out.println(arrEmployee[i].getSerialNumber() + " " + arrEmployee[i].getName() + " "
                        + arrEmployee[i].getSalary() + " " + arrEmployee[i].getAge());
        }

    }
}
