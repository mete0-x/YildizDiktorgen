import java.util.Scanner;

public class yildiz {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
int sutun = 0;
int satir = 0;

    System.err.println("Sutun  :");
     sutun = scanner.nextInt();
    System.out.println("Satir  :");
     satir = scanner.nextInt();

   for(int i= 1;i <= satir; i++){
  
     if(i == 1 || i == satir){
         for(int j=1; j<=sutun; j++ ){
             System.out.print("*");
         }
         
      }
       else{
          System.out.print("*");
             for(int k = 1;k <= sutun-2;k++){
                 System.out.print(" ");
              }
              System.out.print("*");
            }
            System.out.println("");
   }

  }
    
}
