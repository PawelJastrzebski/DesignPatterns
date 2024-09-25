package com.jastrzab.designpatterns.structural.proxy.video;

public interface IVideoLib {

    VideoLib.VideoInfo fetchMetadata(String videoId);
    byte[] fetchVideo(String videoId);
}
