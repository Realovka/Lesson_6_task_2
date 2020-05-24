package com.company;

public class Main {

    public static void main(String[] args) {
       Computer computer1 =new Computer("Процессор ADM Ryzen 5 2600", 32,"Western Digital WD10EZEX", 40000 );
       Computer computer2 =new Computer("Процессор Intel Core i5-9600KF", 16, "Seagate ST1000DM010",40000);
       Computer computer3 =new Computer("Процессор AMD Ryzen 3 3200G", 16,"Toshiba HDWL120UZVA", 40000 );
       Computer computer4 =new Computer("Процессор AMD Ryzen 5 1600G", 64, "Western Digital WD10EZEX", 40000 );
       Computer computer5 =new Computer("Процессор Intel Core i7-9700K OEM", 8,  "Toshiba HDWL120UZVA", 40000);
       Computer a=new Computer();

       Computer[] array={computer1, computer2, computer3, computer4, computer5};
       int max=computer1.getRam();

       for (int i=0; i<array.length; i++){
           if (array[i].getRam()>max){
               max=array[i].getRam();
               a=array[i];
           }

       }
      a.getAllInfo();
    }
}
