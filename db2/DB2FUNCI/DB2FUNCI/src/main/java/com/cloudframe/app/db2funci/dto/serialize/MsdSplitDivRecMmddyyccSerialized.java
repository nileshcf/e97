package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdSplitDivRecMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSplitDivRecMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSplitDivRecMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SPLIT_DIV_REC_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSplitDivRecMmddyy;
            protected  int beginMsdSplitDivRecCc;
	
	/**
	* Constructor for MsdSplitDivRecMmddyyccSerialized
	**/
    public MsdSplitDivRecMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSplitDivRecMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivRecMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSplitDivRecMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1756); // serialize this field at offset 1756 by default 
    }
    
	/**
	* sets parent for this MsdSplitDivRecMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1756 by default
    }    
	/**
	* initializes the field in MsdSplitDivRecMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SPLIT_DIV_REC_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSplitDivRecMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSplitDivRecCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSplitDivRecMmddyyCounter = -1;
     public boolean isMsdSplitDivRecMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivRecMmddyyCounter != sharedCounter;
         localMsdSplitDivRecMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSplitDivRecMmddyy
	 *	@return msdSplitDivRecMmddyy
	 */
	public char[]  getMsdSplitDivRecMmddyyString() {
	     return getCharArray(beginMsdSplitDivRecMmddyy,MSD_SPLIT_DIV_REC_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivRecMmddyyIsNumeric() {
	    return isNumeric(beginMsdSplitDivRecMmddyy
	                    ,beginMsdSplitDivRecMmddyy + MSD_SPLIT_DIV_REC_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPLIT_DIV_REC_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdSplitDivRecMmddyy
	 */
	protected void serializeMsdSplitDivRecMmddyy(long msdSplitDivRecMmddyy) {
		 putNumber(beginMsdSplitDivRecMmddyy,msdSplitDivRecMmddyy,MSD_SPLIT_DIV_REC_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivRecMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSplitDivRecMmddyy
	 */
   	protected  long serializeMsdSplitDivRecMmddyy(char[] value) {
	    long  msdSplitDivRecMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSplitDivRecMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdSplitDivRecMmddyy
		       ,6
		      );
		 localMsdSplitDivRecMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSplitDivRecMmddyy;
    }

   protected long checkMsdSplitDivRecMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSplitDivRecMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdSplitDivRecMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdSplitDivRecMmddyy
			                 ,MSD_SPLIT_DIV_REC_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivRecMmddyy", beginMsdSplitDivRecMmddyy,MSD_SPLIT_DIV_REC_MMDDYY_LEN);
    }
   	}
     int localMsdSplitDivRecCcCounter = -1;
     public boolean isMsdSplitDivRecCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivRecCcCounter != sharedCounter;
         localMsdSplitDivRecCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSplitDivRecCc
	 *	@return msdSplitDivRecCc
	 */
	public char[]  getMsdSplitDivRecCcString() {
	     return getCharArray(beginMsdSplitDivRecCc,MSD_SPLIT_DIV_REC_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivRecCcIsNumeric() {
	    return isNumeric(beginMsdSplitDivRecCc
	                    ,beginMsdSplitDivRecCc + MSD_SPLIT_DIV_REC_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPLIT_DIV_REC_CC_LEN = 2;
  	/**
	 * serializeMsdSplitDivRecCc
	 */
	protected void serializeMsdSplitDivRecCc(int msdSplitDivRecCc) {
		 putNumber(beginMsdSplitDivRecCc,msdSplitDivRecCc,MSD_SPLIT_DIV_REC_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivRecCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSplitDivRecCc
	 */
   	protected  int serializeMsdSplitDivRecCc(char[] value) {
	    int  msdSplitDivRecCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSplitDivRecCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdSplitDivRecCc
		       ,2
		      );
		 localMsdSplitDivRecCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSplitDivRecCc;
    }

   protected int checkMsdSplitDivRecCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSplitDivRecCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdSplitDivRecCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdSplitDivRecCc
			                 ,MSD_SPLIT_DIV_REC_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivRecCc", beginMsdSplitDivRecCc,MSD_SPLIT_DIV_REC_CC_LEN);
    }
   	}




}
  
