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
@Structure()
public final class MortLigatureSubtable extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MortLigatureSubtable() {
		super(MortLigatureSubtable.class);
	}

	@Generated
	protected MortLigatureSubtable(Pointer peer) {
		super(peer);
	}

	@Generated
	public MortLigatureSubtable(@ByValue STHeader header,
			short ligatureActionTableOffset, short componentTableOffset,
			short ligatureTableOffset) {
		super(MortLigatureSubtable.class);
		setHeader(header);
		setLigatureActionTableOffset(ligatureActionTableOffset);
		setComponentTableOffset(componentTableOffset);
		setLigatureTableOffset(ligatureTableOffset);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native STHeader header();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setHeader(@ByValue STHeader value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short ligatureActionTableOffset();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setLigatureActionTableOffset(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short componentTableOffset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setComponentTableOffset(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short ligatureTableOffset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLigatureTableOffset(short value);
}
