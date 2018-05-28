/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SecurityConfigDO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject.commonproducts;

import java.io.Serializable;
import java.util.Date;

public class SecurityConfigDO implements Serializable {
    /**
     * corresponds to the database column security_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column security_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column security_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column security_config.cipher_algorithm
     *
     * @mbggenerated
     */
    private String cipherAlgorithm;

    /**
     * corresponds to the database column security_config.cipher_charset
     *
     * @mbggenerated
     */
    private String cipherCharset;

    /**
     * corresponds to the database column security_config.mode
     *
     * @mbggenerated
     */
    private String mode;

    /**
     * corresponds to the database column security_config.original_charset
     *
     * @mbggenerated
     */
    private String originalCharset;

    /**
     * corresponds to the database column security_config.security_user
     *
     * @mbggenerated
     */
    private String securityUser;

    /**
     * corresponds to the database column security_config.signature_algorithm
     *
     * @mbggenerated
     */
    private String signatureAlgorithm;

    /**
     * corresponds to the database column security_config.signature_charset
     *
     * @mbggenerated
     */
    private String signatureCharset;

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column security_config.id
     *
     * @return the value of security_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column security_config.id
     *
     * @param id the value for security_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column security_config.raw_add_time
     *
     * @return the value of security_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column security_config.raw_add_time
     *
     * @param rawAddTime the value for security_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column security_config.raw_update_time
     *
     * @return the value of security_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column security_config.raw_update_time
     *
     * @param rawUpdateTime the value for security_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column security_config.cipher_algorithm
     *
     * @return the value of security_config.cipher_algorithm
     *
     * @mbggenerated
     */
    public String getCipherAlgorithm() {
        return cipherAlgorithm;
    }

    /**
     * set the value of the database column security_config.cipher_algorithm
     *
     * @param cipherAlgorithm the value for security_config.cipher_algorithm
     *
     * @mbggenerated
     */
    public void setCipherAlgorithm(String cipherAlgorithm) {
        this.cipherAlgorithm = cipherAlgorithm == null ? null : cipherAlgorithm.trim();
    }

    /**
     * return the value of the database column security_config.cipher_charset
     *
     * @return the value of security_config.cipher_charset
     *
     * @mbggenerated
     */
    public String getCipherCharset() {
        return cipherCharset;
    }

    /**
     * set the value of the database column security_config.cipher_charset
     *
     * @param cipherCharset the value for security_config.cipher_charset
     *
     * @mbggenerated
     */
    public void setCipherCharset(String cipherCharset) {
        this.cipherCharset = cipherCharset == null ? null : cipherCharset.trim();
    }

    /**
     * return the value of the database column security_config.mode
     *
     * @return the value of security_config.mode
     *
     * @mbggenerated
     */
    public String getMode() {
        return mode;
    }

    /**
     * set the value of the database column security_config.mode
     *
     * @param mode the value for security_config.mode
     *
     * @mbggenerated
     */
    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    /**
     * return the value of the database column security_config.original_charset
     *
     * @return the value of security_config.original_charset
     *
     * @mbggenerated
     */
    public String getOriginalCharset() {
        return originalCharset;
    }

    /**
     * set the value of the database column security_config.original_charset
     *
     * @param originalCharset the value for security_config.original_charset
     *
     * @mbggenerated
     */
    public void setOriginalCharset(String originalCharset) {
        this.originalCharset = originalCharset == null ? null : originalCharset.trim();
    }

    /**
     * return the value of the database column security_config.security_user
     *
     * @return the value of security_config.security_user
     *
     * @mbggenerated
     */
    public String getSecurityUser() {
        return securityUser;
    }

    /**
     * set the value of the database column security_config.security_user
     *
     * @param securityUser the value for security_config.security_user
     *
     * @mbggenerated
     */
    public void setSecurityUser(String securityUser) {
        this.securityUser = securityUser == null ? null : securityUser.trim();
    }

    /**
     * return the value of the database column security_config.signature_algorithm
     *
     * @return the value of security_config.signature_algorithm
     *
     * @mbggenerated
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * set the value of the database column security_config.signature_algorithm
     *
     * @param signatureAlgorithm the value for security_config.signature_algorithm
     *
     * @mbggenerated
     */
    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm == null ? null : signatureAlgorithm.trim();
    }

    /**
     * return the value of the database column security_config.signature_charset
     *
     * @return the value of security_config.signature_charset
     *
     * @mbggenerated
     */
    public String getSignatureCharset() {
        return signatureCharset;
    }

    /**
     * set the value of the database column security_config.signature_charset
     *
     * @param signatureCharset the value for security_config.signature_charset
     *
     * @mbggenerated
     */
    public void setSignatureCharset(String signatureCharset) {
        this.signatureCharset = signatureCharset == null ? null : signatureCharset.trim();
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", cipherAlgorithm=").append(cipherAlgorithm);
        sb.append(", cipherCharset=").append(cipherCharset);
        sb.append(", mode=").append(mode);
        sb.append(", originalCharset=").append(originalCharset);
        sb.append(", securityUser=").append(securityUser);
        sb.append(", signatureAlgorithm=").append(signatureAlgorithm);
        sb.append(", signatureCharset=").append(signatureCharset);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table security_config
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
        SecurityConfigDO other = (SecurityConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getCipherAlgorithm() == null ? other.getCipherAlgorithm() == null : this.getCipherAlgorithm().equals(other.getCipherAlgorithm()))
            && (this.getCipherCharset() == null ? other.getCipherCharset() == null : this.getCipherCharset().equals(other.getCipherCharset()))
            && (this.getMode() == null ? other.getMode() == null : this.getMode().equals(other.getMode()))
            && (this.getOriginalCharset() == null ? other.getOriginalCharset() == null : this.getOriginalCharset().equals(other.getOriginalCharset()))
            && (this.getSecurityUser() == null ? other.getSecurityUser() == null : this.getSecurityUser().equals(other.getSecurityUser()))
            && (this.getSignatureAlgorithm() == null ? other.getSignatureAlgorithm() == null : this.getSignatureAlgorithm().equals(other.getSignatureAlgorithm()))
            && (this.getSignatureCharset() == null ? other.getSignatureCharset() == null : this.getSignatureCharset().equals(other.getSignatureCharset()));
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getCipherAlgorithm() == null) ? 0 : getCipherAlgorithm().hashCode());
        result = prime * result + ((getCipherCharset() == null) ? 0 : getCipherCharset().hashCode());
        result = prime * result + ((getMode() == null) ? 0 : getMode().hashCode());
        result = prime * result + ((getOriginalCharset() == null) ? 0 : getOriginalCharset().hashCode());
        result = prime * result + ((getSecurityUser() == null) ? 0 : getSecurityUser().hashCode());
        result = prime * result + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        result = prime * result + ((getSignatureCharset() == null) ? 0 : getSignatureCharset().hashCode());
        return result;
    }
}