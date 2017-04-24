package com.ksc.kls;

import com.ksc.kls.model.transform.*;
import com.ksc.regions.Region;
/**
 * Created by yangfan on 2017/4/24.
 */
public interface KLS {
    void setEndpoint(String endpoint);

    void setRegion(Region region);

    //创建定时任务
    public CreateRecordResult createRecordTask(
            CreateRecordRequest createRecordRequest);

    //取消定时任务
    public CancelRecordResult cancelRecordTask(
            CancelRecordRequest cancleRecordRequest);

    //查询录像任务状态
    public GetRecordTaskResult getRecordTask(
            GetRecordTaskRequest getRecordTaskRequest);

    //查询历史录制任务
    public ListHistoryRecordTasksResult listHistoryRecordTasks(
            ListHistoryRecordTasksRequest listHistoryRecordTasksRequest);
    //短视频开始录制
    public StartStreamRecordResult startStreamRecord(
            StartStreamRecordRequest startStreamRecordRequest);
    //结束短视频录制
    public StopStreamRecordResult stopStreamRecord(
            StopStreamRecordRequest stopStreamRecordRequest);
}
