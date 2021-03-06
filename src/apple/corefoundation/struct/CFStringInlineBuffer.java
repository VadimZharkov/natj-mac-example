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

package apple.corefoundation.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstCharPtr;
import apple.corefoundation.opaque.CFStringRef;

@Generated
@Structure()
public final class CFStringInlineBuffer extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CFStringInlineBuffer() {
		super(CFStringInlineBuffer.class);
	}

	@Generated
	protected CFStringInlineBuffer(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 64)
	public native char buffer(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 64)
	public native void setBuffer(char value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native CFStringRef theString();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTheString(CFStringRef value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native ConstCharPtr directUniCharBuffer();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDirectUniCharBuffer(ConstCharPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String directCStringBuffer();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDirectCStringBuffer(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native CFRange rangeToBuffer();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRangeToBuffer(@ByValue CFRange value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long bufferedRangeStart();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setBufferedRangeStart(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long bufferedRangeEnd();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setBufferedRangeEnd(long value);
}
