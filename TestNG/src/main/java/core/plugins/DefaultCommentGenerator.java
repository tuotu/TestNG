package core.plugins;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * 生成注释
 *                       
 * @Filename DefaultCommentGenerator.java
 *
 * @Description 
 *
 * @Version 1.0
 *
 * @Author bohr
 *
 * @Email qzhanbo@yiji.com
 *       
 * @History
 *<li>Author: bohr.qiu</li>
 *<li>Date: 2013-4-20</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
public class DefaultCommentGenerator implements CommentGenerator {
	
	private Properties properties;
	@SuppressWarnings("unused")
	private boolean suppressDate;
	private boolean suppressAllComments;
	
	public DefaultCommentGenerator() {
		super();
		properties = new Properties();
		suppressDate = false;
		suppressAllComments = false;
	}
	
	public void addJavaFileComment(CompilationUnit compilationUnit) {
		compilationUnit.addFileCommentLine("/**");
		compilationUnit.addFileCommentLine(" *");
		if (compilationUnit.getType().getShortName().endsWith("DAO")) {
			compilationUnit
				.addFileCommentLine(" * A dao interface provides methods to access database ");
		} else if (compilationUnit.getType().getShortName().endsWith("DO")) {
			compilationUnit
				.addFileCommentLine(" * A data object class directly models database table");
		} else if (compilationUnit.getType().getShortName().endsWith("Example")) {
			compilationUnit.addFileCommentLine(" * A database access helper class");
		} else {
			
		}
		compilationUnit.addFileCommentLine(" * Dont modify any generated method! ");
		compilationUnit
			.addFileCommentLine(" * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.");
		
		compilationUnit.addFileCommentLine(" *");
		compilationUnit.addFileCommentLine(" * @Filename "
											+ compilationUnit.getType().getShortName() + ".java");
		compilationUnit.addFileCommentLine(" *");
		compilationUnit.addFileCommentLine(" * @Description");
		compilationUnit.addFileCommentLine(" *");
		compilationUnit.addFileCommentLine(" * @Author bohr.qiu");
		compilationUnit.addFileCommentLine(" *");
		compilationUnit.addFileCommentLine(" * @Email qzhanbo@yiji.com");
		compilationUnit.addFileCommentLine(" *");
		compilationUnit.addFileCommentLine(" */");
		return;
	}
	
	/**
	 * Adds a suitable comment to warn users that the element was generated, and
	 * when it was generated.
	 */
	public void addComment(XmlElement xmlElement) {
		if (suppressAllComments) {
			return;
		}
		
		xmlElement.addElement(new TextElement("<!--"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("  WARNING - ");
		sb.append(MergeConstants.NEW_ELEMENT_TAG);
		xmlElement.addElement(new TextElement(sb.toString()));
		xmlElement.addElement(new TextElement("  DONT MODIFY!"));
		
		//		String s = getDateString();
		//		if (s != null) {
		//			sb.setLength(0);
		//			sb.append("  此文件通过MyBatis Generator生成于 ");
		//			sb.append(s);
		//			sb.append('.');
		//			xmlElement.addElement(new TextElement(sb.toString()));
		//		}
		
		xmlElement.addElement(new TextElement("-->"));
	}
	
	public void addRootComment(XmlElement xmlElement) {
		
		xmlElement.addElement(new TextElement("<!--"));
		
		StringBuilder sb = new StringBuilder();
		sb.append(" WARNING  - DONT MODIFY ANY GENERATED ELEMENTS IN THIS FILE");
		xmlElement.addElement(new TextElement(sb.toString()));
		xmlElement
			.addElement(new TextElement(
				" if you want to add  new function ,plesae add a new element without  mbggenerated annotation marked comment"));
		
			sb.setLength(0);
			sb.append(" the file generated by MyBatis Generator.");
			xmlElement.addElement(new TextElement(sb.toString()));
		xmlElement.addElement(new TextElement(" @author bohr.qiu"));
		xmlElement.addElement(new TextElement("-->"));
		return;
	}
	
	public void addConfigurationProperties(Properties properties) {
		this.properties.putAll(properties);
		
		suppressDate = isTrue(properties
			.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
		
		suppressAllComments = isTrue(properties
			.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
	}
	
	/**
	 * This method adds the custom javadoc tag for. You may do nothing if you do
	 * not wish to include the Javadoc tag - however, if you do not include the
	 * Javadoc tag then the Java merge capability of the eclipse plugin will
	 * break.
	 * 
	 * @param javaElement
	 *            the java element
	 */
	protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
		javaElement.addJavaDocLine(" *");
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(MergeConstants.NEW_ELEMENT_TAG);
		if (markAsDoNotDelete) {
			sb.append(" do_not_delete_during_merge");
		}
		javaElement.addJavaDocLine(sb.toString());
	}
	
	
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		innerClass.addJavaDocLine("/**");
		innerClass.addJavaDocLine(" * ");
		
		sb.append(" * corresponds to the database table ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		innerClass.addJavaDocLine(sb.toString());
		
		addJavadocTag(innerClass, false);
		
		innerClass.addJavaDocLine(" */");
	}
	
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		innerEnum.addJavaDocLine("/**");
		sb.append(" *  corresponds to the database table ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		innerEnum.addJavaDocLine(sb.toString());
		
		addJavadocTag(innerEnum, false);
		
		innerEnum.addJavaDocLine(" */");
	}
	
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
								IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		field.addJavaDocLine("/**");
		
		sb.append(" * corresponds to the database column ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		field.addJavaDocLine(sb.toString());
		
		addJavadocTag(field, false);
		
		field.addJavaDocLine(" */");
	}
	
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		field.addJavaDocLine("/**");
		
		sb.append(" * corresponds to the database table ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		field.addJavaDocLine(sb.toString());
		
		addJavadocTag(field, false);
		
		field.addJavaDocLine(" */");
	}
	
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		method.addJavaDocLine("/**");
		
		sb.append(" * corresponds to the database table ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		method.addJavaDocLine(sb.toString());
		
		addJavadocTag(method, false);
		
		method.addJavaDocLine(" */");
	}
	
	public void addGetterComment(Method method, IntrospectedTable introspectedTable,
									IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		method.addJavaDocLine("/**");
		
		sb.append(" * return the value of the database column ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		method.addJavaDocLine(sb.toString());
		
		method.addJavaDocLine(" *");
		
		sb.setLength(0);
		sb.append(" * @return the value of ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		method.addJavaDocLine(sb.toString());
		
		addJavadocTag(method, false);
		
		method.addJavaDocLine(" */");
	}
	
	public void addSetterComment(Method method, IntrospectedTable introspectedTable,
									IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		method.addJavaDocLine("/**");
		
		sb.append(" * set the value of the database column ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		method.addJavaDocLine(sb.toString());
		
		method.addJavaDocLine(" *");
		
		Parameter parm = method.getParameters().get(0);
		sb.setLength(0);
		sb.append(" * @param ");
		sb.append(parm.getName());
		sb.append(" the value for ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		method.addJavaDocLine(sb.toString());
		
		addJavadocTag(method, false);
		
		method.addJavaDocLine(" */");
	}
	
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable,
								boolean markAsDoNotDelete) {
		if (suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		innerClass.addJavaDocLine("/**");
		
		sb.append(" * corresponds to the database table ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		innerClass.addJavaDocLine(sb.toString());
		
		addJavadocTag(innerClass, markAsDoNotDelete);
		
		innerClass.addJavaDocLine(" */");
	}
}
