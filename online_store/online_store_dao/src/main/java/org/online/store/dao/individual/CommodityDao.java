package org.online.store.dao.individual;

import org.online.store.dao.base.BaseDao;
import org.online.store.model.Commodity;
import org.springframework.stereotype.Repository;

@Repository(value = "commodityDao")
public class CommodityDao extends BaseDao<Commodity> {

}
