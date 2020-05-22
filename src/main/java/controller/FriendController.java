package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FriendController {



    @PostMapping("/{id}")
    public ResponseEntity<?> newBazz(@RequestParam("name") String name){
        return new ResponseEntity<>(new FriendController.Bazz("5", name), HttpStatus.OK);
    }


    private class Bazz {
        public Bazz(String s, String name) {
        }
    }
}
