public class bit_swap 
{
    public static void main(String args[])
    {
        int n = 525;
        int rem,sum = 0,base = 1;
        while(n != 0)
        {
          rem = n % 2;
          sum = sum + rem*base;
          base = base * 10;
          n = n / 2;
        }
        String binary = "" + sum;
        System.out.println("The binary value is " + binary);
        char arr[] = binary.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
              if (i % 2 != 0)
              {
                continue;
              }
              else
              {
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
              }
        }
        StringBuilder s = new StringBuilder();
        for(char c:arr)
        {
          s.append(c);
        }
        String str = s.toString();      
      System.out.println(str);
      
      int count = 0;
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i] == '0')
         count++;
      }
      System.out.println(count);
    }

}