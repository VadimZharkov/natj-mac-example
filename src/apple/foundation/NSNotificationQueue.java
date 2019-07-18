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
import apple.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNotificationQueue extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNotificationQueue(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNotificationQueue alloc();

	@Generated
	@Selector("defaultQueue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultQueue();

	@Generated
	@Selector("dequeueNotificationsMatching:coalesceMask:")
	public native void dequeueNotificationsMatchingCoalesceMask(
			NSNotification notification, long coalesceMask);

	@Generated
	@Selector("enqueueNotification:postingStyle:")
	public native void enqueueNotificationPostingStyle(
			NSNotification notification, long postingStyle);

	@Generated
	@Selector("enqueueNotification:postingStyle:coalesceMask:forModes:")
	public native void enqueueNotificationPostingStyleCoalesceMaskForModes(
			NSNotification notification, long postingStyle, long coalesceMask,
			NSArray modes);

	@Generated
	@Selector("init")
	public native NSNotificationQueue init();

	@Generated
	@Selector("initWithNotificationCenter:")
	public native NSNotificationQueue initWithNotificationCenter(
			NSNotificationCenter notificationCenter);
}
