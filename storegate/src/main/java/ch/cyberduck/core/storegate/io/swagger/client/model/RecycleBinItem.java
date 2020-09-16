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
import org.joda.time.DateTime;

/**
 * A recyclebin item.
 */
@ApiModel(description = "A recyclebin item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T20:27:33.275+02:00")
public class RecycleBinItem {
  @JsonProperty("originalLocation")
  private String originalLocation = null;

  @JsonProperty("deleted")
  private DateTime deleted = null;

  @JsonProperty("deletedBy")
  private String deletedBy = null;

  @JsonProperty("versions")
  private Integer versions = null;

  /**
   * Included if the item supports permission
   */
  public enum PermissionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_99(99),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    PermissionEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionEnum fromValue(String text) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("permission")
  private PermissionEnum permission = null;

  @JsonProperty("md5")
  private String md5 = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("createdById")
  private String createdById = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("modified")
  private DateTime modified = null;

  @JsonProperty("uploaded")
  private DateTime uploaded = null;

  @JsonProperty("accessed")
  private DateTime accessed = null;

  /**
   * Indicates the item type.
   */
  public enum FlagsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_16(16),
    
    NUMBER_32(32),
    
    NUMBER_64(64),
    
    NUMBER_128(128),
    
    NUMBER_256(256),
    
    NUMBER_512(512),
    
    NUMBER_1024(1024);

    private Integer value;

    FlagsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FlagsEnum fromValue(String text) {
      for (FlagsEnum b : FlagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("flags")
  private FlagsEnum flags = null;

  @JsonProperty("ownerId")
  private String ownerId = null;

  public RecycleBinItem originalLocation(String originalLocation) {
    this.originalLocation = originalLocation;
    return this;
  }

   /**
   * The original location of the item.
   * @return originalLocation
  **/
  @ApiModelProperty(value = "The original location of the item.")
  public String getOriginalLocation() {
    return originalLocation;
  }

  public void setOriginalLocation(String originalLocation) {
    this.originalLocation = originalLocation;
  }

  public RecycleBinItem deleted(DateTime deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * When the item was deleted.
   * @return deleted
  **/
  @ApiModelProperty(value = "When the item was deleted.")
  public DateTime getDeleted() {
    return deleted;
  }

  public void setDeleted(DateTime deleted) {
    this.deleted = deleted;
  }

  public RecycleBinItem deletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }

   /**
   * Who deleted the file.
   * @return deletedBy
  **/
  @ApiModelProperty(value = "Who deleted the file.")
  public String getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
  }

  public RecycleBinItem versions(Integer versions) {
    this.versions = versions;
    return this;
  }

   /**
   * Indicated how many versions exists of this item.
   * @return versions
  **/
  @ApiModelProperty(value = "Indicated how many versions exists of this item.")
  public Integer getVersions() {
    return versions;
  }

  public void setVersions(Integer versions) {
    this.versions = versions;
  }

  public RecycleBinItem permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Included if the item supports permission
   * @return permission
  **/
  @ApiModelProperty(value = "Included if the item supports permission")
  public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public RecycleBinItem md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * Not Checksum. Only avaialable for SyncClient
   * @return md5
  **/
  @ApiModelProperty(value = "Not Checksum. Only avaialable for SyncClient")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public RecycleBinItem path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path to the item
   * @return path
  **/
  @ApiModelProperty(value = "The path to the item")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RecycleBinItem createdById(String createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * The created by id.
   * @return createdById
  **/
  @ApiModelProperty(value = "The created by id.")
  public String getCreatedById() {
    return createdById;
  }

  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }

  public RecycleBinItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The item id.
   * @return id
  **/
  @ApiModelProperty(value = "The item id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecycleBinItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item name.
   * @return name
  **/
  @ApiModelProperty(value = "The item name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecycleBinItem size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The item size.
   * @return size
  **/
  @ApiModelProperty(value = "The item size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public RecycleBinItem created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the item was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the item was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public RecycleBinItem modified(DateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public DateTime getModified() {
    return modified;
  }

  public void setModified(DateTime modified) {
    this.modified = modified;
  }

  public RecycleBinItem uploaded(DateTime uploaded) {
    this.uploaded = uploaded;
    return this;
  }

   /**
   * The date and time the item was uploaded.
   * @return uploaded
  **/
  @ApiModelProperty(value = "The date and time the item was uploaded.")
  public DateTime getUploaded() {
    return uploaded;
  }

  public void setUploaded(DateTime uploaded) {
    this.uploaded = uploaded;
  }

  public RecycleBinItem accessed(DateTime accessed) {
    this.accessed = accessed;
    return this;
  }

   /**
   * The date and time the item was last accessed.
   * @return accessed
  **/
  @ApiModelProperty(value = "The date and time the item was last accessed.")
  public DateTime getAccessed() {
    return accessed;
  }

  public void setAccessed(DateTime accessed) {
    this.accessed = accessed;
  }

  public RecycleBinItem flags(FlagsEnum flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Indicates the item type.
   * @return flags
  **/
  @ApiModelProperty(value = "Indicates the item type.")
  public FlagsEnum getFlags() {
    return flags;
  }

  public void setFlags(FlagsEnum flags) {
    this.flags = flags;
  }

  public RecycleBinItem ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The owner id.
   * @return ownerId
  **/
  @ApiModelProperty(value = "The owner id.")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecycleBinItem recycleBinItem = (RecycleBinItem) o;
    return Objects.equals(this.originalLocation, recycleBinItem.originalLocation) &&
        Objects.equals(this.deleted, recycleBinItem.deleted) &&
        Objects.equals(this.deletedBy, recycleBinItem.deletedBy) &&
        Objects.equals(this.versions, recycleBinItem.versions) &&
        Objects.equals(this.permission, recycleBinItem.permission) &&
        Objects.equals(this.md5, recycleBinItem.md5) &&
        Objects.equals(this.path, recycleBinItem.path) &&
        Objects.equals(this.createdById, recycleBinItem.createdById) &&
        Objects.equals(this.id, recycleBinItem.id) &&
        Objects.equals(this.name, recycleBinItem.name) &&
        Objects.equals(this.size, recycleBinItem.size) &&
        Objects.equals(this.created, recycleBinItem.created) &&
        Objects.equals(this.modified, recycleBinItem.modified) &&
        Objects.equals(this.uploaded, recycleBinItem.uploaded) &&
        Objects.equals(this.accessed, recycleBinItem.accessed) &&
        Objects.equals(this.flags, recycleBinItem.flags) &&
        Objects.equals(this.ownerId, recycleBinItem.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalLocation, deleted, deletedBy, versions, permission, md5, path, createdById, id, name, size, created, modified, uploaded, accessed, flags, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleBinItem {\n");
    
    sb.append("    originalLocation: ").append(toIndentedString(originalLocation)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

