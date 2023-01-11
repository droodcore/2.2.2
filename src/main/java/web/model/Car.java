package web.model;


public class Car {


    private String model;
    private int hp;
    private String user;

    public Car(){}

    public Car(String model, int hp, String user) {
        this.model = model;
        this.hp = hp;
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", user='" + user + '\'' +
                '}';
    }
}
