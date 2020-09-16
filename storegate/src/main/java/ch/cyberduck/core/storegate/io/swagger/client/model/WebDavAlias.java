/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T20:27:33.275+02:00")
public class WebDavAlias {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("hostnames")
  private List<String> hostnames = null;

  public WebDavAlias id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Id
   * @return id
  **/
  @ApiModelProperty(value = "The Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WebDavAlias username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username to use with WebDAV
   * @return username
  **/
  @ApiModelProperty(value = "The username to use with WebDAV")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public WebDavAlias password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The Password
   * @return password
  **/
  @ApiModelProperty(value = "The Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public WebDavAlias hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  public WebDavAlias addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * A list of WebDAV hostname alias
   * @return hostnames
  **/
  @ApiModelProperty(value = "A list of WebDAV hostname alias")
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDavAlias webDavAlias = (WebDavAlias) o;
    return Objects.equals(this.id, webDavAlias.id) &&
        Objects.equals(this.username, webDavAlias.username) &&
        Objects.equals(this.password, webDavAlias.password) &&
        Objects.equals(this.hostnames, webDavAlias.hostnames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, hostnames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDavAlias {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
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

