package kz.aitu.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="products")
public class Product {
    @Id
    private long productId;
    private String productName;
    private long categoryId;
    private int unitPrice;
    private String description;
    private long companyId;
    private Date productionDate;
    private Date expireDate;
    private float volume;
    private int barcode;
}
