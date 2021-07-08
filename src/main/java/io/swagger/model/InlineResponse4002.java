package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse4002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-03T14:36:23.648Z[GMT]")


public class InlineResponse4002   {
  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("status_desc")
  private String statusDesc = null;

  @JsonProperty("response_code")
  private String responseCode = null;

  @JsonProperty("response_code_desc")
  private String responseCodeDesc = null;

  @JsonProperty("error")
  private Object error = null;

  @JsonProperty("statusId")
  private Integer statusId = null;

  @JsonProperty("response_status_id")
  private Integer responseStatusId = null;

  public InlineResponse4002 status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InlineResponse4002 statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  /**
   * Get statusDesc
   * @return statusDesc
   **/
  @Schema(description = "")
  
    public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public InlineResponse4002 responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   **/
  @Schema(description = "")
  
    public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public InlineResponse4002 responseCodeDesc(String responseCodeDesc) {
    this.responseCodeDesc = responseCodeDesc;
    return this;
  }

  /**
   * Get responseCodeDesc
   * @return responseCodeDesc
   **/
  @Schema(description = "")
  
    public String getResponseCodeDesc() {
    return responseCodeDesc;
  }

  public void setResponseCodeDesc(String responseCodeDesc) {
    this.responseCodeDesc = responseCodeDesc;
  }

  public InlineResponse4002 error(Object error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema(description = "")
  
    public Object getError() {
    return error;
  }

  public void setError(Object error) {
    this.error = error;
  }

  public InlineResponse4002 statusId(Integer statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
   **/
  @Schema(description = "")
  
    public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public InlineResponse4002 responseStatusId(Integer responseStatusId) {
    this.responseStatusId = responseStatusId;
    return this;
  }

  /**
   * Get responseStatusId
   * @return responseStatusId
   **/
  @Schema(description = "")
  
    public Integer getResponseStatusId() {
    return responseStatusId;
  }

  public void setResponseStatusId(Integer responseStatusId) {
    this.responseStatusId = responseStatusId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4002 inlineResponse4002 = (InlineResponse4002) o;
    return Objects.equals(this.status, inlineResponse4002.status) &&
        Objects.equals(this.statusDesc, inlineResponse4002.statusDesc) &&
        Objects.equals(this.responseCode, inlineResponse4002.responseCode) &&
        Objects.equals(this.responseCodeDesc, inlineResponse4002.responseCodeDesc) &&
        Objects.equals(this.error, inlineResponse4002.error) &&
        Objects.equals(this.statusId, inlineResponse4002.statusId) &&
        Objects.equals(this.responseStatusId, inlineResponse4002.responseStatusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusDesc, responseCode, responseCodeDesc, error, statusId, responseStatusId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4002 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseCodeDesc: ").append(toIndentedString(responseCodeDesc)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    responseStatusId: ").append(toIndentedString(responseStatusId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
