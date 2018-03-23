package eureka.event;

import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/24 14:44
 * @description
 */
@Component
@Slf4j
public class EurekaStateChangeListener {

    @EventListener
    public void cancelEventListen(EurekaInstanceCanceledEvent canceledEvent) {
        log.info("======> Eureka is cancelled... || appName:{} serverId:{}",
                canceledEvent.getAppName(),
                canceledEvent.getServerId());
    }

    @EventListener
    public void registerEventListen(EurekaInstanceRegisteredEvent registeredEvent) {
        InstanceInfo instanceInfo = registeredEvent.getInstanceInfo();
        log.info("======> Eureka is registered... || instanceInfo:{}",
                instanceInfo.getAppName());
    }

    @EventListener
    public void serverStartEventListen(EurekaServerStartedEvent serverStartedEvent) {
        log.info("======> Eureka Server is started... || timestamp:{}",
                serverStartedEvent.getTimestamp());
    }
}
