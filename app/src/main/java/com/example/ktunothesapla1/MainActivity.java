package com.example.ktunothesapla1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public TextView SinifOrt;
    public TextView StanSapma;
    public TextView Vizen;
    public TextView FinaBut;
    public TextView sonuc;
    public Button terstenHesapla;
    public Button hesapla;
    public EditText SinifOrt_edit;
    public EditText StanSapma_edit;
    public EditText Vizen_edit;
    public EditText FinaBut_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SinifOrt = (TextView) findViewById(R.id.sinif_ort);
       StanSapma = (TextView)findViewById(R.id.standart_sapma);
       Vizen = (TextView)findViewById(R.id.vize_notu);
       FinaBut = (TextView)findViewById(R.id.final_but);
       terstenHesapla = (Button) findViewById(R.id.ters_hesapla);
       hesapla = (Button)findViewById(R.id.hesapla);
       sonuc = (TextView)findViewById(R.id.sonuc);

        SinifOrt_edit =(EditText)findViewById(R.id.sinif_edit);
        StanSapma_edit =(EditText)findViewById(R.id.standart_sapma_edit);
        Vizen_edit =(EditText)findViewById(R.id.vize_notu_edit);
        FinaBut_edit =(EditText)findViewById(R.id.final_but_edit);

       hesapla.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double sayi1 = Double.parseDouble(SinifOrt_edit.getText().toString());
               double sayi2 = Double.parseDouble(StanSapma_edit.getText().toString());
               double sayi3 = Double.parseDouble(Vizen_edit.getText().toString());
               double sayi4 =Double.parseDouble(FinaBut_edit.getText().toString());


               double Not_ort = (sayi3 + sayi4) / 2;

               double sayi5 = (Not_ort - sayi1) / sayi2 ;

               final double son_hesap=  (sayi5 * 10) + 50 ;


             //ORTALAMA 42.5 TAN KÜÇÜK İSE

              if(Not_ort <= 42.5){
                  if(son_hesap <36){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                  }
                  if(son_hesap >= 36 & son_hesap <= 40.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                  }
                  if(son_hesap >= 41 & son_hesap <= 45.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                  }
                  if(son_hesap >= 46 & son_hesap <= 50.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                  }
                  if(son_hesap >= 51 & son_hesap <= 55.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                  }
                  if(son_hesap >= 56 & son_hesap <= 60.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                  }
                  if(son_hesap >= 61 & son_hesap <= 65.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                  }
                  if(son_hesap >= 66 & son_hesap <= 70.99){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                  }
                  if(son_hesap >= 71){
                      sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                  }
              }


              //ORTALAMA 42.5 VE 47.5 ARASINDA İSE
               if(Not_ort >= 42.5 & Not_ort <= 47.5){
                   if(son_hesap <34){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                   }
                   if(son_hesap >= 34 & son_hesap <= 38.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                   }
                   if(son_hesap >= 39 & son_hesap <= 43.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                   }
                   if(son_hesap >= 44 & son_hesap <= 48.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                   }
                   if(son_hesap >= 49 & son_hesap <= 53.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                   }
                   if(son_hesap >= 54 & son_hesap <= 58.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                   }
                   if(son_hesap >= 59 & son_hesap <= 63.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                   }
                   if(son_hesap >= 64 & son_hesap <= 68.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                   }
                   if(son_hesap >= 69){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                   }
               }


               //ORTALAMA 47.5 VE 52.5 ARASINDA İSE
               if(Not_ort >= 47.5 & Not_ort <= 52.5){
                   if(son_hesap <32){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                   }
                   if(son_hesap >= 32 & son_hesap <= 36.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                   }
                   if(son_hesap >= 37 & son_hesap <= 41.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                   }
                   if(son_hesap >= 42 & son_hesap <= 46.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                   }
                   if(son_hesap >= 47 & son_hesap <= 51.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                   }
                   if(son_hesap >= 52 & son_hesap <= 56.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                   }
                   if(son_hesap >= 57 & son_hesap <= 61.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                   }
                   if(son_hesap >= 62 & son_hesap <= 66.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                   }
                   if(son_hesap >= 67){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                   }
               }

               //ORTALAMA 52.5 VE 57.5 ARASINDA İSE
               if(Not_ort >= 52.5 & Not_ort <= 57.5){
                   if(son_hesap <30){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                   }
                   if(son_hesap >= 30 & son_hesap <= 34.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                   }
                   if(son_hesap >= 35 & son_hesap <= 39.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                   }
                   if(son_hesap >= 40 & son_hesap <= 44.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                   }
                   if(son_hesap >= 45 & son_hesap <= 49.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                   }
                   if(son_hesap >= 50 & son_hesap <= 54.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                   }
                   if(son_hesap >= 55 & son_hesap <= 59.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                   }
                   if(son_hesap >= 60 & son_hesap <= 64.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                   }
                   if(son_hesap >= 65){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                   }
               }


               //ORTALAMA 57.5 VE 62.5 ARASINDA İSE
               if(Not_ort >= 57.5 & Not_ort <= 62.5){
                   if(son_hesap <28){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                   }
                   if(son_hesap >= 28 & son_hesap <= 32.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                   }
                   if(son_hesap >= 33 & son_hesap <= 37.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                   }
                   if(son_hesap >= 38 & son_hesap <= 42.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                   }
                   if(son_hesap >= 43 & son_hesap <= 47.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                   }
                   if(son_hesap >= 48 & son_hesap <= 52.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                   }
                   if(son_hesap >= 53 & son_hesap <= 57.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                   }
                   if(son_hesap >= 58 & son_hesap <= 62.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                   }
                   if(son_hesap >= 63){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                   }
               }


               //ORTALAMA 62.5 VE 70 ARASINDA İSE
               if(Not_ort >= 62.5 & Not_ort <= 70){
                   if(son_hesap <26){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                   }
                   if(son_hesap >= 26 & son_hesap <= 30.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                   }
                   if(son_hesap >= 31 & son_hesap <= 35.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                   }
                   if(son_hesap >= 36 & son_hesap <= 40.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                   }
                   if(son_hesap >= 41 & son_hesap <= 45.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                   }
                   if(son_hesap >= 46 & son_hesap <= 50.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                   }
                   if(son_hesap >= 51 & son_hesap <= 55.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                   }
                   if(son_hesap >= 56 & son_hesap <= 60.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                   }
                   if(son_hesap >= 61){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                   }
               }


               //ORTALAMA 70.0 VE 80 ARASINDA İSE
               if(Not_ort >= 70.0 & Not_ort <= 80){
                   if(son_hesap <24){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FF"));
                   }
                   if(son_hesap >= 24 & son_hesap <= 28.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ FD"));
                   }
                   if(son_hesap >= 29 & son_hesap <= 33.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DD"));
                   }
                   if(son_hesap >= 34 & son_hesap <= 38.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ DC"));
                   }
                   if(son_hesap >= 39 & son_hesap <= 43.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CC"));
                   }
                   if(son_hesap >= 44 & son_hesap <= 48.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ CB"));
                   }
                   if(son_hesap >= 49 & son_hesap <= 53.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BB"));
                   }
                   if(son_hesap >= 54 & son_hesap <= 58.99){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ BA"));
                   }
                   if(son_hesap >= 59){
                       sonuc.setText(String.valueOf("HARFLİ NOTUNUZ AA"));
                   }
               }


               //ORTALAMA 80 VE 100 ARASINDA İSE
               if(Not_ort >= 80 & Not_ort <= 100){
                   Toast.makeText(getApplicationContext(),"ÇOK BAŞARILISINIZ. TEBRİKLER ",Toast.LENGTH_LONG).show();
               }
           }


       });


    }
}
