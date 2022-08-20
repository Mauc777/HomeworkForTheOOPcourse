
public class Player {
    private String name;
    private String email;
    private boolean white; // если Игрок игр Белыми, значит он не играет Черными!
    private int rank; // ранг
    private int age;

    public Player(String name, String email, boolean white, int rank, int age) {
        this.name = name;
        this.email = email;
        this.white = white;
        this.rank = rank;
        this.age = age;
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


    //     @Override
//     public String toString() {
        
//         return "Привет" + name;
//     }



}








