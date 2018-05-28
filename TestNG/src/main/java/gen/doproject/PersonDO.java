/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PersonDO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject;

import java.io.Serializable;

public class PersonDO implements Serializable {
    /**
     * corresponds to the database column person.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column person.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * corresponds to the database column person.age
     *
     * @mbggenerated
     */
    private Integer age;

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column person.id
     *
     * @return the value of person.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column person.id
     *
     * @param id the value for person.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column person.name
     *
     * @return the value of person.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * set the value of the database column person.name
     *
     * @param name the value for person.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * return the value of the database column person.age
     *
     * @return the value of person.age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * set the value of the database column person.age
     *
     * @param age the value for person.age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PersonDO other = (PersonDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()));
    }

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        return result;
    }
}