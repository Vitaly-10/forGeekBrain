package javaOne;

public class Employee {
    private static int serialNumber = 0;
    final int CURRENT_YEAR = 2020;
    private String fullName;
    private int salary;
    private int birthYear;

    public String getName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {this.salary = salary; }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }
    private void setAge(int age) {
        this.birthYear = CURRENT_YEAR - age;
    }

    public int getSerialNumber() { return serialNumber; }
    private int setSerialNumber() {
        serialNumber = serialNumber + 2;
        return serialNumber;
    }

    public Employee (String fullName, int salary, int age) {
        setSerialNumber();
        this.fullName = fullName;
        this.salary = salary;
        setAge(age);
    }

}
