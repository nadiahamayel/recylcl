package com.example.recylcl;

public class pizza {
    private String name;
    private int imgid;

    public pizza(String name , int imgid){
        this.name=name;
        this.imgid=imgid;
    }
    public pizza[] p= {
            new pizza("1", R.drawable.v),
            new pizza("2", R.drawable.b),

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public pizza[] getP() {
        return p;
    }

    public void setP(pizza[] p) {
        this.p = p;
    }
}
