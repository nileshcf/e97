package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00901TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00901TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00901TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00901_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00901TableNo;
	
	/**
	* Constructor for Ip00901TableIdSerialized
	**/
    public Ip00901TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00901TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00901TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip00901TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip00901TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00901_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00901TableNo = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp00901TableNoCounter = -1;
     public boolean isIp00901TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901TableNoCounter != sharedCounter;
         localIp00901TableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip00901TableNo
	 */
   protected void serializeIp00901TableNo(char[] ip00901TableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901TableNo,0,getStringValue(),beginIp00901TableNo,IP_00901_TABLE_NO_LEN);
       localIp00901TableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901TableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp00901TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901TableNo() {	 
   		return (substring(getStringValue(),beginIp00901TableNo,beginIp00901TableNo + IP_00901_TABLE_NO_LEN));
   	}




}
  
