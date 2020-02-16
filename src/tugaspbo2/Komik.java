package tugaspbo2;

public class Komik extends Buku {
    Komik()
    {
        harga -= 10000;
        setdiskon(0);
    }
    
    @Override
    void naikharga()
    {
        harga += 15000;
    }
}
