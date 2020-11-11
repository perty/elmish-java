package se.artcomputer.elmish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/message",
        decoders = MessageDecoder.class,
        encoders = MessageEncoder.class)
public class MessageEndPoint {
    private static final Logger LOG = LoggerFactory.getLogger(ModelCmd.class);

    @OnOpen
    public void onOpen(Session session) throws IOException {
        // Get session and WebSocket connection
        LOG.info("onOpenSession id:'{}'", session.getId());
    }
 
    @OnMessage
    public void onMessage(Session session, Message message) {
        // Handle new messages
    }
 
    @OnClose
    public void onClose(Session session) {
        // WebSocket connection closes
    }
 
    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }
}