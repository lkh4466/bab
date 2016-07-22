package spring.model.review;

public class ReviewDTO {
	private int revNum;
	private int restNum;
	private String title;
	private String content;
	private int rankScore;
	
	public int getRevNum() {
		return revNum;
	}
	public void setRevNum(int revNum) {
		this.revNum = revNum;
	}
	public int getRestNum() {
		return restNum;
	}
	public void setRestNum(int restNum) {
		this.restNum = restNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRankScore() {
		return rankScore;
	}
	public void setRankScore(int rankScore) {
		this.rankScore = rankScore;
	}
	
}