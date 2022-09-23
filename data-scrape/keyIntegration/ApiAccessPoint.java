package keyIntegration;

import twitter4j.Twitter;

import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

class subscribe{
    public static void main(String[] args){
      ConfigurationBuilder cb = new ConfigurationBuilder();
      cb.setDebugEnabled(true)
      .setOAuthConsumerKey("1QN7SP4omgsbxA6PCS2gO1ISt")
      .setOAuthConsumerSecret("mvT82S89Bcfi92N6nuUJtcHbPEwDI3SiilcuzcbBI05RJYYq0V")
      .setOAuthAccessToken("1228613283134894081-S3KeucIjzRutop0vAEYUfM24aalKNG")
      .setOAuthAccessTokenSecret("CrxwoEF9VDSvc4FoOgWoKJzYFFrAzIfqImpFoTjoURlIv");
      TwitterFactory tf = new TwitterFactory(cb.build());
      Twitter twitter = tf.getInstance();
    
    }
}