package akutsenkou.Lesson5_7.person.Shoes;

public class Slippers implements IShoes{
    @Override
    public void undress() {
        System.out.println("Undress slippers");
    }

    @Override
    public void dress() {
        System.out.println("Dress slippers");
    }
}
