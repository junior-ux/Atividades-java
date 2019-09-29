package Questao1e2;

public class Lampada {
    boolean    ligada;
 
    
    public void Liga(){
        ligada=true;
    }
    public void desliga(){
    ligada =  false;
    }
    
    public String observa(){
         if (ligada == true){
                  return "Lampada ligada" ;
         }
         
         else {
                  return "Lampada Desligada";
                   }
      
        
    }
}


