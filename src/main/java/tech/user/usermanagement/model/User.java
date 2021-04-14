package tech.user.usermanagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String userTitle;
    private String phone;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String userCode;

    public User() {
    }

    public User(String name, String email, String userTitle, String phone, String imageURL, String userCode) {
        this.name = name;
        this.email = email;
        this.userTitle = userTitle;
        this.phone = phone;
        this.imageURL = imageURL;
        this.userCode = userCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userTitle='" + userTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
