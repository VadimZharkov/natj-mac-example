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
import apple.applicationservices.opaque.ATSUStyle;

@Generated
@Structure(alignment = 2)
public final class ATSUGlyphInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSUGlyphInfo() {
		super(ATSUGlyphInfo.class);
	}

	@Generated
	protected ATSUGlyphInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short glyphID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setGlyphID(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short reserved();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReserved(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int layoutFlags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLayoutFlags(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long charIndex();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCharIndex(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native ATSUStyle style();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setStyle(ATSUStyle value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native float deltaY();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDeltaY(float value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native float idealX();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setIdealX(float value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short screenX();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setScreenX(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short caretX();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCaretX(short value);
}
