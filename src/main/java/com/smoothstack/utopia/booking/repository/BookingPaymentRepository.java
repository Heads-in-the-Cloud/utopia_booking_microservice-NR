package com.smoothstack.utopia.booking.repository;

import com.smoothstack.utopia.booking.entity.BookingPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingPaymentRepository extends JpaRepository<BookingPayment, Integer> {
}
