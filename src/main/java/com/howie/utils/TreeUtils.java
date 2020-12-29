package com.howie.utils;


import com.howie.dto.CmAttrEnumRspDTO;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {

    public static List<CmAttrEnumRspDTO> getTree(long parentId, List<CmAttrEnumRspDTO> dos) {
        List<CmAttrEnumRspDTO> listTree = new ArrayList<>();
        for (CmAttrEnumRspDTO vo : dos) {
            if (parentId == vo.getParentEnumId()) {
                List<CmAttrEnumRspDTO> children = getTree(vo.getEnumId(), dos);
                if (!children.isEmpty()) {
                    vo.setChildren(children);
                }
                listTree.add(vo);
            }
        }
        return listTree;

    }
}
