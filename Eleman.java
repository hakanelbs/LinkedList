
package bizimlinklist;


public class Eleman {
    int sayi;
    Eleman siradaki;

    public Eleman(Eleman siradaki) {
        this.siradaki = siradaki;
    }

    public Eleman(int sayi) {
        this.sayi = sayi;
    }
    
    
}
