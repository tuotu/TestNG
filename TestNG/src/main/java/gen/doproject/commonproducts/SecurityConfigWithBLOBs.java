/**
 *
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SecurityConfigWithBLOBs.java
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

public class SecurityConfigWithBLOBs extends SecurityConfigDO implements Serializable {
    /**
     * corresponds to the database column security_config.cipher_salt
     *
     * @mbggenerated
     */
    private byte[] cipherSalt;

    /**
     * corresponds to the database column security_config.counter_signature_key
     *
     * @mbggenerated
     */
    private byte[] counterSignatureKey;

    /**
     * corresponds to the database column security_config.decrypt_key
     *
     * @mbggenerated
     */
    private byte[] decryptKey;

    /**
     * corresponds to the database column security_config.encrypt_key
     *
     * @mbggenerated
     */
    private byte[] encryptKey;

    /**
     * corresponds to the database column security_config.signature_key
     *
     * @mbggenerated
     */
    private byte[] signatureKey;

    /**
     * corresponds to the database column security_config.signature_salt
     *
     * @mbggenerated
     */
    private byte[] signatureSalt;

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column security_config.cipher_salt
     *
     * @return the value of security_config.cipher_salt
     *
     * @mbggenerated
     */
    public byte[] getCipherSalt() {
        return cipherSalt;
    }

    /**
     * set the value of the database column security_config.cipher_salt
     *
     * @param cipherSalt the value for security_config.cipher_salt
     *
     * @mbggenerated
     */
    public void setCipherSalt(byte[] cipherSalt) {
        this.cipherSalt = cipherSalt;
    }

    /**
     * return the value of the database column security_config.counter_signature_key
     *
     * @return the value of security_config.counter_signature_key
     *
     * @mbggenerated
     */
    public byte[] getCounterSignatureKey() {
        return counterSignatureKey;
    }

    /**
     * set the value of the database column security_config.counter_signature_key
     *
     * @param counterSignatureKey the value for security_config.counter_signature_key
     *
     * @mbggenerated
     */
    public void setCounterSignatureKey(byte[] counterSignatureKey) {
        this.counterSignatureKey = counterSignatureKey;
    }

    /**
     * return the value of the database column security_config.decrypt_key
     *
     * @return the value of security_config.decrypt_key
     *
     * @mbggenerated
     */
    public byte[] getDecryptKey() {
        return decryptKey;
    }

    /**
     * set the value of the database column security_config.decrypt_key
     *
     * @param decryptKey the value for security_config.decrypt_key
     *
     * @mbggenerated
     */
    public void setDecryptKey(byte[] decryptKey) {
        this.decryptKey = decryptKey;
    }

    /**
     * return the value of the database column security_config.encrypt_key
     *
     * @return the value of security_config.encrypt_key
     *
     * @mbggenerated
     */
    public byte[] getEncryptKey() {
        return encryptKey;
    }

    /**
     * set the value of the database column security_config.encrypt_key
     *
     * @param encryptKey the value for security_config.encrypt_key
     *
     * @mbggenerated
     */
    public void setEncryptKey(byte[] encryptKey) {
        this.encryptKey = encryptKey;
    }

    /**
     * return the value of the database column security_config.signature_key
     *
     * @return the value of security_config.signature_key
     *
     * @mbggenerated
     */
    public byte[] getSignatureKey() {
        return signatureKey;
    }

    /**
     * set the value of the database column security_config.signature_key
     *
     * @param signatureKey the value for security_config.signature_key
     *
     * @mbggenerated
     */
    public void setSignatureKey(byte[] signatureKey) {
        this.signatureKey = signatureKey;
    }

    /**
     * return the value of the database column security_config.signature_salt
     *
     * @return the value of security_config.signature_salt
     *
     * @mbggenerated
     */
    public byte[] getSignatureSalt() {
        return signatureSalt;
    }

    /**
     * set the value of the database column security_config.signature_salt
     *
     * @param signatureSalt the value for security_config.signature_salt
     *
     * @mbggenerated
     */
    public void setSignatureSalt(byte[] signatureSalt) {
        this.signatureSalt = signatureSalt;
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
        sb.append(", cipherSalt=").append(cipherSalt);
        sb.append(", counterSignatureKey=").append(counterSignatureKey);
        sb.append(", decryptKey=").append(decryptKey);
        sb.append(", encryptKey=").append(encryptKey);
        sb.append(", signatureKey=").append(signatureKey);
        sb.append(", signatureSalt=").append(signatureSalt);
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
        SecurityConfigWithBLOBs other = (SecurityConfigWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getCipherAlgorithm() == null ? other.getCipherAlgorithm() == null : this.getCipherAlgorithm().equals(other.getCipherAlgorithm()))
            && (this.getCipherCharset() == null ? other.getCipherCharset() == null : this.getCipherCharset().equals(other.getCipherCharset()))
            && (this.getMode() == null ? other.getMode() == null : this.getMode().equals(other.getMode()))
            && (this.getOriginalCharset() == null ? other.getOriginalCharset() == null : this.getOriginalCharset().equals(other.getOriginalCharset()))
            && (this.getSecurityUser() == null ? other.getSecurityUser() == null : this.getSecurityUser().equals(other.getSecurityUser()))
            && (this.getSignatureAlgorithm() == null ? other.getSignatureAlgorithm() == null : this.getSignatureAlgorithm().equals(other.getSignatureAlgorithm()))
            && (this.getSignatureCharset() == null ? other.getSignatureCharset() == null : this.getSignatureCharset().equals(other.getSignatureCharset()))
            && (this.getCipherSalt() == null ? other.getCipherSalt() == null : this.getCipherSalt().equals(other.getCipherSalt()))
            && (this.getCounterSignatureKey() == null ? other.getCounterSignatureKey() == null : this.getCounterSignatureKey().equals(other.getCounterSignatureKey()))
            && (this.getDecryptKey() == null ? other.getDecryptKey() == null : this.getDecryptKey().equals(other.getDecryptKey()))
            && (this.getEncryptKey() == null ? other.getEncryptKey() == null : this.getEncryptKey().equals(other.getEncryptKey()))
            && (this.getSignatureKey() == null ? other.getSignatureKey() == null : this.getSignatureKey().equals(other.getSignatureKey()))
            && (this.getSignatureSalt() == null ? other.getSignatureSalt() == null : this.getSignatureSalt().equals(other.getSignatureSalt()));
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
        result = prime * result + ((getCipherSalt() == null) ? 0 : getCipherSalt().hashCode());
        result = prime * result + ((getCounterSignatureKey() == null) ? 0 : getCounterSignatureKey().hashCode());
        result = prime * result + ((getDecryptKey() == null) ? 0 : getDecryptKey().hashCode());
        result = prime * result + ((getEncryptKey() == null) ? 0 : getEncryptKey().hashCode());
        result = prime * result + ((getSignatureKey() == null) ? 0 : getSignatureKey().hashCode());
        result = prime * result + ((getSignatureSalt() == null) ? 0 : getSignatureSalt().hashCode());
        return result;
    }
}