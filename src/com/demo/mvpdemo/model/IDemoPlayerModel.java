/**
 * 
 */
package com.demo.mvpdemo.model;

/**
 * @author lidongkai
 *
 */
public interface IDemoPlayerModel extends IDemoPlayerControlModel, IDemoPlayerInfoModel,
        IDemoPlayerStatusModel {
    public void releaseModel();

}
