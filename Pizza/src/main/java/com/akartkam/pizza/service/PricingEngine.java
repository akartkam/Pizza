package com.akartkam.pizza.service;

import com.akartkam.pizza.domain.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
