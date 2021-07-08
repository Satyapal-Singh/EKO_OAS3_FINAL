package io.swagger.api;

import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse20015;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.InlineResponse20019;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.InlineResponse20021;
import io.swagger.model.InlineResponse20022;
import io.swagger.model.InlineResponse20023;
import io.swagger.model.InlineResponse20024;
import io.swagger.model.InlineResponse20025;
import io.swagger.model.InlineResponse20026;
import io.swagger.model.InlineResponse20034;
import io.swagger.model.InlineResponse20035;
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
public class V2ApiController implements V2Api {

    private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> v2AepsPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "2-Cash;3-Balance;4-Stat" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_type", required = true) Integer serviceType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Value of customer's mobile number who wants the cash" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer API Docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_code", required = true) String bankCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount or 0 for Bal" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@NotNull @Parameter(in = ParameterIn.QUERY, description = "1- SMS, Default- 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "notify_customer", required = true) String notifyCustomer,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Encrypted AADHAR number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "aadhar", required = true) String aadhar,@NotNull @Parameter(in = ParameterIn.QUERY, description = "PID Data of the biometric device" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "piddata", required = true) String piddata,@NotNull @Parameter(in = ParameterIn.QUERY, description = "latlon of requesting user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = true) String latlong,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IP of merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "real_source_ip", required = true) String realSourceIp,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.HEADER, description = "Refer to API Docs" ,required=true,schema=@Schema()) @RequestHeader(value="request_hash", required=true) String requestHash) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20034> v2BanksGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_code", required = true) String bankCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = false) String ifsc) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20034>(objectMapper.readValue("\"\"", InlineResponse20034.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20034>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20034>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20035> v2CustomersCustomerIdTypecustomerIdBalanceGet(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("customer_id") String customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20035>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"last_used_okekey\" : \"last_used_okekey\",\n    \"balance\" : \"balance\",\n    \"currency\" : \"currency\",\n    \"customer_id\" : \"customer_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20035.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20035>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20035>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20012> v2CustomersCustomerIdTypecustomerIdGet(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("customer_id") String customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("\"\"", InlineResponse20012.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20012> v2CustomersCustomerIdTypecustomerIdGet(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("customer_id") String customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "share code set by customer on the uidai website" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "aadhaar_xml_password", required = true) String aadhaarXmlPassword,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer the docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ovd_type_id", required = true) Integer ovdTypeId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "OVD (other valid documents) proof number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ovd_number", required = true) String ovdNumber,@NotNull @Parameter(in = ParameterIn.QUERY, description = "value = 2" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "kyc_option", required = true) Integer kycOption,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Zip file downloaded" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "Zip_file", required = true) Resource zipFile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ovd_image", required = true) Resource ovdImage,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "ovd_image_back", required = false) Resource ovdImageBack,@Parameter(in = ParameterIn.QUERY, description = "zip file which has been downloaded from UIDAI" ,schema=@Schema()) @Valid @RequestParam(value = "file_name", required = false) Resource fileName,@Parameter(in = ParameterIn.QUERY, description = "If not passing PAN" ,schema=@Schema()) @Valid @RequestParam(value = "form_60", required = false) Resource form60) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("\"\"", InlineResponse20012.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20015> v2CustomersCustomerIdTypecustomerIdOtpPut(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") Integer customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20015>(objectMapper.readValue("\"\"", InlineResponse20015.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20015>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20015>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20013> v2CustomersCustomerIdTypecustomerIdPut(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of customer's mobile number", required=true, schema=@Schema()) @PathVariable("customer_id") String customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of the customer as per id" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "name", required = true) String name,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Date of Birth of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "dob", required = true) String dob,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Residence address of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "residence_address", required = true) List<String> residenceAddress,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20013>(objectMapper.readValue("\"\"", InlineResponse20013.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20013>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20013>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20016> v2CustomersCustomerIdTypecustomerIdPut(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") Integer customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of customer as per id proof" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "name", required = true) String name,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer to docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id_proof_type_id", required = true) Integer idProofTypeId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "ID Proof Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id_proof", required = true) String idProof,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer to docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ovd_type_id", required = true) Integer ovdTypeId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "OVD proof number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ovd_number", required = true) String ovdNumber,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Front image of id proof" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "file1(front)", required = true) Resource file1Front,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Back image of id proof" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "file2(back)", required = true) Resource file2Back,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Photo of the Customer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_photo", required = true) Resource customerPhoto,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Image of OVD" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ovd_image", required = true) Resource ovdImage,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Residence address of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "residence_address", required = true) List<String> residenceAddress,@NotNull @Parameter(in = ParameterIn.QUERY, description = "DOB of customer in YYYY-MM-DD format" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "dob", required = true) String dob,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Back of proof (other than PAN)" ,schema=@Schema()) @Valid @RequestParam(value = "ovd_image_back", required = false) Resource ovdImageBack,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "customer_name_as_id", required = false) String customerNameAsId,@Parameter(in = ParameterIn.QUERY, description = "If not passing PAN" ,schema=@Schema()) @Valid @RequestParam(value = "form_60", required = false) Resource form60) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20016>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20016.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20016>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20016>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20018> v2CustomersCustomerIdTypecustomerIdRecipientsGet(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") Integer customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20018>(objectMapper.readValue("\"\"", InlineResponse20018.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20018>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20018>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20019> v2CustomersCustomerIdTypecustomerIdRecipientsRecipientIdidGet(@Parameter(in = ParameterIn.PATH, description = "Unique recipient ID", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id") String customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "For a India to Nepal remittance transaction" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "product", required = true) String product,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20019>(objectMapper.readValue("\"\"", InlineResponse20019.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20019>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20019>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20020> v2CustomersCustomerIdTypecustomerIdRecipientsRecipientsIdTypeidPost(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id_type") String customerIdType,@Parameter(in = ParameterIn.PATH, description = "Value of Mobile Number", required=true, schema=@Schema()) @PathVariable("customer_id") Integer customerId,@Parameter(in = ParameterIn.PATH, description = "Refer to docs", required=true, schema=@Schema()) @PathVariable("recipients_id_type") Integer recipientsIdType,@Parameter(in = ParameterIn.PATH, description = "Unique recipient ID", required=true, schema=@Schema()) @PathVariable("id") String id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique ID for each bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_id", required = true) String bankId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of the recipient" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = true) String recipientName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_mobile", required = true) Integer recipientMobile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_type", required = true) Integer recipientType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20020>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"recipient_mobile\" : \"recipient_mobile\",\n    \"recipient_id_type\" : \"recipient_id_type\",\n    \"customer_id\" : \"customer_id\",\n    \"pipes\" : { },\n    \"recipient_id\" : 6\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse20020.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20020>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20020>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20017> v2CustomersIdTypeidProductchangenameOtpPost(@Parameter(in = ParameterIn.PATH, description = "Fixed as mobile number", required=true, schema=@Schema()) @PathVariable("id_type") String idType,@Parameter(in = ParameterIn.PATH, description = "Mobile number of customer", required=true, schema=@Schema()) @PathVariable("id") Integer id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique Cell Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=false) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20017>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"otp\" : \"otp\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20017.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20017>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20017>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20016> v2CustomersProductchangenameVerificationOtpotpPut(@Parameter(in = ParameterIn.PATH, description = "OTP received on customer mobile", required=true, schema=@Schema()) @PathVariable("otp") Integer otp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique Cell Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Fixed as mobile number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id_type", required = true) String idType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of customer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=false) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20016>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20016.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20016>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20016>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20014> v2CustomersVerificationOtpotpPut(@Parameter(in = ParameterIn.PATH, description = "Mobile Number", required=true, schema=@Schema()) @PathVariable("otp") Integer otp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id_type", required = true) String customerIdType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Value of customer's mobile number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "partner id from where the request has been initiated" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer from whom the requet is coming" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@NotNull @Parameter(in = ParameterIn.QUERY, description = "value of otp_ref_id received in response of create customer API" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp_ref_id", required = true) String otpRefId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20014>(objectMapper.readValue("\"\"", InlineResponse20014.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20014>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20014>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20023> v2TransactionsBatchIdOtpPost(@Parameter(in = ParameterIn.PATH, description = "Batch id received in the response of Initiate Transaction", required=true, schema=@Schema()) @PathVariable("batch_id") Integer batchId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20023>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"batch_id\" : \"batch_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20023.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20023>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20023>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20022> v2TransactionsBatchIdVerifyPut(@Parameter(in = ParameterIn.PATH, description = "Batch id received in the response of initiate Transaction API", required=true, schema=@Schema()) @PathVariable("batch_id") Integer batchId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "OTP received on the customer mobile number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp", required = true) Integer otp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer to docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20022>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"tx_status\" : \"tx_status\",\n    \"debit_user_id\" : \"debit_user_id\",\n    \"tds\" : \"tds\",\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"fee\" : \"fee\",\n    \"total_sent\" : \"total_sent\",\n    \"channel\" : \"channel\",\n    \"collectable_amount\" : \"collectable_amount\",\n    \"txn_wallet\" : \"txn_wallet\",\n    \"utility_acc_no\" : \"utility_acc_no\",\n    \"sender_name\" : \"sender_name\",\n    \"ekyc_enabled\" : \"ekyc_enabled\",\n    \"remaining_limit_before_pan_required\" : 6,\n    \"tid\" : \"tid\",\n    \"bank\" : \"bank\",\n    \"utrnumber\" : \"utrnumber\",\n    \"balance\" : \"balance\",\n    \"user_code\" : \"user_code\",\n    \"totalfee\" : \"totalfee\",\n    \"next_allowed_limit\" : \"next_allowed_limit\",\n    \"is_otp_required\" : \"is_otp_required\",\n    \"aadhar\" : \"aadhar\",\n    \"currency\" : \"currency\",\n    \"commission\" : \"commission\",\n    \"pipe\" : 1,\n    \"state\" : \"state\",\n    \"bank_ref_num\" : \"bank_ref_num\",\n    \"recipient_id\" : 5,\n    \"timestamp\" : \"timestamp\",\n    \"amount\" : \"amount\",\n    \"pan_required\" : 5,\n    \"pinNo\" : \"pinNo\",\n    \"gst_benefit\" : \"gst_benefit\",\n    \"payment_mode_desc\" : \"payment_mode_desc\",\n    \"channel_desc\" : \"channel_desc\",\n    \"last_used_okekey\" : \"last_used_okekey\",\n    \"npr\" : \"npr\",\n    \"service_tax\" : \"service_tax\",\n    \"paymentid\" : \"paymentid\",\n    \"mdr\" : \"mdr\",\n    \"recipient_name\" : \"recipient_name\",\n    \"customer_id\" : \"customer_id\",\n    \"account\" : \"account\",\n    \"kyc_state\" : \"kyc_state\"\n  },\n  \"response_type_id\" : 2,\n  \"message\" : \"message\",\n  \"status\" : 7\n}", InlineResponse20022.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20022>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20022>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20024> v2TransactionsIdGet(@Parameter(in = ParameterIn.PATH, description = "TID or client_ref_id", required=true, schema=@Schema()) @PathVariable("id") String id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20024>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"tx_status\" : \"tx_status\",\n    \"tds\" : \"tds\",\n    \"amount\" : \"amount\",\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"fee\" : \"fee\",\n    \"channel\" : \"channel\",\n    \"txn_wallet\" : \"txn_wallet\",\n    \"branch\" : \"branch\",\n    \"gst_benefit\" : \"gst_benefit\",\n    \"tid\" : \"tid\",\n    \"allow_retry\" : \"allow_retry\",\n    \"tx_desc\" : \"tx_desc\",\n    \"client_ref_id\" : \"client_ref_id\",\n    \"service_tax\" : \"service_tax\",\n    \"currency\" : \"currency\",\n    \"commission\" : \"commission\",\n    \"pipe\" : 6,\n    \"bank_ref_num\" : \"bank_ref_num\",\n    \"customer_id\" : \"customer_id\",\n    \"recipient_id\" : 1,\n    \"timestamp\" : \"timestamp\"\n  },\n  \"response_type_id\" : 5,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse20024.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20024>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20024>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20026> v2TransactionsIdRefundOtpPost(@Parameter(in = ParameterIn.PATH, description = "Eko tid or partner's unique reference id", required=true, schema=@Schema()) @PathVariable("id") String id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20026>(objectMapper.readValue("{\n  \"response_status_id\" : 6,\n  \"data\" : {\n    \"otp\" : \"otp\",\n    \"tid\" : \"tid\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20026.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20026>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20026>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20021> v2TransactionsPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_id", required = true) Integer recipientId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer to docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "timestamp", required = true) String timestamp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "currency", required = true) String currency,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique reference number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "1 - Commit, 2- Hold" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "state", required = true) Integer state,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "channel", required = true) Integer channel,@NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = false) String latlong) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20021>(objectMapper.readValue("\"\"", InlineResponse20021.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20021>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20021>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20025> v2TransactionsTidRefundPost(@Parameter(in = ParameterIn.PATH, description = "Eko tid or partner's unique reference id", required=true, schema=@Schema()) @PathVariable("tid") String tid,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "OTP shared with customer on the registered mobile number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp", required = true) Integer otp,@NotNull @Parameter(in = ParameterIn.QUERY, description = "current status of the transaction; 1 denotes \"commit\"" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "state", required = true) Integer state,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20025>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"refund_tid\" : \"refund_tid\",\n    \"amount\" : \"amount\",\n    \"tds\" : \"tds\",\n    \"balance\" : \"balance\",\n    \"fee\" : \"fee\",\n    \"currency\" : \"currency\",\n    \"commission_reverse\" : \"commission_reverse\",\n    \"tid\" : \"tid\",\n    \"timestamp\" : \"timestamp\",\n    \"refunded_amount\" : \"refunded_amount\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20025.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20025>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20025>(HttpStatus.OK);
    }

}
