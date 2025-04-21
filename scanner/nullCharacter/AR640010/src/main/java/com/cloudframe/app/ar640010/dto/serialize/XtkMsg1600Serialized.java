package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class XtkMsg1600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XtkMsg1600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XtkMsg1600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XTK_MSG_1600_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXtkStartPosition600;
	
	/**
	* Constructor for XtkMsg1600Serialized
	**/
    public XtkMsg1600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XtkMsg1600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkMsg1600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XtkMsg1600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,123); // serialize this field at offset 123 by default 
    }
    
	/**
	* sets parent for this XtkMsg1600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 123 by default
    }    
	/**
	* initializes the field in XtkMsg1600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XTK_MSG_1600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginXtkStartPosition600 = getStartOffset() + 57;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXtkStartPosition600Counter = -1;
     public boolean isXtkStartPosition600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXtkStartPosition600Counter != sharedCounter;
         localXtkStartPosition600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xtkStartPosition600
	 *	@return xtkStartPosition600
	 */
	public char[]  getXtkStartPosition600String() {
	     return getCharArray(beginXtkStartPosition600,XTK_START_POSITION_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xtkStartPosition600IsNumeric() {
	    return isNumeric(beginXtkStartPosition600
	                    ,beginXtkStartPosition600 + XTK_START_POSITION_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XTK_START_POSITION_600_LEN = 4;
  	/**
	 * serializeXtkStartPosition600
	 */
	protected void serializeXtkStartPosition600(int xtkStartPosition600) {
		 putNumber(beginXtkStartPosition600,xtkStartPosition600,XTK_START_POSITION_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXtkStartPosition600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXtkStartPosition600
	 */
   	protected  int serializeXtkStartPosition600(char[] value) {
	    int  xtkStartPosition600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xtkStartPosition600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginXtkStartPosition600
		       ,4
		      );
		 localXtkStartPosition600Counter = shareString.getSerializedField().getModifiedCounter();
		return  xtkStartPosition600;
    }

   protected int checkXtkStartPosition600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXtkStartPosition600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXtkStartPosition600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXtkStartPosition600
			                 ,XTK_START_POSITION_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xtkStartPosition600", beginXtkStartPosition600,XTK_START_POSITION_600_LEN);
    }
   	}




}
  
