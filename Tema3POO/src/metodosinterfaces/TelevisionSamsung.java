package metodosinterfaces;

public class TelevisionSamsung implements InterfaceCanalTelevision {
	private int canal = 0;

	public TelevisionSamsung() {
	}

	public TelevisionSamsung(int canal) {
		this.canal = canal;
	}

	@Override
	public int getCanal() {
// TODO Auto-generated method stub
		return canal;
	}

	@Override
	public void setCanal(int canal) {
// TODO Auto-generated method stub
		InterfaceCanalTelevision.cambiamosCanal();
		this.canal = canal;
	}

}
