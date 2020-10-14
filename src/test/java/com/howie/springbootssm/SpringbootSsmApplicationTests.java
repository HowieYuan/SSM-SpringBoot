package com.howie.springbootssm;

import com.howie.mybatis.dao.SysRegionDao;
import com.howie.entity.SysRegionDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSsmApplicationTests {
	@Resource
	private SysRegionDao sysRegionDao;
	@Test
	public void contextLoads() {
		List<SysRegionDO> all = sysRegionDao.findAll();
		List<SysRegionDO> list = SysRegionDO.getTree(0,all);
		System.out.println(list);
	}

}
