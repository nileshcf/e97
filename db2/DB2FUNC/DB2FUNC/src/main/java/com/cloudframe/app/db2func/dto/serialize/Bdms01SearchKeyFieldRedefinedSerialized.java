package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01SearchKeyFieldRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01SearchKeyFieldRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01SearchKeyFieldRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_SEARCH_KEY_FIELD_REDEFINED_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SearchOptPutCallCd;
            protected  int beginBdms01SearchOptStyleCd;
            protected  int beginBdms01SearchOptOpenClose;
	
	/**
	* Constructor for Bdms01SearchKeyFieldRedefinedSerialized
	**/
    public Bdms01SearchKeyFieldRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01SearchKeyFieldRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchKeyFieldRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01SearchKeyFieldRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Bdms01SearchKeyFieldRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Bdms01SearchKeyFieldRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_SEARCH_KEY_FIELD_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBdms01SearchOptPutCallCd = getStartOffset() + 8;	// set offset for serialization
  
             beginBdms01SearchOptStyleCd = getStartOffset() + 9;	// set offset for serialization
  
             beginBdms01SearchOptOpenClose = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01SearchOptPutCallCdCounter = -1;
     public boolean isBdms01SearchOptPutCallCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptPutCallCdCounter != sharedCounter;
         localBdms01SearchOptPutCallCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_PUT_CALL_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01SearchOptPutCallCd
	 */
   protected void serializeBdms01SearchOptPutCallCd(char[] bdms01SearchOptPutCallCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptPutCallCd,0,getStringValue(),beginBdms01SearchOptPutCallCd,BDMS_01_SEARCH_OPT_PUT_CALL_CD_LEN);
       localBdms01SearchOptPutCallCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptPutCallCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptPutCallCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptPutCallCd() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptPutCallCd,beginBdms01SearchOptPutCallCd + BDMS_01_SEARCH_OPT_PUT_CALL_CD_LEN));
   	}
     int localBdms01SearchOptStyleCdCounter = -1;
     public boolean isBdms01SearchOptStyleCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptStyleCdCounter != sharedCounter;
         localBdms01SearchOptStyleCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_STYLE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01SearchOptStyleCd
	 */
   protected void serializeBdms01SearchOptStyleCd(char[] bdms01SearchOptStyleCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptStyleCd,0,getStringValue(),beginBdms01SearchOptStyleCd,BDMS_01_SEARCH_OPT_STYLE_CD_LEN);
       localBdms01SearchOptStyleCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptStyleCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptStyleCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptStyleCd() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptStyleCd,beginBdms01SearchOptStyleCd + BDMS_01_SEARCH_OPT_STYLE_CD_LEN));
   	}
     int localBdms01SearchOptOpenCloseCounter = -1;
     public boolean isBdms01SearchOptOpenCloseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptOpenCloseCounter != sharedCounter;
         localBdms01SearchOptOpenCloseCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_OPEN_CLOSE_LEN = 1;
	/**
	 * 	serialize this Bdms01SearchOptOpenClose
	 */
   protected void serializeBdms01SearchOptOpenClose(char[] bdms01SearchOptOpenClose) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptOpenClose,0,getStringValue(),beginBdms01SearchOptOpenClose,BDMS_01_SEARCH_OPT_OPEN_CLOSE_LEN);
       localBdms01SearchOptOpenCloseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptOpenCloseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptOpenClose is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptOpenClose() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptOpenClose,beginBdms01SearchOptOpenClose + BDMS_01_SEARCH_OPT_OPEN_CLOSE_LEN));
   	}




}
  
