package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00754SearchCriteriaGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00754SearchCriteriaGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00754SearchCriteriaGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00754_SEARCH_CRITERIA_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00754SearchCriteria;
	
	/**
	* Constructor for Ip00754SearchCriteriaGroupSerialized
	**/
    public Ip00754SearchCriteriaGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00754SearchCriteriaGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00754_SEARCH_CRITERIA_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00754SearchCriteria = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00754SearchCriteriaCounter = -1;
     public boolean isIp00754SearchCriteriaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754SearchCriteriaCounter != sharedCounter;
         localIp00754SearchCriteriaCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00754_SEARCH_CRITERIA_LEN = 1;
	/**
	 * 	serialize this Ip00754SearchCriteria
	 */
   protected void serializeIp00754SearchCriteria(char[] ip00754SearchCriteria) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00754SearchCriteria,0,getStringValue(),beginIp00754SearchCriteria,IP_00754_SEARCH_CRITERIA_LEN);
       localIp00754SearchCriteriaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00754SearchCriteriaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00754SearchCriteria is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00754SearchCriteria() {	 
   		return (substring(getStringValue(),beginIp00754SearchCriteria,beginIp00754SearchCriteria + IP_00754_SEARCH_CRITERIA_LEN));
   	}




}
  
