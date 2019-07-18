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


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import apple.struct.HFSUniStr255;

@Generated
@Structure(alignment = 2)
public final class FSForkCBInfoParam extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSForkCBInfoParam() {
		super(FSForkCBInfoParam.class);
	}

	@Generated
	protected FSForkCBInfoParam(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native QElem qLink();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setQLink(
			@UncertainArgument("Options: reference, array Fallback: reference") QElem value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short qType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setQType(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short ioTrap();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setIoTrap(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native BytePtr ioCmdAddr();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIoCmdAddr(BytePtr value);

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setIoCompletion(
			@FunctionPtr(name = "call_ioCompletion") Function_ioCompletion value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ioCompletion {
		@Generated
		public void call_ioCompletion(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short ioResult();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setIoResult(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int desiredRefNum();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDesiredRefNum(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short volumeRefNum();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setVolumeRefNum(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int iterator();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setIterator(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short actualRefNum();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setActualRefNum(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSRef ref();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setRef(
			@UncertainArgument("Options: reference, array Fallback: reference") FSRef value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSForkInfo forkInfo();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setForkInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") FSForkInfo value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native HFSUniStr255 forkName();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setForkName(
			@UncertainArgument("Options: reference, array Fallback: reference") HFSUniStr255 value);
}
