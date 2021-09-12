import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();
    @Test
    public void testGetLocalNumber(){
        int res;
        res = mainClass.getLocalNumber();
       if (res == 14) {
           System.out.println("Result is OK");
         return;
       }
       else {
           System.out.println("Wrong result");
           return;
       }
    }
}
