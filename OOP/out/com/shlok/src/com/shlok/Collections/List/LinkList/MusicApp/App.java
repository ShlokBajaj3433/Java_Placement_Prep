package com.shlok.Collections.List.LinkList.MusicApp;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Song playlist = new Song();

		while (true) {
			System.out.println();
			System.out.println("=========== Music Playlist Menu ===========");
			System.out.println("1. Add song at beginning");
			System.out.println("2. Add song at end");
			System.out.println("3. Remove first song");
			System.out.println("4. Remove last song");
			System.out.println("5. Display current playing song");
			System.out.println("6. Display previous played song");
			System.out.println("7. Display upcoming song");
			System.out.println("8. Search a song");
			System.out.println("9. Display playlist");
			System.out.println("10. Clear playlist");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");

			int choice;
			try {
				choice = Integer.parseInt(scanner.nextLine().trim());
			} catch (NumberFormatException ex) {
				System.out.println("Please enter a valid number.");
				continue;
			}

			if (choice == 0) {
				System.out.println("Exiting playlist manager.");
				break;
			}

			switch (choice) {
				case 1 -> {
					System.out.print("Enter song name: ");
					playlist.addSongBeginning(scanner.nextLine());
				}
				case 2 -> {
					System.out.print("Enter song name: ");
					playlist.addSongEnd(scanner.nextLine());
				}
				case 3 -> playlist.removeFirstSong();
				case 4 -> playlist.removeLastSong();
				case 5 -> playlist.displayCurrentPlayingSong();
				case 6 -> playlist.displayPreviousPlayedSong();
				case 7 -> playlist.displayUpcomingSong();
				case 8 -> {
					System.out.print("Enter song name to search: ");
					playlist.searchSong(scanner.nextLine());
				}
				case 9 -> playlist.displayPlaylist();
				case 10 -> playlist.clearPlaylist();
				default -> System.out.println("Invalid option. Please try again.");
			}
		}

		scanner.close();
	}
}
