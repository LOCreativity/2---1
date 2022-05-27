class Mart{
	
	private int purchase;
	private boolean member;
	private int plusdis = 0;
	
	public Mart(int purchase) {
		this.purchase = purchase;
	}
	public Mart(boolean member, int purchase) {
		this.member = member;
		this.purchase = purchase;
	}
	public int Sale() {
		
		if(this.member) {
			this.plusdis = this.purchase / 10; 
		}
		
		if(this.purchase >= 10000 && this.purchase < 50000) {
			this.purchase -= this.(purchase/20);
		}
		else if(this.purchase >= 50000 && this.purchase < 100000) {
			this.purchase -= this.purchase/10;
		}
		else if(this.purchase >= 100000 && this.purchase < 1000000) {
			this.purchase -= this.purchase/5;
		}
		else if(this.purchase >= 0 && this.purchase < 10000) {
			return this.purchase - this.plusdis;
		}
		else if(this.purchase > 1000000 || this.purchase < 0) {
			System.out.println("값이 범위를 벗어났습니다.");
			return 0;
		}
		return this.purchase - this.plusdis;
	}
}
