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
import org.moe.natj.general.ptr.FloatPtr;

@Generated
@Structure()
public final class CMFloatBitmap extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMFloatBitmap() {
		super(CMFloatBitmap.class);
	}

	@Generated
	protected CMFloatBitmap(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(long value);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 16)
	public native FloatPtr buffers(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 16)
	public native void setBuffers(FloatPtr value, int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long height();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHeight(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long width();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setWidth(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long rowStride();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRowStride(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long colStride();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setColStride(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int space();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSpace(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setFlags(int value);
}
