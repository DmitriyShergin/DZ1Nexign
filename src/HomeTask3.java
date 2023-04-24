public class HomeTask3 {
    public static void main(String[] args) {
        String current_time = "13:48:10";
        int total_seconds, hours, minutes, seconds;
        String delimeter = ":";
        String[] subStr;
        subStr = current_time.split(delimeter);
        hours = Integer.parseInt(subStr[0]);
        minutes = Integer.parseInt(subStr[1]);
        seconds = Integer.parseInt(subStr[2]);
        total_seconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println(total_seconds);
    }
}
