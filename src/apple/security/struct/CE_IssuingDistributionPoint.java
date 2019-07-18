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

package apple.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CE_IssuingDistributionPoint extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CE_IssuingDistributionPoint() {
		super(CE_IssuingDistributionPoint.class);
	}

	@Generated
	protected CE_IssuingDistributionPoint(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr distPointName();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDistPointName(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int onlyUserCertsPresent();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setOnlyUserCertsPresent(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int onlyUserCerts();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setOnlyUserCerts(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int onlyCACertsPresent();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setOnlyCACertsPresent(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int onlyCACerts();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setOnlyCACerts(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int onlySomeReasonsPresent();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setOnlySomeReasonsPresent(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native byte onlySomeReasons();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setOnlySomeReasons(byte value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int indirectCrlPresent();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setIndirectCrlPresent(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int indirectCrl();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setIndirectCrl(int value);
}
