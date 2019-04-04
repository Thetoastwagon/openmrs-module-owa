/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0 + Health disclaimer. If a copy of the MPL was not distributed with
 * this file, You can obtain one at http://license.openmrs.org
 */
package org.openmrs.module.owa.utils;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This class contains utility methods that support various actions that affect OWAs
 * for example OWA installation
 */
public class OwaUtils {
	/**
	 * Removes the version number from the file name of the OWA and adds .zip file extension
	 *
	 * @param passedFileName File name of owa that may contain owa version number
	 * @return the file name of the owa with the version number removed and .zip extension
	 */
	public static String removeVersionNumber(String passedFileName) {
		String fileName = getStrippedFileName(passedFileName);
		if (fileName != null && !fileName.contains(".zip")) {
			fileName += ".zip";
		}
		return fileName;
	}

	/**
	 * Removes the version number from the file name of the OWA
	 *
	 * @param passedFileName File name of owa that may contain owa version number
	 * @return the file name of the owa with the version number removed
	 */
	public static String getStrippedFileName(String passedFileName) {
		String[] tokens = passedFileName.split("((-|[_])+[0-9])|[\\s]");
		String fileName = tokens[0];
		return fileName;
	}

}
