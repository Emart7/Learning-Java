package Curso2;

//Ejercicio 1 de abstraccion
abstract class User {
    private String profession;

    public User(String profession) {
        this.profession = profession;
    }

    public void goToWork(){}
}

class Doctor extends User {
    public Doctor() {
        super("Doctor");
    }
    @Override
    public void goToWork(){}

}

class Police extends User {
    public Police() {
        super("Police");
    }
    @Override
    public void goToWork(){}
}
