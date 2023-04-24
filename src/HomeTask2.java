public class HomeTask2 {
    public static void main(String[] args) {
        int total_seconds = 49690;
        byte hours = (byte) (total_seconds / 3600);
        byte minutes = (byte) ((total_seconds - hours * 3600) / 60);
        byte seconds = (byte) (total_seconds - hours * 3600 - minutes * 60);
        System.out.println("CURRENT TIME: " + hours + " HOURS " + minutes + " MINUTES " + seconds + " SECONDS.");
    }
}
