package deadlock1;

/**
 * Class providing something to write with
 */
public class WritingMaterial {
	private String crayon;

	private String paper;

	public WritingMaterial() {
		crayon = "aPencil";
		paper = "SomePaperA4";
	}
	
	public String getCrayon() {
		return crayon;
	}
	
	public String getPaper() {
		return paper;
	}
}
