package akutsenkou.Lesson5_7.TaskA1;

public class Oven extends Cooking{

    public Oven (String brand, String model){
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" plug in the oven");
    }
}
