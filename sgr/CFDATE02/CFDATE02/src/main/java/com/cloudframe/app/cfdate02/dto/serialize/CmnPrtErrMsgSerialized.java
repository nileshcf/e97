package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnPrtErrMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPrtErrMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPrtErrMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PRT_ERR_MSG_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnPrtErrHdrText;
	
	/**
	* Constructor for CmnPrtErrMsgSerialized
	**/
    public CmnPrtErrMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPrtErrMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPrtErrMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPrtErrMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,264); // serialize this field at offset 264 by default 
    }
    
	/**
	* sets parent for this CmnPrtErrMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 264 by default
    }    
	/**
	* initializes the field in CmnPrtErrMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PRT_ERR_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnPrtErrHdrText = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnPrtErrHdrTextCounter = -1;
     public boolean isCmnPrtErrHdrTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPrtErrHdrTextCounter != sharedCounter;
         localCmnPrtErrHdrTextCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_PRT_ERR_HDR_TEXT_LEN = 26;
	/**
	 * 	serialize this CmnPrtErrHdrText
	 */
   protected void serializeCmnPrtErrHdrText(char[] cmnPrtErrHdrText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnPrtErrHdrText,0,getStringValue(),beginCmnPrtErrHdrText,CMN_PRT_ERR_HDR_TEXT_LEN);
       localCmnPrtErrHdrTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnPrtErrHdrTextConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCmnPrtErrHdrText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnPrtErrHdrText() {	 
   		return (substring(getStringValue(),beginCmnPrtErrHdrText,beginCmnPrtErrHdrText + CMN_PRT_ERR_HDR_TEXT_LEN));
   	}




}
  
