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

package apple.sys.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class _opaque_pthread_t extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public _opaque_pthread_t() {
		super(_opaque_pthread_t.class);
	}

	@Generated
	protected _opaque_pthread_t(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long __sig();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__sig(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native __darwin_pthread_handler_rec __cleanup_stack();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__cleanup_stack(
			@UncertainArgument("Options: reference, array Fallback: reference") __darwin_pthread_handler_rec value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 1168)
	public native byte __opaque(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 1168)
	public native void set__opaque(byte value, int field_idx);
}
