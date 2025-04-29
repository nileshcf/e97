package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class PgmTime800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PgmTime800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PgmTime800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_TIME_800_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgmHour800;
            protected  int beginPgmMinute800;
            protected  int beginPgmSecond800;
	
	/**
	* Constructor for PgmTime800Serialized
	**/
    public PgmTime800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PgmTime800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmTime800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PgmTime800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1329); // serialize this field at offset 1329 by default 
    }
    
	/**
	* sets parent for this PgmTime800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1329 by default
    }    
	/**
	* initializes the field in PgmTime800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_TIME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgmHour800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginPgmMinute800 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginPgmSecond800 = getStartOffset() + 6;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localPgmHour800Counter = -1;
     public boolean isPgmHour800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmHour800Counter != sharedCounter;
         localPgmHour800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmHour800
	 *	@return pgmHour800
	 */
	public char[]  getPgmHour800String() {
	     return getCharArray(beginPgmHour800,PGM_HOUR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmHour800IsNumeric() {
	    return isNumeric(beginPgmHour800
	                    ,beginPgmHour800 + PGM_HOUR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_HOUR_800_LEN = 2;
  	/**
	 * serializePgmHour800
	 */
	protected void serializePgmHour800(int pgmHour800) {
		 putNumber(beginPgmHour800,pgmHour800,PGM_HOUR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmHour800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmHour800
	 */
   	protected  int serializePgmHour800(char[] value) {
	    int  pgmHour800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmHour800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPgmHour800
		       ,2
		      );
		 localPgmHour800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmHour800;
    }

   protected int checkPgmHour800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmHour800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmHour800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmHour800
			                 ,PGM_HOUR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmHour800", beginPgmHour800,PGM_HOUR_800_LEN);
    }
   	}
     int localPgmMinute800Counter = -1;
     public boolean isPgmMinute800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmMinute800Counter != sharedCounter;
         localPgmMinute800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmMinute800
	 *	@return pgmMinute800
	 */
	public char[]  getPgmMinute800String() {
	     return getCharArray(beginPgmMinute800,PGM_MINUTE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmMinute800IsNumeric() {
	    return isNumeric(beginPgmMinute800
	                    ,beginPgmMinute800 + PGM_MINUTE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_MINUTE_800_LEN = 2;
  	/**
	 * serializePgmMinute800
	 */
	protected void serializePgmMinute800(int pgmMinute800) {
		 putNumber(beginPgmMinute800,pgmMinute800,PGM_MINUTE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmMinute800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmMinute800
	 */
   	protected  int serializePgmMinute800(char[] value) {
	    int  pgmMinute800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmMinute800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPgmMinute800
		       ,2
		      );
		 localPgmMinute800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmMinute800;
    }

   protected int checkPgmMinute800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmMinute800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmMinute800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmMinute800
			                 ,PGM_MINUTE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmMinute800", beginPgmMinute800,PGM_MINUTE_800_LEN);
    }
   	}
     int localPgmSecond800Counter = -1;
     public boolean isPgmSecond800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmSecond800Counter != sharedCounter;
         localPgmSecond800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmSecond800
	 *	@return pgmSecond800
	 */
	public char[]  getPgmSecond800String() {
	     return getCharArray(beginPgmSecond800,PGM_SECOND_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmSecond800IsNumeric() {
	    return isNumeric(beginPgmSecond800
	                    ,beginPgmSecond800 + PGM_SECOND_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_SECOND_800_LEN = 2;
  	/**
	 * serializePgmSecond800
	 */
	protected void serializePgmSecond800(int pgmSecond800) {
		 putNumber(beginPgmSecond800,pgmSecond800,PGM_SECOND_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmSecond800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmSecond800
	 */
   	protected  int serializePgmSecond800(char[] value) {
	    int  pgmSecond800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmSecond800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPgmSecond800
		       ,2
		      );
		 localPgmSecond800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmSecond800;
    }

   protected int checkPgmSecond800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmSecond800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmSecond800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmSecond800
			                 ,PGM_SECOND_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmSecond800", beginPgmSecond800,PGM_SECOND_800_LEN);
    }
   	}




}
  
