package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00911TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00911TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00911TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00911_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00911TableNo;
	
	/**
	* Constructor for Ip00911TableIdSerialized
	**/
    public Ip00911TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00911TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00911TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip00911TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip00911TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00911_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00911TableNo = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp00911TableNoCounter = -1;
     public boolean isIp00911TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911TableNoCounter != sharedCounter;
         localIp00911TableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip00911TableNo
	 */
   protected void serializeIp00911TableNo(char[] ip00911TableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911TableNo,0,getStringValue(),beginIp00911TableNo,IP_00911_TABLE_NO_LEN);
       localIp00911TableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911TableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp00911TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911TableNo() {	 
   		return (substring(getStringValue(),beginIp00911TableNo,beginIp00911TableNo + IP_00911_TABLE_NO_LEN));
   	}




}
  
