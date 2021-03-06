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
public final class auditpinfo_addr extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public auditpinfo_addr() {
		super(auditpinfo_addr.class);
	}

	@Generated
	protected auditpinfo_addr(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int ap_pid();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAp_pid(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ap_auid();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAp_auid(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native au_mask ap_mask();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAp_mask(@ByValue au_mask value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native au_tid_addr ap_termid();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAp_termid(@ByValue au_tid_addr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int ap_asid();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAp_asid(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long ap_flags();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setAp_flags(long value);
}
