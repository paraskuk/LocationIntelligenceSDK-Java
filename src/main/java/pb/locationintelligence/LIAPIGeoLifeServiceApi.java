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

import pb.ApiCallback;
import pb.ApiClient;
import pb.ApiException;
import pb.ApiResponse;
import pb.Configuration;
import pb.Pair;
import pb.ProgressRequestBody;
import pb.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import pb.locationintelligence.model.Demographics;
import pb.locationintelligence.model.Segmentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIAPIGeoLifeServiceApi {
    private ApiClient apiClient;

    public LIAPIGeoLifeServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LIAPIGeoLifeServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDemographicsByAddress */
    private com.squareup.okhttp.Call getDemographicsByAddressCall(String address, String profile, String filter, String country, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getDemographicsByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geolife/v1/demographics/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (profile != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "profile", profile));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Demographics By Address.
     * Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     * @param address The address to be searched. (required)
     * @param profile Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending (optional)
     * @param filter The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. (optional)
     * @param country 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,IND,ITA,AUS,DEU. (optional)
     * @return Demographics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Demographics getDemographicsByAddress(String address, String profile, String filter, String country) throws ApiException {
        ApiResponse<Demographics> resp = getDemographicsByAddressWithHttpInfo(address, profile, filter, country);
        return resp.getData();
    }

    /**
     * Demographics By Address.
     * Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     * @param address The address to be searched. (required)
     * @param profile Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending (optional)
     * @param filter The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. (optional)
     * @param country 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,IND,ITA,AUS,DEU. (optional)
     * @return ApiResponse&lt;Demographics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Demographics> getDemographicsByAddressWithHttpInfo(String address, String profile, String filter, String country) throws ApiException {
        com.squareup.okhttp.Call call = getDemographicsByAddressCall(address, profile, filter, country, null, null);
        Type localVarReturnType = new TypeToken<Demographics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Demographics By Address. (asynchronously)
     * Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     * @param address The address to be searched. (required)
     * @param profile Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending (optional)
     * @param filter The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. (optional)
     * @param country 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,IND,ITA,AUS,DEU. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDemographicsByAddressAsync(String address, String profile, String filter, String country, final ApiCallback<Demographics> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDemographicsByAddressCall(address, profile, filter, country, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Demographics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDemographicsByLocation */
    private com.squareup.okhttp.Call getDemographicsByLocationCall(String longitude, String latitude, String profile, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getDemographicsByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getDemographicsByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geolife/v1/demographics/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
        if (profile != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "profile", profile));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Demographics By Location.
     * Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param profile Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending (optional)
     * @param filter The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. (optional)
     * @return Demographics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Demographics getDemographicsByLocation(String longitude, String latitude, String profile, String filter) throws ApiException {
        ApiResponse<Demographics> resp = getDemographicsByLocationWithHttpInfo(longitude, latitude, profile, filter);
        return resp.getData();
    }

    /**
     * Demographics By Location.
     * Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param profile Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending (optional)
     * @param filter The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. (optional)
     * @return ApiResponse&lt;Demographics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Demographics> getDemographicsByLocationWithHttpInfo(String longitude, String latitude, String profile, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getDemographicsByLocationCall(longitude, latitude, profile, filter, null, null);
        Type localVarReturnType = new TypeToken<Demographics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Demographics By Location. (asynchronously)
     * Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param profile Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending (optional)
     * @param filter The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDemographicsByLocationAsync(String longitude, String latitude, String profile, String filter, final ApiCallback<Demographics> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDemographicsByLocationCall(longitude, latitude, profile, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Demographics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSegmentationByAddress */
    private com.squareup.okhttp.Call getSegmentationByAddressCall(String address, String country, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getSegmentationByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geolife/v1/segmentation/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Segmentation By Address.
     * Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     * @param address The address to be searched. (required)
     * @param country 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU. (optional)
     * @return Segmentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Segmentation getSegmentationByAddress(String address, String country) throws ApiException {
        ApiResponse<Segmentation> resp = getSegmentationByAddressWithHttpInfo(address, country);
        return resp.getData();
    }

    /**
     * Segmentation By Address.
     * Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     * @param address The address to be searched. (required)
     * @param country 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU. (optional)
     * @return ApiResponse&lt;Segmentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Segmentation> getSegmentationByAddressWithHttpInfo(String address, String country) throws ApiException {
        com.squareup.okhttp.Call call = getSegmentationByAddressCall(address, country, null, null);
        Type localVarReturnType = new TypeToken<Segmentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Segmentation By Address. (asynchronously)
     * Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     * @param address The address to be searched. (required)
     * @param country 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSegmentationByAddressAsync(String address, String country, final ApiCallback<Segmentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSegmentationByAddressCall(address, country, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Segmentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSegmentationByLocation */
    private com.squareup.okhttp.Call getSegmentationByLocationCall(String longitude, String latitude, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getSegmentationByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getSegmentationByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geolife/v1/segmentation/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Segmentation By Location.
     * Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return Segmentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Segmentation getSegmentationByLocation(String longitude, String latitude) throws ApiException {
        ApiResponse<Segmentation> resp = getSegmentationByLocationWithHttpInfo(longitude, latitude);
        return resp.getData();
    }

    /**
     * Segmentation By Location.
     * Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return ApiResponse&lt;Segmentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Segmentation> getSegmentationByLocationWithHttpInfo(String longitude, String latitude) throws ApiException {
        com.squareup.okhttp.Call call = getSegmentationByLocationCall(longitude, latitude, null, null);
        Type localVarReturnType = new TypeToken<Segmentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Segmentation By Location. (asynchronously)
     * Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSegmentationByLocationAsync(String longitude, String latitude, final ApiCallback<Segmentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSegmentationByLocationCall(longitude, latitude, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Segmentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
