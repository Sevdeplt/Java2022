package youTubeEgitim;

public abstract class BaseCreditManager implements ICreditManager {
	public abstract void calculate();// ortak değil her yerde değişken

	public void save() {
		System.out.println("Kaydedildi");
	}
}
