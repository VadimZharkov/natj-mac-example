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

package apple.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.foundation.NSError;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLConnection;
import apple.foundation.NSURLProtectionSpace;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLConnectionDelegate")
public interface NSURLConnectionDelegate {
	@Generated
	@IsOptional
	@Selector("connection:canAuthenticateAgainstProtectionSpace:")
	public boolean connectionCanAuthenticateAgainstProtectionSpace(
			NSURLConnection connection, NSURLProtectionSpace protectionSpace);

	@Generated
	@IsOptional
	@Selector("connection:didCancelAuthenticationChallenge:")
	public void connectionDidCancelAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connection:didFailWithError:")
	public void connectionDidFailWithError(NSURLConnection connection,
			NSError error);

	@Generated
	@IsOptional
	@Selector("connection:didReceiveAuthenticationChallenge:")
	public void connectionDidReceiveAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connection:willSendRequestForAuthenticationChallenge:")
	public void connectionWillSendRequestForAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connectionShouldUseCredentialStorage:")
	public boolean connectionShouldUseCredentialStorage(
			NSURLConnection connection);
}
