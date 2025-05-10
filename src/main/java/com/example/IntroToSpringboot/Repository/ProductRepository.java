package com.example.IntroToSpringboot.Repository;


import com.example.IntroToSpringboot.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class ProductRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;


    // gets data, executes -> SELECT query
    public List<Product> getProductList() {
        String sqlQuery = "SELECT * FROM sample_db.products";
        List<Product> data = jdbcTemplate.query(sqlQuery, (rs, rowNum)->{
            Product p = new Product();
            p.id = rs.getInt(1);;
            p.name = rs.getString(2);;
            p.price = rs.getInt(3);;

            return p;
        });

        return data;
    }



    // Insert, update, delete
    public int addProduct(String name, int price) {
        String sqlQuery = "INSERT INTO sample_db.products(name, price) VALUES(?,?)";
        return jdbcTemplate.update(sqlQuery, name, price);
    }



    public int removeProduct(int productId){
        String sqlQuery = "DELETE from sample_db.products where id = ?";
        return jdbcTemplate.update(sqlQuery, productId);
    }


}
