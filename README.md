# ![Logo](https://github.com/xiaopansky/AndroidToolbox/raw/master/sample/src/main/res/mipmap-mdpi/ic_launcher.png) AndroidToolbox

这是一个Android工具类库，其包含大量在Android开发中经常用到的工具类或方法，旨在让Android开发变得更简单、更随意、更舒心！

##Usage guide
me.xiaopan.android.app
>* DialogUtils.java
>* DownloadManagerUtils.java
>* FragmentBuilder.java
>* FragmentListPagerAdapter.java
>* FragmentUtils
>* MessageDialogFragment.java
>* ProgressDialogFragment.java
>* SimpleFragmentPagerAdapter.java
>* SimpleFragmentStatePagerAdapter.java

me.xiaopan.android.content
>* BroadcastUtils.java
>* ContentUtils.java
>* FileUtils.java
>* IntentUtils.java
>* LaunchAppReceiver.java
>* UriUtils.java

me.xiaopan.android.content.pm
>* VersionManager.java

me.xiaopan.android.content.res
>* AssetUtils.java
>* DimenUtils.java

me.xiaopan.android.graphics
>* BitmapDecoder.java
>* BitmapUtils.java
>* Colors.java
>* ImageProcessor.java
>* RectUtils.java
>* TextUtils.java

me.xiaopan.android.graphics.drawble
>* DrawableLevelController.java

me.xiaopan.android.hardware
>* DeviceUtils.java

me.xiaopan.android.hardware.camera
>* BasePreviewAndPictureSizeCalculator.java
>* BestPreviewSizeCalculator.java
>* CameraManager.java
>* CameraUtils.java
>* LoopFocusManager.java

me.xiaopan.android.net
>* NetworkUtils.java

me.xiaopan.android.os
>* OSUtils.java
>* SDCardUtils.java
>* StatFsCompat.java

me.xiaopan.android.os.storage
>* StorageUtils.java

me.xiaopan.android.preference
>* PreferencesUtils.java

me.xiaopan.android.provider
>* PhoneUtils.java
>* SettingsUtils.java

me.xiaopan.android.util
>* ALog.java
>* BuildConfigUtils.java
>* Countdown.java
>* DoubleClickDetector.java
>* DoubleClickExitDetector.java
>* InputVerifyUtils.java
>* LoopTimer.java
>* MessageDigestUtils.java
>* OtherUtils.java
>* RebootThreadExceptionHandler.java

me.xiaopan.android.view
>* ViewListPagerAdapter.java
>* ViewRefreshHandler.java
>* ViewUtils.java
>* WindowUtils.java

me.xiaopan.android.view.animation
>* AnimationUtils.java
>* ViewAnimationUtils.java

me.xiaopan.android.view.inputmethod
>* InputMethodUtils.java

me.xiaopan.android.webkit
>* WebViewManager.java

me.xiaopan.android.widget
>* [CheckAdapter.java](https://github.com/xiaopansky/AndroidToolbox/wiki/CheckAdapter.java)
>* DepthPageTransformer.java
>* NestedGridView.java
>* NestedListView.java
>* ToastUtils.java
>* ViewAdapter.java
>* ZoomOutPageTransformer.java

##Downloads
>* [android-happy-5.0.0.jar](https://github.com/xiaopansky/AndroidToolbox/raw/master/releases/android-toolbox-5.0.0.jar)
>* [android-happy-5.0.0-with-src.zip](https://github.com/xiaopansky/AndroidToolbox/raw/master/releases/android-toolbox-5.0.0-with-src.zip)

Dependencies
>* android-support-v4.jar
    1. FragmentListPagerAdapter.java
    2. SimpleFragmentPagerAdapter.java
    3. SimpleFragmentStatePagerAdapter.java
    4. ViewListPagerAdapter.java
    5. MessageDialogFragment.java
    6. ProgressDialogFragment.java
    7. DepthPageTransformer.java
    8. ZoomOutPageTransformer.java
    
>* [gson-2.2.4.jar](https://github.com/xiaopansky/AndroidToolbox/raw/master/library/libs/gson-2.2.4.jar) 可选的。如果你要使用PreferenceUtils的putObject()和getObject()方法的话就必须要导入此类库

>* [pinyin4j-2.5.0.jar](https://github.com/xiaopansky/AndroidToolbox/raw/master/library/libs/pinyin4j-2.5.0.jar) 可选的。此类库用于实现为中文匹配拼音或者比较两个中文的大小，所以如果你要使用CharUtils的getPinyin系列方法或者StringUtils的compare()方法的话就必须要导入此类库

## Change log
#### 5.0.0
>* 更改项目结构为Gradle
>* 删掉了一些多余的工具方法、类
>* 优化了一些方法的命名以及组织结构

#### 4.5.9
>* 增加MessageDigestUtils.java 方便计算文件MD5或SHA-1摘要信息
>* MessageDialogFragment和ProgressDialogFragment中Builder的成员变量改为私有的

#### 4.5.8
>* 优化MessageDialogFragment和ProgressDialogFragment的按钮设置方法，并增加中立按钮（NeutralButton）

#### 4.5.7
>* 增加FragmentUtils，方便查找Fragment

#### 4.5.6
>* 恢复并升级WebViewManager

#### 4.5.5
>* 删除WebViewManager

#### 4.5.4
>* 增加ContentUtils.java
>* BimtapDecoder增加decodeUri()方法，方便读取 Uri指定的图片

#### 4.5.3
>* 删除me.xiaopan.android.adapter包，并将其中的类 移至其它包中
>* 修复MessageDialogFragment和ProgressDialogFragment的OnDismissListener以及OnCancelListener事件不起作用的BUG
>* 增加FragmentBuilder，目的是方便在创建Fragment时添加参数

#### 4.5.2
>* 修复BimtapDecoder在4.4上调用decodeFromAssets()或decodeFromStream()方法解码失败，返回null的BUG，原因是同一个InputStream用了两次

##License
```java
/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
```
