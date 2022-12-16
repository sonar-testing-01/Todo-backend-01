package com.example.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "List")
public class List {
	
	@Id
	@GeneratedValue
	private int listId;
	
	private String name;
	
	private String description;
	
	private LocalDateTime date;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="personId")
	private int personId;

}
