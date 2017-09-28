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

import pb.locationintelligence.model.GeoPropertyResponse;
import pb.locationintelligence.model.GeoPropertyResponses;
import pb.locationintelligence.model.GeoPropertyAddressRequest;
import pb.locationintelligence.model.GeoPropertyPBKeyRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIAPIGeoPropertyServiceApi {
    private ApiClient apiClient;

    public LIAPIGeoPropertyServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LIAPIGeoPropertyServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getGeoPropertyByAddress */
    private com.squareup.okhttp.Call getGeoPropertyByAddressCall(String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getGeoPropertyByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geoproperty/v1/all/attributes/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));

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
     * Gets GeoPropertyResponse
     * Gets GeoPropertyResponse
     * @param address free form address text (required)
     * @return GeoPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoPropertyResponse getGeoPropertyByAddress(String address) throws ApiException {
        ApiResponse<GeoPropertyResponse> resp = getGeoPropertyByAddressWithHttpInfo(address);
        return resp.getData();
    }

    /**
     * Gets GeoPropertyResponse
     * Gets GeoPropertyResponse
     * @param address free form address text (required)
     * @return ApiResponse&lt;GeoPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoPropertyResponse> getGeoPropertyByAddressWithHttpInfo(String address) throws ApiException {
        com.squareup.okhttp.Call call = getGeoPropertyByAddressCall(address, null, null);
        Type localVarReturnType = new TypeToken<GeoPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets GeoPropertyResponse (asynchronously)
     * Gets GeoPropertyResponse
     * @param address free form address text (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeoPropertyByAddressAsync(String address, final ApiCallback<GeoPropertyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeoPropertyByAddressCall(address, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getGeoPropertyByAddressBatch */
    private com.squareup.okhttp.Call getGeoPropertyByAddressBatchCall(GeoPropertyAddressRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        

        // create path and map variables
        String localVarPath = "/geoproperty/v1/all/attributes/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets GeoPropertyResponses
     * Gets GeoPropertyResponses
     * @param body  (optional)
     * @return GeoPropertyResponses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoPropertyResponses getGeoPropertyByAddressBatch(GeoPropertyAddressRequest body) throws ApiException {
        ApiResponse<GeoPropertyResponses> resp = getGeoPropertyByAddressBatchWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Gets GeoPropertyResponses
     * Gets GeoPropertyResponses
     * @param body  (optional)
     * @return ApiResponse&lt;GeoPropertyResponses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoPropertyResponses> getGeoPropertyByAddressBatchWithHttpInfo(GeoPropertyAddressRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getGeoPropertyByAddressBatchCall(body, null, null);
        Type localVarReturnType = new TypeToken<GeoPropertyResponses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets GeoPropertyResponses (asynchronously)
     * Gets GeoPropertyResponses
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeoPropertyByAddressBatchAsync(GeoPropertyAddressRequest body, final ApiCallback<GeoPropertyResponses> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeoPropertyByAddressBatchCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoPropertyResponses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getGeoPropertyByPBKey */
    private com.squareup.okhttp.Call getGeoPropertyByPBKeyCall(String pbKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pbKey' is set
        if (pbKey == null) {
            throw new ApiException("Missing the required parameter 'pbKey' when calling getGeoPropertyByPBKey(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geoproperty/v1/all/attributes/bypbkey".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pbKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pbKey", pbKey));

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
     * Gets GeoPropertyResponse
     * Gets GeoPropertyResponse
     * @param pbKey free form text (required)
     * @return GeoPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoPropertyResponse getGeoPropertyByPBKey(String pbKey) throws ApiException {
        ApiResponse<GeoPropertyResponse> resp = getGeoPropertyByPBKeyWithHttpInfo(pbKey);
        return resp.getData();
    }

    /**
     * Gets GeoPropertyResponse
     * Gets GeoPropertyResponse
     * @param pbKey free form text (required)
     * @return ApiResponse&lt;GeoPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoPropertyResponse> getGeoPropertyByPBKeyWithHttpInfo(String pbKey) throws ApiException {
        com.squareup.okhttp.Call call = getGeoPropertyByPBKeyCall(pbKey, null, null);
        Type localVarReturnType = new TypeToken<GeoPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets GeoPropertyResponse (asynchronously)
     * Gets GeoPropertyResponse
     * @param pbKey free form text (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeoPropertyByPBKeyAsync(String pbKey, final ApiCallback<GeoPropertyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeoPropertyByPBKeyCall(pbKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getGeoPropertyByPBKeyBatch */
    private com.squareup.okhttp.Call getGeoPropertyByPBKeyBatchCall(GeoPropertyPBKeyRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        

        // create path and map variables
        String localVarPath = "/geoproperty/v1/all/attributes/bypbkey".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets GeoPropertyResponses
     * Gets GeoPropertyResponses
     * @param body  (optional)
     * @return GeoPropertyResponses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoPropertyResponses getGeoPropertyByPBKeyBatch(GeoPropertyPBKeyRequest body) throws ApiException {
        ApiResponse<GeoPropertyResponses> resp = getGeoPropertyByPBKeyBatchWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Gets GeoPropertyResponses
     * Gets GeoPropertyResponses
     * @param body  (optional)
     * @return ApiResponse&lt;GeoPropertyResponses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoPropertyResponses> getGeoPropertyByPBKeyBatchWithHttpInfo(GeoPropertyPBKeyRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getGeoPropertyByPBKeyBatchCall(body, null, null);
        Type localVarReturnType = new TypeToken<GeoPropertyResponses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets GeoPropertyResponses (asynchronously)
     * Gets GeoPropertyResponses
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeoPropertyByPBKeyBatchAsync(GeoPropertyPBKeyRequest body, final ApiCallback<GeoPropertyResponses> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeoPropertyByPBKeyBatchCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoPropertyResponses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
