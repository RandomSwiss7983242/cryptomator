package org.cryptomator.filesystem.crypto;

public interface CryptoFileSystemDelegate {

	/**
	 * Reports the path for resources, that could not be decrypted due to authentication errors.
	 * 
	 * @param cleartextPath Unix-style vault-relative path
	 */
	void authenticationFailed(String cleartextPath);

	/**
	 * Allows the delegate to deactivate authentication during decryption.
	 * This bears the risk of CCAs, thus this method should only return <code>true</code> for data recovery purposes.
	 * 
	 * @param cleartextPath Unix-style vault-relative path
	 * @return Must always <b>default to <code>false</code></b>, except when authentication should be skipped.
	 */
	boolean shouldSkipAuthentication(String cleartextPath);

}
