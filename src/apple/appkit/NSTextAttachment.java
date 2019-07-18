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
import apple.foundation.NSCoder;
import apple.foundation.NSFileWrapper;
import apple.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextAttachment extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextAttachment(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextAttachment alloc();

	@Generated
	@Selector("attachmentCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object attachmentCell();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fileWrapper")
	public native NSFileWrapper fileWrapper();

	@Generated
	@Selector("init")
	public native NSTextAttachment init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFileWrapper:")
	public native NSTextAttachment initWithFileWrapper(NSFileWrapper fileWrapper);

	@Generated
	@Selector("setAttachmentCell:")
	public native void setAttachmentCell(
			@Mapped(ObjCObjectMapper.class) Object cell);

	@Generated
	@Selector("setFileWrapper:")
	public native void setFileWrapper(NSFileWrapper fileWrapper);
}
