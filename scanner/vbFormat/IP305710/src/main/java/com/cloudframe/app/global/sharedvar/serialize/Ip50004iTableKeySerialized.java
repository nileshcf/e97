package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50004iTableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50004iTableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50004iTableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50004I_TABLE_KEY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50004iEffDate;
	
	/**
	* Constructor for Ip50004iTableKeySerialized
	**/
    public Ip50004iTableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50004iTableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iTableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50004iTableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50004iTableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50004iTableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50004I_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50004iEffDate = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50004iEffDateCounter = -1;
     public boolean isIp50004iEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iEffDateCounter != sharedCounter;
         localIp50004iEffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50004I_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this Ip50004iEffDate
	 */
   protected void serializeIp50004iEffDate(char[] ip50004iEffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50004iEffDate,0,getStringValue(),beginIp50004iEffDate,IP_50004I_EFF_DATE_LEN);
       localIp50004iEffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50004iEffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp50004iEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50004iEffDate() {	 
   		return (substring(getStringValue(),beginIp50004iEffDate,beginIp50004iEffDate + IP_50004I_EFF_DATE_LEN));
   	}




}
  
