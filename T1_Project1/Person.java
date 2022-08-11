package Project1;

// класс хозяин-кошки , реализует всего лишь 1
// метод = добавляет еду в миску\тарелку
public class Person {

    public void addFoodTo(Plate plate, int food) {
        System.out.println("Хозяин добавляет еду в миску");
        // plate.increaseFood(food);
        plate.decreaseFood(food);
    }

}
