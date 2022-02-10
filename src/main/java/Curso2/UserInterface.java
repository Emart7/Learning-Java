package Curso2;

public class UserInterface {

    interface IUser {
        String profession = null;
        default void goToWork(){}
    }
}

class Doctors implements UserInterface.IUser {
    private final String phoneNumber;

    public Doctors(String phoneNumber) {
        final String profession = this.profession;
        this.phoneNumber = phoneNumber;

    }
    @Override
    public void goToWork(){}

}

class Polices implements UserInterface.IUser {
    public Polices() {
        final String profession = this.profession;

    }
    @Override
    public void goToWork(){}
}