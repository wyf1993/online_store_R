package org.online.store.util.sysenum;

public enum CommodityStatus {
	VALID("ио╪э"),INVALID("об╪э");
	
	private String name;
	
	private CommodityStatus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static CommodityStatus getValue(String name) {
		CommodityStatus[] values = CommodityStatus.values();
		for(int i=0; i<values.length; ++i){
			if(values[i].getName().equals(name)){
				return values[i];
			}
		}
		return null;
	}
	
}
