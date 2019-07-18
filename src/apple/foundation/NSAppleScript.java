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

package apple.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;
import apple.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAppleScript extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAppleScript(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAppleScript alloc();

	@Generated
	@Selector("compileAndReturnError:")
	public native boolean compileAndReturnError(Ptr<NSDictionary> errorInfo);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("executeAndReturnError:")
	public native NSAppleEventDescriptor executeAndReturnError(
			Ptr<NSDictionary> errorInfo);

	@Generated
	@Selector("executeAppleEvent:error:")
	public native NSAppleEventDescriptor executeAppleEventError(
			NSAppleEventDescriptor event, Ptr<NSDictionary> errorInfo);

	@Generated
	@Selector("init")
	public native NSAppleScript init();

	@Generated
	@Selector("initWithContentsOfURL:error:")
	public native NSAppleScript initWithContentsOfURLError(NSURL url,
			Ptr<NSDictionary> errorInfo);

	@Generated
	@Selector("initWithSource:")
	public native NSAppleScript initWithSource(String source);

	@Generated
	@Selector("isCompiled")
	public native boolean isCompiled();

	@Generated
	@Selector("source")
	public native String source();

	@Generated
	@Selector("richTextSource")
	public native NSAttributedString richTextSource();
}
