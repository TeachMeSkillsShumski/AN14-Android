package kdavydenko.Lesson5.TaskA2;
/*
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Alfa", "1111 1111 1111 1111", "10/22", 222);
        creditCard.printCardDetails();
    }
}
