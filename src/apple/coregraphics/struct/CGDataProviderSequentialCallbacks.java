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

package apple.coregraphics.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CGDataProviderSequentialCallbacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CGDataProviderSequentialCallbacks() {
		super(CGDataProviderSequentialCallbacks.class);
	}

	@Generated
	protected CGDataProviderSequentialCallbacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setGetBytes(
			@FunctionPtr(name = "call_getBytes") Function_getBytes value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_getBytes {
		@Generated
		public long call_getBytes(VoidPtr arg0, VoidPtr arg1, long arg2);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSkipForward(
			@FunctionPtr(name = "call_skipForward") Function_skipForward value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_skipForward {
		@Generated
		public long call_skipForward(VoidPtr arg0, long arg1);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRewind(
			@FunctionPtr(name = "call_rewind") Function_rewind value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_rewind {
		@Generated
		public void call_rewind(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setReleaseInfo(
			@FunctionPtr(name = "call_releaseInfo") Function_releaseInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_releaseInfo {
		@Generated
		public void call_releaseInfo(VoidPtr arg0);
	}
}
