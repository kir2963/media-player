package kir.util;

import kir.util.media.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            Printer.error("Usage: java -jar MediaPlayer <address:port> <screen width> <screen height>");
            return;
        }
        var player = new MediaPlayer(args[0]);

        int sw, sh;
        try {
            sw = Integer.parseInt(args[1]);
            sh = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        player.setScreenSize(sw, sh);
        player.play();
    }
}