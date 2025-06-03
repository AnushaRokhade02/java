package com.kle.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, TransactionDetailsId> {
}
