package top.zhzskin.cqhttpchat.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import top.zhzskin.cqhttpchat.network.WsClient;

public class Event_PlayerChat implements Listener {
    WsClient wsClient;

    public void setWsClient(WsClient wsClient) {
        this.wsClient = wsClient;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent playerChatEvent){
        // todo set chat event
        // wsClient.send();
    }

}
