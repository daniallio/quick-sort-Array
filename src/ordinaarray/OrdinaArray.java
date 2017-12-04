
package ordinaarray;


public class OrdinaArray {

    
    public static void main(String[] args) {
        
       int[] v = {15,2,20,7,10,2};
       int temp = 0;
        
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
            
        
        
    }
        
        
        
    
    

