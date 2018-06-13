package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.data.vos;

import java.util.List;

public class TalkVO {


    private int talkId;
    private String title;
    private SpeakerVO speakerVO;
    private String imageUrl;
    private int durationInSec;
    private String description;
    private List<TagVO> tags;

    public int getTalkId() {
        return talkId;
    }

    public String getTitle() {
        return title;
    }

    public SpeakerVO getSpeakerVO() {
        return speakerVO;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getDurationInSec() {
        return durationInSec;
    }

    public String getDescription() {
        return description;
    }

    public List<TagVO> getTags() {
        return tags;
    }
}
