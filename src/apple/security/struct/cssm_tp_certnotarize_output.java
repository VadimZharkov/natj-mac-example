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
public final class cssm_tp_certnotarize_output extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_tp_certnotarize_output() {
		super(cssm_tp_certnotarize_output.class);
	}

	@Generated
	protected cssm_tp_certnotarize_output(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_tp_certnotarize_output(int NotarizeStatus,
			VoidPtr NotarizedCertGroup, int PerformedServiceRequests) {
		super(cssm_tp_certnotarize_output.class);
		setNotarizeStatus(NotarizeStatus);
		setNotarizedCertGroup(NotarizedCertGroup);
		setPerformedServiceRequests(PerformedServiceRequests);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int NotarizeStatus();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNotarizeStatus(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr NotarizedCertGroup();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNotarizedCertGroup(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int PerformedServiceRequests();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPerformedServiceRequests(int value);
}
