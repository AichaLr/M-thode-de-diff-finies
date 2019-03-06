package a_num;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class A_Num {
    public A_Num(){};
   static Scanner scan;
    public int fact(int n){
          int f = 1;
          
     for (int i = 2; i <= n; i++) 
        
      
        f *= i; 

    return f; 
} 
    
    float u_cal(float u, int n) 
{ 

    float temp = u; 

    for (int i = 1; i < n; i++) 

        temp = temp * (u - i)/ fact(i);  

    return temp; 
} 

  
    public static void main(String[] args) {
        
 scan = new Scanner(System.in);
  Scanner sc = new Scanner(System.in);
        float h;
        System.out.println("Entrer La Valeur de n");
        int n = sc.nextInt();
        int f=n-1;
       System.out.println("Le Polynome est de Degrée"+f);
         float[]x = new float[n];
         for (int i = 0; i < n; i++) {
             System.out.println("Entrer La Valeur de x["+i+"]");
               x[i] = scan.nextFloat();
         } 
        
      
           float[][] y = new float[n][n];
           for (int i = 0; i < n; i++) {
	   System.out.println("Entrer La Valeur de y["+i+"]");
           y[i][0] = scan.nextFloat();

        // TODO code application logic here
    }
           
           
           
            for (int i = 1; i < n; i++) { 

        for (int j = 0; j < n - i; j++) 

            y[j][i] = y[j + 1][i - 1] - y[j][i - 1]; 

    } 

  System.out.println("la valeur de x[0] :"+x[0]);
   System.out.println("la Valeur de f(x0) :"+y[0][0]);  
  for (int i = 1; i < n ; i++) 
   System.out.println("la Valeur de ∇"+i+" :"+y[0][i]);        
    
  
  
  
  System.out.println("enter the value of x pour calculer le polynome Pn");
    float value = sc.nextInt();
    A_Num poly=new A_Num();
   
         
           
       
       
    
     float sum = y[0][0]; 
      float resultat = y[0][0]; 
      h=x[1]-x[0]/1;
       float u = (value - x[0]) /h; 
 
    for (int i = 1; i < n; i++) { 
        sum = sum +(poly.u_cal(u, i) * y[0][i]) ;
    }
    
    
    
      System.out.println("la Resultas de polynome Pn"+value+"est :"+sum);

}}
    
 /*  Entrer La Valeur de n
3
Le Polynome est de Degrée2
Entrer La Valeur de x[0]
0
Entrer La Valeur de x[1]
1
Entrer La Valeur de x[2]
2
Entrer La Valeur de y[0]
1
Entrer La Valeur de y[1]
2
Entrer La Valeur de y[2]
4
la valeur de x[0] :0.0
la Valeur de f(x0) :1.0
la Valeur de ∇1 :1.0
la Valeur de ∇2 :1.0
enter the value of x pour calculer le polynome Pn
1
la Resultas de polynome Pn1.0est :2.0*/

/*Entrer La Valeur de n
4
Le Polynome est de Degrée3
Entrer La Valeur de x[0]
0
Entrer La Valeur de x[1]
1
Entrer La Valeur de x[2]
2
Entrer La Valeur de x[3]
3
Entrer La Valeur de y[0]
0
Entrer La Valeur de y[1]
2
Entrer La Valeur de y[2]
36
Entrer La Valeur de y[3]
252
la valeur de x[0] :0.0
la Valeur de f(x0) :0.0
la Valeur de ∇1 :2.0
la Valeur de ∇2 :32.0
la Valeur de ∇3 :150.0
enter the value of x pour calculer le polynome Pn
2
la Resultas de polynome Pn2.0est :68.0*/