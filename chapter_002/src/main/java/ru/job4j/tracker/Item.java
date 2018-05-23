package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;
    private String desc;
    private long create;
    private String[] comments;

    public Item(String id, String name, String desc, long create, String[] comments) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.create = create;
        this.comments = comments;
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
