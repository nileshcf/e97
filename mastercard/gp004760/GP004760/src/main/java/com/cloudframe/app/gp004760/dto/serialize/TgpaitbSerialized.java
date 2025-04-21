package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class TgpaitbSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TgpaitbSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TgpaitbSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGPAITB_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTgpaitbCabCd;
            protected  int beginTgpaitbAuthTxnCatCd;
	
	/**
	* Constructor for TgpaitbSerialized
	**/
    public TgpaitbSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TgpaitbSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGPAITB_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTgpaitbCabCd = getStartOffset() + 0;	// set offset for serialization
  
             beginTgpaitbAuthTxnCatCd = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localTgpaitbCabCdCounter = -1;
        public boolean isTgpaitbCabCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgpaitbCabCdCounter != sharedCounter;
           localTgpaitbCabCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean tgpaitbCabCdIsNumeric() {
	      return decimalIsNumeric(beginTgpaitbCabCd,TGPAITB_CAB_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TGPAITB_CAB_CD_LEN = 3;
  	/**
	 * 	serializeTgpaitbCabCd
	 */
	protected void serializeTgpaitbCabCd(int tgpaitbCabCd) {
		   putDecimal(beginTgpaitbCabCd,tgpaitbCabCd,TGPAITB_CAB_CD_LEN,true);
   }
   

   protected int checkTgpaitbCabCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTgpaitbCabCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgpaitbCabCd() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTgpaitbCabCd,TGPAITB_CAB_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgpaitbCabCd", beginTgpaitbCabCd,TGPAITB_CAB_CD_LEN);
     }
   	}
     int localTgpaitbAuthTxnCatCdCounter = -1;
     public boolean isTgpaitbAuthTxnCatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgpaitbAuthTxnCatCdCounter != sharedCounter;
         localTgpaitbAuthTxnCatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TGPAITB_AUTH_TXN_CAT_CD_LEN = 1;
	/**
	 * 	serialize this TgpaitbAuthTxnCatCd
	 */
   protected void serializeTgpaitbAuthTxnCatCd(char[] tgpaitbAuthTxnCatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgpaitbAuthTxnCatCd,0,getStringValue(),beginTgpaitbAuthTxnCatCd,TGPAITB_AUTH_TXN_CAT_CD_LEN);
       localTgpaitbAuthTxnCatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgpaitbAuthTxnCatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTgpaitbAuthTxnCatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgpaitbAuthTxnCatCd() {	 
   		return (substring(getStringValue(),beginTgpaitbAuthTxnCatCd,beginTgpaitbAuthTxnCatCd + TGPAITB_AUTH_TXN_CAT_CD_LEN));
   	}




}
  
