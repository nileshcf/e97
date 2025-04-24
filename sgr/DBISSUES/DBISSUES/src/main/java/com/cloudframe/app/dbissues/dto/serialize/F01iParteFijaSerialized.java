package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class F01iParteFijaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class F01iParteFijaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(F01iParteFijaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int F_01I_PARTE_FIJA_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginF01iIznuchar;
	
	/**
	* Constructor for F01iParteFijaSerialized
	**/
    public F01iParteFijaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for F01iParteFijaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iParteFijaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this F01iParteFijaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this F01iParteFijaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in F01iParteFijaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(F_01I_PARTE_FIJA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginF01iIznuchar = getStartOffset() + 595;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localF01iIznucharCounter = -1;
     public boolean isF01iIznucharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localF01iIznucharCounter != sharedCounter;
         localF01iIznucharCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of f01iIznuchar
	 *	@return f01iIznuchar
	 */
	public char[]  getF01iIznucharString() {
	     return getCharArray(beginF01iIznuchar,F_01I_IZNUCHAR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean f01iIznucharIsNumeric() {
	    return isNumeric(beginF01iIznuchar
	                    ,beginF01iIznuchar + F_01I_IZNUCHAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int F_01I_IZNUCHAR_LEN = 5;
  	/**
	 * serializeF01iIznuchar
	 */
	protected void serializeF01iIznuchar(long f01iIznuchar) {
		 putNumber(beginF01iIznuchar,f01iIznuchar,F_01I_IZNUCHAR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localF01iIznucharCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeF01iIznuchar
	 */
   	protected  long serializeF01iIznuchar(char[] value) {
	    long  f01iIznuchar;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    f01iIznuchar = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginF01iIznuchar
		       ,5
		      );
		 localF01iIznucharCounter = shareString.getSerializedField().getModifiedCounter();
		return  f01iIznuchar;
    }

   protected long checkF01iIznucharMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshF01iIznuchar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshF01iIznuchar() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginF01iIznuchar
			                 ,F_01I_IZNUCHAR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("f01iIznuchar", beginF01iIznuchar,F_01I_IZNUCHAR_LEN);
    }
   	}




}
  
