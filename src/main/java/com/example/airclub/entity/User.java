package com.example.airclub.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;
    private String name;
    private int phone;
    private LocalDate birthday;
    private String address;
    private int roleId;

    public User() {
    }

    public void setUid(Long id) {
        this.uid = id;
    }

    public Long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int password) {
        this.phone = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return roleId == user.roleId && Objects.equals(uid, user.uid) && Objects.equals(name, user.name) && Objects.equals(phone, user.phone) && Objects.equals(birthday, user.birthday) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, phone, birthday, address, roleId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("uid=" + uid)
                .add("name='" + name + "'")
                .add("phone=" + phone)
                .add("birthday=" + birthday)
                .add("address='" + address + "'")
                .add("roleId=" + roleId)
                .toString();
    }
}
