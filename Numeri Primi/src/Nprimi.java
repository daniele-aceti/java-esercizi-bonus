//1)scrivere una classe con solo metodo main, una volta eseguita la classe in ouput devono esserci i primi 100 numeri primi. Un numero primo e' un numero divisibile solo per se stesso e per 1


public class Nprimi {
/*public void main() {
        for( int i = 0; i <= 421; i++){
            if(i >= 2){
                if((i %2 == 0 && i != 2) || (i %3 == 0 && i != 3) || (i% 5 == 0 && i != 5) ||(i%7 == 0 &&  i != 7)){
                    //non fare nulla sono quelli non primi
                }else{  
                    System.out.println("Numero primo " + i );
                }
            }
            
        }                     
}*/

int contatore = 0;
public void main(){
    for(int index = 0; index <= 421; index++){
        if(index >= 2){
            if(index % 2 != 0 || index == 2){
                if(index % 3 != 0 || index == 3){
                    if(index % 5 != 0 || index == 5){
                       if(index % 7 != 0 || index == 7){
                           contatore++;
                          System.out.println("N. " + index + "   riga  " + contatore);
                    }
                  }
                }
            }  
        }
    }
}
}
    

