
public class Player {
    private String name;
    private String email;
    private boolean white; // если Игрок игр Белыми, значит он не играет Черными!
    private int rank; // ранг
    private int age;

    public Player(String name, String email, boolean white, int rank, int age) {
        if(name == null || name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("Введите пожалуйста  ИМЯ ИГРОКА ...  ");
        }
        else {
            this.name = name;
        }
        

        if(email == null || email.isBlank() || email.isEmpty()  ) {
            throw new IllegalArgumentException(" Введите корректный @mail!!  ");
        } 
        if(email.contains("@")== false || email.contains(".") == false){
            throw new IllegalArgumentException(" Введите корректный @mail!! c @ и . ");
        }       
        else {
            this.email = email;
        }


        if(age < 10 || 110 > age){
            this.age = age;
        }

        this.white = white;
        this.rank = rank;

        
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public boolean isWhite() {return white;}

    public void setWhite(boolean white) {this.white = white;}

    public int getRank() {return rank;}


    // Здесь мы вводим минимальные и максимальные параметры "Ранга" Игрока.
    //  А также проверку на наличие выхода за их рамки!
    public void setRank(int rank) {
        if(rank < 100 || rank > 3000){
            throw new IllegalArgumentException("Введи Ранг от 100 до 3_000!! ");
        }
        this.rank = rank;
        // Кстати, в set() (в сеттерах) --> мы сразу можем вводить любую необходимую функциональность.
        System.out.println("Ранг " + name+ " был изменен на " + rank);
    }

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}


    @Override
    public String toString() {
        return
                // "Player{" +
                "name='" + name + '\'' +
                ", email ='" + email + '\'' +
                ", white ='" + white + '\'' +
                ", rank ='" + rank + '\'' +
                ", age =" + age;
        // '}';
    }





}



// проверка валидности имейл??!! Вариант 1-ый ... Хотя существуют целые библиотеки для ее проверки...
// public  Boolean checkMail(){
//     if (getEmail() == " ") {
//         System.out.println("Введите Адрес электронной почты. Поле пусто -->> ");
//         }
//         // ToDoo ------------
//     if (this.getEmail().indexOf(".") == -1) {
//         System.out.println("Нет символа\".\"");
//         }
//     if((getEmail().indexOf(",")>=0)||(getEmail().indexOf(";")>=0)||(getEmail().indexOf(" ")>=0)){
//         System.out.println("Адрес электронной почты был введен неправильно.");
//         }
//     var dog = getEmail().indexOf("@");
//         if (dog == -1) {
//         System.out.println("Нет символа\"@\".");
//         }
//     if ((dog < 1) || (dog > getEmail().length() - 5)) {
//         System.out.println("Адрес электронной почты был введен неправильно.");
//         }
//     if ((getEmail().charAt(dog - 1) == '.') || (getEmail().charAt(dog + 1) == '.')) {
//     System.out.println("Адрес электронной почты был введен неправильно.");
//     }
//     System.out.println("Адрес электронной почты был введен ВЕРНО!");
//     return true;
// }







