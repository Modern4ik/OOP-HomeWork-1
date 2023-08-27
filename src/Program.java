import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("Бутылка с водой", "ООО \"Источник\"", 200, 2.0));
        products.add(new BottleOfMilk("Бутылка с молоком", "ООО \"Сёлушко\"", 250, 1.0, 3));
        products.add(new Sandwich("Сэндвич", "ЗАО \"Хруст\"", 200, "Ветчина и Сыр", 295));
        products.add(new Sandwich("Сэндвич", "ЗАО \"Хруст\"", 200, "Бекон и Яйцо", 350));
        products.add(new Sandwich("Сэндвич", "ЗАО \"Хруст\"", 300, "Лосось и Салат \"Айсберг\"", 325));

        VendingMachine vendingMachine = new VendingMachine(products);

        System.out.println(vendingMachine.getSandwich("Сэндвич", "Бекон и Яйцо"));
        System.out.println(vendingMachine.getSandwich("Сэндвич", "Лосось и Салат \"Айсберг\""));
        System.out.println(vendingMachine.getBottleOfWater("Бутылка с водой", 2.0));
    }
}
