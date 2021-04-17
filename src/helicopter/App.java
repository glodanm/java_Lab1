package helicopter;


public class App {

    public static void main(String[]args){
        Helicopter helicopter = new Helicopter();
        Helicopter eagle = new Helicopter(1500, "eagle", 3500,  "Blue");
        System.out.println(eagle);
        Helicopter vaflia = new Helicopter(700, "vaflia", 4999, "Black", "USA",
                3125, 20, 890, 610, 500);

        System.out.println(vaflia.toString());
        helicopter.resetValues(1200, "Vaflia21", 4505,
                "Silver", "USA", 3100, 14, 900, 495, 600);
        System.out.println(helicopter.toString());

        eagle.printPrice();
        vaflia.printPrice();
        Helicopter.printPrice();

    }
}
