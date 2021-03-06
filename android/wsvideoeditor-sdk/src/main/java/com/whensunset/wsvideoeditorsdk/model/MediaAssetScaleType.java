// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ws_video_editor_sdk.proto

package com.whensunset.wsvideoeditorsdk.model;

/**
 * <pre>
 * 视频/图片填充播放器的方式
 * </pre>
 *
 * Protobuf enum {@code whensunset.wsvideoeditor.model.MediaAssetScaleType}
 */
public enum MediaAssetScaleType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>MEDIA_ASSET_SCALE_DEFAULT = 0;</code>
   */
  MEDIA_ASSET_SCALE_DEFAULT(0),
  /**
   * <code>MEDIA_ASSET_SCALE_FIT = 1;</code>
   */
  MEDIA_ASSET_SCALE_FIT(1),
  /**
   * <code>MEDIA_ASSET_SCALE_FILL = 2;</code>
   */
  MEDIA_ASSET_SCALE_FILL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MEDIA_ASSET_SCALE_DEFAULT = 0;</code>
   */
  public static final int MEDIA_ASSET_SCALE_DEFAULT_VALUE = 0;
  /**
   * <code>MEDIA_ASSET_SCALE_FIT = 1;</code>
   */
  public static final int MEDIA_ASSET_SCALE_FIT_VALUE = 1;
  /**
   * <code>MEDIA_ASSET_SCALE_FILL = 2;</code>
   */
  public static final int MEDIA_ASSET_SCALE_FILL_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MediaAssetScaleType valueOf(int value) {
    return forNumber(value);
  }

  public static MediaAssetScaleType forNumber(int value) {
    switch (value) {
      case 0: return MEDIA_ASSET_SCALE_DEFAULT;
      case 1: return MEDIA_ASSET_SCALE_FIT;
      case 2: return MEDIA_ASSET_SCALE_FILL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MediaAssetScaleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MediaAssetScaleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MediaAssetScaleType>() {
          public MediaAssetScaleType findValueByNumber(int number) {
            return MediaAssetScaleType.forNumber(number);
          }
        };

  private final int value;

  private MediaAssetScaleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:whensunset.wsvideoeditor.model.MediaAssetScaleType)
}

