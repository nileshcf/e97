package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class EsV1CorrelId270Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EsV1CorrelId270Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EsV1CorrelId270Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ES_V_1_CORREL_ID_270_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEsV1SrvId270;
            protected  int beginEsV1SrvreqId270;
	
	/**
	* Constructor for EsV1CorrelId270Serialized
	**/
    public EsV1CorrelId270Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EsV1CorrelId270Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsV1CorrelId270Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EsV1CorrelId270Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this EsV1CorrelId270Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in EsV1CorrelId270Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ES_V_1_CORREL_ID_270_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEsV1SrvId270 = getStartOffset() + 0;	// set offset for serialization
  
             beginEsV1SrvreqId270 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEsV1SrvId270Counter = -1;
     public boolean isEsV1SrvId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1SrvId270Counter != sharedCounter;
         localEsV1SrvId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_SRV_ID_270_LEN = 4;
	/**
	 * 	serialize this EsV1SrvId270
	 */
   protected void serializeEsV1SrvId270(char[] esV1SrvId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1SrvId270,0,getStringValue(),beginEsV1SrvId270,ES_V_1_SRV_ID_270_LEN);
       localEsV1SrvId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1SrvId270Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEsV1SrvId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1SrvId270() {	 
   		return (substring(getStringValue(),beginEsV1SrvId270,beginEsV1SrvId270 + ES_V_1_SRV_ID_270_LEN));
   	}
     int localEsV1SrvreqId270Counter = -1;
     public boolean isEsV1SrvreqId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1SrvreqId270Counter != sharedCounter;
         localEsV1SrvreqId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_SRVREQ_ID_270_LEN = 6;
	/**
	 * 	serialize this EsV1SrvreqId270
	 */
   protected void serializeEsV1SrvreqId270(char[] esV1SrvreqId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1SrvreqId270,0,getStringValue(),beginEsV1SrvreqId270,ES_V_1_SRVREQ_ID_270_LEN);
       localEsV1SrvreqId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1SrvreqId270Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshEsV1SrvreqId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1SrvreqId270() {	 
   		return (substring(getStringValue(),beginEsV1SrvreqId270,beginEsV1SrvreqId270 + ES_V_1_SRVREQ_ID_270_LEN));
   	}




}
  
