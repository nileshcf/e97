package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnApplMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnApplMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnApplMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_APPL_MSG_AREA_LENGTH = 512;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginCmnApplMsg;
           protected static final int CMN_APPL_MSG_SIZE = 4;
	
	/**
	* Constructor for CmnApplMsgAreaSerialized
	**/
    public CmnApplMsgAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnApplMsgAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnApplMsgAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnApplMsgAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,91); // serialize this field at offset 91 by default 
    }
    
	/**
	* sets parent for this CmnApplMsgAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 91 by default
    }    
	/**
	* initializes the field in CmnApplMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_APPL_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginCmnApplMsg = getStartOffset() + 0; // set offset for serialization
  
  
	   /*  end of offset */
	}
 
   
  protected  static final int CMN_APPL_MSG_LEN = 40;
   /**
	 *	serializeCmnApplMsg as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeCmnApplMsg(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginCmnApplMsg + index*CMN_APPL_MSG_LEN)
   	          , CMN_APPL_MSG_LEN 
   	          );
   }

		public int cmnApplMsgSize() {
			return CMN_APPL_MSG_SIZE;
		}



}
  
