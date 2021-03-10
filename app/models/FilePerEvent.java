package models;
import models.TweetApi;

import java.util.ArrayList;
import java.util.List;

public class FilePerEvent {
	
	private String nameFile;
	private List<TweetApi> tweets = new ArrayList<>();
	public FilePerEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public List<TweetApi> getTweets() {
		return tweets;
	}
	public void setTweets(List<TweetApi> tweets) {
		this.tweets = tweets;
	}
	
	

}
