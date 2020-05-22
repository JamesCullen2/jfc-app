import domain.Friend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.FriendService;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FriendTest {

    @Autowired
    private FriendService friendService;

    @Test
    public void shouldCompile() {

        // Given
        BigInteger id = BigInteger.ONE;
        String name = "toby";
        BigInteger age = BigInteger.valueOf(3);
        String gender = "boy";

        // When
        Friend friend = new Friend(id, name, age, gender);

        // Then
        assertThat(friend.getId(), is(id));
    }

}