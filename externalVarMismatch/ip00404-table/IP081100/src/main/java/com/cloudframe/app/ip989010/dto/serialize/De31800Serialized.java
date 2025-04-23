package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class De31800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De31800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De31800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_31800_LENGTH = 23;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe31S5800;
	
	/**
	* Constructor for De31800Serialized
	**/
    public De31800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De31800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De31800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De31800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,107); // serialize this field at offset 107 by default 
    }
    
	/**
	* sets parent for this De31800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 107 by default
    }    
	/**
	* initializes the field in De31800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_31800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDe31S5800 = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDe31S5800Counter = -1;
     public boolean isDe31S5800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe31S5800Counter != sharedCounter;
         localDe31S5800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de31S5800
	 *	@return de31S5800
	 */
	public char[]  getDe31S5800String() {
	     return getCharArray(beginDe31S5800,DE_31_S_5800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de31S5800IsNumeric() {
	    return isNumeric(beginDe31S5800
	                    ,beginDe31S5800 + DE_31_S_5800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_31_S_5800_LEN = 1;
  	/**
	 * serializeDe31S5800
	 */
	protected void serializeDe31S5800(int de31S5800) {
		 putNumber(beginDe31S5800,de31S5800,DE_31_S_5800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe31S5800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe31S5800
	 */
   	protected  int serializeDe31S5800(char[] value) {
	    int  de31S5800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de31S5800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginDe31S5800
		       ,1
		      );
		 localDe31S5800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de31S5800;
    }

   protected int checkDe31S5800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe31S5800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe31S5800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe31S5800
			                 ,DE_31_S_5800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de31S5800", beginDe31S5800,DE_31_S_5800_LEN);
    }
   	}




}
  
