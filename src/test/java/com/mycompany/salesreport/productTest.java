/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.salesreport;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author peter
 */
public class productTest {
    
 private Product CreateProduct() {
        String[] names = {"Cozy Nights Monarch", "Dream Cloud", "Sleep Easy"};
        int[][] sales = {
            {10, 8, 7},   // 25
            {5, 6, 4},    // 15
            {3, 9, 2}     // 14
        };
        return new Product(names, sales);
    }

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = CreateProduct();

        int result = product.GetTotalProductsSold();

        assertEquals(54, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = CreateProduct();

        double result = product.GetAverageProductSold();

        assertEquals(6.0, result, 0.001);
    }
}