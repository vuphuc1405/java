package baitapsolid;

interface DiscountStrategy {
    double applyDiscount(double price);
}

class NormalCustomer implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price;
    }
}

class VipCustomer implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}

class SuperVipCustomer implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.8;
    }
}

class StudentCustomer implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}

class DiscountService {
    public double calculatePrice(DiscountStrategy customer, double price) {
        return customer.applyDiscount(price);
    }
}

public class bai1 {

}
