package com.example.photoapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val urls: UnsplashPhotoUrls,
    val user: UnsplashUser
) : Parcelable {

    @Parcelize
    data class UnsplashPhotoUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String,
    ) : Parcelable

    // @Parcelize はパフォーマンスを最適化するためのもの
    @Parcelize
    data class UnsplashUser(
        val name: String,
        val username: String
    ) : Parcelable {
        // カスタムアクセサ コンストラクタで初期化したusernameに応じて、sttributionUrlに値を代入
        // ↓こう書く場合と同じ?
        //val attributionUrl = "https://unsplash.com/${this.username}?utm_source=ImageSearchApp&utm_medium=referral"
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }
}