@BeforeStep
void before(context){
    println "Splunk: running before the ${context.library} library's ${context.step} step"
}

//@AfterStep({ context.step.equals("static_code_analysis") })
@AfterStep({ context.step in config.afterSteps })
void after(context){
    println "Splunk: running after the ${context.library} library's ${context.step} step"
}


