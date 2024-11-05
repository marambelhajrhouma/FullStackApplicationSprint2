package com.example.users.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class Role {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long role_id;
	private String role;

}