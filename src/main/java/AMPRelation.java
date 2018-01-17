import java.util.HashSet;
import java.util.Set;

public class AMPRelation {

	private String seq1;
	private String seq2;
	private Set<String> seqSet = new HashSet<String>();
	private double sim;

	public void createSet() {
		seqSet.add(seq1);
		seqSet.add(seq2);
	}

	public Set<String> getSeqSet(){
		return this.seqSet;
	}

	public double getSim() {
		return sim;
	}

}
