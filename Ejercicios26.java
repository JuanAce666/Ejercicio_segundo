/*  */
package ejercicios26;

import java.util.Scanner;

public class Ejercicios26 {

  
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int nro_apto,n;
        float cant_metros,val_metro,descuento,
        valor_admin,valor_neto;
        
        System.out.print("Cuantos apartamentos son ");
        n=objread.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Numero del apartamento ");
            nro_apto=objread.nextInt();
            System.out.print("Tamaño en metrosd del apartamento ");
            cant_metros=objread.nextInt();
            System.out.print("Valor por metro ");
            val_metro=objread.nextInt();
            valor_admin=cant_metros * val_metro;
            if (cant_metros <= 40)
                descuento=valor_admin * 20/100;
            else
                if (cant_metros <= 60)
                    descuento=(valor_admin * 15/100);
                else 
                    descuento=(valor_admin * 10)/100;
            valor_neto=valor_admin - descuento;
            System.out.println("\n El valor bruto a pagar es " + valor_admin);
            System.out.println("El descuento es de " + descuento);
            System.out.println("El neto a pagar es de " + valor_neto);
        }
    }
}
