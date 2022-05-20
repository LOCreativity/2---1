class Mart{
	
	private int purchase;
	private boolean member;
	private int result;
	private int plusdis = 0;
	
	public Mart(int purchase) {
		this.purchase = purchase;
	}
	public Mart(boolean member, int purchase) {
		this.member = member;
		this.purchase = purchase;
	}
	public int Sale() {
		
		if(member) {
			plusdis = purchase / 10; 
		}
		
		if(purchase >= 10000 && purchase < 50000) {
			result = purchase - (purchase/20) - plusdis;
		}
		else if(purchase >= 50000 && purchase < 100000) {
			result = purchase - (purchase/10) - plusdis;
		}
		else if(purchase >= 100000 && purchase < 1000000) {
			result = purchase - (purchase/5) - plusdis;
		}
		else if(purchase >= 0 && purchase < 10000) {
			result = purchase;
		}
		else if(purchase > 1000000 || purchase < 0) {
			System.out.println("°ªÀÌ ¹üÀ§¸¦ ¹ş¾î³µ½À´Ï´Ù.");
			return 0;
		}
		return result;
	}
}