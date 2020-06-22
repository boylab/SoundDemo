package com.boylab.sounddemo;

import android.content.Context;
import android.media.SoundPool;

/**
 * Created by pengle on 2020/06/22
 * Email: pengle609@163.com
 */
public class SoundUtil {

    private static final SoundUtil ourInstance = new SoundUtil();
    private SoundPool soundPool;

    static SoundUtil newInstance() {
        return ourInstance;
    }

    private SoundUtil() {
        soundPool = new SoundPool.Builder().setMaxStreams(3).build();
    }

    public void loadSource(Context context) {
        //加载音频文件
        soundPool.load(context, R.raw.sound_0_0, 1);
        soundPool.load(context, R.raw.sound_1_0, 1);
        soundPool.load(context, R.raw.sound_1_1, 1);
        soundPool.load(context, R.raw.sound_1_2, 1);
    }

    public void play(int number) {
        //播放音频
        soundPool.play(number, 1, 1, 0, 0, 1);
    }

}
