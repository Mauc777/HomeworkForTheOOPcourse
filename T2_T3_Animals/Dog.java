public class Dog extends Animal implements Voice {
    Voice v;

    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public Dog(String name, String color, int age, Voice v) {
        super(name, color, age);
        this.v = v;
    }

    public void walk() {
        System.out.println(name + " Ходит на лапах, туда сюда обратно! ");
    }

    @Override
    public void voice() {
        System.out.println("Джаф джаф  -- 11");
        // new GafGaf().gaf();
        super.voice();

    }

    // void voiceDogs(){
    // System.out.println(name + " Гаф -Маф "+ age + " лет");
    // }

}
