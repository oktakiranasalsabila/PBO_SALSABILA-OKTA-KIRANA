package SALSABILA_07112022_modul7;

public class lat3 {
 public static void main(String[] args) {
     String alamat[][] = {{"Florence", "735-1234", "Manila"}, 
         {"Joyce", "983-3333", "Quezon City"},
         {"Becca", "456-3322", "Manila"}};
int i=0;
do{
System.out.println("name    :" + alamat[i][0] );
System.out.println("Tel. #  :" + alamat[i][1] );
System.out.println("Address :" + alamat[i][2] );
System.out.println(" ");
i++;
}
while (i<3);
}
}