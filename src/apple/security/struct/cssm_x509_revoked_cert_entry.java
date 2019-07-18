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

@Generated
@Structure()
public final class cssm_x509_revoked_cert_entry extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_x509_revoked_cert_entry() {
		super(cssm_x509_revoked_cert_entry.class);
	}

	@Generated
	protected cssm_x509_revoked_cert_entry(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_x509_revoked_cert_entry(
			@ByValue cssm_data certificateSerialNumber,
			@ByValue cssm_x509_time revocationDate,
			@ByValue cssm_x509_extensions extensions) {
		super(cssm_x509_revoked_cert_entry.class);
		setCertificateSerialNumber(certificateSerialNumber);
		setRevocationDate(revocationDate);
		setExtensions(extensions);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_data certificateSerialNumber();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCertificateSerialNumber(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_x509_time revocationDate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRevocationDate(@ByValue cssm_x509_time value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_x509_extensions extensions();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setExtensions(@ByValue cssm_x509_extensions value);
}
