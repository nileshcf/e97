package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondCouponMmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondCouponMmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondCouponMmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_COUPON_MMDD_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondCouponMm;
            protected  int beginMsdBondCouponDd;
	
	/**
	* Constructor for MsdBondCouponMmddSerialized
	**/
    public MsdBondCouponMmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondCouponMmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCouponMmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondCouponMmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2561); // serialize this field at offset 2561 by default 
    }
    
	/**
	* sets parent for this MsdBondCouponMmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2561 by default
    }    
	/**
	* initializes the field in MsdBondCouponMmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_COUPON_MMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondCouponMm = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondCouponDd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondCouponMmCounter = -1;
     public boolean isMsdBondCouponMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCouponMmCounter != sharedCounter;
         localMsdBondCouponMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondCouponMm
	 *	@return msdBondCouponMm
	 */
	public char[]  getMsdBondCouponMmString() {
	     return getCharArray(beginMsdBondCouponMm,MSD_BOND_COUPON_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCouponMmIsNumeric() {
	    return isNumeric(beginMsdBondCouponMm
	                    ,beginMsdBondCouponMm + MSD_BOND_COUPON_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_COUPON_MM_LEN = 2;
  	/**
	 * serializeMsdBondCouponMm
	 */
	protected void serializeMsdBondCouponMm(int msdBondCouponMm) {
		 putNumber(beginMsdBondCouponMm,msdBondCouponMm,MSD_BOND_COUPON_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCouponMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondCouponMm
	 */
   	protected  int serializeMsdBondCouponMm(char[] value) {
	    int  msdBondCouponMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondCouponMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondCouponMm
		       ,2
		      );
		 localMsdBondCouponMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondCouponMm;
    }

   protected int checkMsdBondCouponMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondCouponMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondCouponMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondCouponMm
			                 ,MSD_BOND_COUPON_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCouponMm", beginMsdBondCouponMm,MSD_BOND_COUPON_MM_LEN);
    }
   	}
     int localMsdBondCouponDdCounter = -1;
     public boolean isMsdBondCouponDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCouponDdCounter != sharedCounter;
         localMsdBondCouponDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondCouponDd
	 *	@return msdBondCouponDd
	 */
	public char[]  getMsdBondCouponDdString() {
	     return getCharArray(beginMsdBondCouponDd,MSD_BOND_COUPON_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCouponDdIsNumeric() {
	    return isNumeric(beginMsdBondCouponDd
	                    ,beginMsdBondCouponDd + MSD_BOND_COUPON_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_COUPON_DD_LEN = 2;
  	/**
	 * serializeMsdBondCouponDd
	 */
	protected void serializeMsdBondCouponDd(int msdBondCouponDd) {
		 putNumber(beginMsdBondCouponDd,msdBondCouponDd,MSD_BOND_COUPON_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCouponDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondCouponDd
	 */
   	protected  int serializeMsdBondCouponDd(char[] value) {
	    int  msdBondCouponDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondCouponDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondCouponDd
		       ,2
		      );
		 localMsdBondCouponDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondCouponDd;
    }

   protected int checkMsdBondCouponDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondCouponDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondCouponDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondCouponDd
			                 ,MSD_BOND_COUPON_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCouponDd", beginMsdBondCouponDd,MSD_BOND_COUPON_DD_LEN);
    }
   	}




}
  
