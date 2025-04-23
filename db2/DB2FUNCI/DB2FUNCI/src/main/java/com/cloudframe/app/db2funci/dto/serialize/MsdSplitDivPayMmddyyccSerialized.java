package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdSplitDivPayMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSplitDivPayMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSplitDivPayMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SPLIT_DIV_PAY_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSplitDivPayMmddyy;
            protected  int beginMsdSplitDivPayCc;
	
	/**
	* Constructor for MsdSplitDivPayMmddyyccSerialized
	**/
    public MsdSplitDivPayMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSplitDivPayMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivPayMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSplitDivPayMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1787); // serialize this field at offset 1787 by default 
    }
    
	/**
	* sets parent for this MsdSplitDivPayMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1787 by default
    }    
	/**
	* initializes the field in MsdSplitDivPayMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SPLIT_DIV_PAY_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSplitDivPayMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSplitDivPayCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSplitDivPayMmddyyCounter = -1;
     public boolean isMsdSplitDivPayMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivPayMmddyyCounter != sharedCounter;
         localMsdSplitDivPayMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSplitDivPayMmddyy
	 *	@return msdSplitDivPayMmddyy
	 */
	public char[]  getMsdSplitDivPayMmddyyString() {
	     return getCharArray(beginMsdSplitDivPayMmddyy,MSD_SPLIT_DIV_PAY_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivPayMmddyyIsNumeric() {
	    return isNumeric(beginMsdSplitDivPayMmddyy
	                    ,beginMsdSplitDivPayMmddyy + MSD_SPLIT_DIV_PAY_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPLIT_DIV_PAY_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdSplitDivPayMmddyy
	 */
	protected void serializeMsdSplitDivPayMmddyy(long msdSplitDivPayMmddyy) {
		 putNumber(beginMsdSplitDivPayMmddyy,msdSplitDivPayMmddyy,MSD_SPLIT_DIV_PAY_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivPayMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSplitDivPayMmddyy
	 */
   	protected  long serializeMsdSplitDivPayMmddyy(char[] value) {
	    long  msdSplitDivPayMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSplitDivPayMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdSplitDivPayMmddyy
		       ,6
		      );
		 localMsdSplitDivPayMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSplitDivPayMmddyy;
    }

   protected long checkMsdSplitDivPayMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSplitDivPayMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdSplitDivPayMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdSplitDivPayMmddyy
			                 ,MSD_SPLIT_DIV_PAY_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivPayMmddyy", beginMsdSplitDivPayMmddyy,MSD_SPLIT_DIV_PAY_MMDDYY_LEN);
    }
   	}
     int localMsdSplitDivPayCcCounter = -1;
     public boolean isMsdSplitDivPayCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivPayCcCounter != sharedCounter;
         localMsdSplitDivPayCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSplitDivPayCc
	 *	@return msdSplitDivPayCc
	 */
	public char[]  getMsdSplitDivPayCcString() {
	     return getCharArray(beginMsdSplitDivPayCc,MSD_SPLIT_DIV_PAY_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivPayCcIsNumeric() {
	    return isNumeric(beginMsdSplitDivPayCc
	                    ,beginMsdSplitDivPayCc + MSD_SPLIT_DIV_PAY_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPLIT_DIV_PAY_CC_LEN = 2;
  	/**
	 * serializeMsdSplitDivPayCc
	 */
	protected void serializeMsdSplitDivPayCc(int msdSplitDivPayCc) {
		 putNumber(beginMsdSplitDivPayCc,msdSplitDivPayCc,MSD_SPLIT_DIV_PAY_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivPayCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSplitDivPayCc
	 */
   	protected  int serializeMsdSplitDivPayCc(char[] value) {
	    int  msdSplitDivPayCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSplitDivPayCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdSplitDivPayCc
		       ,2
		      );
		 localMsdSplitDivPayCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSplitDivPayCc;
    }

   protected int checkMsdSplitDivPayCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSplitDivPayCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdSplitDivPayCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdSplitDivPayCc
			                 ,MSD_SPLIT_DIV_PAY_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivPayCc", beginMsdSplitDivPayCc,MSD_SPLIT_DIV_PAY_CC_LEN);
    }
   	}




}
  
