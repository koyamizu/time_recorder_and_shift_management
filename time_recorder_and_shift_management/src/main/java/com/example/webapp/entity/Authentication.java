package com.example.webapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {
	//SQLの命名規則（スネークキャメルケース）に合わせる
	private Integer employeeId;
	private String password;
	private Role authority;
	private String name;
}
