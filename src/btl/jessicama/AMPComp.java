package btl.jessicama;

import java.util.HashSet;

public class AMPComp {

    HashSet<AMP> AMPs;
    double similarity;

    AMPComp(AMP amp1, AMP amp2) {
        this.AMPs.add(amp1);
        this.AMPs.add(amp2);
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }
}
