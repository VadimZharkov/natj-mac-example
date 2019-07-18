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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRelativeSpecifier extends NSScriptObjectSpecifier {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRelativeSpecifier(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRelativeSpecifier alloc();

	@Generated
	@Selector("baseSpecifier")
	public native NSScriptObjectSpecifier baseSpecifier();

	@Generated
	@Selector("init")
	public native NSRelativeSpecifier init();

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:")
	public native NSRelativeSpecifier initWithContainerClassDescriptionContainerSpecifierKey(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:relativePosition:baseSpecifier:")
	public native NSRelativeSpecifier initWithContainerClassDescriptionContainerSpecifierKeyRelativePositionBaseSpecifier(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property, long relPos,
			NSScriptObjectSpecifier baseSpecifier);

	@Generated
	@Selector("initWithContainerSpecifier:key:")
	public native NSRelativeSpecifier initWithContainerSpecifierKey(
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("objectSpecifierWithDescriptor:")
	public static native NSScriptObjectSpecifier objectSpecifierWithDescriptor(
			NSAppleEventDescriptor descriptor);

	@Generated
	@Selector("relativePosition")
	public native long relativePosition();

	@Generated
	@Selector("setBaseSpecifier:")
	public native void setBaseSpecifier(NSScriptObjectSpecifier baseSpecifier);

	@Generated
	@Selector("setRelativePosition:")
	public native void setRelativePosition(long relPos);
}
