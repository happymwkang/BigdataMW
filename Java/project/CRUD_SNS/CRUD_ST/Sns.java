package step04_miniProject;


public class Sns {
	private String adid;
	private long adpw;
	// °ü¸®ÀÚ, °í°´---------------------
	private String id;
	private long pw;
	private String posts;
	
	public Sns () {}
	
	public Sns(String adid, long adpw) {
		this.adid = adid;
		this.adpw = adpw;
	}
	
	public Sns(String id, long pw, String posts) {
		this.id = id;
		this.pw = pw;
		this.posts = posts;
	}
		
	public String getAdid() {
		return adid;
	}

	public void setAdid(String adid) {
		this.adid = adid;
	}

	public long getAdpw() {
		return adpw;
	}

	public void setAdpw(long adpw) {
		this.adpw = adpw;
	}

	//============================================
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	// pw -----------------------------------------
	
	public long getPw() {
		return pw;
	}
	
	public void setPw(long pw) {
		this.pw = pw;
	}
	
	// posts -----------------------------------------

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}
	
	public String toString() {
		return id + " " + pw + " " + posts;
	}
}