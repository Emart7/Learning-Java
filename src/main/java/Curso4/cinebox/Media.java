package Curso4.cinebox;

public class Media {

    public String title;
    public String gender;
    public static int duration;

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

    public static int getDuration() {
        return duration;
    }

    public static void setDuration(int duration) {
        Media.duration = duration;
    }

    public void play(){
        System.out.println("Playing " + title);
    }

    public void pause(){
        System.out.println("Pausing " + title);
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
