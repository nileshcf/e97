package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014TableDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014TableDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014TableDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014_TABLE_DATA_KEY_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014PrcssAgrmtId;
	
	/**
	* Constructor for Ip02014TableDataKeySerialized
	**/
    public Ip02014TableDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014TableDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014TableDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014TableDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip02014TableDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip02014TableDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014_TABLE_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014PrcssAgrmtId = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014PrcssAgrmtIdCounter = -1;
     public boolean isIp02014PrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014PrcssAgrmtIdCounter != sharedCounter;
         localIp02014PrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02014PrcssAgrmtId
	 */
   protected void serializeIp02014PrcssAgrmtId(char[] ip02014PrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014PrcssAgrmtId,0,getStringValue(),beginIp02014PrcssAgrmtId,IP_02014_PRCSS_AGRMT_ID_LEN);
       localIp02014PrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014PrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02014PrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014PrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02014PrcssAgrmtId,beginIp02014PrcssAgrmtId + IP_02014_PRCSS_AGRMT_ID_LEN));
   	}




}
  
