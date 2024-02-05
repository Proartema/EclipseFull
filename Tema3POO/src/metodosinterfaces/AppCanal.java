package metodosinterfaces;

public class AppCanal {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		TelevisionSamsung tv = new TelevisionSamsung(1);
		tv.bajarCanal();
		tv.subirCanal();
		tv.setCanal(4);
		InterfaceCanalTelevision ct = tv;
		ct.setCanal(7);
		ct.bajarCanal();
		ct.subirCanal();
	}
}
