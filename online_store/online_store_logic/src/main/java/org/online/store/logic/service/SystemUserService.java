package org.online.store.logic.service;

import org.online.store.model.SystemUser;

public interface SystemUserService {

	SystemUser login(String userName, String password);

}
