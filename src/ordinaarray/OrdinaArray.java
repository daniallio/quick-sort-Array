
package ordinaarray;


public class OrdinaArray {

    static int[] v;
    
    public static void main(String[] args) {
        v = new int[5];
                
        int temp; // variabile per salvare il contenuto in maniera temporale
        init(); // metodo che carica numeri casuali su un array
        
        for (int indice = 0; indice < v.length; indice ++) 
        {
            for (int indice1 = indice +1 ; indice1 < v.length; indice1 ++ )
            {
                if (v[indice1] < v[indice])
                {
                    temp = v[indice];
                    v[indice] = v[indice1];
                    v[indice1] = temp;
                    
                }
                    
            }    
          
        }
             
            
            for (int j = 0; j < v.length; j++) { // scorro l'arry ed eseguo la stampa
                System.out.println(v[j]);
                
            }
        }

     static void init() { // metodo che carica con numeri causali un array
        
        for (int i = 0;  i < v.length; i++){
             v[i] =(int) (Math.random()*10); // genero numeri casuali compresi fra 0 e 10, viene convertito int tramite cast.
            
        }
            
    }
            
        
        
    }
        
        
        
    
    

