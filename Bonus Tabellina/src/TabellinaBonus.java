//6)BONUS: modificare la classe Tabellina in modo da renderla piu' incasinata e irriconoscibile possibile, non deve essere possibile capire cosa sta succedendo, usate la fantasia. Questa pratica si chiama refucktoring, quindi lasciatevi guidare dal nome ;D Se vi sentite impavidi mandatemi in privato le vostre creazioni, i migliori tre avranno un bonus non meglio specificato 


public class TabellinaBonus {
    private int number;

    public TabellinaBonus (int number){
        this.number =  number;
    }
     int contatore = 1;
    public void print(){
         if(contatore != (10+1)){
             int total = (number * contatore);
             System.out.println(total);
             contatore += 1;
              print();   
         }else{
            System.out.println("Non provare la tabellina del due");
            return;
      }
      if(number == 2){
        int index = 0;
         while(true){
         System.out.println("Errore");
         }
    }
    }
}

