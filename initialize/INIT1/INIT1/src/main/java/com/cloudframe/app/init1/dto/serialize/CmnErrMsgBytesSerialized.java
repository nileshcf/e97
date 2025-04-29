package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnErrMsgBytesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnErrMsgBytesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnErrMsgBytesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_ERR_MSG_BYTES_LENGTH = 512;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginCmnErrByte;
           protected static final int CMN_ERR_BYTE_SIZE = 512;
	
	/**
	* Constructor for CmnErrMsgBytesSerialized
	**/
    public CmnErrMsgBytesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnErrMsgBytesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsgBytesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnErrMsgBytesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,91); // serialize this field at offset 91 by default 
    }
    
	/**
	* sets parent for this CmnErrMsgBytesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 91 by default
    }    
	/**
	* initializes the field in CmnErrMsgBytesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_ERR_MSG_BYTES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginCmnErrByte = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int CMN_ERR_BYTE_LEN = 1;
   /**
	 *	serializeCmnErrByte as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeCmnErrByte(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginCmnErrByte + index*CMN_ERR_BYTE_LEN)
   	          , CMN_ERR_BYTE_LEN 
   	          );
   }

		public int cmnErrByteSize() {
			return CMN_ERR_BYTE_SIZE;
		}



}
  
