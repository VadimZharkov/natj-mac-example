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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class LAMorphemesArray extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public LAMorphemesArray() {
		super(LAMorphemesArray.class);
	}

	@Generated
	protected LAMorphemesArray(Pointer peer) {
		super(peer);
	}

	@Generated
	public LAMorphemesArray(long morphemesCount, int processedTextLength,
			int morphemesTextLength, @ByValue LAMorphemeRec morphemes) {
		super(LAMorphemesArray.class);
		setMorphemesCount(morphemesCount);
		setProcessedTextLength(processedTextLength);
		setMorphemesTextLength(morphemesTextLength);
		setMorphemes(morphemes);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long morphemesCount();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMorphemesCount(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int processedTextLength();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setProcessedTextLength(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int morphemesTextLength();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMorphemesTextLength(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native LAMorphemeRec morphemes();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMorphemes(@ByValue LAMorphemeRec value);
}
