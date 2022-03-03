package Curso4.cinebox;

public abstract class Media implements Comparable<Media> {

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

    @Override
    public boolean equals(Object object) {
        if (object instanceof Media) {
            return this.title.equals(((Media) object).getTitle()) && this.gender.equals(((Media) object).getGender());
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Media otherMedia) {
//        //in alphabetical order
        return this.getTitle().compareTo(otherMedia.getTitle());

        //by duration of the chapter
//        if (this.getDuration() > otherMedia.getDuration()) {
//            return 1;
//        } else if (this.getDuration() < otherMedia.getDuration()) {
//            return -1;
//        } else {
//            return this.getTitle().compareTo(otherMedia.getTitle());
//        }
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

    public void printSomething(String something) {
        System.out.println(something);
    }

    public void moveForward(int minutes) {
        System.out.println("Moving forward " + minutes + " minutes");
    }

    public abstract void play();

    public abstract void stop();

    public abstract void pause();

    public abstract void resume();

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
