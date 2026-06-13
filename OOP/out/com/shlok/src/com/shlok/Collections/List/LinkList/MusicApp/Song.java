package com.shlok.Collections.List.LinkList.MusicApp;

import java.util.LinkedList;

public class Song {
    private final LinkedList<String> playlist = new LinkedList<>();
    private int currentIndex = -1;

    public void addSongBeginning(String song) {
        String cleanedSong = normalizeSong(song);
        if (cleanedSong == null) {
            return;
        }

        playlist.addFirst(cleanedSong);
        if (currentIndex >= 0) {
            currentIndex++;
        } else {
            currentIndex = 0;
        }

        System.out.println(cleanedSong + " added at the beginning.");
    }

    public void addSongEnd(String song) {
        String cleanedSong = normalizeSong(song);
        if (cleanedSong == null) {
            return;
        }

        playlist.addLast(cleanedSong);
        if (currentIndex < 0) {
            currentIndex = 0;
        }

        System.out.println(cleanedSong + " added at the end.");
    }

    public void removeFirstSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty. Nothing to remove.");
            return;
        }

        String removedSong = playlist.removeFirst();
        if (playlist.isEmpty()) {
            currentIndex = -1;
        } else if (currentIndex == 0) {
            currentIndex = 0;
        } else if (currentIndex > 0) {
            currentIndex--;
        }

        System.out.println("Removed first song: " + removedSong);
    }

    public void removeLastSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty. Nothing to remove.");
            return;
        }

        int lastIndex = playlist.size() - 1;
        String removedSong = playlist.removeLast();

        if (playlist.isEmpty()) {
            currentIndex = -1;
        } else if (currentIndex >= lastIndex) {
            currentIndex = playlist.size() - 1;
        }

        System.out.println("Removed last song: " + removedSong);
    }

    public void displayCurrentPlayingSong() {
        if (!hasCurrentSong()) {
            System.out.println("No current song is playing.");
            return;
        }

        System.out.println("Current playing song: " + playlist.get(currentIndex));
    }

    public void displayPreviousPlayedSong() {
        if (!hasCurrentSong() || currentIndex == 0) {
            System.out.println("No previous song available.");
            return;
        }

        System.out.println("Previous played song: " + playlist.get(currentIndex - 1));
    }

    public void displayUpcomingSong() {
        if (!hasCurrentSong() || currentIndex >= playlist.size() - 1) {
            System.out.println("No upcoming song available.");
            return;
        }

        System.out.println("Upcoming song: " + playlist.get(currentIndex + 1));
    }

    public void searchSong(String song) {
        String cleanedSong = normalizeSong(song);
        if (cleanedSong == null) {
            return;
        }

        for (int index = 0; index < playlist.size(); index++) {
            if (playlist.get(index).equalsIgnoreCase(cleanedSong)) {
                System.out.println("Song found at position " + (index + 1) + ": " + playlist.get(index));
                return;
            }
        }

        System.out.println("Song not found: " + cleanedSong);
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("=============== Playlist ===============");
        for (int index = 0; index < playlist.size(); index++) {
            String marker = index == currentIndex ? " <= current" : "";
            System.out.println((index + 1) + ". " + playlist.get(index) + marker);
        }
    }

    public void clearPlaylist() {
        playlist.clear();
        currentIndex = -1;
        System.out.println("Playlist cleared.");
    }

    public void visitSong(String song) {
        addSongEnd(song);
        if (!playlist.isEmpty()) {
            currentIndex = playlist.size() - 1;
        }
    }

    void goBack() {
        if (!hasCurrentSong() || currentIndex == 0) {
            System.out.println("No previous song available.");
            return;
        }

        currentIndex--;
        System.out.println("Now your current song is " + playlist.get(currentIndex));
    }

    void goForward() {
        if (!hasCurrentSong() || currentIndex >= playlist.size() - 1) {
            System.out.println("No upcoming song available.");
            return;
        }

        currentIndex++;
        System.out.println("Current song: " + playlist.get(currentIndex));
    }

    void addFirst(String song) {
        addSongBeginning(song);
    }

    private boolean hasCurrentSong() {
        return currentIndex >= 0 && currentIndex < playlist.size();
    }

    private String normalizeSong(String song) {
        if (song == null || song.trim().isEmpty()) {
            System.out.println("Song name cannot be blank.");
            return null;
        }

        return song.trim();
    }
}
