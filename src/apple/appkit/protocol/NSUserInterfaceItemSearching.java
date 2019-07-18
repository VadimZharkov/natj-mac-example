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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSUserInterfaceItemSearching")
public interface NSUserInterfaceItemSearching {
	@Generated
	@Selector("localizedTitlesForItem:")
	public NSArray localizedTitlesForItem(
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("performActionForItem:")
	public void performActionForItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("searchForItemsWithSearchString:resultLimit:matchedItemHandler:")
	public void searchForItemsWithSearchStringResultLimitMatchedItemHandler(
			String searchString,
			long resultLimit,
			@ObjCBlock(name = "call_searchForItemsWithSearchStringResultLimitMatchedItemHandler") Block_searchForItemsWithSearchStringResultLimitMatchedItemHandler handleMatchedItems);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_searchForItemsWithSearchStringResultLimitMatchedItemHandler {
		@Generated
		public void call_searchForItemsWithSearchStringResultLimitMatchedItemHandler(
				NSArray arg0);
	}

	@Generated
	@IsOptional
	@Selector("showAllHelpTopicsForSearchString:")
	public void showAllHelpTopicsForSearchString(String searchString);
}
