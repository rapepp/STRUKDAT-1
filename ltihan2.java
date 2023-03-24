import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
    
        LinkedList<String> hewan = new LinkedList<>();
       hewan.add("Sapi");
       hewan.add("Kelinci");
       hewan.add("Kambing");
       hewan.add("Unta");
       hewan.add("Domba");

        System.out.println("Data Hewan Sebelum Evolusi: "+hewan);

        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("Hewan yang dihapus: "+deleteHewan);

        for (String data : deleteHewan) {
            hewan.remove(data);
        }

        System.out.println("LinkedList Hewan setelah penghapusan: "+hewan);
    }
}
