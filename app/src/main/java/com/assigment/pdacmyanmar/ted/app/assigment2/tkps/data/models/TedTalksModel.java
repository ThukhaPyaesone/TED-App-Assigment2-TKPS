package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.data.models;

import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.networks.HttpUrlConnectionDataAgentImpl;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.networks.TedTalkDataAgent;

public class TedTalksModel {


    private static TedTalksModel objInstance;
    private TedTalkDataAgent tNewDataAgent;
    private static final String ACCESS_TOKEN = "b002c7e1a528b7cb460933fc2875e916";


    private TedTalksModel() {
        tNewDataAgent = HttpUrlConnectionDataAgentImpl.getObjInstance();
    }

    public static TedTalksModel getObjInstance() {
        if (objInstance == null) {
            objInstance = new TedTalksModel();
        }
        return objInstance;
    }

    public void loadTedTalkList() {
        tNewDataAgent.loadTedTalkList(1, ACCESS_TOKEN);
    }

}
