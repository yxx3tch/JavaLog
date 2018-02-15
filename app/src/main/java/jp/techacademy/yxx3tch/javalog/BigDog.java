package jp.techacademy.yxx3tch.javalog;

import android.util.Log;

/**
 * Created by yxx3tch on 2018/02/15.
 */

public class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
