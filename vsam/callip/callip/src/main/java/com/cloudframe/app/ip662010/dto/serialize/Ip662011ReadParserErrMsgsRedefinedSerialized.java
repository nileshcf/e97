package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class Ip662011ReadParserErrMsgsRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip662011ReadParserErrMsgsRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip662011ReadParserErrMsgsRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_662011_READ_PARSER_ERR_MSGS_REDEFINED_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp662011ReadParserMsg;
           protected static final int IP_662011_READ_PARSER_MSG_SIZE = 10;
	
	/**
	* Constructor for Ip662011ReadParserErrMsgsRedefinedSerialized
	**/
    public Ip662011ReadParserErrMsgsRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip662011ReadParserErrMsgsRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip662011ReadParserErrMsgsRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip662011ReadParserErrMsgsRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip662011ReadParserErrMsgsRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip662011ReadParserErrMsgsRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_662011_READ_PARSER_ERR_MSGS_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp662011ReadParserMsg = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IP_662011_READ_PARSER_MSG_LEN = 60;
   /**
	 *	serializeIp662011ReadParserMsg as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp662011ReadParserMsg(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp662011ReadParserMsg + index*IP_662011_READ_PARSER_MSG_LEN)
   	          , IP_662011_READ_PARSER_MSG_LEN 
   	          );
   }

		public int ip662011ReadParserMsgSize() {
			return IP_662011_READ_PARSER_MSG_SIZE;
		}



}
  
