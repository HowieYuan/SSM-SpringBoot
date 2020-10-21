package com.howie.springbootssm;

import com.howie.dto.CmAttrEnumRspDTO;
import com.howie.entity.CmAttrEnumDO;
import com.howie.mybatis.dao.CmAttrEnumDao;
import com.howie.mybatis.dao.SysRegionDao;
import com.howie.entity.SysRegionDO;
import com.howie.utils.JudgeUtils;
import com.howie.utils.TreeUtils;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Resource
	private CmAttrEnumDao cmAttrEnumDao;

	@Test
	public void contextLoads() {
		List<CmAttrEnumDO> attrEnumList = cmAttrEnumDao.getAttrEnumList(Arrays.asList(1L, 2L, 3L));
        ArrayList<CmAttrEnumRspDTO> treeList = new ArrayList<>();
        if (JudgeUtils.isNotNull(attrEnumList)){
            for (CmAttrEnumDO attrEnumDo:attrEnumList) {
                CmAttrEnumRspDTO rspDto = new CmAttrEnumRspDTO();
                BeanUtils.copyProperties(attrEnumDo,rspDto);
                treeList.add(rspDto);
            }
		}
		List<CmAttrEnumRspDTO> list = TreeUtils.getTree(0,treeList);
		System.out.println(list);
	}

}
