public class Bird extends Animal implements Voice {
    // имеет Крылья
    String wings;
    Voice v;

    Bird(String name, String color, int age,String wings) {
        super(name, color, age); 
    }

    public Bird(String name, String color, int age, String wings, Voice v){
        super(name, color, age);
        this.wings = wings; //измер в см
        this.v= v;
    }

    @Override
    public void voice() {
        System.out.println(" О, чирик, Шеф ");
        super.voice();
     
    }

    // есть метод ходьбы , так как птицы передвигаются на Лапках
    public void walk() {
        System.out.println(name + " изредка ходит на лапках ");
    }
 
    public String getWings() {
        return wings;
    }

  

}

