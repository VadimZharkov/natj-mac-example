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

package apple.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class PhonemeInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PhonemeInfo() {
		super(PhonemeInfo.class);
	}

	@Generated
	protected PhonemeInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short opcode();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setOpcode(short value);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 16)
	public native byte phStr(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 16)
	public native void setPhStr(byte value, int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 32)
	public native byte exampleStr(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 32)
	public native void setExampleStr(byte value, int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short hiliteStart();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setHiliteStart(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short hiliteEnd();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setHiliteEnd(short value);
}
