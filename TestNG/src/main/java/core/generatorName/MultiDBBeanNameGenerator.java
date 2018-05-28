package core.generatorName;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * 
 * 多数据库时，会遇到表名相同的情况，
 * 
 * 使用类的全命名(包名+类名)来区分开不同数据库中的表
 *                       
 * @Filename MultiDBBeanNameGenerator.java
 *
 * @Description 
 *
 * @Version 1.0
 *
 * @Author qzhanbo
 *
 * @Email qzhanbo@yiji.com
 *       
 * @History
 *<li>Author: qzhanbo</li>
 *<li>Date: 2013-6-9</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
public class MultiDBBeanNameGenerator implements BeanNameGenerator {
	
	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		return definition.getBeanClassName();
	}
	
}
