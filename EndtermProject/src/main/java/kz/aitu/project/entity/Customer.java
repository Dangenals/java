package kz.aitu.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer {
    @Id
    private long customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private long paymentId;
    private String token;

}
