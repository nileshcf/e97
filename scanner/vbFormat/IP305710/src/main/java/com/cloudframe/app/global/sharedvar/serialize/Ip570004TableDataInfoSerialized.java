package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip570004TableDataInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip570004TableDataInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip570004TableDataInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_570004_TABLE_DATA_INFO_LENGTH = 1800018;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp570004EffdtTm;
            protected  int beginIp570004Idx;
            protected  int beginIp570004IdxMax;
	
	/**
	* Constructor for Ip570004TableDataInfoSerialized
	**/
    public Ip570004TableDataInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip570004TableDataInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_570004_TABLE_DATA_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp570004EffdtTm = getStartOffset() + 0;	// set offset for serialization
  
             beginIp570004Idx = getStartOffset() + 10;	// set offset for serialization
  
             beginIp570004IdxMax = getStartOffset() + 14;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp570004EffdtTmCounter = -1;
     public boolean isIp570004EffdtTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp570004EffdtTmCounter != sharedCounter;
         localIp570004EffdtTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_570004_EFFDT_TM_LEN = 10;
	/**
	 * 	serialize this Ip570004EffdtTm
	 */
   protected void serializeIp570004EffdtTm(char[] ip570004EffdtTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip570004EffdtTm,0,getStringValue(),beginIp570004EffdtTm,IP_570004_EFFDT_TM_LEN);
       localIp570004EffdtTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp570004EffdtTmConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp570004EffdtTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp570004EffdtTm() {	 
   		return (substring(getStringValue(),beginIp570004EffdtTm,beginIp570004EffdtTm + IP_570004_EFFDT_TM_LEN));
   	}
         int localIp570004IdxCounter = -1;
         public boolean isIp570004IdxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp570004IdxCounter != sharedCounter;
            localIp570004IdxCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_570004_IDX_LEN = 4;
  	/**
	 * serializeIp570004Idx
	 */
	protected void serializeIp570004Idx(long ip570004Idx) {
           replaceValue( //  save the value as string
                   getBinaryString( ip570004Idx,IP_570004_IDX_LEN)
                  ,beginIp570004Idx
                  ,IP_570004_IDX_LEN
                 );
            localIp570004IdxCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp570004IdxMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp570004Idx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp570004Idx() {	 
			return (getUnsignedInt(beginIp570004Idx));
   	}
         int localIp570004IdxMaxCounter = -1;
         public boolean isIp570004IdxMaxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp570004IdxMaxCounter != sharedCounter;
            localIp570004IdxMaxCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_570004_IDX_MAX_LEN = 4;
  	/**
	 * serializeIp570004IdxMax
	 */
	protected void serializeIp570004IdxMax(long ip570004IdxMax) {
           replaceValue( //  save the value as string
                   getBinaryString( ip570004IdxMax,IP_570004_IDX_MAX_LEN)
                  ,beginIp570004IdxMax
                  ,IP_570004_IDX_MAX_LEN
                 );
            localIp570004IdxMaxCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp570004IdxMaxMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp570004IdxMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp570004IdxMax() {	 
			return (getUnsignedInt(beginIp570004IdxMax));
   	}




}
  
