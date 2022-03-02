package Curso4.cinebox.cineboxPlayer;

import Curso4.cinebox.Media;
import Curso4.cinebox.mediaDownloader.MediaDownloader;
import Curso4.cinebox.movie.Movie;
import Curso4.cinebox.series.Series;

import java.util.Scanner;

public class CineboxPlayer implements MediaDownloader.DownloadListener {

    public void initialize() {

        Movie findingNemo = new Movie("Finding Nemo", "childish", 5);

        //Exercises with class Movie and Series
        findingNemo.setWonOscar(true);

        MediaDownloader.download(findingNemo, this);

        Series theBigBangTheory = new Series("The Big Bang Theory", "comedy", 45, 12, 5);
        Series vikings = new Series("vikings", "Action and Adventures", 45, 15, 7);
        Series friends = new Series("friends", "comedy", 45, 20, 7);

        theBigBangTheory.setSynopsis("The Big Bang Theory is a comedy about the lives of a group of college friends");
        vikings.setSynopsis("Vikings is a series about the adventures of a Viking family");
        friends.setSynopsis("Friends is a comedy about the lives of a group friends");

        printInstructions();

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        System.out.println("You selected: " + selection);
        System.out.println("");

        while (selection != 0) {
            switch (selection) {
                case 1:
                    System.out.println(theBigBangTheory.getSynopsis());
                    break;
                case 2:
                    System.out.println(vikings.getSynopsis());
                    break;
                case 3:
                    System.out.println(friends.getSynopsis());
                    break;
                default:
                    System.out.println("Invalid selection");
            }
            System.out.println("");
            printInstructions();
            selection = scanner.nextInt();
        }
        System.out.println("End of program");
    }

    private static void printInstructions() {
        System.out.println("Select a series to see its synopsis");
        System.out.println("1. The Big Bang Theory");
        System.out.println("2. Vikings");
        System.out.println("3. Friends");
        System.out.println("0. Get out");
        System.out.println("");
        System.out.print("Enter your selection: ");

    }

    @Override
    public void onDownloadComplete(Media media, String content) {
        if (content != null) {
            media.setContent(content);
            media.play();
        }
        System.out.println(content);
    }

}
