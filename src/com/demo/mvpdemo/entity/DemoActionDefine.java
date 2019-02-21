/**
 * 
 */
package com.demo.mvpdemo.entity;

/**
 * @author lidongkai
 *
 */
public class DemoActionDefine {
    //action define
    static public final int ACTION_APP_LAUNCHED = 1;
    static public final int ACTION_PASS_MDEIA_DATA = 2;
    static public final int ACTION_PLAYER_STATE_CHANGED = 3;
    static public final int ACTION_PLAY = 4;
    static public final int ACTION_PAUSE = 5;
    static public final int ACTION_EXIT = 6;
    static public final int ACTION_SEEK = 7;
    static public final int ACTION_APP_EXIT = 99;

    //state define
    static public final int STATE_IDLE = 1;
    static public final int STATE_PREPARED = 2;
    static public final int STATE_PLAYING = 3;
    static public final int STATE_PAUSED = 4;
    static public final int STATE_STOPPED = 5;
    static public final int STATE_ERROR = 6;
}
