package T1_Project1;           
//тарелка
public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    // 2.Сделать так, Чтоб в тарелке с едой не могло получиться
    // отриц коли-ва еды
    // (например, в миске 10 еды , а кот пытается съесть 15-20
    public void decreaseFood(int appetite) {
        if (appetite < 0){
            return;
        }
        if (!hasEnoughFoodFor(appetite)) {
            System.out.println(" Аппетиты больше чем еды в тарелке!");
        } else {
            food = food - appetite;
        }
    }

    public boolean hasEnoughFoodFor(int appetite) {
        return appetite <= food;
    }

    public void showInfo() {
        System.out.println(" в тарелке: " + food + "  единиц еды");
    }
}
