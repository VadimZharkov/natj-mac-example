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

@Generated
@Structure()
public final class cssm_sample extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_sample() {
		super(cssm_sample.class);
	}

	@Generated
	protected cssm_sample(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_sample(
			@ByValue cssm_list TypedSample,
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_subservice_uid Verifier) {
		super(cssm_sample.class);
		setTypedSample(TypedSample);
		setVerifier(Verifier);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_list TypedSample();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTypedSample(@ByValue cssm_list value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_subservice_uid Verifier();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVerifier(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_subservice_uid value);
}
