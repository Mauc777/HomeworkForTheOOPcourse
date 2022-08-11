import java.util.ArrayList;


public class Human {
    int id;
    String name;
    int age;
    String Role;

    // Animal animal; //у человека может быть вообще любое жевотное,либо несколько

    // Для того чтоб мы могли добавлять и обращаться к нес-ким жевотным,
    //  нам потребуется (коллекция сост из Жевотных) = ArrayList<Animal> animals;
    // Объявление = Инициализация коллекции Жевотных
    ArrayList<Animal> animals = new ArrayList<>();

     
    // Конструктор создания конкретного экземл жевотного У ЧЕЛОВЕКА
    // Добавим Заполнение/добавление любого жевотного
    public Human(Animal... c){
        for (Animal animal : c) {
            animals.add(animal);
            
        }
    }

  

    // Базовый Конструктор Человека
    Human (int id, String name, String role, int age ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.Role = role;
    }


    // в данном методе пробегая по массиву коллекций жевотных,
    // для каждого Жевотного собаки, кошки и т д. мы обращаемся к конкретному питомцу (как к элементу массива)
    // и зовем его.
    void call(){
        System.out.println("\n");
       System.out.println("Друг , иди ко мне ");  // строка просто для сверки
       for (Animal animal : animals) {
        if(animal instanceof Cat){
            animal.voice();
            System.out.println(animal.getName() + " Пушистик мой, котик))");
        }
        if(animal instanceof Dog){
            animal.voice();
            System.out.println(animal.getName() + " Хороший Собакен");
        }
        if (animal instanceof Bird){
            animal.voice();
            System.out.println(animal.getName() + " Отлично, дружок , свистать всех на палубу ");
        }
       }
    }

    // public void removeAnimal(){
    //     for (Animal animal : animals) {
    //         animals.remove(animal);
    //     }
    // }
}
