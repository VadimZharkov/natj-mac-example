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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSocketPortNameServer extends NSPortNameServer {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSocketPortNameServer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSocketPortNameServer alloc();

	@Generated
	@Selector("defaultNameServerPortNumber")
	public native short defaultNameServerPortNumber();

	@Generated
	@Selector("init")
	public native NSSocketPortNameServer init();

	@Generated
	@Selector("portForName:")
	public native NSPort portForName(String name);

	@Generated
	@Selector("portForName:host:")
	public native NSPort portForNameHost(String name, String host);

	@Generated
	@Selector("portForName:host:nameServerPortNumber:")
	public native NSPort portForNameHostNameServerPortNumber(String name,
			String host, short portNumber);

	@Generated
	@Selector("registerPort:name:")
	public native boolean registerPortName(NSPort port, String name);

	@Generated
	@Selector("registerPort:name:nameServerPortNumber:")
	public native boolean registerPortNameNameServerPortNumber(NSPort port,
			String name, short portNumber);

	@Generated
	@Selector("removePortForName:")
	public native boolean removePortForName(String name);

	@Generated
	@Selector("setDefaultNameServerPortNumber:")
	public native void setDefaultNameServerPortNumber(short portNumber);

	@Generated
	@Selector("sharedInstance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedInstance();
}
