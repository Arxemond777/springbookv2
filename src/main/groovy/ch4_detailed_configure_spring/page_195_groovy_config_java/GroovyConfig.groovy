package ch4_detailed_configure_spring.page_195_groovy_config_java

import org.springframework.context.support.GenericApplicationContext
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

def ctx = new GenericApplicationContext()
def reader = new GroovyBeanDefinitionReader(ctx)

reader.beans {
    contact(Contact, firstName: 'Chris', lastName: 'Schaefer', age: 666)
}

ctx.refresh()

println ctx.getBean("contact")
