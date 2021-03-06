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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_db_record_index_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_db_record_index_info() {
		super(cssm_db_record_index_info.class);
	}

	@Generated
	protected cssm_db_record_index_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_db_record_index_info(int DataRecordType, int NumberOfIndexes,
			VoidPtr IndexInfo) {
		super(cssm_db_record_index_info.class);
		setDataRecordType(DataRecordType);
		setNumberOfIndexes(NumberOfIndexes);
		setIndexInfo(IndexInfo);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int DataRecordType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDataRecordType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int NumberOfIndexes();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNumberOfIndexes(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr IndexInfo();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setIndexInfo(VoidPtr value);
}
