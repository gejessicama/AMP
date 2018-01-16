package btl.jessicama;

import java.util.ArrayList;
import java.io.File.*;

public class AMP {

    String id;
    ArrayList<AMPComp> comparisonList;

    AMP(String id) {
        this.id = id;
        comparisonList = new ArrayList<AMPComp>();
    }

    public static void main(String[] args) {
    }

    public void addAMP(AMP other){

        comparisonList.add(new AMPComp(this, other));

    }
}

