package one.digitalinnovation.personapi.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    private String FirstName;

    private String LastName;

    private String cpf;

    private String birthDate;

    private List<PhoneDTO> phones;


}
