package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01FrozenChillSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01FrozenChillSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01FrozenChillSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_FROZEN_CHILL_SEG_DATA_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01FrozenChillSegSqlcd;
            protected  int beginMsdFrozenChilledInd;
           protected int beginMsdFcData;
           protected static final int MSD_FC_DATA_SIZE = 3;
            protected  int beginMsdDtc;
            protected  int beginMsdDtcCustodyInd;
	
	/**
	* Constructor for Bdms01FrozenChillSegDataSerialized
	**/
    public Bdms01FrozenChillSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01FrozenChillSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01FrozenChillSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01FrozenChillSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1339); // serialize this field at offset 1339 by default 
    }
    
	/**
	* sets parent for this Bdms01FrozenChillSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1339 by default
    }    
	/**
	* initializes the field in Bdms01FrozenChillSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_FROZEN_CHILL_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01FrozenChillSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdFrozenChilledInd = getStartOffset() + 4;	// set offset for serialization
  
  
	        beginMsdFcData = getStartOffset() + 12; // set offset for serialization
  
             beginMsdDtc = getStartOffset() + 132;	// set offset for serialization
  
             beginMsdDtcCustodyInd = getStartOffset() + 133;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01FrozenChillSegSqlcdCounter = -1;
     public boolean isBdms01FrozenChillSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FrozenChillSegSqlcdCounter != sharedCounter;
         localBdms01FrozenChillSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01FrozenChillSegSqlcd
	 *	@return bdms01FrozenChillSegSqlcd
	 */
	public char[]  getBdms01FrozenChillSegSqlcdString() {
	     return getCharArray(beginBdms01FrozenChillSegSqlcd,BDMS_01_FROZEN_CHILL_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01FrozenChillSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01FrozenChillSegSqlcd
	                    ,beginBdms01FrozenChillSegSqlcd + BDMS_01_FROZEN_CHILL_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_FROZEN_CHILL_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01FrozenChillSegSqlcd
	 */
	protected void serializeBdms01FrozenChillSegSqlcd(int bdms01FrozenChillSegSqlcd) {
		 putNumber(beginBdms01FrozenChillSegSqlcd,bdms01FrozenChillSegSqlcd,BDMS_01_FROZEN_CHILL_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01FrozenChillSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01FrozenChillSegSqlcd
	 */
   	protected  int serializeBdms01FrozenChillSegSqlcd(char[] value) {
	    int  bdms01FrozenChillSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01FrozenChillSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01FrozenChillSegSqlcd
		       ,4
		      );
		 localBdms01FrozenChillSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01FrozenChillSegSqlcd;
    }

   protected int checkBdms01FrozenChillSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01FrozenChillSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01FrozenChillSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01FrozenChillSegSqlcd
			                 ,BDMS_01_FROZEN_CHILL_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01FrozenChillSegSqlcd", beginBdms01FrozenChillSegSqlcd,BDMS_01_FROZEN_CHILL_SEG_SQLCD_LEN);
    }
   	}
     int localMsdFrozenChilledIndCounter = -1;
     public boolean isMsdFrozenChilledIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFrozenChilledIndCounter != sharedCounter;
         localMsdFrozenChilledIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdFrozenChilledInd
	 *	@return msdFrozenChilledInd
	 */
	public char[]  getMsdFrozenChilledIndString() {
	     return getCharArray(beginMsdFrozenChilledInd,MSD_FROZEN_CHILLED_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdFrozenChilledIndIsNumeric() {
	    return isNumeric(beginMsdFrozenChilledInd
	                    ,beginMsdFrozenChilledInd + MSD_FROZEN_CHILLED_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_FROZEN_CHILLED_IND_LEN = 8;
  	/**
	 * serializeMsdFrozenChilledInd
	 */
	protected void serializeMsdFrozenChilledInd(long msdFrozenChilledInd) {
		 putNumber(beginMsdFrozenChilledInd,msdFrozenChilledInd,MSD_FROZEN_CHILLED_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdFrozenChilledIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdFrozenChilledInd
	 */
   	protected  long serializeMsdFrozenChilledInd(char[] value) {
	    long  msdFrozenChilledInd;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdFrozenChilledInd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdFrozenChilledInd
		       ,8
		      );
		 localMsdFrozenChilledIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdFrozenChilledInd;
    }

   protected long checkMsdFrozenChilledIndMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdFrozenChilledInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdFrozenChilledInd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdFrozenChilledInd
			                 ,MSD_FROZEN_CHILLED_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdFrozenChilledInd", beginMsdFrozenChilledInd,MSD_FROZEN_CHILLED_IND_LEN);
    }
   	}
     int localMsdDtcCounter = -1;
     public boolean isMsdDtcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDtcCounter != sharedCounter;
         localMsdDtcCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DTC_LEN = 1;
	/**
	 * 	serialize this MsdDtc
	 */
   protected void serializeMsdDtc(char[] msdDtc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDtc,0,getStringValue(),beginMsdDtc,MSD_DTC_LEN);
       localMsdDtcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDtcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdDtc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDtc() {	 
   		return (substring(getStringValue(),beginMsdDtc,beginMsdDtc + MSD_DTC_LEN));
   	}
     int localMsdDtcCustodyIndCounter = -1;
     public boolean isMsdDtcCustodyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDtcCustodyIndCounter != sharedCounter;
         localMsdDtcCustodyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DTC_CUSTODY_IND_LEN = 1;
	/**
	 * 	serialize this MsdDtcCustodyInd
	 */
   protected void serializeMsdDtcCustodyInd(char[] msdDtcCustodyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDtcCustodyInd,0,getStringValue(),beginMsdDtcCustodyInd,MSD_DTC_CUSTODY_IND_LEN);
       localMsdDtcCustodyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDtcCustodyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdDtcCustodyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDtcCustodyInd() {	 
   		return (substring(getStringValue(),beginMsdDtcCustodyInd,beginMsdDtcCustodyInd + MSD_DTC_CUSTODY_IND_LEN));
   	}

		public int msdFcDataSize() {
			return MSD_FC_DATA_SIZE;
		}



}
  
