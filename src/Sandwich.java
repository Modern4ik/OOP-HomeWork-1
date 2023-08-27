public class Sandwich extends Product{

    private String filling; // Начинка
    private int colories; // Калорийность

    public Sandwich(){
        this("NoName");
    }

    public Sandwich(String name){
        this(name, "NoBrand");
    }

    public Sandwich(String name, String brand){
        this(name, brand, 100);
    }

    public Sandwich(String name, String brand, double price){
        this(name, brand, price, "NoFilling");
    }

    public Sandwich(String name, String brand, double price, String filling){
        this(name, brand, price, filling, 0);
    }

    public Sandwich(String name, String brand, double price, String filling, int colories){

        super(name, brand, price);
        this.filling = checkFilling(filling);
        this.colories = checkColories(colories);
    }
    private String checkFilling(String filling){
        if (filling == null || filling.length() < 2){

            return "NoFilling";

        }else{

            return filling;
        }
    }

    private int checkColories(int colories){
        if (colories <= 0){

            return 0;

        }else{

            return colories;

        }
    }

    public String getFilling() {
        return filling;
    }

    public int getColories() {
        return colories;
    }
    
    @Override
    public String toString(){
        return String.format("[Сэндвич] %s - %s - %.2f - Начинка: %s - Ккал: %d", name, brand, price, filling, colories);
    }
}
