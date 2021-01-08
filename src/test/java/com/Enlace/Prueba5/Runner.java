package com.Enlace.Prueba5;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="features", glue={"StepsDefinitions"})	
public class Runner {

}
