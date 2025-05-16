package com.example.IntroToSpringboot.Entity;


import java.io.Serializable;
import java.util.Objects;

// this class will contain fields that will act as composite primary-key for the Product2 table
// Rules to follow , defined in own notes - check
public class Product2_CompositeKey implements Serializable {

    public int product_id;
    public String product_name;

    // 1 no argument constructor
    Product2_CompositeKey() {

    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Product2_CompositeKey)){
            return false;
        }

        Product2_CompositeKey objCasted = (Product2_CompositeKey) obj;
        return objCasted.product_id == this.product_id && objCasted.product_name.equals(this.product_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name);
    }

}
