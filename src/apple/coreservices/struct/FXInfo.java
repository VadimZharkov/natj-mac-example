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

package apple.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class FXInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FXInfo() {
		super(FXInfo.class);
	}

	@Generated
	protected FXInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short fdIconID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFdIconID(short value);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 3)
	public native short fdReserved(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 3)
	public native void setFdReserved(short value, int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte fdScript();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFdScript(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte fdXFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFdXFlags(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short fdComment();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFdComment(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int fdPutAway();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setFdPutAway(int value);
}
