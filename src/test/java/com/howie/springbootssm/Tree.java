package com.howie.springbootssm;

import java.util.List;

public class Tree {

    private int id;
    private String name;
    private int fid;
    private List<Tree> children;

    public Tree(int id, String name, int fid) {
        this.id = id;
        this.name = name;
        this.fid = fid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }
}
