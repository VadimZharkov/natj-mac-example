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
import apple.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDraggingImageComponent extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDraggingImageComponent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDraggingImageComponent alloc();

	@Generated
	@Selector("contents")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object contents();

	@Generated
	@Selector("draggingImageComponentWithKey:")
	public static native NSDraggingImageComponent draggingImageComponentWithKey(
			String key);

	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	@Generated
	@Selector("init")
	public native NSDraggingImageComponent init();

	@Generated
	@Selector("initWithKey:")
	public native NSDraggingImageComponent initWithKey(String key);

	@Generated
	@Selector("key")
	public native String key();

	@Generated
	@Selector("setContents:")
	public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setFrame:")
	public native void setFrame(@ByValue CGRect value);

	@Generated
	@Selector("setKey:")
	public native void setKey(String value);
}
