package T1_Project1;

public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;
    private Person host;

    public Cat(int appetite, String name, Person host) {
        isFull = false; // показатель Голода
        this.name = name;
        this.appetite = appetite;
        this.host = host; // Хозяин
    }

    // 4. Считаем, что если коту мало еды в тарелке,
    // то он ее не трогает, то есть кот не может
    // быть наполовину голоден или сыт
    // (сделано для упрощения логики)

    // Описание как кошка ест
    public void eat(Plate plate) {
        if (plate.hasEnoughFoodFor(appetite) && !isFull) {
            System.out.println(name + "  Кушает ");
            // уменьш питания
            plate.decreaseFood(appetite);
            isFull = true;
        } else if (!plate.hasEnoughFoodFor(appetite)) {
            System.out.println(name + "  Недовольный рык  ");
            // хозяин докладывает еду
            host.addFoodTo(plate, appetite);
        } else if (isFull) {
            System.out.println(" у " + name + " в пузе уже есть еда ");
        }
        plate.decreaseFood(appetite);
    }

    public int getAppetite() {
        return appetite;
    }
}
