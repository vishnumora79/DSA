class Payday {
    public static void main(String args[]) {
        int x1 = 2942200;
        int r1 = 89;
        int x2 = 213224085;
        int r2 = 37;
        double a1 = x1;
        double a2 = x2;
        float i1 = (long)(r1*x1);
        float i2 = (long)(r2*x2);
        double s1 = i1/100;
        double s2 = i2/100;
        System.out.println(i1);
        System.out.println(i2);
        if (s1 > s2)
           System.out.println("A");
        else if(s2 > s1)
        System.out.println("B");
        else   
        System.out.println("EQUAL");
           
    }
}