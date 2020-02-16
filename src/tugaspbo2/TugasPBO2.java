package tugaspbo2;
public class TugasPBO2 {
    public static void main(String[] args) {
        Buku buku[] = new Buku[3];
        buku[0] = new Novel();
        buku[1] = new Komik();
        buku[2] = new Kamus();
        for (int i = 0; i<3; i++){
            System.out.println("Harga buku " + i + " adalah " + buku[i].gettotalharga());
        }
        for (int i = 0; i<3; i++){
            buku[i].naikharga();
        }
        for (int i = 0;i<3; i++){
            System.out.println("Harga buku " + i + " sekarang adalah " + buku[i].gettotalharga());
        }
    }
}
