package com.desafio_api.runners;

import com.desafio_api.tests.base.tests.BaseTest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(com.desafio_api.suites.AllTests.class)
@Suite.SuiteClasses({
        BaseTest.class,
})
public class AllTests {
}