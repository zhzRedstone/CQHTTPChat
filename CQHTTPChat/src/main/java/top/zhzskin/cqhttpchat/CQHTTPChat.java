package top.zhzskin.cqhttpchat;


import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import top.zhzskin.cqhttpchat.event.Event_PlayerChat;
import top.zhzskin.cqhttpchat.network.WsClient;

import java.net.URISyntaxException;

public final class CQHTTPChat extends JavaPlugin implements Listener {
    FileConfiguration config = getConfig();
    Event_PlayerChat event_playerChat =new Event_PlayerChat();
    WsClient wsClient;
    String WS_URL;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Event_PlayerChat(),this);//注册事件
        WS_URL = config.getString("WS_URL");
        try {
            this.wsClient = new WsClient(WS_URL);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        event_playerChat.setWsClient(wsClient);
        wsClient.connect();
        //todo messagechain
        //wsClient.send();
    }
    @Override
    public void onDisable() {
        //todo messagechain shutdown
        wsClient.close();
    }
}
