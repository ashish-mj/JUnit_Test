package com.rakuten.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.rakuten.test")
//@SelectPackages({"com.rakuten","com.rakuten.test1"})
@IncludeTags({"Prod"})
public class TestSuite {

}