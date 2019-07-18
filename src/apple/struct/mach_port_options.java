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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_port_options extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public mach_port_options() {
		super(mach_port_options.class);
	}

	@Generated
	protected mach_port_options(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native mach_port_limits mpl();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMpl(@ByValue mach_port_limits value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 2)
	public native long reserved(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 2)
	public native void setReserved(long value, int field_idx);
}
