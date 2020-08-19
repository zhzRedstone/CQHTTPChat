package top.zhzskin.cqhttpchat.pojo;

import top.zhzskin.cqhttpchat.pojo.param.Params;

public class APICaller {
    String action;
    public void setAction(String action) {
        this.action = action;
    }
    public String getAction() {
        return action;
    }

    Params params;
    public void setParams(Params params){
        this.params=params;
    }
    public Params getParams() {
        return params;
    }

}
