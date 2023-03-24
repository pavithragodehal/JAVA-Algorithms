package p1;
//polymorphism
public class platinumAccount extends GoldAccount{
	@Override
	public void chqBooks() { 
	System.out.println("Unlimited"); 
	}
	@Override
	public void rateOfInterest() { 
	System.out.println("6% PA"); 
	}
		public static void main(String[] args) {
			GoldAccount g =new GoldAccount();
			g.onlineBanking();
			g.rateOfInterest();
			g.chqBooks();
			
			platinumAccount g =new platinumAccount();
			p.onlineBanking();
			p.rateOfInterest();
			p.chqBooks();
		}

	}
	

