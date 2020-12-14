package jp.techacademy.yosuke.kokhara.kadai22

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は言った")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は考えた。")
    }
}