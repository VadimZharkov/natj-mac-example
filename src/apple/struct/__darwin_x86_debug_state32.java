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

package apple.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_x86_debug_state32 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_x86_debug_state32() {
		super(__darwin_x86_debug_state32.class);
	}

	@Generated
	protected __darwin_x86_debug_state32(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int __dr0();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__dr0(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int __dr1();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__dr1(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int __dr2();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__dr2(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int __dr3();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void set__dr3(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int __dr4();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void set__dr4(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int __dr5();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void set__dr5(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int __dr6();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void set__dr6(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int __dr7();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void set__dr7(int value);
}
