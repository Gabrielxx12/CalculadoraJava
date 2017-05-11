package calculadora;
import java.util.Scanner;
public class Calcular {
    float num1,num2,soma,sub,mult,div;
    int i;
    String op,resp;
    Scanner sc = new Scanner(System.in); 
    public void escolherOperador(){
      i = 1;
      while(i != 0){
        System.out.println("Informe um Operador Válido :");
        op = sc.next();
        switch(op)  {
           case "+" : 
             somarNum();
             i = 0; break ;           
           case "-" :
             subtrairNum();
             i = 0; break;            
           case "*" :
             multiplicarNum();
             i = 0; break;           
           case "/" :
             dividirNum();
             i = 0; break;            
           default :
               System.out.println("Apenas Operadores válidos!");
               i++;
        }
      }    
    }
    public void validarNum(){
      do{  
        try{
          i = 0;
          System.out.println("Informe 2 Numeros ");
          num1 = sc.nextFloat(); 
          num2 = sc.nextFloat();  
        }catch(Exception e){System.out.println("Somente números!."); i=1;sc.nextLine();}
      }while(i !=0);  
    }
    public void somarNum(){       
        soma = num1 + num2;
        System.out.println(soma); 
    }
    public void subtrairNum(){
        sub = num1 - num2;
        System.out.println(sub);
    }
    public void multiplicarNum(){
        mult = num1 * num2;
        System.out.println(mult);        
    }
    public void dividirNum(){
        if(num2 != 0){
          div =  num1 / num2 ;
          System.out.println(div);            
        }else{
          System.out.println("Não é possivel dividir por 0"); 
        }
    }
     public void imprimirResultado(){
    i = 1;
      char resp2;
      while(i!=0){  
        validarNum();
        escolherOperador();
        do{
        
         System.out.println("Deseja continuar [S/N]? ");
         resp = sc.next();
         resp2 = resp.charAt(0);
             if (resp2 == 'S'){                 
                 i++; 
             }else if(resp2 == 'N'){
                i = 0; break;
             }else
                System.out.println("Digite uma resposta Válida");                 
        }while(resp2 != 'S' && resp2 != 'N') ;        
      } 
    }
}     