package mob.textfinder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TextFinderTest {

    @Test
    public void サンプルテスト(){
        String filePath = "src/resources/target.txt";
        boolean result = TextFinder.existText(filePath, "サンアーチ");
        assertTrue( result );
    }
}
