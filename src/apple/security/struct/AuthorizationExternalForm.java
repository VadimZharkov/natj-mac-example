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

@Generated
@Structure()
public final class AuthorizationExternalForm extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AuthorizationExternalForm() {
		super(AuthorizationExternalForm.class);
	}

	@Generated
	protected AuthorizationExternalForm(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 32)
	public native byte bytes(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 32)
	public native void setBytes(byte value, int field_idx);
}
