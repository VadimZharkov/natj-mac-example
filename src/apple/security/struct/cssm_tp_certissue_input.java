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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_tp_certissue_input extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_tp_certissue_input() {
		super(cssm_tp_certissue_input.class);
	}

	@Generated
	protected cssm_tp_certissue_input(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_subservice_uid CSPSubserviceUid();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCSPSubserviceUid(@ByValue cssm_subservice_uid value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long CLHandle();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCLHandle(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int NumberOfTemplateFields();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNumberOfTemplateFields(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_field SubjectCertFields();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSubjectCertFields(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_field value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int MoreServiceRequests();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMoreServiceRequests(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int NumberOfServiceControls();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNumberOfServiceControls(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_field ServiceControls();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setServiceControls(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_field value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native VoidPtr UserCredentials();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setUserCredentials(VoidPtr value);
}
