package io.swagger.api;

import io.swagger.model.InlineResponse20033;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-03T14:36:23.648Z[GMT]")
@RestController
public class BanksApiController implements BanksApi {

    private static final Logger log = LoggerFactory.getLogger(BanksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BanksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse20033> banksIdTypeidAccountsAccNumPost(@Parameter(in = ParameterIn.PATH, description = "can have 2 values- ifsc or bank_code", required=true, schema=@Schema()) @PathVariable("id_type") String idType,@Parameter(in = ParameterIn.PATH, description = "IFSC code if ifsc is selected as id_type and bank code if bank_code is selected as id_type", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.PATH, description = "pass complete account number which needs to be verified", required=true, schema=@Schema()) @PathVariable("acc_num") Integer accNum,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20033>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"amount\" : \"amount\",\n    \"fee\" : \"fee\",\n    \"verification_failure_refund\" : \"verification_failure_refund\",\n    \"is_Ifsc_required\" : \"is_Ifsc_required\",\n    \"tid\" : \"tid\",\n    \"client_ref_id\" : \"client_ref_id\",\n    \"bank\" : \"bank\",\n    \"is_name_editable\" : \"is_name_editable\",\n    \"user_code\" : \"user_code\",\n    \"aadhar\" : \"aadhar\",\n    \"recipient_name\" : \"recipient_name\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : \"account\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20033.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20033>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20033>(HttpStatus.OK);
    }

}
