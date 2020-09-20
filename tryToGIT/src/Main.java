public class Main {

    public static void main(String[] args) {
        Cat c1 = new Cat("Борис",20,2,3);
        c1.jump(1);

        Dog d1 = new Dog("Рекс", 100, 50, 1);
        d1.jump(0.2);

        c1.run(30);
        d1.run(150);

        // lots of fun code...


    }
}