package akutsenkou.Lesson5_7.person.Pants;

public class Jeans implements IPants{
    @Override
    public void undress() {
        System.out.println("Undress jeans");
    }

    @Override
    public void dress() {
        System.out.println("Dress jeans");
    }
}
