package org.openmrs.module.owa.utils;

import org.junit.Assert;
import org.junit.Test;

public class OwaUtilsTest {

	@Test
	public void testGetFileNameWithNoQueryString() {
		String testString = "https://dl.bintray.com/openmrs/owa/cohortbuilder-1.0.0-beta.zip";
		String fileName = OwaUtils.getFileName(testString);
		Assert.assertEquals(fileName, "cohortbuilder.zip");
	}

	@Test
	public void testGetFileNameWithQueryString() {
		String testString = "https://bintray.com/openmrs/owa/download_file?file_path=cohortbuilder-1.0.0-beta.zip";
		String fileName = OwaUtils.getFileName(testString);
		Assert.assertEquals(fileName, "cohortbuilder.zip");
	}

	@Test
	public void testRemoveVersionNumberStandard() {
		String testString = "cohortbuilder-1.0.0.zip";
		String fileName = OwaUtils.removeVersionNumber(testString);
		Assert.assertEquals(fileName, "cohortbuilder.zip");
	}

	@Test
	public void testRemoveVersionNumberBeta() {
		String testString = "cohortbuilder-1.0.0-beta.zip";
		String fileName = OwaUtils.removeVersionNumber(testString);
		Assert.assertEquals(fileName, "cohortbuilder.zip");
	}

	@Test
	public void testGetStrippedFileNameStandard() {
		String testString = "cohortbuilder-1.0.0.zip";
		String fileName = OwaUtils.getStrippedFileName(testString);
		Assert.assertEquals(fileName, "cohortbuilder");
	}

	@Test
	public void testGetStrippedFileNameBeta() {
		String testString = "cohortbuilder-1.0.0-beta.zip";
		String fileName = OwaUtils.getStrippedFileName(testString);
		Assert.assertEquals(fileName, "cohortbuilder");
	}

}
