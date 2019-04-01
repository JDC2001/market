package com.hbh.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbh.dao.KcxxMapper;
import com.hbh.entity.Kcxx;
import com.hbh.service.IKcxxService;

/**
 * @Author Binvor
 * @Date 2019年3月28日上午11:07:14
 * @Des 
 */
@Service
public class KcxxServiceImp implements IKcxxService {
	@Autowired
	KcxxMapper kcxxMapper;
	public int delete(String proid) {
		// TODO Auto-generated method stub
		return kcxxMapper.deleteByPrimaryKey(proid);
	}

	public int insert(Kcxx record) {
		// TODO Auto-generated method stub
		return kcxxMapper.insert(record);
	}

	public List<Kcxx> getall() {
		// TODO Auto-generated method stub
		return kcxxMapper.selectByExample(null);
	}

	public Kcxx getbyid(String proid) {
		// TODO Auto-generated method stub
		return kcxxMapper.selectByPrimaryKey(proid);
	}

	public Boolean update(Kcxx record) {
		// TODO Auto-generated method stub
		return kcxxMapper.updateByPrimaryKey(record);
	}

	public Kcxx kcxxWithPro(String proid) {
		// TODO Auto-generated method stub
		return kcxxMapper.kcxxWithPro(proid);
	}
	public List<Kcxx> kcxxWithPronum() {
		// TODO Auto-generated method stub
		return kcxxMapper.kcxxWithPronum();
	}

	public List<Kcxx> kcxxWithProdata() {
		// TODO Auto-generated method stub
		return kcxxMapper.kcxxWithProdata();
	}

	


}