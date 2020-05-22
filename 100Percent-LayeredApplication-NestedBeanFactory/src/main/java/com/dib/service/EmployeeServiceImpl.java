package com.dib.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dib.bo.EmployeeBO;
import com.dib.dao.EmployeeDAO;
import com.dib.dto.EmployeeDTO;

@Service("service")
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDAO dao;

	@Override
	public List<EmployeeDTO> fetchEmps(String desg, String desg1) throws Exception 
	{
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		List<EmployeeBO> listBO=null;
		
		listBO=dao.getEmps(desg, desg1);
		
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
	
		return listDTO;
	}
}
