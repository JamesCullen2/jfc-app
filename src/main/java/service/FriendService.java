package service;

import domain.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FriendRepository;

import java.util.List;

public interface FriendService {

    List<Friend> findAll();
}

