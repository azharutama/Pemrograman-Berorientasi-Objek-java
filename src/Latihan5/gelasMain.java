public class gelasMain {


  static void tukarWarna() {
    
  }

  public static void main(String[] args) {
    gelas g1 = new gelas("hitam");
    gelas g2 = new gelas("putih");


    tukarWarna(g1, g2);
    System.out.println("warna g1 " + g1.getWarna());
    System.out.println("warna g2 "+ g2.getWarna());
  }
  
  static void tukarWarna(gelas g1, gelas g2) {

    gelas gTemp = new gelas("temp");
    gTemp.setWarna(g1.getWarna());
    g1.setWarna(g2.getWarna());
    g2.setWarna(gTemp.getWarna());
    
  }
  
}
