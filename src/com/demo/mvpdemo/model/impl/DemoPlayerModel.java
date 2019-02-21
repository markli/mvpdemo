/**
 * 
 */
package com.demo.mvpdemo.model.impl;

import android.content.Context;
import android.util.Log;

import com.demo.mvpdemo.model.IDemoPlayerModel;
import common.utils.observer.SimpleSubjecter;

/**
 * @author lidongkai
 *
 */
public class DemoPlayerModel extends SimpleSubjecter implements
        IDemoPlayerModel {
    Context mContext = null;

    public DemoPlayerModel(Context context) {
        // TODO Auto-generated constructor stub
        mContext = context;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#setDataSource(java.lang.String)
     */
    @Override
    public void setDataSource(String uri) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#prepare()
     */
    @Override
    public void prepare() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#reset()
     */
    @Override
    public void reset() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#release()
     */
    @Override
    public void release() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#start()
     */
    @Override
    public void start() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#pause()
     */
    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#stop()
     */
    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerControlModel#seekTo(long)
     */
    @Override
    public void seekTo(long msec) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerInfoModel#getTitle()
     */
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerInfoModel#getArtist()
     */
    @Override
    public String getArtist() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerInfoModel#getDuration()
     */
    @Override
    public long getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerInfoModel#getCurrentPosition()
     */
    @Override
    public long getCurrentPosition() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerStatusModel#isLooping()
     */
    @Override
    public boolean isLooping() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerStatusModel#isPlaying()
     */
    @Override
    public boolean isPlaying() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerStatusModel#isPaused()
     */
    @Override
    public boolean isPaused() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.model.IDemoPlayerStatusModel#isStopped()
     */
    @Override
    public boolean isStopped() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void releaseModel() {
        // TODO Auto-generated method stub
        mContext = null;
    }

}
