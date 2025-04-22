package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class Ip00054wTable5Key1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00054wTable5Key1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00054wTable5Key1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00054W_TABLE_5_KEY_1_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00054wKeyTableId;
	
	/**
	* Constructor for Ip00054wTable5Key1Serialized
	**/
    public Ip00054wTable5Key1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00054wTable5Key1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054wTable5Key1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00054wTable5Key1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00054wTable5Key1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00054wTable5Key1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00054W_TABLE_5_KEY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00054wKeyTableId = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00054wKeyTableIdCounter = -1;
     public boolean isIp00054wKeyTableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00054wKeyTableIdCounter != sharedCounter;
         localIp00054wKeyTableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00054W_KEY_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip00054wKeyTableId
	 */
   protected void serializeIp00054wKeyTableId(char[] ip00054wKeyTableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00054wKeyTableId,0,getStringValue(),beginIp00054wKeyTableId,IP_00054W_KEY_TABLE_ID_LEN);
       localIp00054wKeyTableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00054wKeyTableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp00054wKeyTableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00054wKeyTableId() {	 
   		return (substring(getStringValue(),beginIp00054wKeyTableId,beginIp00054wKeyTableId + IP_00054W_KEY_TABLE_ID_LEN));
   	}




}
  
