
public class RewardValue {

	public double cash;
	public int miles;
	public RewardValue(double cash) {
		this.cash=cash;
	}
	public RewardValue(int miles) {
		this.miles=miles;
	}
	public double getCashValue() {
		return this.miles*(0.0035);
	}
	public double getMilesValue() {
		return (this.cash)/(0.0035);
	}
	
}
