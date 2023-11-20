package com.tableAssociation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tableAssociation.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
