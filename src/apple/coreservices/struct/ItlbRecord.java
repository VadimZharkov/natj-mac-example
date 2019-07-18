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
@Structure()
public final class ItlbRecord extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ItlbRecord() {
		super(ItlbRecord.class);
	}

	@Generated
	protected ItlbRecord(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short itlbNumber();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setItlbNumber(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short itlbDate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setItlbDate(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short itlbSort();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setItlbSort(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short itlbFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setItlbFlags(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short itlbToken();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setItlbToken(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short itlbEncoding();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setItlbEncoding(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short itlbLang();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setItlbLang(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte itlbNumRep();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setItlbNumRep(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte itlbDateRep();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setItlbDateRep(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short itlbKeys();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setItlbKeys(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short itlbIcon();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setItlbIcon(short value);
}
