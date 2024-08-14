package OOP;

public class Enum {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//     These are enum constants.
//     Type is Week.
//     By default they are public, static and final.
//
    }
    public static void main(String[] args) {
       Week week;
       week = Week.Monday;
        System.out.println(week.ordinal());
    }
}
