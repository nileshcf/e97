package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class F01oParteFijaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class F01oParteFijaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(F01oParteFijaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int F_01O_PARTE_FIJA_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginF01oIznuchar;
	
	/**
	* Constructor for F01oParteFijaSerialized
	**/
    public F01oParteFijaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for F01oParteFijaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oParteFijaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this F01oParteFijaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this F01oParteFijaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in F01oParteFijaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(F_01O_PARTE_FIJA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginF01oIznuchar = getStartOffset() + 595;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localF01oIznucharCounter = -1;
     public boolean isF01oIznucharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localF01oIznucharCounter != sharedCounter;
         localF01oIznucharCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of f01oIznuchar
	 *	@return f01oIznuchar
	 */
	public char[]  getF01oIznucharString() {
	     return getCharArray(beginF01oIznuchar,F_01O_IZNUCHAR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean f01oIznucharIsNumeric() {
	    return isNumeric(beginF01oIznuchar
	                    ,beginF01oIznuchar + F_01O_IZNUCHAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int F_01O_IZNUCHAR_LEN = 5;
  	/**
	 * serializeF01oIznuchar
	 */
	protected void serializeF01oIznuchar(long f01oIznuchar) {
		 putNumber(beginF01oIznuchar,f01oIznuchar,F_01O_IZNUCHAR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localF01oIznucharCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeF01oIznuchar
	 */
   	protected  long serializeF01oIznuchar(char[] value) {
	    long  f01oIznuchar;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    f01oIznuchar = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginF01oIznuchar
		       ,5
		      );
		 localF01oIznucharCounter = shareString.getSerializedField().getModifiedCounter();
		return  f01oIznuchar;
    }

   protected long checkF01oIznucharMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshF01oIznuchar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshF01oIznuchar() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginF01oIznuchar
			                 ,F_01O_IZNUCHAR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("f01oIznuchar", beginF01oIznuchar,F_01O_IZNUCHAR_LEN);
    }
   	}




}
  
