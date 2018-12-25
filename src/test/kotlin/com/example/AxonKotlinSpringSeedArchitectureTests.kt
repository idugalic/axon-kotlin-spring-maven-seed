package com.example

import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.junit.ArchUnitRunner
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition
import org.junit.runner.RunWith

@RunWith(ArchUnitRunner::class)
@AnalyzeClasses(packages = ["com.example"])
class AxonKotlinSpringSeedArchitectureTests {

    @ArchTest
    val classes_from_command_package_should_only_be_accessed_within_same_package = ArchRuleDefinition.classes().that().resideInAPackage("com.example.command").should().onlyBeAccessed().byClassesThat().resideInAPackage("com.example.command")

    @ArchTest
    val classes_from_query_package_should_only_be_accessed_within_same_package = ArchRuleDefinition.classes().that().resideInAPackage("com.example.query").should().onlyBeAccessed().byClassesThat().resideInAPackage("com.example.query")

}
