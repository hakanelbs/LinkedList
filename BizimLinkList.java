
package bizimlinklist;


public class BizimLinkList {

    
    public static void main(String[] args) {
        bLL list1 = new bLL();
        list1.basaEkle(2);
        list1.basaEkle(9);
        list1.basaEkle(12);
        list1.basaEkle(7);
        list1.basaEkle(8);
        list1.basaEkle(2);

        list1.listeyiYazdir();
        list1.bubbleSort();
        list1.listeyiYazdir();
        list1.sifirla();
        list1.listeyiYazdir();
        list1.basaEkle(2);
        list1.basaEkle(9);
        list1.basaEkle(12);
        list1.basaEkle(7);
        list1.basaEkle(8);
        list1.basaEkle(2);
        list1.siraliEkle(5);
        list1.listeyiYazdir();
      
       
    }
    
}
