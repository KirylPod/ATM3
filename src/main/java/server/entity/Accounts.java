package server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


@AllArgsConstructor
@Entity
public class Accounts {
    private int id;
    private String accountId;
    private String accountPin;
    private int accountCash;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account_id", nullable = false, length = 19)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "account_pin", nullable = false, length = 4)
    public String getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(String accountPin) {
        this.accountPin = accountPin;
    }

    @Basic
    @Column(name = "account_cash", nullable = false)
    public int getAccountCash() {
        return accountCash;
    }

    public void setAccountCash(int accountCash) {
        this.accountCash = accountCash;
    }

    public Accounts(String accountId, String accountPin, int accountCash) {
        this.accountId = accountId;
        this.accountPin = accountPin;
        this.accountCash = accountCash;
    }

    public Accounts() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return id == accounts.id &&
                accountCash == accounts.accountCash &&
                Objects.equals(accountId, accounts.accountId) &&
                Objects.equals(accountPin, accounts.accountPin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, accountPin, accountCash);
    }
}
