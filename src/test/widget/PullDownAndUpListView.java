/*
 * Copyright 2013 Peng fei Pan
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
package test.widget;

import me.xiaopan.easyandroid.widget.PullListView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListAdapter;

/**
 * 下拉刷新和上拉加载更多列表列表
 * @author xiaopan
 *
 */
public class PullDownAndUpListView extends PullListView {

	public PullDownAndUpListView(Context context) {
		super(context);
	}

	public PullDownAndUpListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void setAdapter(ListAdapter adapter) {
		openPullDownRefreshMode(new MyPullDownRefreshListHeader(getContext()), null);//打开下拉刷新模式
		openPullUpLoadMoreMode(new MyPullUpLoadMoreListFooter(getContext()), null);//打开上拉加载更多模式
		super.setAdapter(adapter);
	}
}
