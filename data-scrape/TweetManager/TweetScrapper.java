import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
public class TweetScrapper {
    public static ArrayList<String> getTweets(String topic){
        Twitter twitter = new TwitterFactory().getInstance();
        ArrayList<String> tweetlist = new ArrayList<String>();
        try {
			Query query = new Query(since:'2013-08-05', until:'2013-08-10' cats);
			QueryResult result;
			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				for (Status tweet : tweets) {
					tweetlist.add(tweet.getText());
				}
			} while ((query = result.nextQuery()) != null);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return tweetlist;
    
        
    }
}
