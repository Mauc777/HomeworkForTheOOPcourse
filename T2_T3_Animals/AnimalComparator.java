import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {


    // Сортировка по имени
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }


    // тоже работает - но приходится переключаться 
    // в зависимости от требоаний сортировки

    // // Сортировка по возросту
    // @Override
    // public int compare(Animal a, Animal a2){
    //     return a.getAge() - a2.getAge();
    // }


}
