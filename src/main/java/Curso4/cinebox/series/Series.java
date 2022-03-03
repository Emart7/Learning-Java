package Curso4.cinebox.series;

import Curso4.cinebox.Media;
import java.util.Scanner;

public class Series extends Media {
    private int totalEpisodes;
    private int totalSeasons;
    private int episodeDuration;

    public Series(String title, String gender, int duration) {
        super(title, gender, duration);
    }

    public Series(String title, String gender, int duration, int totalEpisodes, int totalSeasons) {
        super(title, gender, duration);
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;
        episodeDuration = duration;
    }

    public Series() {
        super("","",0);
        totalEpisodes = 0;
        totalSeasons = 0;
        episodeDuration = 0;
    }

    @Override
    public int getDuration() {
        return episodeDuration * totalEpisodes * totalSeasons;
    }

    @Override
    public void play() {
        System.out.println("Which episode do you want to play? " + super.getTitle());
//        System.out.println("Which episode do you want to play? ");
//        Scanner sc = new Scanner(System.in);
//        int episodeIndex = sc.nextInt();
//        printSomething("Playing episode " + episodeIndex + " of " + super.getTitle());
    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public void moveForward(){
        System.out.println("How many minutes do you want to move forward?");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        super.moveForward(minutes);
    }
}
