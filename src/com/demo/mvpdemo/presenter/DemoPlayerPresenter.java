/**
 * 
 */
package com.demo.mvpdemo.presenter;

import com.demo.mvpdemo.entity.DemoActionDefine;
import com.demo.mvpdemo.model.IDemoPlayerModel;
import com.demo.mvpdemo.view.IDemoPlayerView;

import android.os.Message;
import android.util.Log;
import common.utils.observer.IObserver;
import common.utils.observer.ISubject;

/**
 * @author lidongkai
 *
 */
public class DemoPlayerPresenter implements IObserver {
    IDemoPlayerModel mPlayerModel = null;
    IDemoPlayerView mPlayerView = null;

    public DemoPlayerPresenter(IDemoPlayerModel model,
            IDemoPlayerView view) {
        super();
        this.mPlayerModel = model;
        this.mPlayerView = view;
    }

    /* (non-Javadoc)
     * @see common.utils.observer.IObserver#listen(android.os.Message)
     */
    @Override
    public void listen(Message inMessage) {
        // TODO Auto-generated method stub
        Log.e("", "inMessage.what:" + inMessage.what);

        switch(inMessage.what) {
        case DemoActionDefine.ACTION_APP_LAUNCHED: {
            init();
            break;
        }
        case DemoActionDefine.ACTION_APP_EXIT: {
            exit();
            break;
        }
//        case DemoActionDefine.ACTION_XXX: {
//            op();
//            break;
//        }
        }
    }

    private void exit() {
        // TODO Auto-generated method stub
        ((ISubject)mPlayerModel).detach(this);
        ((ISubject)mPlayerView).detach(this);
        mPlayerModel.releaseModel();
        mPlayerView.releaseView();
    }

    private void init() {
        // TODO Auto-generated method stub
        ((ISubject)mPlayerModel).attach(this);
        ((ISubject)mPlayerView).attach(this);
    }

}
