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

@Generated
@Structure(alignment = 2)
public final class ScriptCodeRun extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ScriptCodeRun() {
		super(ScriptCodeRun.class);
	}

	@Generated
	protected ScriptCodeRun(Pointer peer) {
		super(peer);
	}

	@Generated
	public ScriptCodeRun(long offset, short script) {
		super(ScriptCodeRun.class);
		setOffset(offset);
		setScript(script);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long offset();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setOffset(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short script();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setScript(short value);
}
