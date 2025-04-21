package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class F01oIzdatparrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:14. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class F01oIzdatparrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(F01oIzdatparrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int F_01O_IZDATPARR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginF01oIzfinprf;
	
	/**
	* Constructor for F01oIzdatparrSerialized
	**/
    public F01oIzdatparrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for F01oIzdatparrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oIzdatparrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this F01oIzdatparrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,85); // serialize this field at offset 85 by default 
    }
    
	/**
	* sets parent for this F01oIzdatparrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 85 by default
    }    
	/**
	* initializes the field in F01oIzdatparrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(F_01O_IZDATPARR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginF01oIzfinprf = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localF01oIzfinprfCounter = -1;
     public boolean isF01oIzfinprfModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localF01oIzfinprfCounter != sharedCounter;
         localF01oIzfinprfCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of f01oIzfinprf
	 *	@return f01oIzfinprf
	 */
	public char[]  getF01oIzfinprfString() {
	     return getCharArray(beginF01oIzfinprf,F_01O_IZFINPRF_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean f01oIzfinprfIsNumeric() {
	    return isNumeric(beginF01oIzfinprf
	                    ,beginF01oIzfinprf + F_01O_IZFINPRF_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int F_01O_IZFINPRF_LEN = 2;
  	/**
	 * serializeF01oIzfinprf
	 */
	protected void serializeF01oIzfinprf(int f01oIzfinprf) {
		 putNumber(beginF01oIzfinprf,f01oIzfinprf,F_01O_IZFINPRF_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localF01oIzfinprfCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeF01oIzfinprf
	 */
   	protected  int serializeF01oIzfinprf(char[] value) {
	    int  f01oIzfinprf;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    f01oIzfinprf = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginF01oIzfinprf
		       ,2
		      );
		 localF01oIzfinprfCounter = shareString.getSerializedField().getModifiedCounter();
		return  f01oIzfinprf;
    }

   protected int checkF01oIzfinprfMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshF01oIzfinprf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshF01oIzfinprf() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginF01oIzfinprf
			                 ,F_01O_IZFINPRF_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("f01oIzfinprf", beginF01oIzfinprf,F_01O_IZFINPRF_LEN);
    }
   	}




}
  
