package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class Ip00054wEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00054wEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00054wEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00054W_ENTRY_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00054wReloadDtTm;
	
	/**
	* Constructor for Ip00054wEntrySerialized
	**/
    public Ip00054wEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00054wEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054wEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00054wEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00054wEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00054wEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00054W_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00054wReloadDtTm = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00054wReloadDtTmCounter = -1;
     public boolean isIp00054wReloadDtTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00054wReloadDtTmCounter != sharedCounter;
         localIp00054wReloadDtTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00054W_RELOAD_DT_TM_LEN = 10;
	/**
	 * 	serialize this Ip00054wReloadDtTm
	 */
   protected void serializeIp00054wReloadDtTm(char[] ip00054wReloadDtTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00054wReloadDtTm,0,getStringValue(),beginIp00054wReloadDtTm,IP_00054W_RELOAD_DT_TM_LEN);
       localIp00054wReloadDtTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00054wReloadDtTmConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp00054wReloadDtTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00054wReloadDtTm() {	 
   		return (substring(getStringValue(),beginIp00054wReloadDtTm,beginIp00054wReloadDtTm + IP_00054W_RELOAD_DT_TM_LEN));
   	}




}
  
