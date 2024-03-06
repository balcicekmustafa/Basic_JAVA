package GraphVeri;

public class Kenar {
	public Tepe baslangic;
    public Tepe hedef;
    public int agirlik;

    public Kenar(Tepe baslangic, Tepe hedef, int agirlik) {
        this.baslangic = baslangic;
        this.hedef = hedef;
        this.agirlik = agirlik;
    }
}
