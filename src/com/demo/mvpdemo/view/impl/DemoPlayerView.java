/**
 * 
 */
package com.demo.mvpdemo.view.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

import com.demo.mvpdemo.view.IDemoPlayerView;
import common.utils.observer.SimpleSubjecter;

/**
 * @author lidongkai
 *
 */
public class DemoPlayerView extends SimpleSubjecter implements IDemoPlayerView,
        OnClickListener, android.content.DialogInterface.OnClickListener {
    Context mContext = null;

    /**
     * 
     */
    public DemoPlayerView(Context context) {
        // TODO Auto-generated constructor stub
        mContext = context;
    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerDiaglogView#showAlert(java.lang.String)
     */
    @Override
    public void showAlert(String msg) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerInfoView#setTitle(java.lang.String)
     */
    @Override
    public void setTitle(String title) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerInfoView#setArtist(java.lang.String)
     */
    @Override
    public void setArtist(String name) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerSeekView#setTotalTime(java.lang.String)
     */
    @Override
    public void setTotalTime(String time) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerSeekView#setCurrentTime(java.lang.String)
     */
    @Override
    public void setCurrentTime(String time) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerSeekView#setDuration(long)
     */
    @Override
    public void setDuration(long duration) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerSeekView#setCurrentPosition(long)
     */
    @Override
    public void setCurrentPosition(long pos) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerToolbarView#enablePlayButton(boolean)
     */
    @Override
    public void enablePlayButton(boolean enable) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerToolbarView#enablePauseButton(boolean)
     */
    @Override
    public void enablePauseButton(boolean enable) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.demo.mvpdemo.view.IDemoPlayerToolbarView#enableStopButton(boolean)
     */
    @Override
    public void enableStopButton(boolean enable) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see android.content.DialogInterface.OnClickListener#onClick(android.content.DialogInterface, int)
     */
    @Override
    public void onClick(DialogInterface dialog, int which) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see android.view.View.OnClickListener#onClick(android.view.View)
     */
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

    }

    @Override
    public void releaseView() {
        // TODO Auto-generated method stub
        mContext = null;
    }

}
