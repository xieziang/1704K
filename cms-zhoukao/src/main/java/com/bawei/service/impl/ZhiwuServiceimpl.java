package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.ZhiwuDao;
import com.bawei.pojo.Zhiwu;
import com.bawei.service.ZhiwuService;
import com.github.pagehelper.PageHelper;
@Service
public class ZhiwuServiceimpl implements ZhiwuService{

	@Autowired
	ZhiwuDao zhiwuDao;
	@Override
	public List<Zhiwu> findall(String str, int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 2);
		return zhiwuDao.findall(str);
	}

}
