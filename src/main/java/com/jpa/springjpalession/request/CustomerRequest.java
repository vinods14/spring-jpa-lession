package com.jpa.springjpalession.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
