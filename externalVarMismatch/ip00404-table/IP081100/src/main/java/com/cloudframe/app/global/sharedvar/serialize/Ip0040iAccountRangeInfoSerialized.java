package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iAccountRangeInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iAccountRangeInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iAccountRangeInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_ACCOUNT_RANGE_INFO_LENGTH = 226;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iFiller01;
	
	/**
	* Constructor for Ip0040iAccountRangeInfoSerialized
	**/
    public Ip0040iAccountRangeInfoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip0040iAccountRangeInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_ACCOUNT_RANGE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginIp0040iFiller01 = getStartOffset() + 224;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iFiller01Counter = -1;
     public boolean isIp0040iFiller01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iFiller01Counter != sharedCounter;
         localIp0040iFiller01Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_FILLER_01_LEN = 2;
	/**
	 * 	serialize this Ip0040iFiller01
	 */
   protected void serializeIp0040iFiller01(char[] ip0040iFiller01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iFiller01,0,getStringValue(),beginIp0040iFiller01,IP_0040I_FILLER_01_LEN);
       localIp0040iFiller01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iFiller01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp0040iFiller01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iFiller01() {	 
   		return (substring(getStringValue(),beginIp0040iFiller01,beginIp0040iFiller01 + IP_0040I_FILLER_01_LEN));
   	}




}
  
