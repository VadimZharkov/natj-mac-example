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

package apple.foundation;


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSConstantString extends NSSimpleCString {
	static {
		NatJ.register();
	}

	@Generated
	protected NSConstantString(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSConstantString alloc();

	@Generated
	@Selector("init")
	public native NSConstantString init();

	@Generated
	@Selector("initWithBytes:length:encoding:")
	public native NSConstantString initWithBytesLengthEncoding(
			ConstVoidPtr bytes, long len, long encoding);

	@Generated
	@Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
	public native NSConstantString initWithBytesNoCopyLengthEncodingFreeWhenDone(
			VoidPtr bytes, long len, long encoding, boolean freeBuffer);

	@Generated
	@Selector("initWithCString:")
	public native NSConstantString initWithCString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);

	@Generated
	@Selector("initWithCString:encoding:")
	public native NSConstantString initWithCStringEncoding(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString,
			long encoding);

	@Generated
	@Selector("initWithCString:length:")
	public native NSConstantString initWithCStringLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes,
			long length);

	@Generated
	@Selector("initWithCStringNoCopy:length:freeWhenDone:")
	public native NSConstantString initWithCStringNoCopyLengthFreeWhenDone(
			BytePtr bytes, long length, boolean freeBuffer);

	@Generated
	@Selector("initWithCharacters:length:")
	public native NSConstantString initWithCharactersLength(
			ConstCharPtr characters, long length);

	@Generated
	@Selector("initWithCharactersNoCopy:length:freeWhenDone:")
	public native NSConstantString initWithCharactersNoCopyLengthFreeWhenDone(
			CharPtr characters, long length, boolean freeBuffer);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSConstantString initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:encoding:error:")
	public native NSConstantString initWithContentsOfFileEncodingError(
			String path, long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfFile:usedEncoding:error:")
	public native NSConstantString initWithContentsOfFileUsedEncodingError(
			String path, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSConstantString initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:encoding:error:")
	public native NSConstantString initWithContentsOfURLEncodingError(
			NSURL url, long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:usedEncoding:error:")
	public native NSConstantString initWithContentsOfURLUsedEncodingError(
			NSURL url, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithData:encoding:")
	public native NSConstantString initWithDataEncoding(NSData data,
			long encoding);

	@Generated
	@Selector("initWithString:")
	public native NSConstantString initWithString(String aString);

	@Generated
	@Selector("initWithUTF8String:")
	public native NSConstantString initWithUTF8String(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString);

	@Generated
	@Selector("string")
	public static native NSConstantString string();

	@Generated
	@Selector("stringWithCString:")
	public static native NSConstantString stringWithCString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);

	@Generated
	@Selector("stringWithCString:encoding:")
	public static native NSConstantString stringWithCStringEncoding(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String cString,
			long enc);

	@Generated
	@Selector("stringWithCString:length:")
	public static native NSConstantString stringWithCStringLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes,
			long length);

	@Generated
	@Selector("stringWithCharacters:length:")
	public static native NSConstantString stringWithCharactersLength(
			ConstCharPtr characters, long length);

	@Generated
	@Selector("stringWithContentsOfFile:")
	public static native NSConstantString stringWithContentsOfFile(String path);

	@Generated
	@Selector("stringWithContentsOfFile:encoding:error:")
	public static native NSConstantString stringWithContentsOfFileEncodingError(
			String path, long enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfFile:usedEncoding:error:")
	public static native NSConstantString stringWithContentsOfFileUsedEncodingError(
			String path, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:")
	public static native NSConstantString stringWithContentsOfURL(NSURL url);

	@Generated
	@Selector("stringWithContentsOfURL:encoding:error:")
	public static native NSConstantString stringWithContentsOfURLEncodingError(
			NSURL url, long enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:usedEncoding:error:")
	public static native NSConstantString stringWithContentsOfURLUsedEncodingError(
			NSURL url, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithString:")
	public static native NSConstantString stringWithString(String string);

	@Generated
	@Selector("stringWithUTF8String:")
	public static native NSConstantString stringWithUTF8String(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString);
}
