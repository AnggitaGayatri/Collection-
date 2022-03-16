package map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ProgramMap {
    public static void main(String[] args){
        //membuat sorted map dengan implementsi menggunakan treemap
        SortedMap<Integer, String> data_mahasiswa = new TreeMap<>();

        //menambhakan data dengan keyword put
        data_mahasiswa.put(204, "Anggita");
        data_mahasiswa.put(201, "Tiara");
        data_mahasiswa.put(203, "Bagus");
        data_mahasiswa.put(205, "Devi");
        data_mahasiswa.put(202, "Indri");

        // proses menampilkan ke layar
        System.out.println("\nData Mahasiswa");
        // proses menampilkan ke layar menggunakan entryset
        for(Map.Entry data: data_mahasiswa.entrySet()){
            System.out.println(" NIM: " +data.getKey() + " Nama: " + data.getValue());
        }
    }
}
