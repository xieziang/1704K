package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.Zhiwu;

public interface ZhiwuDao {
	
	public List<Zhiwu> findall(@Param("str")String str);
	
}
