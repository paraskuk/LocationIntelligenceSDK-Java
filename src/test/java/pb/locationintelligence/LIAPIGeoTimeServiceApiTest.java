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


package pb.locationintelligence;

import pb.ApiException;
import pb.locationintelligence.model.Timezone;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoTimeServiceApi
 */
public class LIAPIGeoTimeServiceApiTest {

    private final LIAPIGeoTimeServiceApi api = new LIAPIGeoTimeServiceApi();

    
    /**
     * Timezone By Address.
     *
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTimezoneByAddressTest() throws ApiException {
        String timestamp = null;
        String address = null;
        // Timezone response = api.getTimezoneByAddress(timestamp, address);

        // TODO: test validations
    }
    
    /**
     * Timezone By Location.
     *
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTimezoneByLocationTest() throws ApiException {
        String timestamp = null;
        String longitude = null;
        String latitude = null;
        // Timezone response = api.getTimezoneByLocation(timestamp, longitude, latitude);

        // TODO: test validations
    }
    
}