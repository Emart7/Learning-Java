package Curso4.cinebox.movie;

//Implement class and object
public class Movie {
    public String title;
    public String gender;
    public int duration;

    //Constructor
    public Movie() {
        this.title = "No tittle";
        this.gender = "No gender";
        this.duration = 0;
    }

    public Movie(String title, String gender) {
        this.title = title;
        this.gender = gender;
        this.duration = 0;
    }

    public Movie(String title, String gender, int duration) {
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing movie..." + title);
    }

    public void pause() {
        System.out.println("Movie paused..." + title);
    }

    public int getTotalFrames() {
       return this.duration = duration * 60;
    }

}
