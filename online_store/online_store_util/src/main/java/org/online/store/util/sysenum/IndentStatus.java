package org.online.store.util.sysenum;

public enum IndentStatus {
	POST("�ѷ���"),ARRIVE("�ѼĴ�"),RECEIVE("��ǩ��");
	
	private String name;
	
	private IndentStatus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static IndentStatus getValue(String name) {
		IndentStatus[] values = IndentStatus.values();
		for(int i=0; i<values.length; ++i){
			if(values[i].getName().equals(name)){
				return values[i];
			}
		}
		return null;
	}
	
}
