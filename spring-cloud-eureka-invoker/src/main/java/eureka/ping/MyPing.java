package eureka.ping;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/24 15:28
 * @description
 */
@Slf4j
public class MyPing implements IPing {
    @Override
    public boolean isAlive(Server server) {
        log.info("自定义Ping类, 服务器信息:{}", server.getHostPort());
        return true;
    }
}
