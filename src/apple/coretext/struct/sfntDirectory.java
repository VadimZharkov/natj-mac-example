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

package apple.coretext.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class sfntDirectory extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public sfntDirectory() {
		super(sfntDirectory.class);
	}

	@Generated
	protected sfntDirectory(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int format();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFormat(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short numOffsets();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNumOffsets(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short searchRange();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSearchRange(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short entrySelector();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setEntrySelector(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short rangeShift();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRangeShift(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native sfntDirectoryEntry table();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setTable(@ByValue sfntDirectoryEntry value);
}
