
package SALSABILA_07112022_modul7;

public class lat1dowhile {
   public static void main(String[]args)
    {
        String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        int i=0;
        do
            {
                System.out.println(hari[i]);
                i++;
            }while(i<hari.length);
    } 
}
