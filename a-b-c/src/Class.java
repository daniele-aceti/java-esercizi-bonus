public class Class{
    int contatore = 0;


    public void a(){
         if(contatore == 10){
            System.out.println(contatore);
            return;
    }else{
        System.out.println(contatore);
        contatore += 1;
        b();
    }
}
    public void b(){
        c();
    }
    public void c(){
        a();
    }
    
   
}