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
public final class cssm_version extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_version() {
		super(cssm_version.class);
	}

	@Generated
	protected cssm_version(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_version(int Major, int Minor) {
		super(cssm_version.class);
		setMajor(Major);
		setMinor(Minor);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int Major();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMajor(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int Minor();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMinor(int value);
}
