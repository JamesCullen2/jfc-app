package service;

import domain.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FriendRepository;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    public FriendRepository friendRepository;

    @Override
    public List<Friend> findAll() {
        return friendRepository.findAll();
    }
}
