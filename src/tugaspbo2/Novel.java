package tugaspbo2;

public class Novel extends Buku {
    Novel()
    {
        harga = 99000;
        setdiskon(12000);
    }
    
    @Override
    void naikharga()
    {
        harga += 0;
    }
}
