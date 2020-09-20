public class Cat extends Animal {

    public Cat (String nameAnimal, int maximumRunningDistance,
                int maximumSwimmingDistance, double maximumHeightObstacle) {
        super (nameAnimal, maximumRunningDistance, maximumSwimmingDistance, maximumHeightObstacle);
    }

    @Override
    protected void run(int runningDistance) {
        if (runningDistance <= maximumRunningDistance) {
            System.out.println("Котик " + nameAnimal + " пробежал " + runningDistance + " метров");
        }
        if (runningDistance > maximumRunningDistance) {
            System.out.println("Котик " + nameAnimal + " так далеко не побежит");
        }
        if (runningDistance < 0) {
            System.out.println(nameAnimal + ": Ты наркоман штоле?");
        }
    }

    @Override
    protected void swim(int swimmingDistance) {
        System.out.println("Кот " + nameAnimal + " плавать не будет!");
    }

    @Override
    protected void jump(double heightObstacle) {
        if (heightObstacle <= maximumHeightObstacle ) {
            System.out.println("Кот " + nameAnimal + " прыгнул на " + heightObstacle + " м.");
        }
        if (heightObstacle > maximumHeightObstacle) {
            System.out.println("Кот " + nameAnimal + " так высоко не прыгает");
        }
        if (heightObstacle < 0) {
            System.out.println(nameAnimal + ": Рыть землю не будем");
        }
    }

}