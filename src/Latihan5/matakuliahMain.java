
public class matakuliahMain {

  public static void main(String[] args) {

    matakuliah mk1 = new matakuliah("001", "Alpro 1", "A", 3);
    matakuliah mk2 = new matakuliah("002", "Alpro 2", "BC", 3);
    matakuliah mk3 = new matakuliah("003", "pemrograman berorientasi objek 1", "B", 3);

    System.out.println("---DAFTAR MATKUL---");
    System.out.println(mk1.Display());
    System.out.println(mk2.Display());
    System.out.println(mk3.Display());

    System.out.println("---NILAI IPK---");
    double ipk = (mk1.nilaiIndex() * mk1.getSks() + mk2.nilaiIndex() * mk2.getSks() + mk3.nilaiIndex() * mk3.getSks()) /
        (double) (mk1.getSks() + mk2.getSks() + mk3.getSks());
    System.out.println("IPK: " + ipk);
  }
}


  //daftar matkul
 


  

