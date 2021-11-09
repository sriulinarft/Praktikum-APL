public class Main {
    public static void main(String[] args) {
        //membuat objek bebek
        Suara bebek = new Bebek();     
        //mengambil nilai dari objek bebek yang suaranya belum diubah menjadi suara kucing
        System.out.println("\nSuara bebek sebelum di konversi  : "+ bebek.getSuara()); 
        //mengambil nilai dari kelas ImplementasiSuara
        SuaraAdapter bebekAdapter = new ImplementasiSuara(bebek); 
        System.out.println("Suara bebek setelah di konversi  : " + bebekAdapter.getSuara()+ "\n");
    }
}
