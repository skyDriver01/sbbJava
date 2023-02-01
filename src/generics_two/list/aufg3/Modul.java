package generics_two.list.aufg3;

import java.util.List;

public class Modul {
    private String name;
    private List<LBV> lbvs;

    public Modul(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <LBV> getLbvs() {
        return lbvs;
    }

    public void setLbvs(List <LBV> lbvs) {
        this.lbvs = lbvs;
    }
}