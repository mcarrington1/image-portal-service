/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.image.portal.api;

import com.image.portal.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-24T09:41:07.734618300-05:00[America/Chicago]")
@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {};
    }

    /**
     * GET /user/ : Retrieve info about the user&#39;s account
     *
     * @return successful operation (status code 200)
     *         or Invalid input provided (status code 400)
     */
    @ApiOperation(value = "Retrieve info about the user's account", nickname = "getUserInfo", notes = "", response = User.class, tags={ "STRETCH - account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid input provided") })
    @GetMapping(
        value = "/user/",
        produces = { "application/json" }
    )
    default ResponseEntity<User> getUserInfo() {
        return getDelegate().getUserInfo();
    }


    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid input provided (status code 400)
     */
    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", tags={ "login page", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid input provided") })
    @GetMapping(
        value = "/user/login"
    )
    default ResponseEntity<Void> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        return getDelegate().loginUser(username, password);
    }


    /**
     * PUT /user/ : Add or update info about the account
     *
     * @return successful operation (status code 200)
     *         or Invalid input provided (status code 400)
     */
    @ApiOperation(value = "Add or update info about the account", nickname = "updateUserInfo", notes = "", response = User.class, tags={ "STRETCH - account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid input provided") })
    @PutMapping(
        value = "/user/",
        produces = { "application/json" }
    )
    default ResponseEntity<User> updateUserInfo() {
        return getDelegate().updateUserInfo();
    }

}
