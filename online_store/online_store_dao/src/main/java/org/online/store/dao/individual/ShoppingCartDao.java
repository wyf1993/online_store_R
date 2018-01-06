package org.online.store.dao.individual;

import org.online.store.dao.base.BaseDao;
import org.online.store.model.ShoppingCart;
import org.springframework.stereotype.Repository;

@Repository(value = "shoppingCartDao")
public class ShoppingCartDao extends BaseDao<ShoppingCart> {

}
