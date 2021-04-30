import java.util.Scanner;
public class sumaImpar {

  public static void main(String[] args) {   
      int suma = 0;
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
     while(num != 0){
         if(num%2==0){
          num = scan.nextInt();
        }
        if(num%2==1){
      suma = suma + num;
      num = scan.nextInt();
    }
    }
    System.out.println("El resultado de la suma es:" + suma);
}
}