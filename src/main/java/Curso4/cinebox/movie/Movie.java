package Curso4.cinebox.movie;

import Curso4.cinebox.Media;

//Implement class and object
public class Movie extends Media {
    // Attributes
    private boolean wonOscar;

    public Movie(String title, String gender, int duration) {
        super(title, gender, duration);
    }

    public Movie() {
        super("","",0);
    }

    @Override
    public void play(){
        printSomething("Playing movie " + super.getTitle());
    }

    @Override
    public void stop(){}

    @Override
    public void pause(){}

    @Override
    public void resume(){}

    @Override
    public int getDuration(){
        return super.getDuration();
    }

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
}
