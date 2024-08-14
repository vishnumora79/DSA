public class stock_trade {
    public static void main(String args[]) {
        int a[] = {7, 1, 5, 3, 6, 4};
        int minimum = a[0];
        int n = a.length,index = 0;
        for (int i=0;i<n;i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        System.out.println("Minimum value is :" + minimum);
        
        for (int i=0;i<n;i++) {
            if (a[i] == minimum) {
              index = i;
            }
        } 
        System.out.println("Index of Minimum value is :" + index);
        if(a[index] == a[n-1]) {
            System.out.println(0);
        }
        else {
            int maxi = a[index];
            
            for (int i = index;i<n;i++) {
                if(a[i] > maxi) {
                    maxi = a[i];
                }
            }
            System.out.println("Maximum value after minimum value is :" + maxi);
            System.out.println(maxi - index);
        }
    }
}