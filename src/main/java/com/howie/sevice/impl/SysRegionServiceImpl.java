package com.howie.sevice.impl;

import com.howie.entity.SysRegionDO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * ServiceImpl:SysRegionServiceImpl
 *
 * @author
 * @date 2020-10-14
 */
@Transactional(rollbackFor = Exception.class)
@Service("sysRegionService")
public class SysRegionServiceImpl {



    /**
     * 两层循环实现建树
     *
     * @param treeNodes 传入的树节点列表
     * @return
     */
    public static List<SysRegionDO> bulid(List<SysRegionDO> treeNodes) {

        List<SysRegionDO> trees = new ArrayList<SysRegionDO>();

        for (SysRegionDO treeNode : treeNodes) {

            if ("0".equals(treeNode.getPid())) {
                trees.add(treeNode);
            }

            for (SysRegionDO it : treeNodes) {
                if (it.getPid().equals(treeNode.getId())) {
                    if (treeNode.getChildren() == null) {
                        treeNode.setChildren(new ArrayList<>());
                    }
                    treeNode.getChildren().add(it);
                }
            }
        }
        return trees;
    }

    /**
     * 使用递归方法建树
     *
     * @param treeNodes
     * @return
     */
    public static List<SysRegionDO> buildByRecursive(List<SysRegionDO> treeNodes) {
        List<SysRegionDO> trees = new ArrayList<SysRegionDO>();
        for (SysRegionDO treeNode : treeNodes) {
            if ("0".equals(treeNode.getPid())) {
                trees.add(findChildren(treeNode, treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    public static SysRegionDO findChildren(SysRegionDO treeNode, List<SysRegionDO> treeNodes) {
        for (SysRegionDO it : treeNodes) {
            if (treeNode.getId().equals(it.getPid())) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<>());
                }
                treeNode.getChildren().add(findChildren(it, treeNodes));
            }
        }
        return treeNode;
    }
}