package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); // hesapla fonk. içermek zorunda,kendine göre hesapla.
	
	public final void gameOver() {  //değişmez,hepsinde aynı 
		System.out.println("Oyun bitti");
	}

}
