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
package me.xiaopan.easyandroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LiXueAutoLoadListView extends ListView {
	// 定义的参数或者变量
	private int lineNo = -1;
	// 定义一个尾部加载更多的董建
	private LiXueFooterControl footerControl;

	// 要写两个构造方法，第一个只适合写一个上下文的，第二个才可以多加参数（可以多加此控件的属性方法）
	public LiXueAutoLoadListView(Context context) {
		super(context);
		// 设置一个监听滚动事件
		onScrollListner();
	}

	public LiXueAutoLoadListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 设置一个监听滚动事件
		onScrollListner();
	}

	// 获得LinearLayout的方法
	public void SetFooterControl(LiXueFooterControl liXueFooterControl) {
		this.footerControl = liXueFooterControl;
	}

	// 监听滚动事件
	public void onScrollListner() {
		setOnScrollListener(new OnScrollListener() {

			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {

			}

			@Override
			public void onScroll(AbsListView view, int firstVisibleItem,
					int visibleItemCount, int totalItemCount) {
				// 如果滚动到倒数第一行时（最后一行的列表尾的个数：getFooterViewsCount（））
				if (footerControl != null) {
					if (visibleItemCount == totalItemCount) {
						footerControl.setVisibility(GONE);
					} else {
						footerControl.setVisibility(VISIBLE);
						if (lineNo < 0) {
							if (getLastVisiblePosition() == totalItemCount - 2
									- getFooterViewsCount()) {
								Toast.makeText(getContext(), "开始加载",
										Toast.LENGTH_SHORT).show();
								lineNo = getLastVisiblePosition();
								footerControl.Startload();
							}
						} else {
							if (getLastVisiblePosition() < lineNo) {
								lineNo = -1;
							}
						}
					}
				}
			}
		});
	}

	// 重写setAdapter方法，必须在setAdapter方法执行之前向列表尾添加一个尾部控件，否则在其之后不管用
	@Override
	public void setAdapter(ListAdapter adapter) {
		if (footerControl != null) {
			addFooterView(footerControl);
		}
		super.setAdapter(adapter);
	}
}
