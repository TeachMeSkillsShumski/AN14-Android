package VNazarov.Lab06.Robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Диктует голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}