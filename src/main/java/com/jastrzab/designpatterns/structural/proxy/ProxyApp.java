package com.jastrzab.designpatterns.structural.proxy;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.proxy.video.IVideoLib;
import com.jastrzab.designpatterns.structural.proxy.video.VideoLib;
import com.jastrzab.designpatterns.structural.proxy.video.VideoLibCacheProxy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProxyApp implements Application {
    @Override
    public String appName() {
        return "Proxy";
    }

    @Override
    public void startApplication() {
        IVideoLib videoLib = new VideoLib();
        IVideoLib videoLibCache = new VideoLibCacheProxy(new VideoLib());

        {
            log.info("Downloading Video 1");
            VideoLib.VideoInfo metadata = videoLibCache.fetchMetadata("1");
            byte[] videoBytes = videoLibCache.fetchVideo("1");
            log.info("Done");
        }

        {
            log.info("Downloading Video 1 Again");
            VideoLib.VideoInfo metadata = videoLibCache.fetchMetadata("1");
            byte[] videoBytes = videoLibCache.fetchVideo("1");
            log.info("Done");
        }
    }
}
