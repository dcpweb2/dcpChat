package dcp.dcpChat.form.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * ログイン画面のFormクラス
 * @author inokoichi
 *
 */
public class LoginForm {

    @NotNull
    @Size(min = 1, max = 127)
    private String email;

    @NotNull
    @Size(min = 1, max = 10)
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
