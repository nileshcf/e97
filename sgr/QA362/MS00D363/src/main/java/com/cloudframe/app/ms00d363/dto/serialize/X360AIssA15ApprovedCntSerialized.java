package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AIssA15ApprovedCntSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360AIssA15ApprovedCntSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AIssA15ApprovedCntSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_AISS_A_15_APPROVED_CNT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360AIssA15ApprovedCntCr;
            protected  int beginX360AIssA15ApprovedCntDb;
	
	/**
	* Constructor for X360AIssA15ApprovedCntSerialized
	**/
    public X360AIssA15ApprovedCntSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AIssA15ApprovedCntSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AIssA15ApprovedCntSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AIssA15ApprovedCntSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1170); // serialize this field at offset 1170 by default 
    }
    
	/**
	* sets parent for this X360AIssA15ApprovedCntSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1170 by default
    }    
	/**
	* initializes the field in X360AIssA15ApprovedCntSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_AISS_A_15_APPROVED_CNT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360AIssA15ApprovedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360AIssA15ApprovedCntDb = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360AIssA15ApprovedCntCrCounter = -1;
     public boolean isX360AIssA15ApprovedCntCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AIssA15ApprovedCntCrCounter != sharedCounter;
         localX360AIssA15ApprovedCntCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AIssA15ApprovedCntCr
	 *	@return x360AIssA15ApprovedCntCr
	 */
	public char[]  getX360AIssA15ApprovedCntCrString() {
	     return getCharArray(beginX360AIssA15ApprovedCntCr,X_360_AISS_A_15_APPROVED_CNT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AIssA15ApprovedCntCrIsNumeric() {
	    return isNumeric(beginX360AIssA15ApprovedCntCr
	                    ,beginX360AIssA15ApprovedCntCr + X_360_AISS_A_15_APPROVED_CNT_CR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AISS_A_15_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * serializeX360AIssA15ApprovedCntCr
	 */
	protected void serializeX360AIssA15ApprovedCntCr(long x360AIssA15ApprovedCntCr) {
		 putNumber(beginX360AIssA15ApprovedCntCr,x360AIssA15ApprovedCntCr,X_360_AISS_A_15_APPROVED_CNT_CR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AIssA15ApprovedCntCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AIssA15ApprovedCntCr
	 */
   	protected  long serializeX360AIssA15ApprovedCntCr(char[] value) {
	    long  x360AIssA15ApprovedCntCr;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AIssA15ApprovedCntCr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginX360AIssA15ApprovedCntCr
		       ,5
		      );
		 localX360AIssA15ApprovedCntCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AIssA15ApprovedCntCr;
    }

   protected long checkX360AIssA15ApprovedCntCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AIssA15ApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssA15ApprovedCntCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AIssA15ApprovedCntCr
			                 ,X_360_AISS_A_15_APPROVED_CNT_CR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AIssA15ApprovedCntCr", beginX360AIssA15ApprovedCntCr,X_360_AISS_A_15_APPROVED_CNT_CR_LEN);
    }
   	}
     int localX360AIssA15ApprovedCntDbCounter = -1;
     public boolean isX360AIssA15ApprovedCntDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AIssA15ApprovedCntDbCounter != sharedCounter;
         localX360AIssA15ApprovedCntDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AIssA15ApprovedCntDb
	 *	@return x360AIssA15ApprovedCntDb
	 */
	public char[]  getX360AIssA15ApprovedCntDbString() {
	     return getCharArray(beginX360AIssA15ApprovedCntDb,X_360_AISS_A_15_APPROVED_CNT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AIssA15ApprovedCntDbIsNumeric() {
	    return isNumeric(beginX360AIssA15ApprovedCntDb
	                    ,beginX360AIssA15ApprovedCntDb + X_360_AISS_A_15_APPROVED_CNT_DB_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AISS_A_15_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * serializeX360AIssA15ApprovedCntDb
	 */
	protected void serializeX360AIssA15ApprovedCntDb(long x360AIssA15ApprovedCntDb) {
		 putNumber(beginX360AIssA15ApprovedCntDb,x360AIssA15ApprovedCntDb,X_360_AISS_A_15_APPROVED_CNT_DB_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AIssA15ApprovedCntDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AIssA15ApprovedCntDb
	 */
   	protected  long serializeX360AIssA15ApprovedCntDb(char[] value) {
	    long  x360AIssA15ApprovedCntDb;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AIssA15ApprovedCntDb = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginX360AIssA15ApprovedCntDb
		       ,5
		      );
		 localX360AIssA15ApprovedCntDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AIssA15ApprovedCntDb;
    }

   protected long checkX360AIssA15ApprovedCntDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AIssA15ApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssA15ApprovedCntDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AIssA15ApprovedCntDb
			                 ,X_360_AISS_A_15_APPROVED_CNT_DB_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AIssA15ApprovedCntDb", beginX360AIssA15ApprovedCntDb,X_360_AISS_A_15_APPROVED_CNT_DB_LEN);
    }
   	}




}
  
