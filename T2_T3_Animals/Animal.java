import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Animal implements Iterator<String>  {
    protected String name;
    protected String color;
    protected int age;


    int index;
    
    
    
    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
  
        switch (index) {
            case 1:
                return String.format("Имя: %s", getName()); 
            case 2:
                return String.format("Цвет: %s", getColor());  

            default:
                return  String.format("Возрост: %d", getAge()); 
        }
       
    }














  
    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Умение у всех животных --> ходить ПО СВОЕМУ , сделаем метод абстрактным
    public abstract void walk();

    public void voice() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal [name = " + getName()
                + ", age = " + getAge()
                + ", color = " + getColor() + "]";
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


}
