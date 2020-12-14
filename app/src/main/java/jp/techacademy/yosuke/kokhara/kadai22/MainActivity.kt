package jp.techacademy.yosuke.kokhara.kadai22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Human = Human("小原", 34)      // 名前を小原、年齢34歳のインスタンスを作る

        Human.say()
        Log.d("kotlintest", "私の名前は" + Human.name + "です。")
        Log.d("kotlintest", "年は" + Human.age + "歳です。")

        val Human2 = Human("洋祐", 34)
        Human2.think()
        Log.d("kotlintest", "私の名前は" + Human2.name + "です。")
        Log.d("kotlintest", "年は" + Human2.age + "歳です。")
    }
}