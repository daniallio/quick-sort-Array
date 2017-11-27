/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinaarray;

/**
 *
 * @author tss
 */
public class BubleSort {
    public static void main(String[] args) {
        int[] numeri = {15,2,20,7,10};
        boolean scambiato = true;
        
        
            while (scambiato == true)
            {
                scambiato = false;
                int index = 0;
                while (index < numeri.length-1)
                {
                    if(numeri[index] > numeri[index+1])
                    {
                        int temp = numeri[index];
                        numeri[index] = numeri[index+1];
                        numeri[index+1] =  temp;
                        scambiato = true;
                    }
                 index++;   
                }
                
                
            }
        
        for (int i = 0; i < numeri.length; i++) {
            
            System.out.println(numeri[i]);
            
        }
        
        
    }
    
    
}
