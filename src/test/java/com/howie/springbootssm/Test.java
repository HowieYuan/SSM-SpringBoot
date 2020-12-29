package com.howie.springbootssm;

import cn.hutool.Hutool;
import cn.hutool.core.lang.tree.TreeUtil;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Tree> list = new ArrayList<>();
        list.add(new Tree(1, "一级菜单1", 0));
        list.add(new Tree(2, "二级菜单11", 1));
        list.add(new Tree(3, "二级菜单12", 1));
        list.add(new Tree(4, "二级菜单13", 1));
        list.add(new Tree(5, "三级菜单111", 2));
        list.add(new Tree(6, "三级菜单112", 2));
        list.add(new Tree(7, "三级菜单121", 3));
        list.add(new Tree(8, "三级菜单122", 3));
        list.add(new Tree(9, "三级菜单131", 4));
        list.add(new Tree(10, "三级菜单132", 4));

        list.add(new Tree(11, "一级菜单2", 0));
        list.add(new Tree(12, "二级菜单21", 1));
        list.add(new Tree(13, "二级菜单22", 1));
        list.add(new Tree(14, "二级菜单23", 1));
        list.add(new Tree(15, "三级菜单211", 2));
        list.add(new Tree(16, "三级菜单212", 2));
        list.add(new Tree(17, "三级菜单221", 3));
        list.add(new Tree(18, "三级菜单222", 3));
        list.add(new Tree(19, "三级菜单231", 4));
        list.add(new Tree(20, "三级菜单232", 4));

        List<Tree> result = buildTree(list, 0);
        System.out.println(result);
    }

    public static List<Tree> buildTree(List<Tree> list, int fid) {
        List<Tree> resultList = new ArrayList<Tree>();
        if (list == null || list.size() == 0 || fid < 0) {
            return null;
        }
        for (Tree tree : list) {
            if (tree.getFid() == fid) {
                resultList.add(tree);
                tree.setChildren(buildTree(list, tree.getId()));
            }
        }
        return resultList;
    }
}
