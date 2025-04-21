package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip662011ErrSubscriptGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip662011ErrSubscriptGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip662011ErrSubscriptGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_662011_ERR_SUBSCRIPT_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp662011ErrSubscript;
	
	/**
	* Constructor for Ip662011ErrSubscriptGroupSerialized
	**/
    public Ip662011ErrSubscriptGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip662011ErrSubscriptGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_662011_ERR_SUBSCRIPT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp662011ErrSubscript = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp662011ErrSubscriptCounter = -1;
         public boolean isIp662011ErrSubscriptModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp662011ErrSubscriptCounter != sharedCounter;
            localIp662011ErrSubscriptCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_662011_ERR_SUBSCRIPT_LEN = 4;
  	/**
	 * serializeIp662011ErrSubscript
	 */
	protected void serializeIp662011ErrSubscript(int ip662011ErrSubscript) {
           replaceValue( //  save the value as string
                   getBinaryString( ip662011ErrSubscript,IP_662011_ERR_SUBSCRIPT_LEN)
                  ,beginIp662011ErrSubscript
                  ,IP_662011_ERR_SUBSCRIPT_LEN
                 );
            localIp662011ErrSubscriptCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp662011ErrSubscriptMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp662011ErrSubscript is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp662011ErrSubscript() {	 
			return (getInt(beginIp662011ErrSubscript));
   	}




}
  
