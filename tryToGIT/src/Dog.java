public class Dog extends Animal {


    public Dog (String nameAnimal, int maximumRunningDistance,
                int maximumSwimmingDistance, double maximumHeightObstacle) {
        super (nameAnimal, maximumRunningDistance, maximumSwimmingDistance, maximumHeightObstacle);
    }

    @Override
    protected void run(int runningDistance) {
        if (runningDistance <= maximumRunningDistance) {
            System.out.println("Пёс " + nameAnimal + " пробежал " + runningDistance + " метров");
        }
        if (runningDistance > maximumRunningDistance) {
            System.out.println("Пёс " + nameAnimal + " так далеко не побежит");
        }
        if (runningDistance < 0) {
            System.out.println(nameAnimal + ": Ты наркоман штоле?");
        }
    }

    @Override
    protected void swim(int swimmingDistance) {
        if (swimmingDistance <= maximumSwimmingDistance) {
            System.out.println("Пёс проплыл " + swimmingDistance + " м.");
        }
        if (swimmingDistance > maximumSwimmingDistance) {
            System.out.println("Пёс так далеко боится плыть");
        }
        if (swimmingDistance < 0) {
            System.out.println(nameAnimal + ": Я плыву только вперёд!");
        }
    }

    @Override
    protected void jump(double heightObstacle) {
        if (heightObstacle <= maximumHeightObstacle ) {
            System.out.println("Пёс прыгнул на " + heightObstacle + " м.");
        }
        if (heightObstacle > maximumHeightObstacle) {
            System.out.println("Пёс так высоко не прыгнет");
        }
        if (heightObstacle < 0) {
            System.out.println("Рыть землю не будем");
        }
    }

}
