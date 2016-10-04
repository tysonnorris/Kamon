/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sematext.spm.client.tracing.thrift;


import org.apache.thrift.TEnum;

public enum TTransactionType implements TEnum {
  WEB(0),
  BACKGROUND(1);

  private final int value;

  private TTransactionType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TTransactionType findByValue(int value) { 
    switch (value) {
      case 0:
        return WEB;
      case 1:
        return BACKGROUND;
      default:
        return null;
    }
  }
}