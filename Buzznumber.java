class Buzznumber
 {
   public static void main(String[]args)
   {
     int v=7;
     String result=(v%7==0||v%10==7)?("it is buzz no"):("it is not buzz no");
 
     System.out.println(result); 
     //it is buzz no
     //Buzz number which is divisible by 7 or last digit of number is 7
   }
 }