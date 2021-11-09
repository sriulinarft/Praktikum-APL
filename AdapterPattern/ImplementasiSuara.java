public class ImplementasiSuara implements SuaraAdapter {
     Suara voice;   //variable voice yang bertipe suara

    //method konstraktor untuk ambil nilai dari kelas Suara
    public ImplementasiSuara(Suara voice) {
        this.voice = voice;
    }
    
    @Override    //mengambil nilai dari method interface 
    public String getSuara() {
        String suara = voice.getSuara();
        return ubahSuara(suara);
    }

    /*method ubahSuara untuk mengubah suara bebek menjadi suara kucing dengan
    membuat objek kucing dan mengembalikan nilai berupa string*/
    public String ubahSuara(String suara) {
        Suara kucing = new Kucing();
        return kucing.getSuara();
    }
}
