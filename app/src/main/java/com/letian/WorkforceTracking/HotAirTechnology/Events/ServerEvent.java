package com.letian.WorkforceTracking.HotAirTechnology.Events;

import com.letian.WorkforceTracking.HotAirTechnology.ServerResponse;


public class ServerEvent {
    private ServerResponse serverResponse;

    public ServerEvent(ServerResponse serverResponse) {
        this.serverResponse = serverResponse;
    }

    public ServerResponse getServerResponse() {
        return serverResponse;
    }

    public void setServerResponse(ServerResponse serverResponse) {
        this.serverResponse = serverResponse;
    }

}
