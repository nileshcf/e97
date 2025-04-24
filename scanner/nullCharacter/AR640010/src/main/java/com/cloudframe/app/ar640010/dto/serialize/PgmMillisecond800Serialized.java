package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class PgmMillisecond800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PgmMillisecond800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PgmMillisecond800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_MILLISECOND_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgmHundredth800;
	
	/**
	* Constructor for PgmMillisecond800Serialized
	**/
    public PgmMillisecond800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PgmMillisecond800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmMillisecond800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PgmMillisecond800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1338); // serialize this field at offset 1338 by default 
    }
    
	/**
	* sets parent for this PgmMillisecond800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1338 by default
    }    
	/**
	* initializes the field in PgmMillisecond800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_MILLISECOND_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgmHundredth800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPgmHundredth800Counter = -1;
     public boolean isPgmHundredth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmHundredth800Counter != sharedCounter;
         localPgmHundredth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmHundredth800
	 *	@return pgmHundredth800
	 */
	public char[]  getPgmHundredth800String() {
	     return getCharArray(beginPgmHundredth800,PGM_HUNDREDTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmHundredth800IsNumeric() {
	    return isNumeric(beginPgmHundredth800
	                    ,beginPgmHundredth800 + PGM_HUNDREDTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_HUNDREDTH_800_LEN = 2;
  	/**
	 * serializePgmHundredth800
	 */
	protected void serializePgmHundredth800(int pgmHundredth800) {
		 putNumber(beginPgmHundredth800,pgmHundredth800,PGM_HUNDREDTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmHundredth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmHundredth800
	 */
   	protected  int serializePgmHundredth800(char[] value) {
	    int  pgmHundredth800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmHundredth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPgmHundredth800
		       ,2
		      );
		 localPgmHundredth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmHundredth800;
    }

   protected int checkPgmHundredth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmHundredth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmHundredth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmHundredth800
			                 ,PGM_HUNDREDTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmHundredth800", beginPgmHundredth800,PGM_HUNDREDTH_800_LEN);
    }
   	}




}
  
