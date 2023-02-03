package generics_two.list.aufg3;

import java.util.ArrayList;
import java.util.List;

public class Modul {
    private String name = "Modul187";
    private List <LBV> lbvs = new ArrayList <>();

    public void addLBV(LBV exam) {
        lbvs.add(exam);
    }

    public float getFinalModuleGrade() throws ModulNotGradeableException {
        float finalGradeWeight = 0F;
        float finalGrade = 0F;
        float notRounded = 0F;
        for (LBV lbv : lbvs) {
            finalGradeWeight += lbv.getWeight();
        }
        if(finalGradeWeight != 1) {
            throw new ModulNotGradeableException();
        } else {
            for (LBV lbv : lbvs) {
                finalGrade += (lbv.getGrade() / lbvs.size());
            }
            return (float) (0.5 * (Math.round(finalGrade / 0.5)));
        }
    }

    public void printReportEntry() {
        try {
            System.out.println("Modulname: " + name + " Grade: " + getFinalModuleGrade());
        } catch (ModulNotGradeableException e) {
            throw new RuntimeException(e);
        }
    }
}