package objetosTema3;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;


public InvoiceItem() {
	
}

public InvoiceItem(String id, String desc, int qty, double unitPrice) {
	super();
	this.id = id;
	this.desc = desc;
	this.qty = qty;
	this.unitPrice = unitPrice;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public double getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}

public double getTotal() {
	
	return qty*unitPrice;
			}
@Override
public String toString() {
	
	return "Invoice [Factura= " + id + ", descripcion= " + desc + ", quantity= " + qty + ", Unit Price= " + unitPrice + "]";
	}

}


