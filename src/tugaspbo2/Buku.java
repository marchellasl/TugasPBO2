package tugaspbo2;


public class Buku {
    double harga;
    private double diskon;
    
    Buku()
    {
        harga = 60000;
        diskon = 15000;
    }
    
    private double hitungharga(double harga, double diskon)
    {
        return harga-diskon;
    }
    
    void naikharga()
    {
        System.out.println("Setiap buku beda harga");
    }
    
    void setdiskon(double diskon)
    {
        this.diskon = diskon;
    }
    
    double gettotalharga()
    {
        return hitungharga(harga, diskon);
    }
}
