import java.util.Scanner;
    
    public class siralama {
         public static void main(String[] args) {
          
           Scanner inp = new Scanner(System.in); 

            double a, b , c;
        
        System.out.print("\n1.sayıyı giriniz:");

            a=inp.nextDouble();

        System.out.print("\n2.sayıyı giriniz:");

            b=inp.nextDouble();

        System.out.print("\n3.sayıyı giriniz:");

            c=inp.nextDouble();


            if ((a<b)&&(b<c)){System.out.println("\n"+a+"\t"+"<"+"\t"+b+"\t"+"<"+"\t"+c+"\n");}
       
    if ((b<a)&&(a<c)){System.out.println("\n"+b+"\t"+"<"+"\t"+a+"\t"+"<"+"\t"+c+"\n");}
 
    if ((c<a)&&(a<b)){System.out.println("\n"+c+"\t"+"<"+"\t"+a+"\t"+"<"+"\t"+b+"\n");}

    if ((b<c)&&(c<a)){System.out.println("\n"+b+"\t"+"<"+"\t"+c+"\t"+"<"+"\t"+a+"\n");}

    if ((c<b)&&(b<a)){System.out.println("\n"+c+"\t"+"<"+"\t"+b+"\t"+"<"+"\t"+a+"\n");}
    
    if ((a<c)&&(c<b)){System.out.println("\n"+a+"\t"+"<"+"\t"+c+"\t"+"<"+"\t"+b+"\n");}


}
}
