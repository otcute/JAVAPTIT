import java.util.*;
import java.text.*;

class CountingTime implements Comparable<CountingTime> {
    private String id;
    private String name;
    private String timein;
    private String timeout;

    public CountingTime(String id, String name, String timein, String timeout) {
        this.id = id;
        this.name = name;
        this.timein = timein;
        this.timeout = timeout;
    }

    public static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    public Date getTimein() throws ParseException {
        return sdf.parse(timein);
    }

    public Date getTimeout() throws ParseException {
        return sdf.parse(timeout);
    }

    public long getDiff() throws ParseException {
        return getTimeout().getTime() - getTimein().getTime();
    }

    public long getDiffInMinutes() throws ParseException {
        return (getDiff() / (60 * 1000)) % 60;
    }

    public long getDiffInHours() throws ParseException {
        return (getDiff() / (60 * 60 * 1000)) % 24;
    }

    public int compareTo(CountingTime o) {
        try {
            if (this.getDiffInHours() < o.getDiffInHours()) {
                return 1;
            } else if (this.getDiffInHours() > o.getDiffInHours()) {
                return -1;
            } else {
                return 0;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String toString() {
        try {
            return id + " " + name + " " + getDiffInHours() + " " + "gio" + " " + getDiffInMinutes() + " " + "phut";
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<CountingTime> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String timein = sc.nextLine();
            String timeout = sc.nextLine();
            CountingTime countingTime = new CountingTime(id, name, timein, timeout);
            list.add(countingTime);
        }
        Collections.sort(list);
        for (CountingTime countingTime : list) {
            System.out.println(countingTime);
        }
    }
}
