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
import apple.coreservices.opaque.FSFileSecurityRef;

@Generated
@Structure(alignment = 2)
public final class FSPermissionInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSPermissionInfo() {
		super(FSPermissionInfo.class);
	}

	@Generated
	protected FSPermissionInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int userID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setUserID(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int groupID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setGroupID(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte reserved1();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setReserved1(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte userAccess();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setUserAccess(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short mode();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMode(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native FSFileSecurityRef fileSec();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setFileSec(FSFileSecurityRef value);
}
