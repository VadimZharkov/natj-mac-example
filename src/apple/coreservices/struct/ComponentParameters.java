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
public final class ComponentParameters extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ComponentParameters() {
		super(ComponentParameters.class);
	}

	@Generated
	protected ComponentParameters(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native byte flags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFlags(byte value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte paramSize();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setParamSize(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short what();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setWhat(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int padding();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPadding(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long params();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setParams(long value);
}
