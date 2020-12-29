package com.howie.mybatis.dao;


import com.howie.entity.SysRegionDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Dao Interface:SysRegionMapper
 *
 * @author
 * @date 2020-10-14
 */
@Mapper
public interface SysRegionDao {
    SysRegionDO get(String id);

    List<SysRegionDO> findAll();
}