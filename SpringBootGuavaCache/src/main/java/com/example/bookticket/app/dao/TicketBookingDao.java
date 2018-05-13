package com.example.bookticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.bookticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
