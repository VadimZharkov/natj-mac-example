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
import apple.security.opaque.SecKeychainItemRef;
import apple.security.opaque.SecKeychainRef;

@Generated
@Structure(alignment = 2)
public final class KCCallbackInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public KCCallbackInfo() {
		super(KCCallbackInfo.class);
	}

	@Generated
	protected KCCallbackInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native SecKeychainItemRef item();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setItem(SecKeychainItemRef value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 2)
	public native int processID(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 2)
	public native void setProcessID(int value, int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 4)
	public native int event(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 4)
	public native void setEvent(int value, int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native SecKeychainRef keychain();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setKeychain(SecKeychainRef value);
}
