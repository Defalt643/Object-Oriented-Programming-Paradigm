
public class PiggyBank implements Measurable{
	private int one,five,ten,size;
	double balance=0;
	int current=0;
	public PiggyBank (int size) {
		this.size=size;
	}public void addCoins(int type,int quatity) {
		if(type==1) {
			addOne(quatity);
		}else if(type==5) {
			addFive(quatity);
		}else if(type==10) {
			addTen(quatity);
		}
	}
	public void addOne(int n) {
		if(current==size) {
			
		}else if((n+current)<=size) {
			balance=balance+(1*n);
			current=current+n;
		}else if(n+current>size){
			balance=+((n-((n+current)-size))*1);
		}else if(current==size) {
			
		}
	}public void addFive(int n) {
		if(current==size) {
			
		}else if((n+current)<=size) {
			balance=balance+(5*n);
			current=current+n;
		}else if(n+current>size){
			balance=+((n-((n+current)-size))*5);
			current=current+(n-((n+current)-size));
		}else if(current==size) {
			
		}
	}public void addTen(int n) {
		if(current==size) {
			
		}else if((n+current)<=size) {
			balance=balance+(10*n);
			current=current+n;
		}else if(n+current>size){
			balance=+((n-((n+current)-size))*10);
			current=current+(n-((n+current)-size));
		}
	}
	@Override
	public double getMeasurable() {
		return balance;
	}public String toString() {
		return "Total : "+getMeasurable();
	}

}
