package com.ksc.kls.model.transform;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CancelRecordRequest {
    private int RecID;
    private String UniqueName;
    private String App;
    private String Pubdomain;
    private String Stream;

    public int getRecID() {
        return RecID;
    }

    public String getUniqueName() {
        return UniqueName;
    }

    public String getApp() {
        return App;
    }

    public String getPubdomain() {
        return Pubdomain;
    }

    public String getStream() {
        return Stream;
    }

    public void setRecID(int recID) {
        RecID = recID;
    }

    public void setUniqueName(String uniqueName) {
        UniqueName = uniqueName;
    }

    public void setApp(String app) {
        App = app;
    }

    public void setPubdomain(String pubdomain) {
        Pubdomain = pubdomain;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
