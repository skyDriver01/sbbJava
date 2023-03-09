package main.java.objektOriented.CØØP;

public class Worker {
    private String name;
    private String storeAddress;
    private String boss;
    private String task;

    public Worker(String name, String storeAddress, String boss, String task) {
        this.name = name;
        this.storeAddress = storeAddress;
        this.boss = boss;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String store) {
        this.storeAddress = store;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
