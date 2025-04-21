package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01SecurityTypeSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01SecurityTypeSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01SecurityTypeSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_SECURITY_TYPE_SEG_DATA_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SecurityTypeSegSqlcd;
            protected  int beginMsdTypeOfRecordInd;
            protected  int beginMsdSecurityTypePos1;
            protected  int beginMsdSecPriceMultiplier;
	
	/**
	* Constructor for Bdms01SecurityTypeSegDataSerialized
	**/
    public Bdms01SecurityTypeSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01SecurityTypeSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SecurityTypeSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01SecurityTypeSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,457); // serialize this field at offset 457 by default 
    }
    
	/**
	* sets parent for this Bdms01SecurityTypeSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 457 by default
    }    
	/**
	* initializes the field in Bdms01SecurityTypeSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_SECURITY_TYPE_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01SecurityTypeSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdTypeOfRecordInd = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdSecurityTypePos1 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginMsdSecPriceMultiplier = getStartOffset() + 12;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01SecurityTypeSegSqlcdCounter = -1;
     public boolean isBdms01SecurityTypeSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityTypeSegSqlcdCounter != sharedCounter;
         localBdms01SecurityTypeSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01SecurityTypeSegSqlcd
	 *	@return bdms01SecurityTypeSegSqlcd
	 */
	public char[]  getBdms01SecurityTypeSegSqlcdString() {
	     return getCharArray(beginBdms01SecurityTypeSegSqlcd,BDMS_01_SECURITY_TYPE_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01SecurityTypeSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01SecurityTypeSegSqlcd
	                    ,beginBdms01SecurityTypeSegSqlcd + BDMS_01_SECURITY_TYPE_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_SECURITY_TYPE_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01SecurityTypeSegSqlcd
	 */
	protected void serializeBdms01SecurityTypeSegSqlcd(int bdms01SecurityTypeSegSqlcd) {
		 putNumber(beginBdms01SecurityTypeSegSqlcd,bdms01SecurityTypeSegSqlcd,BDMS_01_SECURITY_TYPE_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01SecurityTypeSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01SecurityTypeSegSqlcd
	 */
   	protected  int serializeBdms01SecurityTypeSegSqlcd(char[] value) {
	    int  bdms01SecurityTypeSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01SecurityTypeSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01SecurityTypeSegSqlcd
		       ,4
		      );
		 localBdms01SecurityTypeSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01SecurityTypeSegSqlcd;
    }

   protected int checkBdms01SecurityTypeSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01SecurityTypeSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01SecurityTypeSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01SecurityTypeSegSqlcd
			                 ,BDMS_01_SECURITY_TYPE_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01SecurityTypeSegSqlcd", beginBdms01SecurityTypeSegSqlcd,BDMS_01_SECURITY_TYPE_SEG_SQLCD_LEN);
    }
   	}
     int localMsdTypeOfRecordIndCounter = -1;
     public boolean isMsdTypeOfRecordIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdTypeOfRecordIndCounter != sharedCounter;
         localMsdTypeOfRecordIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_TYPE_OF_RECORD_IND_LEN = 1;
	/**
	 * 	serialize this MsdTypeOfRecordInd
	 */
   protected void serializeMsdTypeOfRecordInd(char[] msdTypeOfRecordInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdTypeOfRecordInd,0,getStringValue(),beginMsdTypeOfRecordInd,MSD_TYPE_OF_RECORD_IND_LEN);
       localMsdTypeOfRecordIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdTypeOfRecordIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdTypeOfRecordInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdTypeOfRecordInd() {	 
   		return (substring(getStringValue(),beginMsdTypeOfRecordInd,beginMsdTypeOfRecordInd + MSD_TYPE_OF_RECORD_IND_LEN));
   	}
     int localMsdSecurityTypePos1Counter = -1;
     public boolean isMsdSecurityTypePos1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityTypePos1Counter != sharedCounter;
         localMsdSecurityTypePos1Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_TYPE_POS_1_LEN = 1;
	/**
	 * 	serialize this MsdSecurityTypePos1
	 */
   protected void serializeMsdSecurityTypePos1(char[] msdSecurityTypePos1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecurityTypePos1,0,getStringValue(),beginMsdSecurityTypePos1,MSD_SECURITY_TYPE_POS_1_LEN);
       localMsdSecurityTypePos1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecurityTypePos1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecurityTypePos1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecurityTypePos1() {	 
   		return (substring(getStringValue(),beginMsdSecurityTypePos1,beginMsdSecurityTypePos1 + MSD_SECURITY_TYPE_POS_1_LEN));
   	}
     int localMsdSecPriceMultiplierCounter = -1;
     public boolean isMsdSecPriceMultiplierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecPriceMultiplierCounter != sharedCounter;
         localMsdSecPriceMultiplierCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEC_PRICE_MULTIPLIER_LEN = 1;
	/**
	 * 	serialize this MsdSecPriceMultiplier
	 */
   protected void serializeMsdSecPriceMultiplier(char[] msdSecPriceMultiplier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecPriceMultiplier,0,getStringValue(),beginMsdSecPriceMultiplier,MSD_SEC_PRICE_MULTIPLIER_LEN);
       localMsdSecPriceMultiplierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecPriceMultiplierConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSecPriceMultiplier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecPriceMultiplier() {	 
   		return (substring(getStringValue(),beginMsdSecPriceMultiplier,beginMsdSecPriceMultiplier + MSD_SEC_PRICE_MULTIPLIER_LEN));
   	}




}
  
