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

package apple.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class mach_port_guard_exception_codes {
	@Generated
	private mach_port_guard_exception_codes() {
	}

	@Generated
	public static final int kGUARD_EXC_DESTROY = 0x00000001;
	@Generated
	public static final int kGUARD_EXC_MOD_REFS = 0x00000002;
	@Generated
	public static final int kGUARD_EXC_SET_CONTEXT = 0x00000004;
	@Generated
	public static final int kGUARD_EXC_UNGUARDED = 0x00000008;
	@Generated
	public static final int kGUARD_EXC_INCORRECT_GUARD = 0x00000010;
}
