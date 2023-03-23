package com.skyline.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountServices")
public class AccountService {
	@Autowired
	private IAccountDao accountDao;

	
}
