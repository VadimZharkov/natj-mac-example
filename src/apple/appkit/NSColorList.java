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

package apple.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSColorList extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSColorList(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("allKeys")
	public native NSArray allKeys();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSColorList alloc();

	@Generated
	@Selector("availableColorLists")
	public static native NSArray availableColorLists();

	@Generated
	@Selector("colorListNamed:")
	public static native NSColorList colorListNamed(String name);

	@Generated
	@Selector("colorWithKey:")
	public native NSColor colorWithKey(String key);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSColorList init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithName:")
	public native NSColorList initWithName(String name);

	@Generated
	@Selector("initWithName:fromFile:")
	public native NSColorList initWithNameFromFile(String name, String path);

	@Generated
	@Selector("insertColor:key:atIndex:")
	public native void insertColorKeyAtIndex(NSColor color, String key, long loc);

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("removeColorWithKey:")
	public native void removeColorWithKey(String key);

	@Generated
	@Selector("removeFile")
	public native void removeFile();

	@Generated
	@Selector("setColor:forKey:")
	public native void setColorForKey(NSColor color, String key);

	@Generated
	@Selector("writeToFile:")
	public native boolean writeToFile(String path);
}
