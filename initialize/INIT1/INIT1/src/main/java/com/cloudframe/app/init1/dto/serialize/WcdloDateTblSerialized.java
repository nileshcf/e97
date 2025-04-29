package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloDateTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloDateTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloDateTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_DATE_TBL_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloBlPeriodCd;
            protected  int beginWcdloStartDtIso;
            protected  int beginWcdloEndDtIso;
	
	/**
	* Constructor for WcdloDateTblSerialized
	**/
    public WcdloDateTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloDateTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloDateTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,90); // serialize this field at offset 90 by default 
    }
    
	/**
	* sets parent for this WcdloDateTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 90 by default
    }    
	/**
	* initializes the field in WcdloDateTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_DATE_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdloBlPeriodCd = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginWcdloStartDtIso = getStartOffset() + 22;	// set offset for serialization
  
             beginWcdloEndDtIso = getStartOffset() + 30;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localWcdloBlPeriodCdCounter = -1;
         public boolean isWcdloBlPeriodCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWcdloBlPeriodCdCounter != sharedCounter;
            localWcdloBlPeriodCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int WCDLO_BL_PERIOD_CD_LEN = 2;
  	/**
	 * serializeWcdloBlPeriodCd
	 */
	protected void serializeWcdloBlPeriodCd(short wcdloBlPeriodCd) {
           replaceValue( //  save the value as string
                   getBinaryString( wcdloBlPeriodCd,WCDLO_BL_PERIOD_CD_LEN)
                  ,beginWcdloBlPeriodCd
                  ,WCDLO_BL_PERIOD_CD_LEN
                 );
            localWcdloBlPeriodCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkWcdloBlPeriodCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWcdloBlPeriodCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWcdloBlPeriodCd() {	 
			return (getShort(beginWcdloBlPeriodCd));
   	}
     int localWcdloStartDtIsoCounter = -1;
     public boolean isWcdloStartDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloStartDtIsoCounter != sharedCounter;
         localWcdloStartDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloStartDtIso
	 *	@return wcdloStartDtIso
	 */
	public char[]  getWcdloStartDtIsoString() {
	     return getCharArray(beginWcdloStartDtIso,WCDLO_START_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloStartDtIsoIsNumeric() {
	    return isNumeric(beginWcdloStartDtIso
	                    ,beginWcdloStartDtIso + WCDLO_START_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_START_DT_ISO_LEN = 8;
  	/**
	 * serializeWcdloStartDtIso
	 */
	protected void serializeWcdloStartDtIso(long wcdloStartDtIso) {
		 putNumber(beginWcdloStartDtIso,wcdloStartDtIso,WCDLO_START_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloStartDtIso
	 */
   	protected  long serializeWcdloStartDtIso(char[] value) {
	    long  wcdloStartDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloStartDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginWcdloStartDtIso
		       ,8
		      );
		 localWcdloStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloStartDtIso;
    }

   protected long checkWcdloStartDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloStartDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWcdloStartDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWcdloStartDtIso
			                 ,WCDLO_START_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloStartDtIso", beginWcdloStartDtIso,WCDLO_START_DT_ISO_LEN);
    }
   	}
     int localWcdloEndDtIsoCounter = -1;
     public boolean isWcdloEndDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloEndDtIsoCounter != sharedCounter;
         localWcdloEndDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloEndDtIso
	 *	@return wcdloEndDtIso
	 */
	public char[]  getWcdloEndDtIsoString() {
	     return getCharArray(beginWcdloEndDtIso,WCDLO_END_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloEndDtIsoIsNumeric() {
	    return isNumeric(beginWcdloEndDtIso
	                    ,beginWcdloEndDtIso + WCDLO_END_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_END_DT_ISO_LEN = 8;
  	/**
	 * serializeWcdloEndDtIso
	 */
	protected void serializeWcdloEndDtIso(long wcdloEndDtIso) {
		 putNumber(beginWcdloEndDtIso,wcdloEndDtIso,WCDLO_END_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloEndDtIso
	 */
   	protected  long serializeWcdloEndDtIso(char[] value) {
	    long  wcdloEndDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloEndDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginWcdloEndDtIso
		       ,8
		      );
		 localWcdloEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloEndDtIso;
    }

   protected long checkWcdloEndDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloEndDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWcdloEndDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWcdloEndDtIso
			                 ,WCDLO_END_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloEndDtIso", beginWcdloEndDtIso,WCDLO_END_DT_ISO_LEN);
    }
   	}




}
  
