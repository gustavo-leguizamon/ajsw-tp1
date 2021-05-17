package TP1.P3_FlujoDeIO.P3_5;

public class Datos {
    public void Print(String in, String out){
        synchronized (this){ //SYNCHRONIZED BLOCK
            try{
                Thread.sleep(5000);
                System.out.println(out);
            }
            catch (Exception ex){
                System.out.println(ex);
            }
        } //END SYNCHRONIZED BLOCK
    }
}
