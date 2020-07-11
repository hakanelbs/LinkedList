
package bizimlinklist;


public class bLL {
    Eleman bas;
    Eleman son;

    public bLL() {
        bas = null;
        son = null;
        
    }
    public void basaEkle(int sayi){
    
        Eleman yeniEleman = new Eleman (sayi);
          if(doluMu()){
              yeniEleman.siradaki = bas;
              bas = yeniEleman;
        
        }
    
          else{
            bas = yeniEleman;
            son = yeniEleman;
        }
    }
    
     public void sonaEkle(int sayi){
    
        Eleman yeniEleman = new Eleman (sayi);
          if(doluMu()){
              son.siradaki=yeniEleman;
              son = yeniEleman;
              
              
              
        
        }
    
          else{
            bas = yeniEleman;
            son = yeniEleman;
        }
    }
     
     public void indekseEkle(int sayi , int indeks){
     
         Eleman yeniEleman = new Eleman (sayi);
            if(doluMu()){
              if(indeks ==0){
                  //basa ekleme ile aynı
                  yeniEleman.siradaki = bas;
                  bas = yeniEleman;
              }
              else{
              //ortaya bir yere ekliyoruz
                  Eleman isaretci1 = null;
                  Eleman isaretci2 = bas;
                  int mevcutİndeks = 0;
                  while (isaretci2!=null && mevcutİndeks < indeks){
                    isaretci1 = isaretci2;
                    isaretci2 = isaretci2.siradaki;
                    mevcutİndeks++;
        
        
        }
                  if(isaretci2 == null){
                  
                      //lietenin sonuna ekle
                      son.siradaki=yeniEleman;
                      son = yeniEleman;
                  }
                  else{
                  
                      //ortada bir yere ekle
                      yeniEleman.siradaki=isaretci2;
                      isaretci1.siradaki=yeniEleman;
                  
                  }
              
              }
              
              
              
        
        }
    
          else{
            bas = yeniEleman;
            son = yeniEleman;
        }  
         
         
         
         
     
     }
     
     public void bastanSil(){
     
         if(doluMu()){
         
             if(bas==son){
                 //listede tek eleman var
                 bas = null;
                 son = null;
                 
             
             }
             else{
             
                 //listede 1 den fazla eleman var
                 Eleman yeniBas = bas.siradaki;
                 bas.siradaki = null;
                 bas = yeniBas;
                 
             }
         }
     
     }
     public void sondanSil(){
         if(doluMu()){
         
             if(bas==son){
                 //listede tek eleman var
                 bas = null;
                 son = null;}
             else{
                 Eleman isaretci = bas ;
                 while (isaretci.siradaki != son){
                     isaretci = isaretci.siradaki;
                 
                 
                 }
                 isaretci.siradaki = null;
                 son = isaretci;
                 
             
             
             
             }
         
     
     
     
     
     }
     }
     
     public void indeksSil(int indeks){
     
         if (doluMu()){
         
             //tek leman var
             bas=null;
             son= null;
 
         }
         else{
         //en az ıkı eleman var
             if(indeks == 0){
             
                 //basştaki indeksi siliyoruz
                  Eleman yeniBas = bas.siradaki;
                 bas.siradaki = null;
                 bas = yeniBas;
             
             
             }
             else{
             
                 //en az iki eleman var
                 //silfiğimiz basta değil
                 
                 Eleman isaretci1 = null;
                 Eleman isaretci2 = null;
                 int mevcutIndeks = 0;
                 while(isaretci2!=null &&mevcutIndeks  < indeks){
                 
                     isaretci1 = isaretci2;
                     isaretci2 = isaretci2.siradaki;
                     mevcutIndeks++;
                 
                 
                 }
                 if(isaretci2 != null){
                 
                     if(isaretci2 == son){
                     
                         son = isaretci1;
                         isaretci1.siradaki = null;
                     }
                     else{
                     
                         Eleman isaretci3 = isaretci2.siradaki;
                         isaretci2.siradaki=null;
                         isaretci1.siradaki = isaretci3;
                         
                     }
                 
                 }
             
             }
       
         
         }
     
     
     }
     public void verilenDegElSil( int sayi ) {
		if(doluMu()) {
			if( bas == son ) {
				// tek eleman var
				if( bas.sayi == sayi ) {
					bas = null;
					son = null;
				}
			} else {
				// en az iki eleman var
				if( bas.sayi == sayi ) {
					// baştakini sil
					Eleman yeniBas = bas.siradaki;
					bas.siradaki = null;
					bas = yeniBas;
				} else {
					// en az iki eleman var ve
					// sildiğimiz başta değil
					Eleman isaretci1 = null;
					Eleman isaretci2 = bas;
					while( isaretci2 != null
							&& isaretci2.sayi != sayi) {
						isaretci1 = isaretci2;
						isaretci2 = isaretci2.siradaki;
					}
					if( isaretci2 != null) {
						if( isaretci2 == son) {
							// sondan silme
							son = isaretci1;
							isaretci1.siradaki = null;
						} else {
							// ortadan silme
							Eleman isaretci3 = isaretci2.siradaki;
							isaretci2.siradaki = null;
							isaretci1.siradaki = isaretci3;
						}
					}
				}
			}
		}
	}
	
	public void verilenDegerinHepsiniSil( int sayi ) {
		if(doluMu()) {
			if( bas == son ) {
				// tek eleman var
				if( bas.sayi == sayi ) {
					bas = null;
					son = null;
				}
			} else {
				Eleman isaretci1 = null;
				Eleman isaretci2 = bas;
				
				while( isaretci2 != null ) {
					
					if( isaretci2.sayi == sayi) {
						
						if( bas == isaretci2) {
							bas = isaretci2.siradaki;
							isaretci2.siradaki = null;
							isaretci2 = bas;
						} else {
							if( isaretci2 == son) {
								// sondan silme
								son = isaretci1;
								isaretci1.siradaki = null;
								isaretci2 = null;
							} else {
								// ortadan sil
								Eleman isaretci3 = isaretci2.siradaki;
								isaretci2.siradaki = null;
								isaretci1.siradaki = isaretci3;
								isaretci2 = isaretci3;
							}
						}
					} else {
						// eleman silmiyorsak
						// işaretçileri güncelle
						isaretci1 = isaretci2;
						isaretci2 = isaretci2.siradaki;
					}
				}
			}
		}
	}
        
    
    public void listeyiYazdir(){
    
        Eleman isaretci = bas;
        int elemanSayisi = 0 ;
        while (isaretci!=null){
        
            System.out.print(isaretci.sayi + " ");
            isaretci = isaretci.siradaki;
            elemanSayisi++;
        
        
        }
    
        System.out.println();
        System.out.println("Eleman sayısı : .. " +elemanSayisi);
    }
    
    
    public void bubbleSort(){
        if(!doluMu())
        {
            System.out.println("Listede Eleman yok");
        }
        else if(bas==son){
        //listede tekeleman var
            System.out.println("Listede Tek Eleman var");
            
        }
        else{
        
            //Bublesort Baslar
            
            boolean degisiklikYapildiMi = true;
            Eleman birinci;
            Eleman ikinci;
            Eleman onceki;
            
            while(degisiklikYapildiMi){
            
                degisiklikYapildiMi = false;
                birinci =  bas;
                ikinci = birinci.siradaki;
                if(ilkiBuyukMu(birinci,ikinci)){
                
                    yerDegistir(null,birinci,ikinci);
                    degisiklikYapildiMi = true;
                    
                }
                //ilk elemandan sonra onceki devreye girer
                onceki = birinci;
                birinci = ikinci;
                ikinci = ikinci.siradaki;
                
                while(ikinci !=null){
                
                     if(ilkiBuyukMu(birinci,ikinci)){
                
                     yerDegistir(onceki,birinci,ikinci);
                     degisiklikYapildiMi = true;
                    
                }
                    onceki = birinci;
                    birinci = ikinci;
                    ikinci = ikinci.siradaki;
                
                
                }
            
            }
            
            
        }
    
    
    
    }
    public boolean ilkiBuyukMu(Eleman birinci, Eleman ikinci){
        if(birinci.sayi>ikinci.sayi){
              return true;
        }else{
        return false;
        }
    
    
    }
    // birinci ve iklinci elemanların yerlerini değiştirir..
    public void yerDegistir(Eleman onceki, Eleman birinci, Eleman ikinci){
        if(birinci ==bas){
        
            //birinci basta bbulunuyor
            
            
            if(ikinci == son){
                //ikincide sonda yer alıyor
                // yer değiştir ve baş/son güncelle
                
                ikinci.sayi = birinci.sayi;
                birinci.siradaki = null;
                son = birinci;
                bas = ikinci;
                
        }
        
            else{
                // birinci başta ikinci sonda değil durumu
                
                birinci.siradaki = ikinci.siradaki;
                ikinci.siradaki = birinci;
                bas = ikinci;
                
                
            }}
             else if(ikinci ==son){
             
                 //ikinci eleman sonda fakat birinci başta değil
                 ikinci.siradaki = birinci;
                 birinci.siradaki =null;
                 onceki.siradaki = ikinci ;
                 son = birinci ;
                 
             
             }
             else{
                 // birinci ve ikinci listenin içinde
                 birinci.siradaki=ikinci.siradaki;
                 ikinci.siradaki= birinci;
                 onceki.siradaki = ikinci;
             
             }
        
  
        
    
    
    
    }
    public boolean doluMu(){
        if (bas != null){
          return true;
    
    }
        else{
          return false;
    }
    }
    public void sifirla(){
    
        bas = null;
        son = null;
        System.out.println("Liste Temizlendi...");
    
    
    }
      public void siraliEkle(int sayi){
          
          if(!doluMu()){
          
              basaEkle(sayi);
   
          }
          
          
          
          else {
              // eğer ilk elemandan küçükse
              if (sayi <=bas.sayi){
              
                  basaEkle(sayi);
                  return;
              
              
              }
          
              //eklenecek noktayı buluyoruzz
              boolean bulunduMu = false;
              Eleman birinci = bas;
              Eleman ikinci = birinci.siradaki;
              if(ikinci == null){
              
                  //bu durum tek elemanlı
                  sonaEkle(sayi);
                  bulunduMu = true;
              
              }
              else{
                //en az iki eleman var
                while(ikinci !=null){
                
                   if( sayi >= birinci.sayi && sayi<= ikinci.sayi){
                       
                       
                       Eleman yeniEleman = new Eleman(sayi);
                       birinci.siradaki = yeniEleman; 
                       yeniEleman.siradaki = ikinci;
                       bulunduMu = true;
                   
                   }
                
                   birinci = ikinci;
                   ikinci = ikinci.siradaki;
                   
                
                
                
                }
               if (!bulunduMu){
              
                  sonaEkle(sayi);
              
              }
                  
              
              }
          
          
          }
    
    
    
    
    }    
    
}
