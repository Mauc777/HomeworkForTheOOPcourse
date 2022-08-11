public class Cat extends Animal implements Voice {
    Voice v;

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name, String color, int age, Voice v) {
        super(name, color, age);
        this.v = v;
    }

    @Override
    public void voice() {
        System.out.println("Мурлык ми  -- 11");
        super.voice();

    }

    @Override
    public void walk() {
        System.out.println(name + " Очень КЛАССНО ходит на лапках");
    }

}
