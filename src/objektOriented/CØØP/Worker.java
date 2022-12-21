package objektOriented.CØØP;

public class Worker {
    private String name;
    private String store;
    private String boss;
    private String task;

    public Worker(String name, String store, String boss, String task) {
        this.name = name;
        this.store = store;
        this.boss = boss;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
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
