public class ReverseNumberSol {
    public int reverse(int x) {
        System.out.println(x);
        int y = 0;
        while(x!=0){
             System.out.println(x%10);
            
          int yy = y*10 + x%10;

        if ((yy - x%10)/10 != y) return 0;
        else y = yy;
           x = x/10;
        }
        
      return y;  
    }
}