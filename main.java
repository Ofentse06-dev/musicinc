public class Main {

    public static void main(String[] args) {

        System.out.println("🎵 Welcome to MusicBox");

        String[] songs = {
                "Calm Nights",
                "Summer Vibes",
                "Dream World"
        };

        System.out.println("\nAvailable Songs:");

        for(int i = 0; i < songs.length; i++) {

            System.out.println((i + 1) + ". " + songs[i]);
        }

        System.out.println("\nNow Playing: " + songs[0]);
    }
}
