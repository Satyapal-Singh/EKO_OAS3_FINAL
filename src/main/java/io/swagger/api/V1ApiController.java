package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse20027;
import io.swagger.model.InlineResponse20028;
import io.swagger.model.InlineResponse20029;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse20030;
import io.swagger.model.InlineResponse20031;
import io.swagger.model.InlineResponse20032;
import io.swagger.model.InlineResponse20036;
import io.swagger.model.InlineResponse20037;
import io.swagger.model.InlineResponse20038;
import io.swagger.model.InlineResponse20039;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse400;
import io.swagger.model.InlineResponse4001;
import io.swagger.model.InlineResponse4002;
import io.swagger.model.InlineResponse500;
import org.springframework.core.io.Resource;
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
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> v1AgentUserCodeSettlementPost(@Parameter(in = ParameterIn.PATH, description = "Your user code in Eko’s system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of the service for fund transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Payment mode you want to use to transfer money" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = true) Integer paymentMode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary name (as in bank records)" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = true) String recipientName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount to transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Sender's name" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "sender_name", required = true) String senderName,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Payment Purpose" ,schema=@Schema()) @Valid @RequestParam(value = "tag", required = false) String tag,@Parameter(in = ParameterIn.QUERY, description = "Sender’s location information; eg- 28.78123,72.808912" ,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = false) String latlong,@Parameter(in = ParameterIn.QUERY, description = "Beneficiary's bank account type" ,schema=@Schema()) @Valid @RequestParam(value = "beneficiary_account_type", required = false) Integer beneficiaryAccountType) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"response_status_id\" : 9,\n  \"data\" : {\n    \"client_ref_id\" : \"client_ref_id\",\n    \"amount\" : 1.4658129805029452,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"balance\" : 5.637376656633329,\n    \"totalfee\" : 2.3021358869347655,\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"tid\" : 5\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 7\n}", InlineResponse200.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> v1AgentUserCodeSettlementPost(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount to transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "unique recipient_id" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_id", required = true) Integer recipientId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Payment mode you want to use to transfer money" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = true) Integer paymentMode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"tx_status\" : \"tx_status\",\n    \"amount\" : \"amount\",\n    \"balance\" : \"balance\",\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"totalfee\" : \"totalfee\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : \"account\",\n    \"tid\" : \"tid\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2005.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> v1AgentUserCodeSettlementaccountGet(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"unsettled_fund\" : \"unsettled_fund\",\n    \"remaining_limit\" : \"remaining_limit\",\n    \"fund_transfer_list\" : [ {\n      \"name\" : \"name\",\n      \"ifsc\" : \"ifsc\",\n      \"account\" : \"account\",\n      \"recipient_id\" : \"recipient_id\"\n    }, {\n      \"name\" : \"name\",\n      \"ifsc\" : \"ifsc\",\n      \"account\" : \"account\",\n      \"recipient_id\" : \"recipient_id\"\n    } ]\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2002.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> v1AgentUserCodeSettlementaccountPut(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique bank ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_id", required = true) Integer bankId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"recipient_id\" : 6\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse2003.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> v1AgentUserCodeSettlementaccountVerifyPut(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique bank ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_id", required = true) Integer bankId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "firm_name", required = true) String firmName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Pass value as 8 which is Bank Statement" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "poa_type", required = true) Integer poaType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Bank image statement" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_statement_image", required = true) Resource bankStatementImage,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"bank_id\" : 6,\n    \"firm_name\" : \"firm_name\",\n    \"service_code\" : \"service_code\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : \"account\"\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse2004.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20028> v1CustomersCustomerIdTypecustomerIdProductindonepalGet(@Parameter(in = ParameterIn.PATH, description = "Value= mobile_number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("product") String product,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20028>(objectMapper.readValue("\"\"", InlineResponse20028.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20028>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20028>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20027> v1CustomersCustomerIdTypecustomerIdProductindonepalOtpPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "id of the customer", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "1,2 or 3" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "action", required = true) Integer action,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Needs to be passed only if action = 2" ,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = false) String recipientName,@Parameter(in = ParameterIn.QUERY, description = "Needs to be passed if action = 2, Pass 1 for Cash Payout, 2 for Account Deposit" ,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = false) Integer paymentMode,@Parameter(in = ParameterIn.QUERY, description = "Needs to be passed if action = 2 and payment_mode = 2" ,schema=@Schema()) @Valid @RequestParam(value = "branch_id", required = false) Integer branchId,@Parameter(in = ParameterIn.QUERY, description = "Account number of the recipient" ,schema=@Schema()) @Valid @RequestParam(value = "account", required = false) String account,@Parameter(in = ParameterIn.QUERY, description = "Needs to be passed only if action = 3" ,schema=@Schema()) @Valid @RequestParam(value = "recipient_id", required = false) String recipientId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20027>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"invalid_params\" : {\n    \"customer_id\" : \"customer_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20027.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20027>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20027>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20029> v1CustomersCustomerIdTypecustomerIdProductindonepalPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "id of the customer", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of the customer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "name", required = true) String name,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Date of birth of the customer- DDMMYYYY" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "dob", required = true) String dob,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Gender of the sender" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "gender", required = true) Integer gender,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Address of the sender" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "address_line1", required = true) String addressLine1,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Nationality of the sender (Indian / Nepalese)" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "nationality", required = true) String nationality,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id_proof type of the sender" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id_proof_type_id", required = true) String idProofTypeId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id_proof number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id_proof", required = true) String idProof,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Front image of the id proof" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "file1 (front)", required = true) Resource file1Front,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Back image of the id proof" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "file2 (back)", required = true) Resource file2Back,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Income source value of the sender" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "income_source", required = true) String incomeSource,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Reason of remittance" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "remittance_reason", required = true) String remittanceReason,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20029>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"customer_profile\" : \"customer_profile\",\n    \"name\" : \"name\",\n    \"status_text\" : \"status_text\",\n    \"is_verified\" : \"is_verified\",\n    \"otp_ref_id\" : \"otp_ref_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20029.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20029>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20029>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20031> v1CustomersCustomerIdTypecustomerIdProductindonepalRecipientsGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "id of the customer", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20031>(objectMapper.readValue("\"\"", InlineResponse20031.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20031>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20031>(HttpStatus.OK);
    }

    public ResponseEntity<Void> v1CustomersCustomerIdTypecustomerIdProductindonepalRecipientsRecipientsIdTypeidPut(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@Parameter(in = ParameterIn.PATH, description = "Mobile Number, acc_indonepalbranch", required=true, schema=@Schema()) @PathVariable("recipients_id_type") String recipientsIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("id") String id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of recipient" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = true) String recipientName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of recipient" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_mobile", required = true) Integer recipientMobile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Received from Send OTP API" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp_ref_id", required = true) String otpRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Received on mobile via SMS" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp", required = true) String otp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "gender", required = true) Integer gender,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Address of the recipient" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "address_line1", required = true) String addressLine1,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "relationship_with_sender", required = true) Integer relationshipWithSender,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "district", required = true) String district,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20030> v1CustomersProductindonepalVerificationOtpotpPut(@Parameter(in = ParameterIn.PATH, description = "Which you received by calling Create Customer or Resend OTP API", required=true, schema=@Schema()) @PathVariable("otp") Integer otp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id_type", required = true) String customerIdType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the customer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Value which is received in create customer API or resend OTP API" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp_ref_id", required = true) String otpRefId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20030>(objectMapper.readValue("{\n  \"response_status_id\" : 6,\n  \"data\" : {\n    \"customer_id_type\" : \"customer_id_type\",\n    \"state_desc\" : \"state_desc\",\n    \"state\" : \"state\",\n    \"customer_id\" : \"customer_id\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20030.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20030>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20030>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20032> v1PanVerifyPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "This is the pan number that needs to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pan_number", required = true) String panNumber,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "purpose", required = true) Integer purpose,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "purpose_desc", required = true) String purposeDesc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20032>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"pan_number\" : \"pan_number\",\n    \"last_name\" : \"last_name\",\n    \"middle_name\" : \"middle_name\",\n    \"title\" : \"title\",\n    \"first_name\" : \"first_name\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20032.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20032>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20032>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20038> v1TokenCancelPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Token for which the enquiry needs to be done" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "token", required = true) String token) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20038>(objectMapper.readValue("{\n  \"response_status_id\" : 6,\n  \"response_code\" : \"response_code\",\n  \"status_desc\" : \"status_desc\",\n  \"data\" : {\n    \"tx_status\" : 1,\n    \"client_ref_id\" : \"client_ref_id\",\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"new_keys_may_be_added_here\" : \"new_keys_may_be_added_here\",\n    \"token\" : \"token\"\n  },\n  \"response_code_desc\" : \"response_code_desc\",\n  \"status\" : 0\n}", InlineResponse20038.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20038>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20038>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20037> v1TokenEnquiryGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.QUERY, description = "Unique identity of partner server" ,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = false) String clientRefId,@Parameter(in = ParameterIn.QUERY, description = "Token for which the enquiry needs to be done" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20037>(objectMapper.readValue("{\n  \"response_status_id\" : 6,\n  \"response_code\" : \"response_code\",\n  \"status_desc\" : \"status_desc\",\n  \"data\" : {\n    \"tx_status\" : 1,\n    \"client_ref_id\" : \"client_ref_id\",\n    \"amount\" : 5.962133916683182,\n    \"payment_mode\" : \"payment_mode\",\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"new_keys_may_be_added_here\" : \"new_keys_may_be_added_here\",\n    \"transaction_time\" : \"transaction_time\",\n    \"tid\" : 5,\n    \"token\" : \"token\"\n  },\n  \"response_code_desc\" : \"response_code_desc\",\n  \"status\" : 0\n}", InlineResponse20037.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20037>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20037>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20036> v1TokenPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique identity of partner server" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default product_code given to the partner" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "product_code", required = true) String productCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Value of customer's mobile number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) String customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of the customer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_name", required = true) String customerName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Expiry time of the token- format (yyyy-MM-dd HH:mm:ss)" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "expiry", required = true) String expiry,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Json input having label of the item getting purchased and the amount json object having currency and amount" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "total", required = true) Object total,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Array of json objects having the bifurcation of the total amount and the description of individual amount" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "display_items", required = true) List<Object> displayItems,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Email of the customer" ,schema=@Schema()) @Valid @RequestParam(value = "email", required = false) String email) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20036>(objectMapper.readValue("{\n  \"response_status_id\" : 6,\n  \"response_code\" : \"response_code\",\n  \"status_desc\" : \"status_desc\",\n  \"data\" : {\n    \"client_ref_id\" : \"client_ref_id\",\n    \"new_keys_may_be_added_here\" : \"new_keys_may_be_added_here\",\n    \"expiry\" : \"expiry\",\n    \"token\" : \"token\"\n  },\n  \"response_code_desc\" : \"response_code_desc\",\n  \"status\" : 0\n}", InlineResponse20036.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20036>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20036>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20039> v1TokenResendPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.QUERY, description = "Unique identity of partner server" ,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = false) String clientRefId,@Parameter(in = ParameterIn.QUERY, description = "Token for which the enquiry needs to be done" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20039>(objectMapper.readValue("{\n  \"response_status_id\" : 6,\n  \"response_code\" : \"response_code\",\n  \"status_desc\" : \"status_desc\",\n  \"response_code_desc\" : \"response_code_desc\",\n  \"status\" : 0\n}", InlineResponse20039.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20039>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20039>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> v1TransactionsIdGet(@Parameter(in = ParameterIn.PATH, description = "EKO TID/client_ref_id", required=true, schema=@Schema()) @PathVariable("id") String id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"response_status_id\" : 4,\n  \"data\" : {\n    \"tx_status\" : 2,\n    \"amount\" : 9.301444243932576,\n    \"payment_mode\" : 3,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"fee\" : 1.4658129805029452,\n    \"gst\" : 5.962133916683182,\n    \"sender_name\" : \"sender_name\",\n    \"tid\" : 7,\n    \"beneficiary_account_type\" : 5,\n    \"client_ref_id\" : \"client_ref_id\",\n    \"receipient_name\" : \"receipient_name\",\n    \"bank_ref_num\" : \"bank_ref_num\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 2\n}", InlineResponse2001.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<Void> v1TransactionsPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_id", required = true) Integer recipientId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "timestamp", required = true) String timestamp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "currency", required = true) String currency,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique reference number of your system" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Received from Send OTP API" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp_ref_id", required = true) String otpRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "hold_timeout", required = true) Integer holdTimeout,@NotNull @Parameter(in = ParameterIn.QUERY, description = "1 - Commit, 2- Hold" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "state", required = true) Integer state,@NotNull @Parameter(in = ParameterIn.QUERY, description = "1 - PAN, 2 - Aadhaar number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "merchant_document_id_type", required = true) Integer merchantDocumentIdType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "value of the merchant document i" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "merchant_document_id", required = true) String merchantDocumentId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Received from Send OTP API" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp", required = true) Integer otp,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> v1TransactionsTidGet(@Parameter(in = ParameterIn.PATH, description = "tid or client_ref_id", required=true, schema=@Schema()) @PathVariable("tid") String tid,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Id of the initiator" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"response_status_id\" : 4,\n  \"data\" : {\n    \"tx_status\" : 2,\n    \"amount\" : 9.301444243932576,\n    \"payment_mode\" : 3,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"fee\" : 1.4658129805029452,\n    \"gst\" : 5.962133916683182,\n    \"sender_name\" : \"sender_name\",\n    \"tid\" : 7,\n    \"beneficiary_account_type\" : 5,\n    \"client_ref_id\" : \"client_ref_id\",\n    \"receipient_name\" : \"receipient_name\",\n    \"bank_ref_num\" : \"bank_ref_num\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 2\n}", InlineResponse2001.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20011> v1UserCodeGet(@Parameter(in = ParameterIn.PATH, description = "Unique code of the user on the platform", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20011>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"service_status_list\" : [ {\n      \"comments\" : \"comments\",\n      \"status_desc\" : \"status_desc\",\n      \"city\" : \"city\",\n      \"user_name\" : \"user_name\",\n      \"mobile\" : \"mobile\",\n      \"service_provider\" : \"service_provider\",\n      \"verification_status\" : 6,\n      \"createdAt\" : \"createdAt\",\n      \"user_code\" : \"user_code\",\n      \"service_code\" : \"service_code\",\n      \"state\" : \"state\",\n      \"status\" : \"status\",\n      \"updatedAt\" : \"updatedAt\"\n    }, {\n      \"comments\" : \"comments\",\n      \"status_desc\" : \"status_desc\",\n      \"city\" : \"city\",\n      \"user_name\" : \"user_name\",\n      \"mobile\" : \"mobile\",\n      \"service_provider\" : \"service_provider\",\n      \"verification_status\" : 6,\n      \"createdAt\" : \"createdAt\",\n      \"user_code\" : \"user_code\",\n      \"service_code\" : \"service_code\",\n      \"state\" : \"state\",\n      \"status\" : \"status\",\n      \"updatedAt\" : \"updatedAt\"\n    } ]\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse20011.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009> v1UserOnboardPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Pan card number of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pan_number", required = true) String panNumber,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "mobile", required = true) String mobile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "First name of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "first_name", required = true) String firstName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Middle name of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "middle_name", required = true) String middleName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Last name of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "last_name", required = true) String lastName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Email of user/merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "email", required = true) String email,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Residence address of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "residence_address", required = true) List<String> residenceAddress,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Date of Birth of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "dob", required = true) String dob,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Shop name of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "shop_name", required = true) String shopName,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2009.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> v1UserRequestOtpPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "mobile", required = true) Integer mobile,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"initiator_id\" : \"initiator_id\",\n    \"mobile\" : \"mobile\",\n    \"otp\" : \"otp\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2007.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2007>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20010> v1UserServiceActivatePut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code for service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) String serviceCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Model name of biometric device" ,schema=@Schema()) @Valid @RequestParam(value = "modelname", required = false) String modelname,@Parameter(in = ParameterIn.QUERY, description = "Device number of biometric device" ,schema=@Schema()) @Valid @RequestParam(value = "devicenumber", required = false) String devicenumber,@Parameter(in = ParameterIn.QUERY, description = "Office address of the user" ,schema=@Schema()) @Valid @RequestParam(value = "office_address", required = false) List<String> officeAddress,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "pan_card", required = false) Resource panCard,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "aadhar_front", required = false) Resource aadharFront,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "aadhar_back", required = false) Resource aadharBack,@Parameter(in = ParameterIn.QUERY, description = "address of the user" ,schema=@Schema()) @Valid @RequestParam(value = "address_as_per_proof", required = false) List<String> addressAsPerProof) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20010>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"service_status_desc\" : \"service_status_desc\",\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"service_status\" : \"service_status\",\n    \"service_code\" : \"service_code\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20010.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20010>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2008> v1UserVerifyPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "mobile", required = true) Integer mobile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp", required = true) Integer otp,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"csp_id\" : \"csp_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2008.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2008>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2006> v1UsersServicesGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"service_list\" : [ {\n      \"service_name\" : \"service_name\",\n      \"service_code\" : \"service_code\",\n      \"provider_name\" : \"provider_name\"\n    }, {\n      \"service_name\" : \"service_name\",\n      \"service_code\" : \"service_code\",\n      \"provider_name\" : \"provider_name\"\n    } ]\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2006.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

}
