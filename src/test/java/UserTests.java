import org.junit.Assert;
import task1.Gender;
import task1.User;
import org.junit.Test;

public class UserTests {
    @Test
    public void test(){
        User user = User.builder().name("Katia").age(18).gender(Gender.FEMALE).build();
        Assert.assertEquals(user.getAge(), 18);
        Assert.assertEquals(user.getName(), "Katia");
    }
}
