package T1_Project1;

public class Program {
    public static void main(String[] args) {

        Person p = new Person();
        // Массив из  Кошек
        Cat[] cats = {
            new Cat(-7, "Дуся", p),
            new Cat(-85, "Мурзик ", p),
            new Cat(-11,"Мышкин" , p)
        };

        Plate plate = new Plate(75);
        plate.showInfo();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }
        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }
    }
}