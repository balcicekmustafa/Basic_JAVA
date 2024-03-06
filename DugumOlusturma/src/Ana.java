
public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinif A = new Sinif();
		Sinif B = new Sinif();
		Sinif C=new Sinif();
		
		A.sayi=11;
		B.sayi=22;
		C.sayi=33;
		
		A.next=B;
		B.next=C;
		C.next=null;
	Sinif temp =A;
	while(temp.next!=null)
	{
		System.out.println(temp.sayi);
		temp=temp.next;
	}
	}

}
