/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FieldsMatching
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class FieldsMatching   {
  @SerializedName("matchOnAddressNumber")
  private Boolean matchOnAddressNumber = false;

  @SerializedName("matchOnPostCode1")
  private Boolean matchOnPostCode1 = false;

  @SerializedName("matchOnPostCode2")
  private Boolean matchOnPostCode2 = false;

  @SerializedName("matchOnAreaName1")
  private Boolean matchOnAreaName1 = false;

  @SerializedName("matchOnAreaName2")
  private Boolean matchOnAreaName2 = false;

  @SerializedName("matchOnAreaName3")
  private Boolean matchOnAreaName3 = false;

  @SerializedName("matchOnAreaName4")
  private Boolean matchOnAreaName4 = false;

  @SerializedName("matchOnAllStreetFields")
  private Boolean matchOnAllStreetFields = false;

  @SerializedName("matchOnStreetName")
  private Boolean matchOnStreetName = false;

  @SerializedName("matchOnStreetType")
  private Boolean matchOnStreetType = false;

  @SerializedName("matchOnStreetDirectional")
  private Boolean matchOnStreetDirectional = false;

  @SerializedName("matchOnPlaceName")
  private Boolean matchOnPlaceName = false;

  @SerializedName("matchOnInputFields")
  private Boolean matchOnInputFields = false;

  public FieldsMatching matchOnAddressNumber(Boolean matchOnAddressNumber) {
    this.matchOnAddressNumber = matchOnAddressNumber;
    return this;
  }

   /**
   * Get matchOnAddressNumber
   * @return matchOnAddressNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnAddressNumber() {
    return matchOnAddressNumber;
  }

  public void setMatchOnAddressNumber(Boolean matchOnAddressNumber) {
    this.matchOnAddressNumber = matchOnAddressNumber;
  }

  public FieldsMatching matchOnPostCode1(Boolean matchOnPostCode1) {
    this.matchOnPostCode1 = matchOnPostCode1;
    return this;
  }

   /**
   * Get matchOnPostCode1
   * @return matchOnPostCode1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnPostCode1() {
    return matchOnPostCode1;
  }

  public void setMatchOnPostCode1(Boolean matchOnPostCode1) {
    this.matchOnPostCode1 = matchOnPostCode1;
  }

  public FieldsMatching matchOnPostCode2(Boolean matchOnPostCode2) {
    this.matchOnPostCode2 = matchOnPostCode2;
    return this;
  }

   /**
   * Get matchOnPostCode2
   * @return matchOnPostCode2
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnPostCode2() {
    return matchOnPostCode2;
  }

  public void setMatchOnPostCode2(Boolean matchOnPostCode2) {
    this.matchOnPostCode2 = matchOnPostCode2;
  }

  public FieldsMatching matchOnAreaName1(Boolean matchOnAreaName1) {
    this.matchOnAreaName1 = matchOnAreaName1;
    return this;
  }

   /**
   * Get matchOnAreaName1
   * @return matchOnAreaName1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnAreaName1() {
    return matchOnAreaName1;
  }

  public void setMatchOnAreaName1(Boolean matchOnAreaName1) {
    this.matchOnAreaName1 = matchOnAreaName1;
  }

  public FieldsMatching matchOnAreaName2(Boolean matchOnAreaName2) {
    this.matchOnAreaName2 = matchOnAreaName2;
    return this;
  }

   /**
   * Get matchOnAreaName2
   * @return matchOnAreaName2
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnAreaName2() {
    return matchOnAreaName2;
  }

  public void setMatchOnAreaName2(Boolean matchOnAreaName2) {
    this.matchOnAreaName2 = matchOnAreaName2;
  }

  public FieldsMatching matchOnAreaName3(Boolean matchOnAreaName3) {
    this.matchOnAreaName3 = matchOnAreaName3;
    return this;
  }

   /**
   * Get matchOnAreaName3
   * @return matchOnAreaName3
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnAreaName3() {
    return matchOnAreaName3;
  }

  public void setMatchOnAreaName3(Boolean matchOnAreaName3) {
    this.matchOnAreaName3 = matchOnAreaName3;
  }

  public FieldsMatching matchOnAreaName4(Boolean matchOnAreaName4) {
    this.matchOnAreaName4 = matchOnAreaName4;
    return this;
  }

   /**
   * Get matchOnAreaName4
   * @return matchOnAreaName4
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnAreaName4() {
    return matchOnAreaName4;
  }

  public void setMatchOnAreaName4(Boolean matchOnAreaName4) {
    this.matchOnAreaName4 = matchOnAreaName4;
  }

  public FieldsMatching matchOnAllStreetFields(Boolean matchOnAllStreetFields) {
    this.matchOnAllStreetFields = matchOnAllStreetFields;
    return this;
  }

   /**
   * Get matchOnAllStreetFields
   * @return matchOnAllStreetFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnAllStreetFields() {
    return matchOnAllStreetFields;
  }

  public void setMatchOnAllStreetFields(Boolean matchOnAllStreetFields) {
    this.matchOnAllStreetFields = matchOnAllStreetFields;
  }

  public FieldsMatching matchOnStreetName(Boolean matchOnStreetName) {
    this.matchOnStreetName = matchOnStreetName;
    return this;
  }

   /**
   * Get matchOnStreetName
   * @return matchOnStreetName
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnStreetName() {
    return matchOnStreetName;
  }

  public void setMatchOnStreetName(Boolean matchOnStreetName) {
    this.matchOnStreetName = matchOnStreetName;
  }

  public FieldsMatching matchOnStreetType(Boolean matchOnStreetType) {
    this.matchOnStreetType = matchOnStreetType;
    return this;
  }

   /**
   * Get matchOnStreetType
   * @return matchOnStreetType
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnStreetType() {
    return matchOnStreetType;
  }

  public void setMatchOnStreetType(Boolean matchOnStreetType) {
    this.matchOnStreetType = matchOnStreetType;
  }

  public FieldsMatching matchOnStreetDirectional(Boolean matchOnStreetDirectional) {
    this.matchOnStreetDirectional = matchOnStreetDirectional;
    return this;
  }

   /**
   * Get matchOnStreetDirectional
   * @return matchOnStreetDirectional
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnStreetDirectional() {
    return matchOnStreetDirectional;
  }

  public void setMatchOnStreetDirectional(Boolean matchOnStreetDirectional) {
    this.matchOnStreetDirectional = matchOnStreetDirectional;
  }

  public FieldsMatching matchOnPlaceName(Boolean matchOnPlaceName) {
    this.matchOnPlaceName = matchOnPlaceName;
    return this;
  }

   /**
   * Get matchOnPlaceName
   * @return matchOnPlaceName
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnPlaceName() {
    return matchOnPlaceName;
  }

  public void setMatchOnPlaceName(Boolean matchOnPlaceName) {
    this.matchOnPlaceName = matchOnPlaceName;
  }

  public FieldsMatching matchOnInputFields(Boolean matchOnInputFields) {
    this.matchOnInputFields = matchOnInputFields;
    return this;
  }

   /**
   * Get matchOnInputFields
   * @return matchOnInputFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMatchOnInputFields() {
    return matchOnInputFields;
  }

  public void setMatchOnInputFields(Boolean matchOnInputFields) {
    this.matchOnInputFields = matchOnInputFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsMatching fieldsMatching = (FieldsMatching) o;
    return Objects.equals(this.matchOnAddressNumber, fieldsMatching.matchOnAddressNumber) &&
        Objects.equals(this.matchOnPostCode1, fieldsMatching.matchOnPostCode1) &&
        Objects.equals(this.matchOnPostCode2, fieldsMatching.matchOnPostCode2) &&
        Objects.equals(this.matchOnAreaName1, fieldsMatching.matchOnAreaName1) &&
        Objects.equals(this.matchOnAreaName2, fieldsMatching.matchOnAreaName2) &&
        Objects.equals(this.matchOnAreaName3, fieldsMatching.matchOnAreaName3) &&
        Objects.equals(this.matchOnAreaName4, fieldsMatching.matchOnAreaName4) &&
        Objects.equals(this.matchOnAllStreetFields, fieldsMatching.matchOnAllStreetFields) &&
        Objects.equals(this.matchOnStreetName, fieldsMatching.matchOnStreetName) &&
        Objects.equals(this.matchOnStreetType, fieldsMatching.matchOnStreetType) &&
        Objects.equals(this.matchOnStreetDirectional, fieldsMatching.matchOnStreetDirectional) &&
        Objects.equals(this.matchOnPlaceName, fieldsMatching.matchOnPlaceName) &&
        Objects.equals(this.matchOnInputFields, fieldsMatching.matchOnInputFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchOnAddressNumber, matchOnPostCode1, matchOnPostCode2, matchOnAreaName1, matchOnAreaName2, matchOnAreaName3, matchOnAreaName4, matchOnAllStreetFields, matchOnStreetName, matchOnStreetType, matchOnStreetDirectional, matchOnPlaceName, matchOnInputFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsMatching {\n");
    
    sb.append("    matchOnAddressNumber: ").append(toIndentedString(matchOnAddressNumber)).append("\n");
    sb.append("    matchOnPostCode1: ").append(toIndentedString(matchOnPostCode1)).append("\n");
    sb.append("    matchOnPostCode2: ").append(toIndentedString(matchOnPostCode2)).append("\n");
    sb.append("    matchOnAreaName1: ").append(toIndentedString(matchOnAreaName1)).append("\n");
    sb.append("    matchOnAreaName2: ").append(toIndentedString(matchOnAreaName2)).append("\n");
    sb.append("    matchOnAreaName3: ").append(toIndentedString(matchOnAreaName3)).append("\n");
    sb.append("    matchOnAreaName4: ").append(toIndentedString(matchOnAreaName4)).append("\n");
    sb.append("    matchOnAllStreetFields: ").append(toIndentedString(matchOnAllStreetFields)).append("\n");
    sb.append("    matchOnStreetName: ").append(toIndentedString(matchOnStreetName)).append("\n");
    sb.append("    matchOnStreetType: ").append(toIndentedString(matchOnStreetType)).append("\n");
    sb.append("    matchOnStreetDirectional: ").append(toIndentedString(matchOnStreetDirectional)).append("\n");
    sb.append("    matchOnPlaceName: ").append(toIndentedString(matchOnPlaceName)).append("\n");
    sb.append("    matchOnInputFields: ").append(toIndentedString(matchOnInputFields)).append("\n");
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

