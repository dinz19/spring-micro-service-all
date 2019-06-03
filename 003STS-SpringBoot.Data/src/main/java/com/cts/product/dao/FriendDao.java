package com.cts.product.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.cts.product.entity.FriendEntity;
import com.cts.product.pojo.Friend;
import com.cts.product.repository.FriendRepository;

@Repository
public class FriendDao {

	@Autowired
	private FriendRepository friendRepository;

	public void saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		FriendEntity fe = new FriendEntity();
	//	fe.setName("Gowsi");
	//	fe.setLocation("Chennai");
		fe.setName(friend.getName());
		fe.setLocation(friend.getLocation());
		friendRepository.save(fe);
				
	}

	public List<FriendEntity> getAllFriends() {
		// TODO Auto-generated method stub
		return friendRepository.findAll();
	}

	public Friend getFriendById(int id) {
		// TODO Auto-generated method stub
		FriendEntity fe = friendRepository.findById(id).get();
		Friend f = new Friend();
		f.setId(fe.getId());
		f.setName(fe.getName());
		f.setLocation(fe.getLocation());
		// return friendRepository.findById(id).get();
		return f;
	}

	public List<Friend> deleteFriendById(int id) {
		// TODO Auto-generated method stub
		friendRepository.deleteById(id);
		List<FriendEntity> friendEntities = friendRepository.findAll();
		List<Friend> allFriends = new ArrayList<Friend>();
		for (FriendEntity feTemp : friendEntities) {
			Friend fTemp = new Friend();
			fTemp.setId(feTemp.getId());
			fTemp.setName(feTemp.getName());
			fTemp.setLocation(feTemp.getLocation());
			allFriends.add(fTemp);
		}
//		return friendRepository.findAll();
		return allFriends;
	}

	public List<Friend> updateFriendById(int id, Friend friend) {
		// TODO Auto-generated method stub
		FriendEntity fe = new FriendEntity();
		fe.setId(id);
		fe.setLocation(friend.getLocation());
		fe.setName(friend.getName());
		friendRepository.save(fe);
		
		List<FriendEntity> friendEntities = friendRepository.findAll();
		List<Friend> allFriends = new ArrayList<Friend>();
		for (FriendEntity feTemp : friendEntities) {
			Friend fTemp = new Friend();
			fTemp.setId(feTemp.getId());
			fTemp.setName(feTemp.getName());
			fTemp.setLocation(feTemp.getLocation());
			allFriends.add(fTemp);
		}
//		return friendRepository.findAll();
		return allFriends;
		
	}

	public FriendEntity findFriendByName(String name) {
		// TODO Auto-generated method stub
		return friendRepository.findByName(name).get();
	}

}
