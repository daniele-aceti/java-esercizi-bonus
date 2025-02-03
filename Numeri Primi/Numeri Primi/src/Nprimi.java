//1)scrivere una classe con solo metodo main, una volta eseguita la classe in ouput devono esserci i primi 100 numeri primi. Un numero primo e' un numero divisibile solo per se stesso e per 1


public class Nprimi {
    public void main() {
        int contatore = 0;
        for(int i = 0; i <= 421; i++){
            if(i >= 2){
                if((i %2 == 0 && i != 2) || (i %3 ==0 && i != 3) || (i% 5 == 0 && i != 5) ||(i%7 == 0 &&  i != 7)){
                    //non fare nulla sono quelli non primi
                }else{  
                    contatore += 1; //per contare i primi 100 numeri primi
                    System.out.println(i + "  " +(contatore));
                }
            }
            
        }                     
} 
}
    

