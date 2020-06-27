package com.aliEducation.websocket;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/26 16:04
 */
@Component
public class MessageHandshakeInterceptor implements HandshakeInterceptor {
    /**
     * Map<String, Object> map 拦截器会把这个map数据放在session中
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @param webSocketHandler
     * @param map
     * @return
     * @throws Exception
     */

    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest,
                                   ServerHttpResponse serverHttpResponse,
                                   WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {

        String url = serverHttpRequest.getURI().getPath();
        String []res = StringUtils.split(url, "/");
        if (res.length != 2) {
            return false;
        }
        if(!StringUtils.isNumeric(res[1])){
            return false;
        }
        /**
         * 每一个试图和websocket建立连接都现在这里注册。
         */
        map.put("uid",Long.valueOf(res[1]));
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {

    }
}
