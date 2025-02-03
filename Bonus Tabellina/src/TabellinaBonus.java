//6)BONUS: modificare la classe Tabellina in modo da renderla piu' incasinata e irriconoscibile possibile, non deve essere possibile capire cosa sta succedendo, usate la fantasia. Questa pratica si chiama refucktoring, quindi lasciatevi guidare dal nome ;D Se vi sentite impavidi mandatemi in privato le vostre creazioni, i migliori tre avranno un bonus non meglio specificato 


public class TabellinaBonus {
    private int number;

    public TabellinaBonus (int number){
        this.number =  number;
    }

    public void stampa(){
         for(int i= 1; i<= 10; i++){
            int total = (number * i);
            System.out.println(total);
         }
    }
    }

