
package boletín9_3;

import javax.swing.JOptionPane;


public class Area {
    
    public class Rectangulo {

   /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int base;
       System.out.println(" introduce la base: ");
       base = sc.nextInt();
       int altura;
       System.out.println(" introduce la altura: ");
       altura=sc.nextInt();
   }*/

int base;
int altura;
int area;
public void revisarDatos(){
   /*int base;
   int altura;
   int area;*/

   /*Scanner rect = new Scanner( System.in);

   System.out.println( JOptionPane.showInputDialog(null," introduce la base:"));
   base = rect.nextInt();
   System.out.println( JOptionPane.showInputDialog(null, " introduce la altura:"));
   altura=rect.nextInt();*/

   do{


       /*Scanner rect = new Scanner( System.in);

       System.out.println( JOptionPane.showInputDialog(null," introduce la base:"));
       base = rect.nextInt();
       System.out.println( JOptionPane.showInputDialog(null," la base es :"+ base));

       System.out.println( JOptionPane.showInputDialog(null, " introduce la altura:"));
       altura=rect.nextInt();
       System.out.println( JOptionPane.showInputDialog(null," la altura es :"+ altura));*/



       area = lerBase() * lerAltura();

       }while (base>0&altura>0);
   System.out.println(JOptionPane.showInputDialog(null," el area del rectangulo es: "+ area));


}
public int lerBase(){
   int base = Integer.parseInt(JOptionPane.showInputDialog(" introduce la base "));
           return base;
}
public int lerAltura(){
      int altura = Integer.parseInt(JOptionPane.showInputDialog(" introduce la altura "));
   return altura;
}
    }
}


    
    
    
    
    
    
   
