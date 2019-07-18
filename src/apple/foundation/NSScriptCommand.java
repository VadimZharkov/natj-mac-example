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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;
import apple.foundation.protocol.NSCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScriptCommand extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScriptCommand(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScriptCommand alloc();

	@Generated
	@Selector("appleEvent")
	public native NSAppleEventDescriptor appleEvent();

	@Generated
	@Selector("arguments")
	public native NSDictionary arguments();

	@Generated
	@Selector("commandDescription")
	public native NSScriptCommandDescription commandDescription();

	@Generated
	@Selector("currentCommand")
	public static native NSScriptCommand currentCommand();

	@Generated
	@Selector("directParameter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object directParameter();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("evaluatedArguments")
	public native NSDictionary evaluatedArguments();

	@Generated
	@Selector("evaluatedReceivers")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object evaluatedReceivers();

	@Generated
	@Selector("executeCommand")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object executeCommand();

	@Generated
	@Selector("init")
	public native NSScriptCommand init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithCommandDescription:")
	public native NSScriptCommand initWithCommandDescription(
			NSScriptCommandDescription commandDef);

	@Generated
	@Selector("isWellFormed")
	public native boolean isWellFormed();

	@Generated
	@Selector("performDefaultImplementation")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performDefaultImplementation();

	@Generated
	@Selector("receiversSpecifier")
	public native NSScriptObjectSpecifier receiversSpecifier();

	@Generated
	@Selector("resumeExecutionWithResult:")
	public native void resumeExecutionWithResult(
			@Mapped(ObjCObjectMapper.class) Object result);

	@Generated
	@Selector("scriptErrorExpectedTypeDescriptor")
	public native NSAppleEventDescriptor scriptErrorExpectedTypeDescriptor();

	@Generated
	@Selector("scriptErrorNumber")
	public native int scriptErrorNumber();

	@Generated
	@Selector("scriptErrorOffendingObjectDescriptor")
	public native NSAppleEventDescriptor scriptErrorOffendingObjectDescriptor();

	@Generated
	@Selector("scriptErrorString")
	public native String scriptErrorString();

	@Generated
	@Selector("setArguments:")
	public native void setArguments(NSDictionary args);

	@Generated
	@Selector("setDirectParameter:")
	public native void setDirectParameter(
			@Mapped(ObjCObjectMapper.class) Object directParameter);

	@Generated
	@Selector("setReceiversSpecifier:")
	public native void setReceiversSpecifier(
			NSScriptObjectSpecifier receiversRef);

	@Generated
	@Selector("setScriptErrorExpectedTypeDescriptor:")
	public native void setScriptErrorExpectedTypeDescriptor(
			NSAppleEventDescriptor errorExpectedTypeDescriptor);

	@Generated
	@Selector("setScriptErrorNumber:")
	public native void setScriptErrorNumber(int errorNumber);

	@Generated
	@Selector("setScriptErrorOffendingObjectDescriptor:")
	public native void setScriptErrorOffendingObjectDescriptor(
			NSAppleEventDescriptor errorOffendingObjectDescriptor);

	@Generated
	@Selector("setScriptErrorString:")
	public native void setScriptErrorString(String errorString);

	@Generated
	@Selector("suspendExecution")
	public native void suspendExecution();
}
