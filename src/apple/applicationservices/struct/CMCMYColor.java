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

package apple.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CMCMYColor extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMCMYColor() {
		super(CMCMYColor.class);
	}

	@Generated
	protected CMCMYColor(Pointer peer) {
		super(peer);
	}

	@Generated
	public CMCMYColor(short cyan, short magenta, short yellow) {
		super(CMCMYColor.class);
		setCyan(cyan);
		setMagenta(magenta);
		setYellow(yellow);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short cyan();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCyan(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short magenta();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMagenta(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short yellow();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setYellow(short value);
}
