/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.salesreport;

import java.util.Scanner;

class Product {

    private String[] names;
    private int[][] sales;

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    public int getTotalSales() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    public int getAverageSales() {
        int count = sales.length * sales[0].length;
        return getTotalSales() / count;
    }

    public int[] getProductTotals() {
        int[] totals = new int[sales.length];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totals[i] += sales[i][j];
            }
        }
        return totals;
    }

    public int getMostPopularIndex() {
        int[] totals = getProductTotals();
        int best = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[best]) {
                best = i;
            }
        }
        return best;
    }

    public String getMostPopularName() {
        return names[getMostPopularIndex()];
    }

    public int getMostPopularTotal() {
        return getProductTotals()[getMostPopularIndex()];
    }
}

public class SalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1)
                        + " for " + names[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(names, sales);

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.getTotalSales());
        System.out.println("AVERAGE PRODUCT SALES: " + product.getAverageSales());
        System.out.println("MOST POPULAR PRODUCT: " + product.getMostPopularName()
                + " (" + product.getMostPopularTotal() + ")");

        input.close();
    }
}
