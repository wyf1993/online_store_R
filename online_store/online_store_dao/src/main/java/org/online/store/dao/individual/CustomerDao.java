package org.online.store.dao.individual;

import org.online.store.dao.base.BaseDao;
import org.online.store.model.Customer;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDao")
public class CustomerDao extends BaseDao<Customer> {

}
