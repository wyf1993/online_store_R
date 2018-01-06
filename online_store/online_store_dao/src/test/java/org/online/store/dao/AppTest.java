package org.online.store.dao;

import org.junit.Test;
import org.online.store.dao.individual.AddressDao;
import org.online.store.model.Address;

public class AppTest {

	@Test
	public void test1(){
		Address addr = new Address();
		addr.setAddress("jiangsu");
		addr.setPhoneNumber("134");
		addr.setReceive("WYF");
		AddressDao dao = new AddressDao();
		dao.save(addr);
	}
	
	@Test
	public void test2() {
		AddressDao dao = new AddressDao();
		Address address = dao.get(1);
		System.out.println(address.getId()+"---"+address.getAddress());
	}
	
	@Test
	public void test3(){
		AddressDao dao = new AddressDao();
		Address addr = new Address();
		addr.setId(1);
		addr.setAddress("jiangsu");
		addr.setPhoneNumber("134");
		addr.setReceive("WYF");
		dao.update(addr);
	}
	
}
