package youTubeEgitim;

public class CarCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandı.");

	}

	@Override
	public void save() {
		System.out.println("Kaydedildi.");

	}

}
