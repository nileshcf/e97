package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class InterimDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InterimDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InterimDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INTERIM_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInterimJulianDate800;
	
	/**
	* Constructor for InterimDate800Serialized
	**/
    public InterimDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InterimDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InterimDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InterimDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this InterimDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in InterimDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INTERIM_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInterimJulianDate800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInterimJulianDate800Counter = -1;
     public boolean isInterimJulianDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInterimJulianDate800Counter != sharedCounter;
         localInterimJulianDate800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of interimJulianDate800
	 *	@return interimJulianDate800
	 */
	public char[]  getInterimJulianDate800String() {
	     return getCharArray(beginInterimJulianDate800,INTERIM_JULIAN_DATE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean interimJulianDate800IsNumeric() {
	    return isNumeric(beginInterimJulianDate800
	                    ,beginInterimJulianDate800 + INTERIM_JULIAN_DATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INTERIM_JULIAN_DATE_800_LEN = 5;
  	/**
	 * serializeInterimJulianDate800
	 */
	protected void serializeInterimJulianDate800(long interimJulianDate800) {
		 putNumber(beginInterimJulianDate800,interimJulianDate800,INTERIM_JULIAN_DATE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInterimJulianDate800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInterimJulianDate800
	 */
   	protected  long serializeInterimJulianDate800(char[] value) {
	    long  interimJulianDate800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    interimJulianDate800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginInterimJulianDate800
		       ,5
		      );
		 localInterimJulianDate800Counter = shareString.getSerializedField().getModifiedCounter();
		return  interimJulianDate800;
    }

   protected long checkInterimJulianDate800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInterimJulianDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInterimJulianDate800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInterimJulianDate800
			                 ,INTERIM_JULIAN_DATE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("interimJulianDate800", beginInterimJulianDate800,INTERIM_JULIAN_DATE_800_LEN);
    }
   	}




}
  
