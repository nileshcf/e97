package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class Sf535ZlogServiceEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf535ZlogServiceEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf535ZlogServiceEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_535_ZLOG_SERVICE_ENTRY_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf535ZlogService;
            protected  int beginSf535ZservDesc;
	
	/**
	* Constructor for Sf535ZlogServiceEntrySerialized
	**/
    public Sf535ZlogServiceEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf535ZlogServiceEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf535ZlogServiceEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf535ZlogServiceEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf535ZlogServiceEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf535ZlogServiceEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_535_ZLOG_SERVICE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf535ZlogService = getStartOffset() + 0;	// set offset for serialization
  
             beginSf535ZservDesc = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf535ZlogServiceCounter = -1;
     public boolean isSf535ZlogServiceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf535ZlogServiceCounter != sharedCounter;
         localSf535ZlogServiceCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_535_ZLOG_SERVICE_LEN = 4;
	/**
	 * 	serialize this Sf535ZlogService
	 */
   protected void serializeSf535ZlogService(char[] sf535ZlogService) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf535ZlogService,0,getStringValue(),beginSf535ZlogService,SF_535_ZLOG_SERVICE_LEN);
       localSf535ZlogServiceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf535ZlogServiceConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf535ZlogService is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf535ZlogService() {	 
   		return (substring(getStringValue(),beginSf535ZlogService,beginSf535ZlogService + SF_535_ZLOG_SERVICE_LEN));
   	}
     int localSf535ZservDescCounter = -1;
     public boolean isSf535ZservDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf535ZservDescCounter != sharedCounter;
         localSf535ZservDescCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_535_ZSERV_DESC_LEN = 55;
	/**
	 * 	serialize this Sf535ZservDesc
	 */
   protected void serializeSf535ZservDesc(char[] sf535ZservDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf535ZservDesc,0,getStringValue(),beginSf535ZservDesc,SF_535_ZSERV_DESC_LEN);
       localSf535ZservDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf535ZservDescConstraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
    /**
	 *	refreshSf535ZservDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf535ZservDesc() {	 
   		return (substring(getStringValue(),beginSf535ZservDesc,beginSf535ZservDesc + SF_535_ZSERV_DESC_LEN));
   	}




}
  
