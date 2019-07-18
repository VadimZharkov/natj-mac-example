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
public final class cssm_x509_name extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_x509_name() {
		super(cssm_x509_name.class);
	}

	@Generated
	protected cssm_x509_name(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_x509_name(
			int numberOfRDNs,
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_x509_rdn RelativeDistinguishedName) {
		super(cssm_x509_name.class);
		setNumberOfRDNs(numberOfRDNs);
		setRelativeDistinguishedName(RelativeDistinguishedName);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int numberOfRDNs();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNumberOfRDNs(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_x509_rdn RelativeDistinguishedName();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRelativeDistinguishedName(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_x509_rdn value);
}
