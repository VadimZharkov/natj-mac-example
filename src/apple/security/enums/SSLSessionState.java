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

package apple.security.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class SSLSessionState {
	@Generated
	private SSLSessionState() {
	}

	@Generated
	public static final int kSSLIdle = 0x00000000;
	@Generated
	public static final int kSSLHandshake = 0x00000001;
	@Generated
	public static final int kSSLConnected = 0x00000002;
	@Generated
	public static final int kSSLClosed = 0x00000003;
	@Generated
	public static final int kSSLAborted = 0x00000004;
}
