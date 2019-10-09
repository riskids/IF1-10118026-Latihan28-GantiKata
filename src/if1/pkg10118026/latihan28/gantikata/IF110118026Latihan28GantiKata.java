/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan28.gantikata;
import java.util.Scanner;
/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: Mengganti kata tertentu
 */
public class IF110118026Latihan28GantiKata {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		System.out.println("[#]===== Program Mengganti Kata =====[#]");
		System.out.print("Masukkan Kalimat : ");
		String kata_a = sc.nextLine();
                
		System.out.print("Ganti Kata : ");
		String kata_awal = sc.next();
                
		System.out.print("Menjadi Kata : ");
		String baru = sc.next();
                
		String kata_b = kata_a.replace(kata_awal, baru);
		System.out.println("\n");
		System.out.println("[#]====== Hasil Formattin ======[#]");
		System.out.println("Kalimat kata_awal : " + kata_a );
		System.out.println("Kalimat Baru : " + kata_b);
	}
	
}
