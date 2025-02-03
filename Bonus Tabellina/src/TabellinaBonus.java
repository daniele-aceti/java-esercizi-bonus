//6)BONUS: modificare la classe Tabellina in modo da renderla piu' incasinata e irriconoscibile possibile, non deve essere possibile capire cosa sta succedendo, usate la fantasia. Questa pratica si chiama refucktoring, quindi lasciatevi guidare dal nome ;D Se vi sentite impavidi mandatemi in privato le vostre creazioni, i migliori tre avranno un bonus non meglio specificato 


public class TabellinaBonus {
    private int number;

    public TabellinaBonus (int number){
        this.number =  number;
        System.out.println("Non provare la tabellina del 2 e del 3 le tabelline si specchiano");

    }

     int contatore = 1;
     int count = 10;
    public void print(){
         if(contatore != (11)){
             int total = (number * contatore);
             System.out.println(total);
             contatore++;
              print();   
         }else if(number == 3 || number == 2){
            if(count != 0){
                int result = (number * count);
                System.out.println(result);
                count--;
                print();
            }
} 
         }
    }


