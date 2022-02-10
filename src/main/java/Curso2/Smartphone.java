package Curso2;

//PropiedadesMetodosContructor
public class Smartphone {
    private String color;
    private String brand;
    private int batery;

    public Smartphone(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.batery = 100;
    }

    public void makeAPhoneCall(){
        System.out.println("Llamando...");
        if (batery == 0){
            throw new RuntimeException("Bateria agotada");
        }
        this.batery -= 5;
    }

   public void sendAMessage(){
        System.out.println("Enviando mensaje...");
    }

   public void takePhoto(){
        System.out.println("Tomando foto...");
    }

    public void chargeBattery(){
        System.out.println("Cargando bateria...");
        this.batery = 100;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public class Android extends Smartphone{
        public Android(String color, String brand) {
            super(color, brand);
        }
    }
    public class Iphone extends Smartphone{
        public Iphone(String color, String brand) {
            super(color, brand);
        }
    }
}
