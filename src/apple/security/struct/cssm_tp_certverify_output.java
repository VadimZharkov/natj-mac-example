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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class cssm_tp_certverify_output extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_tp_certverify_output() {
		super(cssm_tp_certverify_output.class);
	}

	@Generated
	protected cssm_tp_certverify_output(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_tp_certverify_output(
			int VerifyStatus,
			int NumberOfEvidence,
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_evidence Evidence) {
		super(cssm_tp_certverify_output.class);
		setVerifyStatus(VerifyStatus);
		setNumberOfEvidence(NumberOfEvidence);
		setEvidence(Evidence);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int VerifyStatus();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVerifyStatus(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int NumberOfEvidence();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNumberOfEvidence(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_evidence Evidence();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setEvidence(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_evidence value);
}
