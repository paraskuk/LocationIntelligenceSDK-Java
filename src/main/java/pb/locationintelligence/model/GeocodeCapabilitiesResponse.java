/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.6.0
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
import pb.locationintelligence.model.CustomObject;
import pb.locationintelligence.model.Operation;


/**
 * GeocodeCapabilitiesResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-13T02:57:26.849+05:30")
public class GeocodeCapabilitiesResponse   {
  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("serviceDescription")
  private String serviceDescription = null;

  @SerializedName("coreVersion")
  private String coreVersion = null;

  @SerializedName("supportedCountries")
  private List<String> supportedCountries = new ArrayList<String>();

  @SerializedName("supportedOperations")
  private List<Operation> supportedOperations = new ArrayList<Operation>();

  @SerializedName("customObjects")
  private List<CustomObject> customObjects = new ArrayList<CustomObject>();

  public GeocodeCapabilitiesResponse serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public GeocodeCapabilitiesResponse serviceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

   /**
   * Get serviceDescription
   * @return serviceDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public GeocodeCapabilitiesResponse coreVersion(String coreVersion) {
    this.coreVersion = coreVersion;
    return this;
  }

   /**
   * Get coreVersion
   * @return coreVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoreVersion() {
    return coreVersion;
  }

  public void setCoreVersion(String coreVersion) {
    this.coreVersion = coreVersion;
  }

  public GeocodeCapabilitiesResponse supportedCountries(List<String> supportedCountries) {
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

  public GeocodeCapabilitiesResponse supportedOperations(List<Operation> supportedOperations) {
    this.supportedOperations = supportedOperations;
    return this;
  }

   /**
   * Get supportedOperations
   * @return supportedOperations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Operation> getSupportedOperations() {
    return supportedOperations;
  }

  public void setSupportedOperations(List<Operation> supportedOperations) {
    this.supportedOperations = supportedOperations;
  }

  public GeocodeCapabilitiesResponse customObjects(List<CustomObject> customObjects) {
    this.customObjects = customObjects;
    return this;
  }

   /**
   * Get customObjects
   * @return customObjects
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CustomObject> getCustomObjects() {
    return customObjects;
  }

  public void setCustomObjects(List<CustomObject> customObjects) {
    this.customObjects = customObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeCapabilitiesResponse geocodeCapabilitiesResponse = (GeocodeCapabilitiesResponse) o;
    return Objects.equals(this.serviceName, geocodeCapabilitiesResponse.serviceName) &&
        Objects.equals(this.serviceDescription, geocodeCapabilitiesResponse.serviceDescription) &&
        Objects.equals(this.coreVersion, geocodeCapabilitiesResponse.coreVersion) &&
        Objects.equals(this.supportedCountries, geocodeCapabilitiesResponse.supportedCountries) &&
        Objects.equals(this.supportedOperations, geocodeCapabilitiesResponse.supportedOperations) &&
        Objects.equals(this.customObjects, geocodeCapabilitiesResponse.customObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, serviceDescription, coreVersion, supportedCountries, supportedOperations, customObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeCapabilitiesResponse {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    coreVersion: ").append(toIndentedString(coreVersion)).append("\n");
    sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
    sb.append("    supportedOperations: ").append(toIndentedString(supportedOperations)).append("\n");
    sb.append("    customObjects: ").append(toIndentedString(customObjects)).append("\n");
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

