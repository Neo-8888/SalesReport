/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author peter
 */
public class productTest {
    
 @Override
public class ProductTests
{
    private Product CreateProduct()
    {
        string[] names = { "Cozy Nights Monarch", "Dream Cloud", "Sleep Easy" };
        int[,] sales =
        {
            { 10, 8, 7 },   // 25
            { 5, 6, 4 },    // 15
            { 3, 9, 2 }     // 14
        };
        return new Product(names, sales);
    }

    [TestMethod]
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue()
    {
        Product product = CreateProduct();

        int result = product.GetTotalProductsSold();

        Assert.AreEqual(54, result);
    }

    [TestMethod]
    public void GetAverageSales_WithValidData_ReturnsCorrectValue()
    {
        Product product = CreateProduct();

        double result = product.GetAverageProductSold();

        Assert.AreEqual(18.0, result, 0.001);
    }
}