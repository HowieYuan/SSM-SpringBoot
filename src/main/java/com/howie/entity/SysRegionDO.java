package com.howie.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * entity:SysRegion
 *
 * @author
 * @version 3.0
 * @date 2020-10-14
 */
public class SysRegionDO {

    private static final long serialVersionUID = 1L;

    /* 区域主键 */
    private Integer id;

    /* 区域名称 */
    private String name;

    /* 区域上级标识 */
    private Integer pid;

    /* 级别 */
    private Integer lever;

    private List<SysRegionDO> children;
    //其他自定义属性


    public List<SysRegionDO> getChildren() {
        return children;
    }

    public void setChildren(List<SysRegionDO> children) {
        this.children = children;
    }

    // Constructor
    public SysRegionDO() {
    }

    public static List<SysRegionDO> getTree(int parentId, List<SysRegionDO> dos) {
        List<SysRegionDO> listTree = new ArrayList<>();
        for (SysRegionDO vo : dos) {
            if (parentId == vo.getPid()) {
                List<SysRegionDO> children = getTree(vo.getId(), dos);
                if (!children.isEmpty()) {
                    vo.setChildren(children);
                }
                listTree.add(vo);
            }
        }
        return listTree;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "SysRegion [" + "id=" + id + ", name=" + name + ", pid=" + pid + ", lever=" + lever + "]";
    }
}
