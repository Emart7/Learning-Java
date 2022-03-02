package Curso4.cinebox;

public class Media {

    private String title;
    private String gender;
    private static int duration;
    private String synopsis;
    private String content;

    public Media(String title, String gender, int duration) {
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    public Media() {

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
        Media.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void play(){
        System.out.println("Playing " + title);
    }

    public void pause(){
        System.out.println("Pausing " + title);
    }

    public void moveForward(int minutes){
        System.out.println("Moving forward " + minutes + " minutes");
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
