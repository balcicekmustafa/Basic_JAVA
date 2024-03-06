package Queue;

public class QueueYapisi {
	int [] dizi;
	int size;
	int front;	//dizinin ilk elemanı
	int rear;	//dizinin son elemanı
	public QueueYapisi(int size) {
		this.size = size;
		dizi=new int[size]; // Kuyruk yapımız.
		front=0;
		rear=-1;
	}
	private boolean isFull() {
		return rear==size;
	}
	private boolean isEmpty() {
		return rear==-1;
	}
	
	
	void enQueue(int data) {
		if(isFull()) {
			System.out.println("Kuyruk dolu, ekleme yapamazsınız !");
		}else {
			rear++;
			dizi[rear]=data;
			System.out.println(dizi[rear]+"Kuyruğa Eklendi.");
		}
	}
	void deQueue() {
		if (isEmpty()) { 
			System.out.println("Kuyruk boş, silinecek olan eleman yok.");
		}else {
			int sayi=dizi[front];
		for (int i = 1; i <= rear; i++) {
			dizi[i-1]=dizi[i];
		}
		rear--;
		System.out.println(sayi+ "kuyruktan çıkartıldı.");
		}
		
	}
}
