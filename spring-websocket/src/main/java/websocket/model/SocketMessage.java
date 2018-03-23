package websocket.model;

import lombok.Data;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/28 10:55
 * @description
 */
@Data
public class SocketMessage {
    private String message;
    private String timestamp;
}
