package com.howie.mybatis.dao;

import com.howie.entity.CmAttrEnumDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Dao Interface:CmAttrEnumMapper
 *
 * @author
 * @date 2020-10-21
 */
@Mapper
public interface CmAttrEnumDao {
    List<CmAttrEnumDO> getAttrEnumList(List<Long> attrIdList);
}