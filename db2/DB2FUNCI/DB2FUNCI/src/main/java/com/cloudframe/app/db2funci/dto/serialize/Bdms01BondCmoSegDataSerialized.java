package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01BondCmoSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01BondCmoSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BondCmoSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BOND_CMO_SEG_DATA_LENGTH = 84;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01BondCmoSegSqlcd;
            protected  int beginMsdCmoInd;
            protected  int beginMsdStartAccrualDate;
            protected  int beginMsdEndAccrualDate;
            protected  int beginMsdDelayDays;
            protected  int beginBdms01AccrualStartDt;
            protected  int beginBdms01AccrualEndDt;
	
	/**
	* Constructor for Bdms01BondCmoSegDataSerialized
	**/
    public Bdms01BondCmoSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BondCmoSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondCmoSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BondCmoSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3345); // serialize this field at offset 3345 by default 
    }
    
	/**
	* sets parent for this Bdms01BondCmoSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3345 by default
    }    
	/**
	* initializes the field in Bdms01BondCmoSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BOND_CMO_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01BondCmoSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCmoInd = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdStartAccrualDate = getStartOffset() + 5;	// set offset for serialization
  
             beginMsdEndAccrualDate = getStartOffset() + 13;	// set offset for serialization
  
             beginMsdDelayDays = getStartOffset() + 21;	// set offset for serialization
  
             beginBdms01AccrualStartDt = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01AccrualEndDt = getStartOffset() + 34;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01BondCmoSegSqlcdCounter = -1;
     public boolean isBdms01BondCmoSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondCmoSegSqlcdCounter != sharedCounter;
         localBdms01BondCmoSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01BondCmoSegSqlcd
	 *	@return bdms01BondCmoSegSqlcd
	 */
	public char[]  getBdms01BondCmoSegSqlcdString() {
	     return getCharArray(beginBdms01BondCmoSegSqlcd,BDMS_01_BOND_CMO_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BondCmoSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01BondCmoSegSqlcd
	                    ,beginBdms01BondCmoSegSqlcd + BDMS_01_BOND_CMO_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_BOND_CMO_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01BondCmoSegSqlcd
	 */
	protected void serializeBdms01BondCmoSegSqlcd(int bdms01BondCmoSegSqlcd) {
		 putNumber(beginBdms01BondCmoSegSqlcd,bdms01BondCmoSegSqlcd,BDMS_01_BOND_CMO_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BondCmoSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01BondCmoSegSqlcd
	 */
   	protected  int serializeBdms01BondCmoSegSqlcd(char[] value) {
	    int  bdms01BondCmoSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01BondCmoSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01BondCmoSegSqlcd
		       ,4
		      );
		 localBdms01BondCmoSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01BondCmoSegSqlcd;
    }

   protected int checkBdms01BondCmoSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01BondCmoSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01BondCmoSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01BondCmoSegSqlcd
			                 ,BDMS_01_BOND_CMO_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BondCmoSegSqlcd", beginBdms01BondCmoSegSqlcd,BDMS_01_BOND_CMO_SEG_SQLCD_LEN);
    }
   	}
     int localMsdCmoIndCounter = -1;
     public boolean isMsdCmoIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCmoIndCounter != sharedCounter;
         localMsdCmoIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CMO_IND_LEN = 1;
	/**
	 * 	serialize this MsdCmoInd
	 */
   protected void serializeMsdCmoInd(char[] msdCmoInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCmoInd,0,getStringValue(),beginMsdCmoInd,MSD_CMO_IND_LEN);
       localMsdCmoIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCmoIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdCmoInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCmoInd() {	 
   		return (substring(getStringValue(),beginMsdCmoInd,beginMsdCmoInd + MSD_CMO_IND_LEN));
   	}
     int localMsdStartAccrualDateCounter = -1;
     public boolean isMsdStartAccrualDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStartAccrualDateCounter != sharedCounter;
         localMsdStartAccrualDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStartAccrualDate
	 *	@return msdStartAccrualDate
	 */
	public char[]  getMsdStartAccrualDateString() {
	     return getCharArray(beginMsdStartAccrualDate,MSD_START_ACCRUAL_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStartAccrualDateIsNumeric() {
	    return isNumeric(beginMsdStartAccrualDate
	                    ,beginMsdStartAccrualDate + MSD_START_ACCRUAL_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_START_ACCRUAL_DATE_LEN = 8;
  	/**
	 * serializeMsdStartAccrualDate
	 */
	protected void serializeMsdStartAccrualDate(long msdStartAccrualDate) {
		 putNumber(beginMsdStartAccrualDate,msdStartAccrualDate,MSD_START_ACCRUAL_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStartAccrualDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStartAccrualDate
	 */
   	protected  long serializeMsdStartAccrualDate(char[] value) {
	    long  msdStartAccrualDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStartAccrualDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdStartAccrualDate
		       ,8
		      );
		 localMsdStartAccrualDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStartAccrualDate;
    }

   protected long checkMsdStartAccrualDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStartAccrualDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStartAccrualDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStartAccrualDate
			                 ,MSD_START_ACCRUAL_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStartAccrualDate", beginMsdStartAccrualDate,MSD_START_ACCRUAL_DATE_LEN);
    }
   	}
     int localMsdEndAccrualDateCounter = -1;
     public boolean isMsdEndAccrualDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdEndAccrualDateCounter != sharedCounter;
         localMsdEndAccrualDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdEndAccrualDate
	 *	@return msdEndAccrualDate
	 */
	public char[]  getMsdEndAccrualDateString() {
	     return getCharArray(beginMsdEndAccrualDate,MSD_END_ACCRUAL_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdEndAccrualDateIsNumeric() {
	    return isNumeric(beginMsdEndAccrualDate
	                    ,beginMsdEndAccrualDate + MSD_END_ACCRUAL_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_END_ACCRUAL_DATE_LEN = 8;
  	/**
	 * serializeMsdEndAccrualDate
	 */
	protected void serializeMsdEndAccrualDate(long msdEndAccrualDate) {
		 putNumber(beginMsdEndAccrualDate,msdEndAccrualDate,MSD_END_ACCRUAL_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdEndAccrualDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdEndAccrualDate
	 */
   	protected  long serializeMsdEndAccrualDate(char[] value) {
	    long  msdEndAccrualDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdEndAccrualDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdEndAccrualDate
		       ,8
		      );
		 localMsdEndAccrualDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdEndAccrualDate;
    }

   protected long checkMsdEndAccrualDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdEndAccrualDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdEndAccrualDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdEndAccrualDate
			                 ,MSD_END_ACCRUAL_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdEndAccrualDate", beginMsdEndAccrualDate,MSD_END_ACCRUAL_DATE_LEN);
    }
   	}
     int localMsdDelayDaysCounter = -1;
     public boolean isMsdDelayDaysModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDelayDaysCounter != sharedCounter;
         localMsdDelayDaysCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdDelayDays
	 *	@return msdDelayDays
	 */
	public char[]  getMsdDelayDaysString() {
	     return getCharArray(beginMsdDelayDays,MSD_DELAY_DAYS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdDelayDaysIsNumeric() {
	    return isNumeric(beginMsdDelayDays
	                    ,beginMsdDelayDays + MSD_DELAY_DAYS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_DELAY_DAYS_LEN = 3;
  	/**
	 * serializeMsdDelayDays
	 */
	protected void serializeMsdDelayDays(int msdDelayDays) {
		 putNumber(beginMsdDelayDays,msdDelayDays,MSD_DELAY_DAYS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdDelayDaysCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdDelayDays
	 */
   	protected  int serializeMsdDelayDays(char[] value) {
	    int  msdDelayDays;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdDelayDays = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginMsdDelayDays
		       ,3
		      );
		 localMsdDelayDaysCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdDelayDays;
    }

   protected int checkMsdDelayDaysMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdDelayDays is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdDelayDays() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdDelayDays
			                 ,MSD_DELAY_DAYS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdDelayDays", beginMsdDelayDays,MSD_DELAY_DAYS_LEN);
    }
   	}
     int localBdms01AccrualStartDtCounter = -1;
     public boolean isBdms01AccrualStartDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AccrualStartDtCounter != sharedCounter;
         localBdms01AccrualStartDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ACCRUAL_START_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01AccrualStartDt
	 */
   protected void serializeBdms01AccrualStartDt(char[] bdms01AccrualStartDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AccrualStartDt,0,getStringValue(),beginBdms01AccrualStartDt,BDMS_01_ACCRUAL_START_DT_LEN);
       localBdms01AccrualStartDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AccrualStartDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01AccrualStartDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AccrualStartDt() {	 
   		return (substring(getStringValue(),beginBdms01AccrualStartDt,beginBdms01AccrualStartDt + BDMS_01_ACCRUAL_START_DT_LEN));
   	}
     int localBdms01AccrualEndDtCounter = -1;
     public boolean isBdms01AccrualEndDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AccrualEndDtCounter != sharedCounter;
         localBdms01AccrualEndDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ACCRUAL_END_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01AccrualEndDt
	 */
   protected void serializeBdms01AccrualEndDt(char[] bdms01AccrualEndDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AccrualEndDt,0,getStringValue(),beginBdms01AccrualEndDt,BDMS_01_ACCRUAL_END_DT_LEN);
       localBdms01AccrualEndDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AccrualEndDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01AccrualEndDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AccrualEndDt() {	 
   		return (substring(getStringValue(),beginBdms01AccrualEndDt,beginBdms01AccrualEndDt + BDMS_01_ACCRUAL_END_DT_LEN));
   	}




}
  
