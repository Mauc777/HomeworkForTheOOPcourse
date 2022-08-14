
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Player{" +
                "name='"+ email + '\n' +
                ", email ='" + email + "\n" + 
                ",white ='" + white + "\n" +
                ",rank ='" + rank + "\n" +
                ",age ='" + age  +
                '}';
    }
}