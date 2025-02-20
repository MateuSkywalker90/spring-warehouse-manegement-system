package com.mateus.warehouse_management_system.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SystemUserResponseDto {

    private Long id;
    private String employeeRegistration;
    private String username;
    private String role;
}
