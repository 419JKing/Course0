package team.jking.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import team.jking.dao.AMapper;
import team.jking.domain.Testtable;
import team.jking.service.AService;

public class AServiceImpl implements AService {
	@Autowired
	AMapper aMapper;
	
	public List<Testtable> getInfos(){
		System.out.println("2222222");
		System.out.println("1111");
		return aMapper.getInfos();
	}

}
