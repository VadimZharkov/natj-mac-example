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

package apple.security.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_crypto_data extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_crypto_data() {
		super(cssm_crypto_data.class);
	}

	@Generated
	protected cssm_crypto_data(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_data Param();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setParam(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCallback(
			@FunctionPtr(name = "call_Callback") Function_Callback value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_Callback {
		@Generated
		public int call_Callback(
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg0,
				VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr CallerCtx();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCallerCtx(VoidPtr value);
}
