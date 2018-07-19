package com.mudassirshahzad.swaggerServer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TestProductListTransaction1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-19T16:46:07.850+04:00")

public class TestProductListTransaction1   {
  @JsonProperty("param1")
  private String param1 = null;

  @JsonProperty("param2")
  private String param2 = null;

  public TestProductListTransaction1 param1(String param1) {
    this.param1 = param1;
    return this;
  }

  /**
   * Session id.
   * @return param1
  **/
  @ApiModelProperty(required = true, value = "Session id.")
  public String getParam1() {
    return param1;
  }

  public void setParam1(String param1) {
    this.param1 = param1;
  }

  public TestProductListTransaction1 param2(String param2) {
    this.param2 = param2;
    return this;
  }

  /**
   * Other Id. sample value 00999990390.
   * @return param2
  **/
  @ApiModelProperty(value = "Other Id. sample value 00999990390.")
  public String getParam2() {
    return param2;
  }

  public void setParam2(String param2) {
    this.param2 = param2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestProductListTransaction1 testProductListTransaction1 = (TestProductListTransaction1) o;
    return Objects.equals(this.param1, testProductListTransaction1.param1) &&
        Objects.equals(this.param2, testProductListTransaction1.param2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param1, param2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestProductListTransaction1 {\n");
    
    sb.append("    param1: ").append(toIndentedString(param1)).append("\n");
    sb.append("    param2: ").append(toIndentedString(param2)).append("\n");
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

