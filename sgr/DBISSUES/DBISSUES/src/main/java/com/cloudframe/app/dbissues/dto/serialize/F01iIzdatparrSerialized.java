package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class F01iIzdatparrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:14. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class F01iIzdatparrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(F01iIzdatparrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int F_01I_IZDATPARR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginF01iIzfinprf;
	
	/**
	* Constructor for F01iIzdatparrSerialized
	**/
    public F01iIzdatparrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for F01iIzdatparrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iIzdatparrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this F01iIzdatparrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,85); // serialize this field at offset 85 by default 
    }
    
	/**
	* sets parent for this F01iIzdatparrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 85 by default
    }    
	/**
	* initializes the field in F01iIzdatparrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(F_01I_IZDATPARR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginF01iIzfinprf = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localF01iIzfinprfCounter = -1;
     public boolean isF01iIzfinprfModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localF01iIzfinprfCounter != sharedCounter;
         localF01iIzfinprfCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of f01iIzfinprf
	 *	@return f01iIzfinprf
	 */
	public char[]  getF01iIzfinprfString() {
	     return getCharArray(beginF01iIzfinprf,F_01I_IZFINPRF_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean f01iIzfinprfIsNumeric() {
	    return isNumeric(beginF01iIzfinprf
	                    ,beginF01iIzfinprf + F_01I_IZFINPRF_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int F_01I_IZFINPRF_LEN = 2;
  	/**
	 * serializeF01iIzfinprf
	 */
	protected void serializeF01iIzfinprf(int f01iIzfinprf) {
		 putNumber(beginF01iIzfinprf,f01iIzfinprf,F_01I_IZFINPRF_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localF01iIzfinprfCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeF01iIzfinprf
	 */
   	protected  int serializeF01iIzfinprf(char[] value) {
	    int  f01iIzfinprf;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    f01iIzfinprf = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginF01iIzfinprf
		       ,2
		      );
		 localF01iIzfinprfCounter = shareString.getSerializedField().getModifiedCounter();
		return  f01iIzfinprf;
    }

   protected int checkF01iIzfinprfMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshF01iIzfinprf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshF01iIzfinprf() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginF01iIzfinprf
			                 ,F_01I_IZFINPRF_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("f01iIzfinprf", beginF01iIzfinprf,F_01I_IZFINPRF_LEN);
    }
   	}




}
  
