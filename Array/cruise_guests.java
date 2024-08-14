package Array;

public class cruise_guests {
    public static void main(String[] args) {
        int[] guests_entry = {7,0,5,1,3};
        int[] guests_exit = {1,2,1,3,4};
        int t = 5;
        int max_guests = 0;
        int guests = 0;
        for(int i=0; i < t;i++) {
            int entry = guests_entry[i];
            int exit = guests_exit[i];
            guests += entry - exit;
            max_guests = Math.max(max_guests, guests);
        }
        System.out.println(max_guests);

    }
}
