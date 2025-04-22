package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class PgmDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PgmDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PgmDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_DATE_800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgmYear800;
            protected  int beginPgmMonth800;
            protected  int beginPgmDay800;
	
	/**
	* Constructor for PgmDate800Serialized
	**/
    public PgmDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PgmDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PgmDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1318); // serialize this field at offset 1318 by default 
    }
    
	/**
	* sets parent for this PgmDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1318 by default
    }    
	/**
	* initializes the field in PgmDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgmYear800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginPgmMonth800 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginPgmDay800 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPgmYear800Counter = -1;
     public boolean isPgmYear800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmYear800Counter != sharedCounter;
         localPgmYear800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmYear800
	 *	@return pgmYear800
	 */
	public char[]  getPgmYear800String() {
	     return getCharArray(beginPgmYear800,PGM_YEAR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmYear800IsNumeric() {
	    return isNumeric(beginPgmYear800
	                    ,beginPgmYear800 + PGM_YEAR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_YEAR_800_LEN = 4;
  	/**
	 * serializePgmYear800
	 */
	protected void serializePgmYear800(int pgmYear800) {
		 putNumber(beginPgmYear800,pgmYear800,PGM_YEAR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmYear800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmYear800
	 */
   	protected  int serializePgmYear800(char[] value) {
	    int  pgmYear800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmYear800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPgmYear800
		       ,4
		      );
		 localPgmYear800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmYear800;
    }

   protected int checkPgmYear800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmYear800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmYear800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmYear800
			                 ,PGM_YEAR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmYear800", beginPgmYear800,PGM_YEAR_800_LEN);
    }
   	}
     int localPgmMonth800Counter = -1;
     public boolean isPgmMonth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmMonth800Counter != sharedCounter;
         localPgmMonth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmMonth800
	 *	@return pgmMonth800
	 */
	public char[]  getPgmMonth800String() {
	     return getCharArray(beginPgmMonth800,PGM_MONTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmMonth800IsNumeric() {
	    return isNumeric(beginPgmMonth800
	                    ,beginPgmMonth800 + PGM_MONTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_MONTH_800_LEN = 2;
  	/**
	 * serializePgmMonth800
	 */
	protected void serializePgmMonth800(int pgmMonth800) {
		 putNumber(beginPgmMonth800,pgmMonth800,PGM_MONTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmMonth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmMonth800
	 */
   	protected  int serializePgmMonth800(char[] value) {
	    int  pgmMonth800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmMonth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPgmMonth800
		       ,2
		      );
		 localPgmMonth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmMonth800;
    }

   protected int checkPgmMonth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmMonth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmMonth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmMonth800
			                 ,PGM_MONTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmMonth800", beginPgmMonth800,PGM_MONTH_800_LEN);
    }
   	}
     int localPgmDay800Counter = -1;
     public boolean isPgmDay800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmDay800Counter != sharedCounter;
         localPgmDay800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmDay800
	 *	@return pgmDay800
	 */
	public char[]  getPgmDay800String() {
	     return getCharArray(beginPgmDay800,PGM_DAY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmDay800IsNumeric() {
	    return isNumeric(beginPgmDay800
	                    ,beginPgmDay800 + PGM_DAY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_DAY_800_LEN = 2;
  	/**
	 * serializePgmDay800
	 */
	protected void serializePgmDay800(int pgmDay800) {
		 putNumber(beginPgmDay800,pgmDay800,PGM_DAY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmDay800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmDay800
	 */
   	protected  int serializePgmDay800(char[] value) {
	    int  pgmDay800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmDay800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPgmDay800
		       ,2
		      );
		 localPgmDay800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmDay800;
    }

   protected int checkPgmDay800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmDay800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmDay800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmDay800
			                 ,PGM_DAY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmDay800", beginPgmDay800,PGM_DAY_800_LEN);
    }
   	}




}
  
