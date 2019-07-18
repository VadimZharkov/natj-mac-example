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

package apple.corefoundation.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CFRunLoopSourceContext extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CFRunLoopSourceContext() {
		super(CFRunLoopSourceContext.class);
	}

	@Generated
	protected CFRunLoopSourceContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr info();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setInfo(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRetain(
			@FunctionPtr(name = "call_retain") Function_retain value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_retain {
		@Generated
		public ConstVoidPtr call_retain(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRelease(
			@FunctionPtr(name = "call_release") Function_release value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_release {
		@Generated
		public void call_release(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCopyDescription(
			@FunctionPtr(name = "call_copyDescription") Function_copyDescription value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_copyDescription {
		@Generated
		public VoidPtr call_copyDescription(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setEqual(
			@FunctionPtr(name = "call_equal") Function_equal value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_equal {
		@Generated
		public byte call_equal(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setHash(
			@FunctionPtr(name = "call_hash") Function_hash value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_hash {
		@Generated
		public long call_hash(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSchedule(
			@FunctionPtr(name = "call_schedule") Function_schedule value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_schedule {
		@Generated
		public void call_schedule(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCancel(
			@FunctionPtr(name = "call_cancel") Function_cancel value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_cancel {
		@Generated
		public void call_cancel(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setPerform(
			@FunctionPtr(name = "call_perform") Function_perform value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_perform {
		@Generated
		public void call_perform(VoidPtr arg0);
	}
}
