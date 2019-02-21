/**
 * 
 */
package com.demo.mvpdemo.view;

/**
 * @author lidongkai
 *
 */
public interface IDemoPlayerView extends IDemoPlayerDiaglogView,
        IDemoPlayerInfoView, IDemoPlayerSeekView, IDemoPlayerToolbarView {
    public void releaseView();

}
