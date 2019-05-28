package com.ivan.demo.main.temp;

//import com.google.common.collect.Maps;
//import com.sohu.blog.exception.ServiceDaoException;
//import com.sohu.blog.exception.ServiceException;
//import com.sohu.spaces.videos.model.VideoInfo;
//import com.sohu.spaces.videos.service.VideoInfoService;
//import com.sohu.tv.ugc.monitor.admin.util.GsonUtil;
//import com.sohu.tv.ugc.monitor.model.AuditContent;
//import com.sohu.tv.ugc.monitor.sdk.Config;
//import com.sohu.tv.ugc.monitor.sdk.Sender;
//import com.sohu.tv.ugc.monitor.sdk.util.GsonHolder;
//import org.apache.commons.lang.StringUtils;
//
//import java.rmi.Naming;
//import java.util.Date;
//import java.util.Map;

public class Import {

//    public static void main(String []args) throws Exception {
//
//        VideoInfoService videoInfoService = (VideoInfoService) Naming.lookup("//10.19.112.185:8701/VideoInfoRMIService");
//        VideoInfo monitorVideo = videoInfoService.getVideoInfo(Long.parseLong("133191443"));
//        Sender sender = new Sender();
//        Config config = new Config();
//        config.setTypeId("video-sohu-video");
//        config.setApiBaseUrl("http://10.19.116.140:8202");
//        sender.setConfig(config);
//
//        AuditContent content = new AuditContent();
//        content.setType("video-sohu-video");
//        content.setTitle(monitorVideo.getTitle());
//        content.setMainImage(monitorVideo.getCutCoverUrlNew());
//        content.setScreenshotImage(monitorVideo.getCusCoverUrlNew());
//        content.setTag(monitorVideo.getTag());
//        content.setVideoSize(monitorVideo.getVideoSize() != null ? monitorVideo.getVideoSize() : 0);
//        content.setVideoLength(monitorVideo.getVideoLength() != null ? monitorVideo.getVideoLength() : 0);
//        content.setCreateIp(monitorVideo.getUploadIp());
//        content.setPrimaryValue(String.valueOf(monitorVideo.getId()));
//        content.setDomain("sohu.com");
//        content.setUserId(String.valueOf(monitorVideo.getUserId()));
//        content.setMainContent(monitorVideo.getIntroduction());
//        content.setVideoMd5("xxxxxxxx");
//        // 保存当前 待审视频的 上传来源
//        Map<String, Object> extendContent = Maps.newHashMap();
//        extendContent.put("uploadFrom", monitorVideo.getUploadFrom());
//        extendContent.put("subtitle", StringUtils.defaultIfEmpty(monitorVideo.getSubtitle(), StringUtils.EMPTY));
//        content.setExtendContentJson(GsonUtil.toGson(extendContent));
//        content.setTime(new Date(monitorVideo.getUploadTime()));
//
//        String type ="video-sohu-video";
//        content.setType(type);
//        content.setPassage(type + "_1");
//
//        sender.send(content);
//
//    }
}