package com.automation;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "projectNames_provider")
	public static Object[][] dataProviderMethod()
	{
		return new Object[][] {
				{0, "Wikimedia Commons"},
				{1, "MediaWiki"},
				{2, "Meta-Wiki"},
				{3, "Wikiespecies"},
				{4, "Wikilibros"},
				{5, "Wikidata"},
				{6, "Wikimanía"},
				{7, "Wikinoticias"},
				{8, "Wikiquote"},
				{9, "Wikisource"},
				{10, "Wikiversidad"},
				{11, "Wikiviajes"},
				{12, "Wikcionario"}};
	}

}
