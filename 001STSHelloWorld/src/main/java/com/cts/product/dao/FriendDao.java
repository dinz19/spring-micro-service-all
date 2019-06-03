package com.cts.product.dao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.pojo.Friend;

@Repository
public class FriendDao {

	  private List<Friend> friends = new ArrayList<>(Arrays.asList(
			  new Friend("Ola", 21, "1"),
			  new Friend("Uber", 22, "2"),
			  new Friend("FastTrack", 24, "3"),
			  new Friend("Zoom", 18, "4")
			  ));
	  
	  public List<Friend> getAllFriends() {
		  
	/* 		 List<Friend> friends = new ArrayList<>();
			 
			 Friend f1 = new Friend();
			 f1.setAge(21);
			 f1.setName("Ola");

			 Friend f2 = new Friend();
			 f2.setAge(24);
			 f2.setName("Uber");
			 
			 friends.add(f1);
	 		 friends.add(f2);  */
			 
			 return friends;
	  }

	public Friend getFriendById(String id) {
	
		// TODO Auto-generated method stub
		return friends.stream()
				.filter((f) -> f.getId().equals(id))
				.findFirst()
				.get();
	}
}
