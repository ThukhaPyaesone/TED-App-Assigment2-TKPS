package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.data.vos;

import java.util.List;

public class PlayListVO {

    private int playListId;
    private String title;
    private String imageUrl;
    private int totalTalk;
    private String description;
    private List<TalkVO> playLists;

    public int getPlayListId() {
        return playListId;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getTotalTalk() {
        return totalTalk;
    }

    public String getDescription() {
        return description;
    }

    public List<TalkVO> getPlayLists() {
        return playLists;
    }
}
