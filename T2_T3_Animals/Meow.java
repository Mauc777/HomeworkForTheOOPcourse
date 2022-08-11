public class Meow implements Voice{

    @Override
    public void voice(){
        meow();
    }

    void meow(){
        System.out.println("Мяу-мяу....");
    }
    
}
