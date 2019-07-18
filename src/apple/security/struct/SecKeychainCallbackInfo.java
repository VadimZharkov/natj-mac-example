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
import apple.security.opaque.SecKeychainItemRef;
import apple.security.opaque.SecKeychainRef;

@Generated
@Structure()
public final class SecKeychainCallbackInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public SecKeychainCallbackInfo() {
		super(SecKeychainCallbackInfo.class);
	}

	@Generated
	protected SecKeychainCallbackInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	public SecKeychainCallbackInfo(int version, SecKeychainItemRef item,
			SecKeychainRef keychain, int pid) {
		super(SecKeychainCallbackInfo.class);
		setVersion(version);
		setItem(item);
		setKeychain(keychain);
		setPid(pid);
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
	@StructureField(order = 2, isGetter = true)
	public native SecKeychainRef keychain();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setKeychain(SecKeychainRef value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int pid();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPid(int value);
}
