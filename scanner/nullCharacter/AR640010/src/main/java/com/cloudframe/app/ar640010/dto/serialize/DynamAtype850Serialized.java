package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamAtype850Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamAtype850Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamAtype850Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_ATYPE_850_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamBlocks850;
	
	/**
	* Constructor for DynamAtype850Serialized
	**/
    public DynamAtype850Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DynamAtype850Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamAtype850Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DynamAtype850Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,176); // serialize this field at offset 176 by default 
    }
    
	/**
	* sets parent for this DynamAtype850Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 176 by default
    }    
	/**
	* initializes the field in DynamAtype850Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_ATYPE_850_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDynamBlocks850 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDynamBlocks850Counter = -1;
     public boolean isDynamBlocks850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamBlocks850Counter != sharedCounter;
         localDynamBlocks850Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dynamBlocks850
	 *	@return dynamBlocks850
	 */
	public char[]  getDynamBlocks850String() {
	     return getCharArray(beginDynamBlocks850,DYNAM_BLOCKS_850_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dynamBlocks850IsNumeric() {
	    return isNumeric(beginDynamBlocks850
	                    ,beginDynamBlocks850 + DYNAM_BLOCKS_850_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DYNAM_BLOCKS_850_LEN = 9;
  	/**
	 * serializeDynamBlocks850
	 */
	protected void serializeDynamBlocks850(long dynamBlocks850) {
		 putNumber(beginDynamBlocks850,dynamBlocks850,DYNAM_BLOCKS_850_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDynamBlocks850Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDynamBlocks850
	 */
   	protected  long serializeDynamBlocks850(char[] value) {
	    long  dynamBlocks850;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dynamBlocks850 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDynamBlocks850
		       ,9
		      );
		 localDynamBlocks850Counter = shareString.getSerializedField().getModifiedCounter();
		return  dynamBlocks850;
    }

   protected long checkDynamBlocks850MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDynamBlocks850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDynamBlocks850() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDynamBlocks850
			                 ,DYNAM_BLOCKS_850_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dynamBlocks850", beginDynamBlocks850,DYNAM_BLOCKS_850_LEN);
    }
   	}




}
  
