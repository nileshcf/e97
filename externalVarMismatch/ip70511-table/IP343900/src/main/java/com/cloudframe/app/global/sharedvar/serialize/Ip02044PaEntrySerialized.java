package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02044PaEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02044PaEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02044PaEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02044_PA_ENTRY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02044PrcssAgrmtId;
            protected  int beginIp02044MdsEndpntId;
	
	/**
	* Constructor for Ip02044PaEntrySerialized
	**/
    public Ip02044PaEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02044PaEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044PaEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02044PaEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,42); // serialize this field at offset 42 by default 
    }
    
	/**
	* sets parent for this Ip02044PaEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 42 by default
    }    
	/**
	* initializes the field in Ip02044PaEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02044_PA_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02044PrcssAgrmtId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02044MdsEndpntId = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02044PrcssAgrmtIdCounter = -1;
     public boolean isIp02044PrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02044PrcssAgrmtIdCounter != sharedCounter;
         localIp02044PrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02044_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02044PrcssAgrmtId
	 */
   protected void serializeIp02044PrcssAgrmtId(char[] ip02044PrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02044PrcssAgrmtId,0,getStringValue(),beginIp02044PrcssAgrmtId,IP_02044_PRCSS_AGRMT_ID_LEN);
       localIp02044PrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02044PrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02044PrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02044PrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02044PrcssAgrmtId,beginIp02044PrcssAgrmtId + IP_02044_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02044MdsEndpntIdCounter = -1;
     public boolean isIp02044MdsEndpntIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02044MdsEndpntIdCounter != sharedCounter;
         localIp02044MdsEndpntIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02044_MDS_ENDPNT_ID_LEN = 7;
	/**
	 * 	serialize this Ip02044MdsEndpntId
	 */
   protected void serializeIp02044MdsEndpntId(char[] ip02044MdsEndpntId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02044MdsEndpntId,0,getStringValue(),beginIp02044MdsEndpntId,IP_02044_MDS_ENDPNT_ID_LEN);
       localIp02044MdsEndpntIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02044MdsEndpntIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshIp02044MdsEndpntId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02044MdsEndpntId() {	 
   		return (substring(getStringValue(),beginIp02044MdsEndpntId,beginIp02044MdsEndpntId + IP_02044_MDS_ENDPNT_ID_LEN));
   	}




}
  
