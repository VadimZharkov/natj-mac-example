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

package apple.iokit.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class IOServiceInterestContent64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IOServiceInterestContent64() {
		super(IOServiceInterestContent64.class);
	}

	@Generated
	protected IOServiceInterestContent64(Pointer peer) {
		super(peer);
	}

	@Generated
	public IOServiceInterestContent64(int messageType, long messageArgument) {
		super(IOServiceInterestContent64.class);
		setMessageType(messageType);
		setMessageArgument(messageArgument);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int messageType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMessageType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long messageArgument();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMessageArgument(long value);
}
