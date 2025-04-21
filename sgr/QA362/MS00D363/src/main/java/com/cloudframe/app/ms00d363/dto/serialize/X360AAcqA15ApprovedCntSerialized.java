package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AAcqA15ApprovedCntSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360AAcqA15ApprovedCntSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AAcqA15ApprovedCntSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_AACQ_A_15_APPROVED_CNT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360AAcqA15ApprovedCntCr;
            protected  int beginX360AAcqA15ApprovedCntDb;
	
	/**
	* Constructor for X360AAcqA15ApprovedCntSerialized
	**/
    public X360AAcqA15ApprovedCntSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AAcqA15ApprovedCntSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AAcqA15ApprovedCntSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AAcqA15ApprovedCntSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1170); // serialize this field at offset 1170 by default 
    }
    
	/**
	* sets parent for this X360AAcqA15ApprovedCntSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1170 by default
    }    
	/**
	* initializes the field in X360AAcqA15ApprovedCntSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_AACQ_A_15_APPROVED_CNT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360AAcqA15ApprovedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360AAcqA15ApprovedCntDb = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360AAcqA15ApprovedCntCrCounter = -1;
     public boolean isX360AAcqA15ApprovedCntCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AAcqA15ApprovedCntCrCounter != sharedCounter;
         localX360AAcqA15ApprovedCntCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AAcqA15ApprovedCntCr
	 *	@return x360AAcqA15ApprovedCntCr
	 */
	public char[]  getX360AAcqA15ApprovedCntCrString() {
	     return getCharArray(beginX360AAcqA15ApprovedCntCr,X_360_AACQ_A_15_APPROVED_CNT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AAcqA15ApprovedCntCrIsNumeric() {
	    return isNumeric(beginX360AAcqA15ApprovedCntCr
	                    ,beginX360AAcqA15ApprovedCntCr + X_360_AACQ_A_15_APPROVED_CNT_CR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AACQ_A_15_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * serializeX360AAcqA15ApprovedCntCr
	 */
	protected void serializeX360AAcqA15ApprovedCntCr(long x360AAcqA15ApprovedCntCr) {
		 putNumber(beginX360AAcqA15ApprovedCntCr,x360AAcqA15ApprovedCntCr,X_360_AACQ_A_15_APPROVED_CNT_CR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AAcqA15ApprovedCntCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AAcqA15ApprovedCntCr
	 */
   	protected  long serializeX360AAcqA15ApprovedCntCr(char[] value) {
	    long  x360AAcqA15ApprovedCntCr;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AAcqA15ApprovedCntCr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginX360AAcqA15ApprovedCntCr
		       ,5
		      );
		 localX360AAcqA15ApprovedCntCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AAcqA15ApprovedCntCr;
    }

   protected long checkX360AAcqA15ApprovedCntCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AAcqA15ApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqA15ApprovedCntCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AAcqA15ApprovedCntCr
			                 ,X_360_AACQ_A_15_APPROVED_CNT_CR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA15ApprovedCntCr", beginX360AAcqA15ApprovedCntCr,X_360_AACQ_A_15_APPROVED_CNT_CR_LEN);
    }
   	}
     int localX360AAcqA15ApprovedCntDbCounter = -1;
     public boolean isX360AAcqA15ApprovedCntDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AAcqA15ApprovedCntDbCounter != sharedCounter;
         localX360AAcqA15ApprovedCntDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AAcqA15ApprovedCntDb
	 *	@return x360AAcqA15ApprovedCntDb
	 */
	public char[]  getX360AAcqA15ApprovedCntDbString() {
	     return getCharArray(beginX360AAcqA15ApprovedCntDb,X_360_AACQ_A_15_APPROVED_CNT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AAcqA15ApprovedCntDbIsNumeric() {
	    return isNumeric(beginX360AAcqA15ApprovedCntDb
	                    ,beginX360AAcqA15ApprovedCntDb + X_360_AACQ_A_15_APPROVED_CNT_DB_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AACQ_A_15_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * serializeX360AAcqA15ApprovedCntDb
	 */
	protected void serializeX360AAcqA15ApprovedCntDb(long x360AAcqA15ApprovedCntDb) {
		 putNumber(beginX360AAcqA15ApprovedCntDb,x360AAcqA15ApprovedCntDb,X_360_AACQ_A_15_APPROVED_CNT_DB_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AAcqA15ApprovedCntDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AAcqA15ApprovedCntDb
	 */
   	protected  long serializeX360AAcqA15ApprovedCntDb(char[] value) {
	    long  x360AAcqA15ApprovedCntDb;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AAcqA15ApprovedCntDb = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginX360AAcqA15ApprovedCntDb
		       ,5
		      );
		 localX360AAcqA15ApprovedCntDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AAcqA15ApprovedCntDb;
    }

   protected long checkX360AAcqA15ApprovedCntDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AAcqA15ApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqA15ApprovedCntDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AAcqA15ApprovedCntDb
			                 ,X_360_AACQ_A_15_APPROVED_CNT_DB_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA15ApprovedCntDb", beginX360AAcqA15ApprovedCntDb,X_360_AACQ_A_15_APPROVED_CNT_DB_LEN);
    }
   	}




}
  
