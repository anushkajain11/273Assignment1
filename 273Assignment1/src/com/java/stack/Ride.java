package java.stack;

public class Ride {
	Node link  = new Node();
	Node top= null;
	
	public void enterRide(int n)
	{
		Node temp= new Node();
		temp.number=n;
		temp.next=top;
		top=temp;
	}
	public int exitRide(){
		if(top == null)
		{
			System.out.println("Ride is empty");
		}
		else{
			Node tempLink = top;
			top = tempLink.next ;
			return tempLink.number;
		}
		return 0;
	}
	void showRiders()
	{
		Node riders = top;
		System.out.println("Present riders are:");
		while(riders != null)
		{
			System.out.println(riders.number);
			riders = riders.next;
		}
	}
}
