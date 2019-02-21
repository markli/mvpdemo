/**
 * 
 */
package com.demo.mvpdemo.model;

/**
 * @author lidongkai
 *
 */
public interface IDemoPlayerControlModel {
    public void setDataSource(String uri);
    public void prepare();
    public void reset();
    public void release();
    public void start();
    public void pause();
    public void stop();
    public void seekTo(long msec);
}
