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


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSInvocationOperation extends NSOperation {
	static {
		NatJ.register();
	}

	@Generated
	protected NSInvocationOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSInvocationOperation alloc();

	@Generated
	@Selector("init")
	public native NSInvocationOperation init();

	@Generated
	@Selector("initWithInvocation:")
	public native NSInvocationOperation initWithInvocation(NSInvocation inv);

	@Generated
	@Selector("initWithTarget:selector:object:")
	public native NSInvocationOperation initWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object target, SEL sel,
			@Mapped(ObjCObjectMapper.class) Object arg);

	@Generated
	@Selector("invocation")
	public native NSInvocation invocation();

	@Generated
	@Selector("result")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object result();
}
