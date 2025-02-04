//1)scrivere una classe con solo metodo main, una volta eseguita la classe in ouput devono esserci i primi 100 numeri primi. Un numero primo e' un numero divisibile solo per se stesso e per 1


public class Nprimi {
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
    

