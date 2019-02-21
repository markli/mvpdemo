package com.demo.mvpdemo.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;

import com.demo.mvpdemo.R;
import com.demo.mvpdemo.entity.DemoActionDefine;
import com.demo.mvpdemo.model.IDemoPlayerModel;
import com.demo.mvpdemo.model.impl.DemoPlayerModel;
import com.demo.mvpdemo.presenter.DemoPlayerPresenter;
import com.demo.mvpdemo.view.IDemoPlayerView;
import com.demo.mvpdemo.view.impl.DemoPlayerView;
import common.utils.observer.IObserver;
import common.utils.observer.ISubject;
import common.utils.observer.ObserverAdapter;

public class MainActivity extends Activity implements ISubject {
    DemoPlayerPresenter mPresenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMVP();
    }

    private void initMVP() {
        // TODO Auto-generated method stub
        DemoPlayerModel model = new DemoPlayerModel(this);
        DemoPlayerView view = new DemoPlayerView(this);
        mPresenter = new DemoPlayerPresenter(model, view);
        this.attach(mPresenter);
        Message msg = Message.obtain();
        msg.what = DemoActionDefine.ACTION_APP_LAUNCHED;
        this.notify(msg, FLAG_RUN_SYNC);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Message msg = Message.obtain();
        msg.what = DemoActionDefine.ACTION_APP_EXIT;
        this.notify(msg, FLAG_RUN_SYNC);
        this.detach(mPresenter);
    }

    /* (non-Javadoc)
     * @see common.utils.observer.ISubject#attach(common.utils.observer.IObserver)
     */
    @Override
    public boolean attach(IObserver inObserver) {
        return ObserverAdapter.getInstance().register(this, inObserver);
    }

    /* (non-Javadoc)
     * @see common.utils.observer.ISubject#detach(common.utils.observer.IObserver)
     */
    @Override
    public boolean detach(IObserver inObserver) {
        return ObserverAdapter.getInstance().unregister(this, inObserver);
    }

    /* (non-Javadoc)
     * @see common.utils.observer.ISubject#notify(android.os.Message, int)
     */
    @Override
    public void notify(Message inMessage, int... flag) {
        ObserverAdapter.getInstance().notify(this, inMessage, flag);
    }

}
