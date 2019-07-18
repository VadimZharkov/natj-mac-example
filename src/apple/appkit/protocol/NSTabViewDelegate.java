/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.appkit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.appkit.NSTabView;
import apple.appkit.NSTabViewItem;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTabViewDelegate")
public interface NSTabViewDelegate {
	@Generated
	@IsOptional
	@Selector("tabView:didSelectTabViewItem:")
	public void tabViewDidSelectTabViewItem(NSTabView tabView,
			NSTabViewItem tabViewItem);

	@Generated
	@IsOptional
	@Selector("tabView:shouldSelectTabViewItem:")
	public boolean tabViewShouldSelectTabViewItem(NSTabView tabView,
			NSTabViewItem tabViewItem);

	@Generated
	@IsOptional
	@Selector("tabView:willSelectTabViewItem:")
	public void tabViewWillSelectTabViewItem(NSTabView tabView,
			NSTabViewItem tabViewItem);

	@Generated
	@IsOptional
	@Selector("tabViewDidChangeNumberOfTabViewItems:")
	public void tabViewDidChangeNumberOfTabViewItems(NSTabView tabView);
}
