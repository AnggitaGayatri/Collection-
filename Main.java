package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int i;
        // membuat objek array list dengan tipe data string
        List<String> nama_kelompok = new ArrayList<>();

        // menambahkan anggota objek menggunakan method add
        nama_kelompok.add("Anggita"); // mengisisi array dengan indeks 0
        nama_kelompok.add("Gayatri");
        nama_kelompok.add("Steve");
        nama_kelompok.add("Natasha");
        nama_kelompok.add("Anggita");

        // merubah data dalam objek menggunakan keyword set dan indeks array
        nama_kelompok.set(4,"Dewa");

        // menghapus data dalam objek menggunakan keyword remove
        nama_kelompok.remove(2);

        System.out.println("\n\nList Nama Kelompok: ");
        // proses looping untuk menampilkan anggota objek ke layar
        for( i=0; i< nama_kelompok.size(); i++){
            System.out.println(nama_kelompok.get(i));
        }
    }
}
