package Blog;

public class Tags {
	private String[] tags;
	
	public Tags(String[] tags) {
		super();
		this.tags = tags;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() { String space = "";
		for(int i=0; i<tags.length; i++) { space += tags[i]+", ";
		}
		return space;
	}
}