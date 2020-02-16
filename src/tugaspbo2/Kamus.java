package tugaspbo2;

public class Kamus extends Buku {
    Kamus()
    {
        harga += 50000;
        setdiskon(10000);
    }
    
    @Override
    void naikharga()
    {
        harga += 5000;
    }
}
