package ekam.example.api;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UserTests extends APITest {
    int userId = 2;

    @Test(groups = "api")
    public void apiExampleTest() {
        GetSingleUserResponse user = Client(UserClient.class)
                .getSingleUser(userId);
        assertNotNull(user.getData().getEmail());
//        System.out.println(user.getData().getFirstName());
    }
}