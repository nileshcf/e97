package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50921VariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50921VariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50921VariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50921_VARIABLES_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50921CurrentTs;
            protected  int beginIp50921Filler1;
	
	/**
	* Constructor for Ip50921VariablesSerialized
	**/
    public Ip50921VariablesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50921VariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50921_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50921CurrentTs = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50921Filler1 = getStartOffset() + 26;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50921CurrentTsCounter = -1;
     public boolean isIp50921CurrentTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50921CurrentTsCounter != sharedCounter;
         localIp50921CurrentTsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50921_CURRENT_TS_LEN = 26;
	/**
	 * 	serialize this Ip50921CurrentTs
	 */
   protected void serializeIp50921CurrentTs(char[] ip50921CurrentTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50921CurrentTs,0,getStringValue(),beginIp50921CurrentTs,IP_50921_CURRENT_TS_LEN);
       localIp50921CurrentTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50921CurrentTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp50921CurrentTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50921CurrentTs() {	 
   		return (substring(getStringValue(),beginIp50921CurrentTs,beginIp50921CurrentTs + IP_50921_CURRENT_TS_LEN));
   	}
     int localIp50921Filler1Counter = -1;
     public boolean isIp50921Filler1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50921Filler1Counter != sharedCounter;
         localIp50921Filler1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_50921_FILLER_1_LEN = 54;
	/**
	 * 	serialize this Ip50921Filler1
	 */
   protected void serializeIp50921Filler1(char[] ip50921Filler1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50921Filler1,0,getStringValue(),beginIp50921Filler1,IP_50921_FILLER_1_LEN);
       localIp50921Filler1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50921Filler1Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshIp50921Filler1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50921Filler1() {	 
   		return (substring(getStringValue(),beginIp50921Filler1,beginIp50921Filler1 + IP_50921_FILLER_1_LEN));
   	}




}
  
