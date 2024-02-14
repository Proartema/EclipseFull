package empleadoEducacion;

public enum claseAd {
	TRES(300),CUATRO(400),CINCO(500);
	
	private int categoriaBonus;
	
	claseAd (int categoriaBonus) {
		this.categoriaBonus=categoriaBonus;
	}

	public int getCategoriaBonus() {
		return categoriaBonus;
	}

	
}
