public abstract class Animal {

    protected String nameAnimal;
    protected int maximumRunningDistance;
    protected int maximumSwimmingDistance;
    protected double maximumHeightObstacle;

    public Animal (String nameAnimal, int maximumRunningDistance,
                   int maximumSwimmingDistance, double maximumHeightObstacle) {
        this.nameAnimal = nameAnimal;
        this.maximumRunningDistance = maximumRunningDistance;
        this.maximumSwimmingDistance = maximumSwimmingDistance;
        this.maximumHeightObstacle = maximumHeightObstacle;
    }

    abstract void run(int runningDistance);

    abstract void swim(int swimmingDistance);

    abstract void jump(double heightObstacle);
}