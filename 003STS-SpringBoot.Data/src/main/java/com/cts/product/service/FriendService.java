package com.cts.product.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.FriendDao;
import com.cts.product.entity.FriendEntity;
import com.cts.product.pojo.Friend;

@Service
public class FriendService {

	@Autowired
	private FriendDao friendDAO;
	
	public void saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		friendDAO.saveFriend(friend);
	}

	public List<FriendEntity> getAllFriends() {
		// TODO Auto-generated method stub
		return friendDAO.getAllFriends();
	}

	public Friend getFriendById(int id) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("################");
			System.out.println("Sleep for 3 sec");
			System.out.println("################");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return friendDAO.getFriendById(id);
	}

	public List<Friend> deleteFriendById(int id) {
		// TODO Auto-generated method stub
		return friendDAO.deleteFriendById(id);
		
	}

	public List<Friend> updateFriendById(int id, Friend friend) {
		// TODO Auto-generated method stub
		return friendDAO.updateFriendById(id, friend);
	}

	public FriendEntity  findFriendByName(String name) {
		// TODO Auto-generated method stub
		return friendDAO.findFriendByName(name);
	}


}
