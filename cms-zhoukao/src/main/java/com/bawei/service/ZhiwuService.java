package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.Zhiwu;

public interface ZhiwuService {
	
	public List<Zhiwu> findall(@Param("str")String str,@Param("pageNum")int pageNum);
	
}
