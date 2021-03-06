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
@Structure(alignment = 2)
public final class HFSExtentKey extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public HFSExtentKey() {
		super(HFSExtentKey.class);
	}

	@Generated
	protected HFSExtentKey(Pointer peer) {
		super(peer);
	}

	@Generated
	public HFSExtentKey(byte keyLength, byte forkType, int fileID,
			short startBlock) {
		super(HFSExtentKey.class);
		setKeyLength(keyLength);
		setForkType(forkType);
		setFileID(fileID);
		setStartBlock(startBlock);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native byte keyLength();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setKeyLength(byte value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte forkType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setForkType(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int fileID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFileID(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short startBlock();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setStartBlock(short value);
}
