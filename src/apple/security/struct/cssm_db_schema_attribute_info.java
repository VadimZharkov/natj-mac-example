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
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class cssm_db_schema_attribute_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_db_schema_attribute_info() {
		super(cssm_db_schema_attribute_info.class);
	}

	@Generated
	protected cssm_db_schema_attribute_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_db_schema_attribute_info(int AttributeId,
			BytePtr AttributeName, @ByValue cssm_data AttributeNameID,
			int DataType) {
		super(cssm_db_schema_attribute_info.class);
		setAttributeId(AttributeId);
		setAttributeName(AttributeName);
		setAttributeNameID(AttributeNameID);
		setDataType(DataType);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int AttributeId();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAttributeId(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native BytePtr AttributeName();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAttributeName(BytePtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_data AttributeNameID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAttributeNameID(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int DataType();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDataType(int value);
}
