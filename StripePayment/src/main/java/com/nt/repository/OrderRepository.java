package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
