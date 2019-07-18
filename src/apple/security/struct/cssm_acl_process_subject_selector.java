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
public final class cssm_acl_process_subject_selector extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_acl_process_subject_selector() {
		super(cssm_acl_process_subject_selector.class);
	}

	@Generated
	protected cssm_acl_process_subject_selector(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_acl_process_subject_selector(short version, short mask,
			int uid, int gid) {
		super(cssm_acl_process_subject_selector.class);
		setVersion(version);
		setMask(mask);
		setUid(uid);
		setGid(gid);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short mask();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMask(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int uid();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setUid(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int gid();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setGid(int value);
}
