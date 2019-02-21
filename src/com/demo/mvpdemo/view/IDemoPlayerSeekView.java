/**
 * 
 */
package com.demo.mvpdemo.view;

/**
 * @author lidongkai
 *
 */
public interface IDemoPlayerSeekView {
    public void setTotalTime(String time);
    public void setCurrentTime(String time);
    public void setDuration(long duration);
    public void setCurrentPosition(long pos);

}
