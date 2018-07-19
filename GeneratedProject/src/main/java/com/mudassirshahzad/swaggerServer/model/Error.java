package com.mudassirshahzad.swaggerServer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Error
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-19T16:46:07.850+04:00")

public class Error   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("systemErrorCode")
  private String systemErrorCode = null;

  @JsonProperty("errorDescription")
  private String errorDescription = null;

  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * error code
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "error code")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public Error systemErrorCode(String systemErrorCode) {
    this.systemErrorCode = systemErrorCode;
    return this;
  }

  /**
   * error code given by the backend system, CRIS
   * @return systemErrorCode
  **/
  @ApiModelProperty(value = "error code given by the backend system, CRIS")
  public String getSystemErrorCode() {
    return systemErrorCode;
  }

  public void setSystemErrorCode(String systemErrorCode) {
    this.systemErrorCode = systemErrorCode;
  }

  public Error errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * description of the error code.
   * @return errorDescription
  **/
  @ApiModelProperty(value = "description of the error code.")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.systemErrorCode, error.systemErrorCode) &&
        Objects.equals(this.errorDescription, error.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, systemErrorCode, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    systemErrorCode: ").append(toIndentedString(systemErrorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

