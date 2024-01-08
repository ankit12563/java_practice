//0,1,1,2,3,5,8,13..
class Fibonacci {
    public static void main(String arg[]) {
      int num = 10;
      long[] fibo = new long[num + 1];
      fibo[0] = 0;
      fibo[1] = 1;

      for(int i = 0; i<= num; i++){
        if(i >= 2){
          fibo[i] = fibo[i-2] + fibo[i-1];
        }
        System.out.println(i + ":" + fibo[i]);

      }
    }

}