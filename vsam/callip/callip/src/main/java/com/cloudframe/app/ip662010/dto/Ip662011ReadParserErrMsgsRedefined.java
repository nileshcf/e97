package com.cloudframe.app.ip662010.dto;

/**
*  The class Ip662011ReadParserErrMsgsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class Ip662011ReadParserErrMsgsRedefined extends Ip662011ReadParserErrMsgsRedefinedSerialized { 
   
      private List<char[]> ip662011ReadParserMsg; 

	
	/**
	* Constructor for Ip662011ReadParserErrMsgsRedefined
	**/
    public Ip662011ReadParserErrMsgsRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip662011ReadParserErrMsgsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip662011ReadParserErrMsgsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip662011ReadParserMsg
	 *  Corresponding COBOL Variable is IP662011-READ-PARSER-MSG
	 *	@return ip662011ReadParserMsg
	 */
	public List<char[]> getIp662011ReadParserMsg() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_662011_READ_PARSER_MSG_SIZE;index++) {
        	list.add( getIp662011ReadParserMsg( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip662011ReadParserMsg
	 */
	public char[] getIp662011ReadParserMsg(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp662011ReadParserMsg(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_662011_READ_PARSER_MSG_SIZE) {
             	index = IP_662011_READ_PARSER_MSG_SIZE -1; // can't exceed max array size
             	logger.trace("ip662011ReadParserMsg - Array index exceeded max Size {}, resetting it to max allowed",IP_662011_READ_PARSER_MSG_SIZE); 
	    }
   	      return getCharArray( (beginIp662011ReadParserMsg + index*IP_662011_READ_PARSER_MSG_LEN) , IP_662011_READ_PARSER_MSG_LEN );
    }
    
    
   public int  ip662011ReadParserMsgFieldLength() {
   	return IP_662011_READ_PARSER_MSG_LEN;
   }
   
	

  
  	/**
	 *	Update Ip662011ReadParserMsg with the passed value at a given index
	 *  Corresponding COBOL Variable is IP662011-READ-PARSER-MSG
	 *  @param index
	 *	@param value
	 */
  public void setIp662011ReadParserMsg(int index,char[] value) {
   	setIp662011ReadParserMsg(index,value,true);
   }
   
   
   /**
	 *	Update Ip662011ReadParserMsg with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp662011ReadParserMsg(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp662011ReadParserMsg(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 60)  {     
		       value = substring(value,0,60);
           }  else if (value.length < 60) {
		       value = pad(60, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(60).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp662011ReadParserMsg(index,value);		
       }
   }
   

	
	
	

		public static int getIp662011ReadParserErrMsgsRedefinedFieldLength() {
			return IP_662011_READ_PARSER_ERR_MSGS_REDEFINED_LENGTH;
		}

}
  
