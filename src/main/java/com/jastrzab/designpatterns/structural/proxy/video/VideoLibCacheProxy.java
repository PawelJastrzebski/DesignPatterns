package com.jastrzab.designpatterns.structural.proxy.video;

import java.util.LinkedHashMap;
import java.util.Map;

public class VideoLibCacheProxy implements IVideoLib {
    private final Map<String, VideoLib.VideoInfo> metadataCache = new LinkedHashMap<>();
    private final Map<String, byte[]> bytesCache = new LinkedHashMap<>();
    private final VideoLib lib;

    public VideoLibCacheProxy(VideoLib lib) {
        this.lib = lib;
    }

    @Override
    public VideoLib.VideoInfo fetchMetadata(String videoId) {
        if (metadataCache.containsKey(videoId)) {
            return metadataCache.get(videoId);
        }

        VideoLib.VideoInfo metadata = this.lib.fetchMetadata(videoId);
        this.metadataCache.put(videoId, metadata);
        return metadata;
    }

    @Override
    public byte[] fetchVideo(String videoId) {
        if (bytesCache.containsKey(videoId)) {
            return bytesCache.get(videoId);
        }

        byte[] bytes = this.lib.fetchVideo(videoId);
        this.bytesCache.put(videoId, bytes);
        return bytes;
    }
}
