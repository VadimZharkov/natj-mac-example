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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNetServiceBrowser extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNetServiceBrowser(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNetServiceBrowser alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("includesPeerToPeer")
	public native boolean includesPeerToPeer();

	@Generated
	@Selector("init")
	public native NSNetServiceBrowser init();

	@Generated
	@Selector("removeFromRunLoop:forMode:")
	public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("scheduleInRunLoop:forMode:")
	public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("searchForAllDomains")
	public native void searchForAllDomains();

	@Generated
	@Selector("searchForBrowsableDomains")
	public native void searchForBrowsableDomains();

	@Generated
	@Selector("searchForRegistrationDomains")
	public native void searchForRegistrationDomains();

	@Generated
	@Selector("searchForServicesOfType:inDomain:")
	public native void searchForServicesOfTypeInDomain(String type,
			String domainString);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setIncludesPeerToPeer:")
	public native void setIncludesPeerToPeer(boolean value);

	@Generated
	@Selector("stop")
	public native void stop();
}
