package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip5000ParameterMasterDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip5000ParameterMasterDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip5000ParameterMasterDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_5000_PARAMETER_MASTER_DATA_LENGTH = 32745;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp5000TableData;
	
	/**
	* Constructor for Ip5000ParameterMasterDataSerialized
	**/
    public Ip5000ParameterMasterDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip5000ParameterMasterDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip5000ParameterMasterDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip5000ParameterMasterDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip5000ParameterMasterDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip5000ParameterMasterDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_5000_PARAMETER_MASTER_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp5000TableData = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp5000TableDataCounter = -1;
     public boolean isIp5000TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp5000TableDataCounter != sharedCounter;
         localIp5000TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_5000_TABLE_DATA_LEN = 32737;
	/**
	 * 	serialize this Ip5000TableData
	 */
   protected void serializeIp5000TableData(char[] ip5000TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip5000TableData,0,getStringValue(),beginIp5000TableData,IP_5000_TABLE_DATA_LEN);
       localIp5000TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp5000TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32737 ,false, false);
   }
    /**
	 *	refreshIp5000TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp5000TableData() {	 
   		return (substring(getStringValue(),beginIp5000TableData,beginIp5000TableData + IP_5000_TABLE_DATA_LEN));
   	}




}
  
