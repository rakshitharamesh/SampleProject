package EnumPack;

import org.openqa.selenium.By;

public enum LoginPageEnum {

    USERNAME("[name='username']"),
    PASSWORD("[name='password']"),
    LOGIN_BUTTON("[type='submit'][class='radius']");

    String id;

    private LoginPageEnum(String Id) {
        this.id = Id;
    }

    public String getId() {
        return id;
    }

    public By selector() {
        return By.cssSelector(getId());

    }

}
