class Mart{
	
	private int purchase;
	private boolean member;
	private double dis;
	
	public Mart(int purchase) {
		this.purchase = purchase;
	}
	public Mart(boolean member, int purchase) {
		this.member = member;
		this.purchase = purchase;
	}
	public int Sale() {
		
		if(this.member) {
			this.dis = -0.1;
		}
		
		if(this.purchase >= 10000 && this.purchase < 50000) {
			this.dis += 0.95;
		}
		else if(this.purchase >= 50000 && this.purchase < 100000) {
			this.dis += 0.9;
		}
		else if(this.purchase >= 100000 && this.purchase <= 1000000) {
			this.dis += 0.8;
		}
		else if(this.purchase >= 0 && this.purchase < 10000) {
			this.dis = 1.0;
			return (int)(this.purchase * this.dis);
		}
		else if(this.purchase > 1000000 || this.purchase < 0) {
			System.out.println("값이 범위를 벗어났습니다.");
			return 0;
		}
		return (int)(this.purchase * this.dis);
	}
}
