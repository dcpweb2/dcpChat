package dcp.dcpChat.dto.generated;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.mail_address
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private String mailAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.register_datetime
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private Date registerDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.update_datetime
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private Date updateDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.unsubscribe_flg
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private Byte unsubscribeFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.mail_address
     *
     * @return the value of user_info.mail_address
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.mail_address
     *
     * @param mailAddress the value for user_info.mail_address
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.register_datetime
     *
     * @return the value of user_info.register_datetime
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public Date getRegisterDatetime() {
        return registerDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.register_datetime
     *
     * @param registerDatetime the value for user_info.register_datetime
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setRegisterDatetime(Date registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.update_datetime
     *
     * @return the value of user_info.update_datetime
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.update_datetime
     *
     * @param updateDatetime the value for user_info.update_datetime
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.unsubscribe_flg
     *
     * @return the value of user_info.unsubscribe_flg
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public Byte getUnsubscribeFlg() {
        return unsubscribeFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.unsubscribe_flg
     *
     * @param unsubscribeFlg the value for user_info.unsubscribe_flg
     *
     * @mbg.generated Wed Oct 18 01:11:58 JST 2017
     */
    public void setUnsubscribeFlg(Byte unsubscribeFlg) {
        this.unsubscribeFlg = unsubscribeFlg;
    }
}