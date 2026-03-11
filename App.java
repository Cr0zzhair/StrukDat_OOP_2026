public class App {
    public static void main(String[] args) throws Exception {
        

        // class abstak <new variable> new <class inhere>(<constructor>)
        Laptop Laptop1 = new LaptopGaming("MSI", "NVIDA", "merah", 12000, "IYA");
        Laptop Laptop2 = new LaptopOffice("Asus", "Intel", "Biru", 8000, "Tidak");
        Laptop Laptop3 = new LaptopMurah("Advan", "Intel Home", "Putih", 1300);
        Laptop1.tampilSpec();
        Laptop2.tampilSpec();
        Laptop3.tampilSpec();
        System.out.println("Hello, World!");
    }
}

abstract class Laptop {

    private String name;
    private String GPU;
    private String warna;
    private int harga;


    Laptop(String n, String g, String w, int h){
        this.name = n;
        this.GPU = g;
        this.warna = w;
        this.harga = h;
    }

    public String getName(){
        return name;
    }
    public String getGPU(){
        return GPU;
    }
    public String getWarna(){
        return warna;
    }
    public int getHarga(){
        return harga;
    }

    public abstract void tampilSpec();
    
}

class LaptopGaming extends Laptop {

    private String RGB;

   

    

    LaptopGaming(String n, String g, String w, int h, String R){
        super(n, g, w ,h);
        this.RGB = R;
    }

     public String getRGB(){
        return RGB;
    }

    @Override
    public void tampilSpec(){
        System.out.println("Name: " + getName());
        System.out.println("GPU: " + getGPU());
        System.out.println("Warna: " + getWarna());
        System.out.println("Harga: " + getHarga());
        System.out.println("RGB: " + getRGB());
        System.err.println("==============");

    }
    

}

class LaptopOffice extends Laptop {
    
    private String rec;


    LaptopOffice(String n, String g, String w, int h, String r){
        super(n, g, w, h);
        this.rec = r;
    }

    public String getRec(){
        return rec;
    }

    @Override
    public void tampilSpec(){
    System.out.println("Name: " + getName());
    System.out.println("GPU: " + getGPU());
    System.out.println("Warna: " + getWarna());
    System.out.println("Harga: " + getHarga());
     System.out.println("Rekomendasi: " + getRec());        

    }

}

class LaptopMurah extends Laptop {
   
    LaptopMurah(String n, String g, String w, int h){
        super(n, g, w, h);
    }

    @Override
    public void tampilSpec(){
        System.out.println("====Laptop Murah ====");
        System.out.println("Name: " + getName());
        System.out.println("GPU " + getGPU());
        System.out.println("Warna: " + getWarna());
        System.out.println("harga: " + getHarga());

    }

}








