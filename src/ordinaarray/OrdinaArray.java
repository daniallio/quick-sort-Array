
package ordinaarray;


public class OrdinaArray {

    static double[] v;
    
    public static void main(String[] args) {
        v = new double[5];
                
        double temp;
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
             
            
            for (int j = 0; j < v.length; j++) {
                System.out.println(v[j]);
                
            }
        }

     static void init() { // metodo che carica con numeri causali un array
        
        for (int i = 0;  i < v.length; i++){
             v[i] =Math.random();
            
        }
            
    }
            
        
        
    }
        
        
        
    
    

