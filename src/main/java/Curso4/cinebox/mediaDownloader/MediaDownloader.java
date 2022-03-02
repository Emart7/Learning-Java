package Curso4.cinebox.mediaDownloader;

import Curso4.cinebox.Media;

public class MediaDownloader {

    public interface DownloadListener{
        void onDownloadComplete(Media media, String content);
    }

    public static void download(Media media, DownloadListener downloadListener){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("\n");
                System.out.println("Downloading " + media.getTitle());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\n");
                System.out.println(media.getTitle() + " Downloaded!");
                String content = "Probando con esta frase";
                downloadListener.onDownloadComplete(media, content);
            }
        });
        thread.start();
    }
}
