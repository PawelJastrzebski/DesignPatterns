package com.jastrzab.designpatterns.structural.proxy.video;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

public class VideoLib implements IVideoLib {

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VideoInfo {
        public String name;
        public int length;
    }

    @SneakyThrows
    @Override
    public VideoInfo fetchMetadata(String videoId) {
        Thread.sleep(300);  // Emulate network
        return VideoInfo
                .builder()
                .name("Funny Cats")
                .length(80)
                .build();
    }

    @SneakyThrows
    @Override
    public byte[] fetchVideo(String videoId) {
        Thread.sleep(300);  // Emulate network
        return new byte[]{1,2,3};
    }

}
