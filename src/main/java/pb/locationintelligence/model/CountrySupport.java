/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.0.0
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
import java.util.ArrayList;
import java.util.List;


/**
 * CountrySupport
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-07T16:31:43.806+05:30")
public class CountrySupport   {
  @SerializedName("supportedCountries")
  private List<String> supportedCountries = new ArrayList<String>();

  @SerializedName("supportedDataTypes")
  private List<String> supportedDataTypes = new ArrayList<String>();

  public CountrySupport supportedCountries(List<String> supportedCountries) {
    this.supportedCountries = supportedCountries;
    return this;
  }

   /**
   * Get supportedCountries
   * @return supportedCountries
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSupportedCountries() {
    return supportedCountries;
  }

  public void setSupportedCountries(List<String> supportedCountries) {
    this.supportedCountries = supportedCountries;
  }

  public CountrySupport supportedDataTypes(List<String> supportedDataTypes) {
    this.supportedDataTypes = supportedDataTypes;
    return this;
  }

   /**
   * Get supportedDataTypes
   * @return supportedDataTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSupportedDataTypes() {
    return supportedDataTypes;
  }

  public void setSupportedDataTypes(List<String> supportedDataTypes) {
    this.supportedDataTypes = supportedDataTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountrySupport countrySupport = (CountrySupport) o;
    return Objects.equals(this.supportedCountries, countrySupport.supportedCountries) &&
        Objects.equals(this.supportedDataTypes, countrySupport.supportedDataTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedCountries, supportedDataTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountrySupport {\n");
    
    sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
    sb.append("    supportedDataTypes: ").append(toIndentedString(supportedDataTypes)).append("\n");
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
