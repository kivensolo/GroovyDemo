package groovy.closure.delegate.practice

/**
 * Copyright(C) 2018, 北京视达科科技有限公司
 * All rights reserved. <br>
 * author: King.Z <br>
 * date:  2018/12/24 21:48 <br>
 * description: XXXXXXX <br>
 */
class View {
    private Closure onClickListenner
    Timer timer

    View() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            void run() {
                perOnClick();
            }
        }, 1000, 3000)
    }

    void setOnclickListenner(Closure closure) {
        this.onClickListenner = closure
    }


    private void perOnClick() {
        if (onClickListenner != null) {
            onClickListenner.call(this)
        }
    }


    @Override
    String toString() {
        return "this is view"
    }
}