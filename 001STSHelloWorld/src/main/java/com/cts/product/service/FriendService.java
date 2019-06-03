package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.FriendDao;
import com.cts.product.pojo.Friend;

@Service("friendService")
public class FriendService {

	   @Autowired
       private FriendDao friendDao;
	   
	   public List<Friend> getAllFriends1() {
		   return friendDao.getAllFriends();    
	   }

	public Friend getFriendById(String id) {
		// TODO Auto-generated method stub
		return friendDao.getFriendById(id);
		
	}
}
