package set;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {

    public static void main(String[] args){

        // membuat objek set
        Set<String> buku_pelajaran = new HashSet<>();

        // proses penambahan data
        buku_pelajaran.add("kimia");
        buku_pelajaran.add("fisika");
        buku_pelajaran.add("biologi");
        buku_pelajaran.add("Matematika");
        // proses menampilkan ke layar
        System.out.println("\nJenis Buku Pelajaran: ");
        for(var value : buku_pelajaran){
            System.out.println(value);
        }

    }
}
