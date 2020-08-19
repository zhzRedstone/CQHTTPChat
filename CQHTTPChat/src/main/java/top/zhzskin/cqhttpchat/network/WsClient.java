package top.zhzskin.cqhttpchat.network;
import org.bukkit.Bukkit;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
public class WsClient extends WebSocketClient {
    public WsClient(String url) throws URISyntaxException {
        super(URI.create(url));
    }
    @Override
    public void onOpen(ServerHandshake handshakedata) {
        Bukkit.getServer().getLogger().info("WebSocket已连接");
    }
    @Override
    public void onMessage(String message) {
        //todo message
        Bukkit.getServer().broadcastMessage(message);
    }
    @Override
    public void onError(Exception ex) {
    }
    @Override
    public void onClose(int code, String reason, boolean remote) {
        Bukkit.getServer().getLogger().info("WebSocket已关闭");
    }
}