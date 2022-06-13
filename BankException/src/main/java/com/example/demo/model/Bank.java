package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bank {
  @Id 
  @Column(name="id")
  Integer bank_id;
  @Column(name="name")
  String bank_address;
  @Column(name="address")
  String bank_name;
}
