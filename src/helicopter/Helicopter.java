package helicopter;

public class Helicopter {
    private int maxMass;
    private String name;
    private int maxHeight;

    private String color;
    private String producer;
    private int weight;
    private int maxPeople;
    private float power;

    private static int price;

    protected float speed;
    protected float maxDistance;

    public Helicopter() {
        price++;
    }

    public Helicopter(int maxMass, String name, int maxHeight, String color) {
        this(maxMass, name, maxHeight, color,
                null, 0, 0, 0, 0, 0);
    }

    public Helicopter(int maxMass, String name, int maxHeight, String color,
                      String producer, int weight, int maxPeople,
                      float power, float speed, float maxDistance) {

        resetValues(maxMass, name, maxHeight, color, producer, weight,
                maxPeople, power, speed, maxDistance);
        price++;
    }


    public void resetValues(int maxMass, String name, int maxHeight, String color,
                            String producer, int weight, int maxPeople,
                            float power, float speed, float maxDistance){

        this.maxMass =maxMass;
        this.name =name;
        this.maxHeight =maxHeight;
        this.color =color;
        this.producer =producer;
        this.weight =weight;
        this.maxPeople =maxPeople;
        this.power =power;
        this.speed =speed;
        this.maxDistance =maxDistance;
}

    public static void printPrice(){
        System.out.println(price);
    }


    public int getMaxMass() {
        return maxMass;
    }

    public void setMaxMass(int maxMass) {
        this.maxMass = maxMass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Helicopter.price = price;
    }
    @Override
    public String toString() {
        return "Helicopter{" +
                "maxMass=" + maxMass +
                ", name='" + name + '\'' +
                ", maxHeight=" + maxHeight +
                ", color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                ", weight=" + weight +
                ", maxPeople=" + maxPeople +
                ", power=" + power +
                ", speed=" + speed +
                ", maxDistance=" + maxDistance +
                '}';
    }

}
