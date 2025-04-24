package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4MicrLineInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ov4MicrLineInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4MicrLineInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_MICR_LINE_INFO_LENGTH = 67;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4AcctAppl;
            protected  int beginOv4AcctNo;
            protected  int beginOv4AmntSign;
            protected  int beginOv4Amnt;
	
	/**
	* Constructor for Ov4MicrLineInfoSerialized
	**/
    public Ov4MicrLineInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4MicrLineInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MicrLineInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4MicrLineInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,125); // serialize this field at offset 125 by default 
    }
    
	/**
	* sets parent for this Ov4MicrLineInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 125 by default
    }    
	/**
	* initializes the field in Ov4MicrLineInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_MICR_LINE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginOv4AcctAppl = getStartOffset() + 9;	// set offset for serialization
  
             beginOv4AcctNo = getStartOffset() + 10;	// set offset for serialization
  
             beginOv4AmntSign = getStartOffset() + 28;	// set offset for serialization
  
             beginOv4Amnt = getStartOffset() + 29;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localOv4AcctApplCounter = -1;
     public boolean isOv4AcctApplModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AcctApplCounter != sharedCounter;
         localOv4AcctApplCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_ACCT_APPL_LEN = 1;
	/**
	 * 	serialize this Ov4AcctAppl
	 */
   protected void serializeOv4AcctAppl(char[] ov4AcctAppl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4AcctAppl,0,getStringValue(),beginOv4AcctAppl,OV_4_ACCT_APPL_LEN);
       localOv4AcctApplCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4AcctApplConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOv4AcctAppl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4AcctAppl() {	 
   		return (substring(getStringValue(),beginOv4AcctAppl,beginOv4AcctAppl + OV_4_ACCT_APPL_LEN));
   	}
     int localOv4AcctNoCounter = -1;
     public boolean isOv4AcctNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AcctNoCounter != sharedCounter;
         localOv4AcctNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4AcctNo
	 *	@return ov4AcctNo
	 */
	public char[]  getOv4AcctNoString() {
	     return getCharArray(beginOv4AcctNo,OV_4_ACCT_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4AcctNoIsNumeric() {
	    return isNumeric(beginOv4AcctNo
	                    ,beginOv4AcctNo + OV_4_ACCT_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ACCT_NO_LEN = 18;
  	/**
	 * serializeOv4AcctNo
	 */
	protected void serializeOv4AcctNo(long ov4AcctNo) {
		 putNumber(beginOv4AcctNo,ov4AcctNo,OV_4_ACCT_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4AcctNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4AcctNo
	 */
   	protected  long serializeOv4AcctNo(char[] value) {
	    long  ov4AcctNo;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4AcctNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4AcctNo
		       ,18
		      );
		 localOv4AcctNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4AcctNo;
    }

   protected long checkOv4AcctNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4AcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4AcctNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4AcctNo
			                 ,OV_4_ACCT_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4AcctNo", beginOv4AcctNo,OV_4_ACCT_NO_LEN);
    }
   	}
     int localOv4AmntSignCounter = -1;
     public boolean isOv4AmntSignModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AmntSignCounter != sharedCounter;
         localOv4AmntSignCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_AMNT_SIGN_LEN = 1;
	/**
	 * 	serialize this Ov4AmntSign
	 */
   protected void serializeOv4AmntSign(char[] ov4AmntSign) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4AmntSign,0,getStringValue(),beginOv4AmntSign,OV_4_AMNT_SIGN_LEN);
       localOv4AmntSignCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4AmntSignConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOv4AmntSign is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4AmntSign() {	 
   		return (substring(getStringValue(),beginOv4AmntSign,beginOv4AmntSign + OV_4_AMNT_SIGN_LEN));
   	}
     int localOv4AmntCounter = -1;
     
     public boolean isOv4AmntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AmntCounter != sharedCounter;
         localOv4AmntCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4Amnt
	 *	@return ov4Amnt
	 */
	public char[]  getOv4AmntString() {
	    return getCharArray(beginOv4Amnt,OV_4_AMNT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4AmntIsNumeric() {
		    return isNumeric(beginOv4Amnt
	                    ,beginOv4Amnt + OV_4_AMNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_AMNT_LEN = 18;
  protected  static final int OV_4_AMNT_SCALE = 2;

   protected BigDecimal checkOv4AmntMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4Amnt
	 */
	protected void serializeOv4Amnt(BigDecimal ov4Amnt) {
	       putNumber(beginOv4Amnt,ov4Amnt,OV_4_AMNT_LEN,OV_4_AMNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4AmntCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4Amnt
	 */
   	protected  BigDecimal serializeOv4Amnt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4Amnt
		       ,18
		      );		 localOv4AmntCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_AMNT_LEN,OV_4_AMNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4Amnt", beginOv4Amnt,OV_4_AMNT_LEN);
    	}
    }
    /**
	 *	refreshOv4Amnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4Amnt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4Amnt
			            ,OV_4_AMNT_LEN
			            ,OV_4_AMNT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4Amnt", beginOv4Amnt,OV_4_AMNT_LEN);
    }
   	}




}
  
