package Curso4.cinebox.cineboxPlayer;

import Curso4.cinebox.Media;
import Curso4.cinebox.mediaDownloader.MediaDownloader;
import Curso4.cinebox.movie.Movie;
import Curso4.cinebox.series.Series;

import java.util.*;

public class CineboxPlayer implements MediaDownloader.DownloadListener {

    public void initialize() {

        Series theBigBangTheory = new Series("The Big Bang Theory", "comedy", 45, 12, 5);
        Series vikings = new Series("vikings", "Action and Adventures", 45, 15, 7);
        Series friends = new Series("friends", "comedy", 45, 20, 7);
        Series breakingBad = new Series("breaking bad", "Drama", 50, 25, 5);
        Series theBigBangTheory2 = new Series("The Big Bang Theory", "comedy", 40, 15, 4);
        Series vikings2 = new Series("vikings", "Action and Adventures", 50, 20, 5);


        theBigBangTheory.setSynopsis("The Big Bang Theory is a comedy about the lives of a group of college friends");
        vikings.setSynopsis("Vikings is a series about the adventures of a Viking family");
        friends.setSynopsis("Friends is a comedy about the lives of a group friends");
        breakingBad.setSynopsis("Breaking Bad is a drama about a chemistry teacher who is diagnosed with cancer");
        theBigBangTheory2.setSynopsis("The Big Bang Theory is a comedy about the lives of a group of college friends");
        vikings2.setSynopsis("Vikings is a series about the adventures of a Viking family");

        HashMap<Integer, Media> mediaHashMap = new HashMap<>();
        mediaHashMap.put(1, theBigBangTheory);
        mediaHashMap.put(2, vikings);
        mediaHashMap.put(3, friends);

        Media media = mediaHashMap.get(2);
        System.out.println(media.getTitle());
        mediaHashMap.size();

       /* PriorityQueue<Media> mediaQueue = new PriorityQueue<>();
        mediaQueue.add(theBigBangTheory);
        mediaQueue.add(vikings);
        mediaQueue.add(friends);
        mediaQueue.add(breakingBad);

        playQueue(mediaQueue);

        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(theBigBangTheory);
        mediaList.add(vikings);
        mediaList.add(friends);
        mediaList.add(breakingBad);
        mediaList.add(theBigBangTheory2);
        mediaList.add(vikings2);

        Collections.sort(mediaList);

        printInstructions(mediaList);

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        System.out.println("You selected: " + selection);
        System.out.println("");

        //option 1
        while (selection != 0) {
            int mediaListSize  = mediaList.size();
            int index = selection - 1;

            if (index >= mediaListSize) {
                System.out.println("Invalid selection");
            }else {
                Media media = mediaList.get(index);
                System.out.println(media.getSynopsis());
            }
            System.out.println("");
            printInstructions(mediaList);
            selection = scanner.nextInt();
        }

        //option 2
//        while (selection != 0) {
//            switch (selection) {
//                case 1:
//                    System.out.println(theBigBangTheory.getSynopsis());
//                    break;
//                case 2:
//                    System.out.println(vikings.getSynopsis());
//                    break;
//                case 3:
//                    System.out.println(friends.getSynopsis());
//                    break;
//                case 4:
//                    System.out.println(breakingBad.getSynopsis());
//                    break;
//                case 5:
//                    System.out.println(theBigBangTheory2.getSynopsis());
//                    break;
//                case 6:
//                    System.out.println(vikings2.getSynopsis());
//                default:
//                    System.out.println("Invalid selection");
//            }
//            System.out.println("");
//            printInstructions(mediaList);
//            selection = scanner.nextInt();
//        }
        System.out.println("End of program");*/
    }

    private void playQueue(PriorityQueue<Media> mediaQueue) {
        while (mediaQueue.size() > 0){
            Media media = mediaQueue.poll();
            media.play();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printInstructions(ArrayList<Media> mediaList) {
        System.out.println("Select a series to see its synopsis");

        Media theBigBangTheory= mediaList.get(0);
        Media vikings= mediaList.get(1);
        Media friends= mediaList.get(2);
        Media breakingBad= mediaList.get(3);
        Media theBigBangTheory2= mediaList.get(4);
        Media vikings2= mediaList.get(5);

        System.out.println("1. " + theBigBangTheory.getTitle());
        System.out.println("2. " + vikings.getTitle());
        System.out.println("3. " + friends.getTitle());
        System.out.println("4. " + breakingBad.getTitle());
        System.out.println("5. " + theBigBangTheory2.getTitle());
        System.out.println("6. " + vikings2.getTitle());
        System.out.println("0. Exit");
        System.out.println("");
        System.out.print("Enter your selection: ");

        //option 2
        /*System.out.println("Select a series to see its synopsis");
        for (int i = 0; i < mediaList.size(); i++){
            Media media = mediaList.get(i);
            int index = i +1;
            System.out.println(index + ". " + media.getTitle());
        }
        System.out.println("0. Exit");*/

        //option 3
//        for (Media media : mediaList) {
//            System.out.println(media.getTitle());
//        }
//        System.out.println("0. Exit");

        //option 4
//        System.out.println("Select a series to see its synopsis");
//        Iterator<Media> mediaIterator = mediaList.iterator();
//        while (mediaIterator.hasNext()) {
//            Media media = mediaIterator.next();
//            System.out.println(media.getTitle());
//        }


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
