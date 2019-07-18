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
@Structure(alignment = 4)
public final class mach_vm_read_entry extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public mach_vm_read_entry() {
		super(mach_vm_read_entry.class);
	}

	@Generated
	protected mach_vm_read_entry(Pointer peer) {
		super(peer);
	}

	@Generated
	public mach_vm_read_entry(long address, long size) {
		super(mach_vm_read_entry.class);
		setAddress(address);
		setSize(size);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long address();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAddress(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long size();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSize(long value);
}
