package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;
    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getName().equals(labName)){
                return labs.get(i);
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        if(getLab(labName)== (null)){
            throw new UnsupportedOperationException();
        }

        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getName().equals(labName)){
                labs.get(i).setStatus(labStatus);
            }
        }


    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getName().equals(labName)){
                return labs.get(i).getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = labs.size()-1; i >= 0; i--) {
            sb.append(labs.get(i).getName());
            sb.append(" > ");
            sb.append(labs.get(i).getStatus());
            sb.append("\n");
        }
        sb.delete(sb.length()-1,sb.length());

        return sb.toString();
    }
}
