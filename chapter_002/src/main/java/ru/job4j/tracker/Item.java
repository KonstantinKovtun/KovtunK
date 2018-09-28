package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;
    private String desc;
    private long create;
    //private String[] comments;

    public Item(String id, String name, String desc, long create/*, String[] comments*/) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.create = create;
        //this.comments = comments;
    }

    public Item(String name, String desc, long create) {
        this.name = name;
        this.desc = desc;
        this.create = create;
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.create = create;
    }

    @Override
    public String toString() {
        return "id : " + this.id + " name : " + this.name + " description : " + this.desc + " create : " + this.create;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public long getCreate() {
        return this.create;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.id;
    }
}
