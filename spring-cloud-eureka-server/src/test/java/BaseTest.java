import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/27 15:05
 * @description
 */
public class BaseTest {
    @Test
    public void test() {
        List<String> list = Lists.newArrayList("1", "2", "3");
        List<Integer> list1 = Lists.transform(list, new Function<String, Integer>() {
            @Nullable
            public Integer apply(@Nullable String s) {
                return Integer.parseInt(s);
            }
        });
        System.out.println(list1);
    }
}
