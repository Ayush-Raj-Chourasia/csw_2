class TimeConverter {

    public double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    public double hoursToDays(int hours) {
        return hours / 24.0;
    }
}

public class Question_3 {
    public static void main(String[] args) {
        TimeConverter converter = new TimeConverter();

        System.out.println("Seconds to Minutes: " + converter.secondsToMinutes(120));
        System.out.println("Minutes to Hours: " + converter.minutesToHours(180));
        System.out.println("Hours to Days: " + converter.hoursToDays(48));
    }
}
