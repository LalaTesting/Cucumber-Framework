package com.comcast.watchable.curated;

import org.testng.Assert;

import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.model.curatedlists.Video;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuratedList crateList = new CuratedList();
		CuratedItems item1 = new CuratedItems();
		Video video = new Video();
		video.setDuration("0");
		video.setId("12345");
		item1.setVideo(video);
		
		CuratedItems[] items = new CuratedItems[1];
		items[0] = item1;
		
		crateList.setCuratedItems(items);
		
		
		Video videoObject=items[0].getVideo();
		String videoDuration =videoObject.getDuration();
		String videoId=videoObject.getId();
		int duration = Integer.parseInt(videoDuration);
		System.out.println("XXXXXXXXX"+duration);
		
		
	if(duration <=0)
	{
		System.out.println("Video has 0 duration : "+videoId);
		Assert.assertTrue(false);
		
	}
		
		
	}

}
