package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4MiscData2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ov4MiscData2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4MiscData2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_MISC_DATA_2_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4Md2CrAcct;
            protected  int beginOv4Md2CrTc;
            protected  int beginOv4Md2CrAmt;
	
	/**
	* Constructor for Ov4MiscData2Serialized
	**/
    public Ov4MiscData2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4MiscData2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MiscData2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4MiscData2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,425); // serialize this field at offset 425 by default 
    }
    
	/**
	* sets parent for this Ov4MiscData2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 425 by default
    }    
	/**
	* initializes the field in Ov4MiscData2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_MISC_DATA_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginOv4Md2CrAcct = getStartOffset() + 10;	// set offset for serialization
  
  
             beginOv4Md2CrTc = getStartOffset() + 24;	// set offset for serialization
  
             beginOv4Md2CrAmt = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOv4Md2CrAcctCounter = -1;
     public boolean isOv4Md2CrAcctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md2CrAcctCounter != sharedCounter;
         localOv4Md2CrAcctCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4Md2CrAcct
	 *	@return ov4Md2CrAcct
	 */
	public char[]  getOv4Md2CrAcctString() {
	     return getCharArray(beginOv4Md2CrAcct,OV_4_MD_2_CR_ACCT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4Md2CrAcctIsNumeric() {
	    return isNumeric(beginOv4Md2CrAcct
	                    ,beginOv4Md2CrAcct + OV_4_MD_2_CR_ACCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_MD_2_CR_ACCT_LEN = 12;
  	/**
	 * serializeOv4Md2CrAcct
	 */
	protected void serializeOv4Md2CrAcct(long ov4Md2CrAcct) {
		 putNumber(beginOv4Md2CrAcct,ov4Md2CrAcct,OV_4_MD_2_CR_ACCT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4Md2CrAcctCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4Md2CrAcct
	 */
   	protected  long serializeOv4Md2CrAcct(char[] value) {
	    long  ov4Md2CrAcct;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4Md2CrAcct = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginOv4Md2CrAcct
		       ,12
		      );
		 localOv4Md2CrAcctCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4Md2CrAcct;
    }

   protected long checkOv4Md2CrAcctMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4Md2CrAcct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4Md2CrAcct() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4Md2CrAcct
			                 ,OV_4_MD_2_CR_ACCT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4Md2CrAcct", beginOv4Md2CrAcct,OV_4_MD_2_CR_ACCT_LEN);
    }
   	}
     int localOv4Md2CrTcCounter = -1;
     public boolean isOv4Md2CrTcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md2CrTcCounter != sharedCounter;
         localOv4Md2CrTcCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_MD_2_CR_TC_LEN = 5;
	/**
	 * 	serialize this Ov4Md2CrTc
	 */
   protected void serializeOv4Md2CrTc(char[] ov4Md2CrTc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4Md2CrTc,0,getStringValue(),beginOv4Md2CrTc,OV_4_MD_2_CR_TC_LEN);
       localOv4Md2CrTcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4Md2CrTcConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshOv4Md2CrTc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4Md2CrTc() {	 
   		return (substring(getStringValue(),beginOv4Md2CrTc,beginOv4Md2CrTc + OV_4_MD_2_CR_TC_LEN));
   	}
     int localOv4Md2CrAmtCounter = -1;
     
     public boolean isOv4Md2CrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md2CrAmtCounter != sharedCounter;
         localOv4Md2CrAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4Md2CrAmt
	 *	@return ov4Md2CrAmt
	 */
	public char[]  getOv4Md2CrAmtString() {
	    return getCharArray(beginOv4Md2CrAmt,OV_4_MD_2_CR_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4Md2CrAmtIsNumeric() {
		    return isNumeric(beginOv4Md2CrAmt
	                    ,beginOv4Md2CrAmt + OV_4_MD_2_CR_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_MD_2_CR_AMT_LEN = 12;
  protected  static final int OV_4_MD_2_CR_AMT_SCALE = 2;

   protected BigDecimal checkOv4Md2CrAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeOv4Md2CrAmt
	 */
	protected void serializeOv4Md2CrAmt(BigDecimal ov4Md2CrAmt) {
	       putNumber(beginOv4Md2CrAmt,ov4Md2CrAmt,OV_4_MD_2_CR_AMT_LEN,OV_4_MD_2_CR_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4Md2CrAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4Md2CrAmt
	 */
   	protected  BigDecimal serializeOv4Md2CrAmt(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginOv4Md2CrAmt
		       ,12
		      );		 localOv4Md2CrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_MD_2_CR_AMT_LEN,OV_4_MD_2_CR_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4Md2CrAmt", beginOv4Md2CrAmt,OV_4_MD_2_CR_AMT_LEN);
    	}
    }
    /**
	 *	refreshOv4Md2CrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4Md2CrAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4Md2CrAmt
			            ,OV_4_MD_2_CR_AMT_LEN
			            ,OV_4_MD_2_CR_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4Md2CrAmt", beginOv4Md2CrAmt,OV_4_MD_2_CR_AMT_LEN);
    }
   	}




}
  
