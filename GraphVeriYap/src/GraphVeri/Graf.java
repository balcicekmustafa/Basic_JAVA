package GraphVeri;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graf {
	private LinkedList<Tepe> tepeler;
    private LinkedList<Kenar> kenarlar;

    public Graf() {
        this.tepeler = new LinkedList<>();
        this.kenarlar = new LinkedList<>();
    }

    public void tepeEkle(String etiket) {
        tepeler.add(new Tepe(etiket));
    }

    public void kenarEkle(String baslangicEtiket, String hedefEtiket, int agirlik) {
        Tepe baslangic = null;
        Tepe hedef = null;

        for (Tepe t : tepeler) {
            if (t.etiket.equals(baslangicEtiket)) {
                baslangic = t;
            } else if (t.etiket.equals(hedefEtiket)) {
                hedef = t;
            }
        }

        if (baslangic != null && hedef != null) {
            kenarlar.add(new Kenar(baslangic, hedef, agirlik));
        }
    } public void ziyaretiSifirla() {
        for (Tepe t : tepeler) {
            t.ziyaretEdildi = false;
        }
    }
    
    public void genislikIlkArama(Tepe baslangicTepe) {
        Queue<Tepe> kuyruk = new LinkedList<>();
        baslangicTepe.ziyaretEdildi = true;
        kuyruk.add(baslangicTepe);

        while (!kuyruk.isEmpty()) {
            Tepe simdikiTepe = kuyruk.poll();
            System.out.println(simdikiTepe.etiket);

            for (Kenar k : kenarlar) {
                if (k.baslangic == simdikiTepe && !k.hedef.ziyaretEdildi) {
                    k.hedef.ziyaretEdildi = true;
                    kuyruk.add(k.hedef);
                }
            }
        }

        ziyaretiSifirla();
    }
    public void derinlikIlkAramaYigitIle(Tepe baslangicTepe) {
        Stack<Tepe> yigit = new Stack<>();
        baslangicTepe.ziyaretEdildi = true;
        yigit.push(baslangicTepe);

        while (!yigit.isEmpty()) {
            Tepe simdikiTepe = yigit.pop();
            System.out.println(simdikiTepe.etiket);

            for (Kenar k : kenarlar) {
                if (k.baslangic == simdikiTepe && !k.hedef.ziyaretEdildi) {
                    k.hedef.ziyaretEdildi = true;
                    yigit.push(k.hedef);
                }
            }
        }

        ziyaretiSifirla();
    }

}

