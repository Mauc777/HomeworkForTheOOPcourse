import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        // Animal animal = new Cat("svds","sdvvs",1);
        // Iterator<String> parts =animal;
        // while(parts.hasNext()){
        // System.out.println(animal.next());
        // }

        AnimalComparator pcomp = new AnimalComparator();
        // TreeSet<Animal> animalList = new TreeSet<Animal>(pcomp);

        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(new Cat("Васька", "серый", 3));
        animalList.add(new Cat("Петька", "серо-белый", 7));
        animalList.add(new Cat("Бориска", "сизый", 1));
        animalList.add(new Dog("Мухтар", "черный", 22));
        animalList.add(new Dog("Дружок", "черно-серый", 15));
        animalList.add(new Dog("Арчи", "серо-бело-черный", 24));
        animalList.add(new Bird("Ара", "радужный", 2, "25cм крыло"));

        for (Animal animal : animalList) {
            System.out.println(animal);
        }

    }
}

// ????
// animalList.sort(a, new AnimalComparator());
// for(Animal animal:a){
// System.out.println();
// }

// for (Animal animal : animalList) {
// animal.voice();
// if(animal instanceof Cat){
// System.out.println(animal.getName() + " Пушистик мой, котик))");
// }
// if(animal instanceof Dog){
// System.out.println(animal.getName() + " Хороший Собакен");
// }
// if(animal instanceof Bird){
// System.out.println(animal.getName() + " Очень Хороший Попугай");
// }
// }
