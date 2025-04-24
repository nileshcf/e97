package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4IncomingCashLetterInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ov4IncomingCashLetterInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4IncomingCashLetterInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_INCOMING_CASH_LETTER_INFO_LENGTH = 138;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4IclDate;
            protected  int beginOv4IclAmt;
            protected  int beginOv4IclTapeTotal;
            protected  int beginOv4IclPrevious;
            protected  int beginOv4IclNext;
            protected  int beginOv4IclListedAs;
            protected  int beginOv4IclShouldBe;
            protected  int beginOv4IclFromAba;
            protected  int beginOv4IclToAba;
            protected  int beginOv4IclSerialNo;
	
	/**
	* Constructor for Ov4IncomingCashLetterInfoSerialized
	**/
    public Ov4IncomingCashLetterInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4IncomingCashLetterInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4IncomingCashLetterInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4IncomingCashLetterInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,211); // serialize this field at offset 211 by default 
    }
    
	/**
	* sets parent for this Ov4IncomingCashLetterInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 211 by default
    }    
	/**
	* initializes the field in Ov4IncomingCashLetterInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_INCOMING_CASH_LETTER_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4IclDate = getStartOffset() + 0;	// set offset for serialization
  
  
             beginOv4IclAmt = getStartOffset() + 6;	// set offset for serialization
  
             beginOv4IclTapeTotal = getStartOffset() + 24;	// set offset for serialization
  
             beginOv4IclPrevious = getStartOffset() + 42;	// set offset for serialization
  
             beginOv4IclNext = getStartOffset() + 60;	// set offset for serialization
  
             beginOv4IclListedAs = getStartOffset() + 78;	// set offset for serialization
  
             beginOv4IclShouldBe = getStartOffset() + 96;	// set offset for serialization
  
             beginOv4IclFromAba = getStartOffset() + 114;	// set offset for serialization
  
             beginOv4IclToAba = getStartOffset() + 123;	// set offset for serialization
  
             beginOv4IclSerialNo = getStartOffset() + 132;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOv4IclDateCounter = -1;
     public boolean isOv4IclDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclDateCounter != sharedCounter;
         localOv4IclDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4IclDate
	 *	@return ov4IclDate
	 */
	public char[]  getOv4IclDateString() {
	     return getCharArray(beginOv4IclDate,OV_4_ICL_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclDateIsNumeric() {
	    return isNumeric(beginOv4IclDate
	                    ,beginOv4IclDate + OV_4_ICL_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ICL_DATE_LEN = 6;
  	/**
	 * serializeOv4IclDate
	 */
	protected void serializeOv4IclDate(long ov4IclDate) {
		 putNumber(beginOv4IclDate,ov4IclDate,OV_4_ICL_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4IclDate
	 */
   	protected  long serializeOv4IclDate(char[] value) {
	    long  ov4IclDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4IclDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginOv4IclDate
		       ,6
		      );
		 localOv4IclDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4IclDate;
    }

   protected long checkOv4IclDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4IclDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4IclDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4IclDate
			                 ,OV_4_ICL_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclDate", beginOv4IclDate,OV_4_ICL_DATE_LEN);
    }
   	}
     int localOv4IclAmtCounter = -1;
     
     public boolean isOv4IclAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclAmtCounter != sharedCounter;
         localOv4IclAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4IclAmt
	 *	@return ov4IclAmt
	 */
	public char[]  getOv4IclAmtString() {
	    return getCharArray(beginOv4IclAmt,OV_4_ICL_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclAmtIsNumeric() {
		    return isNumeric(beginOv4IclAmt
	                    ,beginOv4IclAmt + OV_4_ICL_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ICL_AMT_LEN = 18;
  protected  static final int OV_4_ICL_AMT_SCALE = 2;

   protected BigDecimal checkOv4IclAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4IclAmt
	 */
	protected void serializeOv4IclAmt(BigDecimal ov4IclAmt) {
	       putNumber(beginOv4IclAmt,ov4IclAmt,OV_4_ICL_AMT_LEN,OV_4_ICL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4IclAmt
	 */
   	protected  BigDecimal serializeOv4IclAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4IclAmt
		       ,18
		      );		 localOv4IclAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ICL_AMT_LEN,OV_4_ICL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4IclAmt", beginOv4IclAmt,OV_4_ICL_AMT_LEN);
    	}
    }
    /**
	 *	refreshOv4IclAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4IclAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4IclAmt
			            ,OV_4_ICL_AMT_LEN
			            ,OV_4_ICL_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclAmt", beginOv4IclAmt,OV_4_ICL_AMT_LEN);
    }
   	}
     int localOv4IclTapeTotalCounter = -1;
     
     public boolean isOv4IclTapeTotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclTapeTotalCounter != sharedCounter;
         localOv4IclTapeTotalCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4IclTapeTotal
	 *	@return ov4IclTapeTotal
	 */
	public char[]  getOv4IclTapeTotalString() {
	    return getCharArray(beginOv4IclTapeTotal,OV_4_ICL_TAPE_TOTAL_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclTapeTotalIsNumeric() {
		    return isNumeric(beginOv4IclTapeTotal
	                    ,beginOv4IclTapeTotal + OV_4_ICL_TAPE_TOTAL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ICL_TAPE_TOTAL_LEN = 18;
  protected  static final int OV_4_ICL_TAPE_TOTAL_SCALE = 2;

   protected BigDecimal checkOv4IclTapeTotalMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4IclTapeTotal
	 */
	protected void serializeOv4IclTapeTotal(BigDecimal ov4IclTapeTotal) {
	       putNumber(beginOv4IclTapeTotal,ov4IclTapeTotal,OV_4_ICL_TAPE_TOTAL_LEN,OV_4_ICL_TAPE_TOTAL_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclTapeTotalCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4IclTapeTotal
	 */
   	protected  BigDecimal serializeOv4IclTapeTotal(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4IclTapeTotal
		       ,18
		      );		 localOv4IclTapeTotalCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ICL_TAPE_TOTAL_LEN,OV_4_ICL_TAPE_TOTAL_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4IclTapeTotal", beginOv4IclTapeTotal,OV_4_ICL_TAPE_TOTAL_LEN);
    	}
    }
    /**
	 *	refreshOv4IclTapeTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4IclTapeTotal() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4IclTapeTotal
			            ,OV_4_ICL_TAPE_TOTAL_LEN
			            ,OV_4_ICL_TAPE_TOTAL_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclTapeTotal", beginOv4IclTapeTotal,OV_4_ICL_TAPE_TOTAL_LEN);
    }
   	}
     int localOv4IclPreviousCounter = -1;
     
     public boolean isOv4IclPreviousModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclPreviousCounter != sharedCounter;
         localOv4IclPreviousCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4IclPrevious
	 *	@return ov4IclPrevious
	 */
	public char[]  getOv4IclPreviousString() {
	    return getCharArray(beginOv4IclPrevious,OV_4_ICL_PREVIOUS_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclPreviousIsNumeric() {
		    return isNumeric(beginOv4IclPrevious
	                    ,beginOv4IclPrevious + OV_4_ICL_PREVIOUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ICL_PREVIOUS_LEN = 18;
  protected  static final int OV_4_ICL_PREVIOUS_SCALE = 2;

   protected BigDecimal checkOv4IclPreviousMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4IclPrevious
	 */
	protected void serializeOv4IclPrevious(BigDecimal ov4IclPrevious) {
	       putNumber(beginOv4IclPrevious,ov4IclPrevious,OV_4_ICL_PREVIOUS_LEN,OV_4_ICL_PREVIOUS_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclPreviousCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4IclPrevious
	 */
   	protected  BigDecimal serializeOv4IclPrevious(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4IclPrevious
		       ,18
		      );		 localOv4IclPreviousCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ICL_PREVIOUS_LEN,OV_4_ICL_PREVIOUS_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4IclPrevious", beginOv4IclPrevious,OV_4_ICL_PREVIOUS_LEN);
    	}
    }
    /**
	 *	refreshOv4IclPrevious is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4IclPrevious() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4IclPrevious
			            ,OV_4_ICL_PREVIOUS_LEN
			            ,OV_4_ICL_PREVIOUS_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclPrevious", beginOv4IclPrevious,OV_4_ICL_PREVIOUS_LEN);
    }
   	}
     int localOv4IclNextCounter = -1;
     
     public boolean isOv4IclNextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclNextCounter != sharedCounter;
         localOv4IclNextCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4IclNext
	 *	@return ov4IclNext
	 */
	public char[]  getOv4IclNextString() {
	    return getCharArray(beginOv4IclNext,OV_4_ICL_NEXT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclNextIsNumeric() {
		    return isNumeric(beginOv4IclNext
	                    ,beginOv4IclNext + OV_4_ICL_NEXT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ICL_NEXT_LEN = 18;
  protected  static final int OV_4_ICL_NEXT_SCALE = 2;

   protected BigDecimal checkOv4IclNextMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4IclNext
	 */
	protected void serializeOv4IclNext(BigDecimal ov4IclNext) {
	       putNumber(beginOv4IclNext,ov4IclNext,OV_4_ICL_NEXT_LEN,OV_4_ICL_NEXT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclNextCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4IclNext
	 */
   	protected  BigDecimal serializeOv4IclNext(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4IclNext
		       ,18
		      );		 localOv4IclNextCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ICL_NEXT_LEN,OV_4_ICL_NEXT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4IclNext", beginOv4IclNext,OV_4_ICL_NEXT_LEN);
    	}
    }
    /**
	 *	refreshOv4IclNext is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4IclNext() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4IclNext
			            ,OV_4_ICL_NEXT_LEN
			            ,OV_4_ICL_NEXT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclNext", beginOv4IclNext,OV_4_ICL_NEXT_LEN);
    }
   	}
     int localOv4IclListedAsCounter = -1;
     
     public boolean isOv4IclListedAsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclListedAsCounter != sharedCounter;
         localOv4IclListedAsCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4IclListedAs
	 *	@return ov4IclListedAs
	 */
	public char[]  getOv4IclListedAsString() {
	    return getCharArray(beginOv4IclListedAs,OV_4_ICL_LISTED_AS_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclListedAsIsNumeric() {
		    return isNumeric(beginOv4IclListedAs
	                    ,beginOv4IclListedAs + OV_4_ICL_LISTED_AS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ICL_LISTED_AS_LEN = 18;
  protected  static final int OV_4_ICL_LISTED_AS_SCALE = 2;

   protected BigDecimal checkOv4IclListedAsMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4IclListedAs
	 */
	protected void serializeOv4IclListedAs(BigDecimal ov4IclListedAs) {
	       putNumber(beginOv4IclListedAs,ov4IclListedAs,OV_4_ICL_LISTED_AS_LEN,OV_4_ICL_LISTED_AS_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclListedAsCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4IclListedAs
	 */
   	protected  BigDecimal serializeOv4IclListedAs(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4IclListedAs
		       ,18
		      );		 localOv4IclListedAsCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ICL_LISTED_AS_LEN,OV_4_ICL_LISTED_AS_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4IclListedAs", beginOv4IclListedAs,OV_4_ICL_LISTED_AS_LEN);
    	}
    }
    /**
	 *	refreshOv4IclListedAs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4IclListedAs() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4IclListedAs
			            ,OV_4_ICL_LISTED_AS_LEN
			            ,OV_4_ICL_LISTED_AS_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclListedAs", beginOv4IclListedAs,OV_4_ICL_LISTED_AS_LEN);
    }
   	}
     int localOv4IclShouldBeCounter = -1;
     
     public boolean isOv4IclShouldBeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclShouldBeCounter != sharedCounter;
         localOv4IclShouldBeCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4IclShouldBe
	 *	@return ov4IclShouldBe
	 */
	public char[]  getOv4IclShouldBeString() {
	    return getCharArray(beginOv4IclShouldBe,OV_4_ICL_SHOULD_BE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclShouldBeIsNumeric() {
		    return isNumeric(beginOv4IclShouldBe
	                    ,beginOv4IclShouldBe + OV_4_ICL_SHOULD_BE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ICL_SHOULD_BE_LEN = 18;
  protected  static final int OV_4_ICL_SHOULD_BE_SCALE = 2;

   protected BigDecimal checkOv4IclShouldBeMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4IclShouldBe
	 */
	protected void serializeOv4IclShouldBe(BigDecimal ov4IclShouldBe) {
	       putNumber(beginOv4IclShouldBe,ov4IclShouldBe,OV_4_ICL_SHOULD_BE_LEN,OV_4_ICL_SHOULD_BE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclShouldBeCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4IclShouldBe
	 */
   	protected  BigDecimal serializeOv4IclShouldBe(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4IclShouldBe
		       ,18
		      );		 localOv4IclShouldBeCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ICL_SHOULD_BE_LEN,OV_4_ICL_SHOULD_BE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4IclShouldBe", beginOv4IclShouldBe,OV_4_ICL_SHOULD_BE_LEN);
    	}
    }
    /**
	 *	refreshOv4IclShouldBe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4IclShouldBe() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4IclShouldBe
			            ,OV_4_ICL_SHOULD_BE_LEN
			            ,OV_4_ICL_SHOULD_BE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclShouldBe", beginOv4IclShouldBe,OV_4_ICL_SHOULD_BE_LEN);
    }
   	}
     int localOv4IclFromAbaCounter = -1;
     public boolean isOv4IclFromAbaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclFromAbaCounter != sharedCounter;
         localOv4IclFromAbaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4IclFromAba
	 *	@return ov4IclFromAba
	 */
	public char[]  getOv4IclFromAbaString() {
	     return getCharArray(beginOv4IclFromAba,OV_4_ICL_FROM_ABA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclFromAbaIsNumeric() {
	    return isNumeric(beginOv4IclFromAba
	                    ,beginOv4IclFromAba + OV_4_ICL_FROM_ABA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ICL_FROM_ABA_LEN = 9;
  	/**
	 * serializeOv4IclFromAba
	 */
	protected void serializeOv4IclFromAba(long ov4IclFromAba) {
		 putNumber(beginOv4IclFromAba,ov4IclFromAba,OV_4_ICL_FROM_ABA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclFromAbaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4IclFromAba
	 */
   	protected  long serializeOv4IclFromAba(char[] value) {
	    long  ov4IclFromAba;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4IclFromAba = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginOv4IclFromAba
		       ,9
		      );
		 localOv4IclFromAbaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4IclFromAba;
    }

   protected long checkOv4IclFromAbaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4IclFromAba is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4IclFromAba() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4IclFromAba
			                 ,OV_4_ICL_FROM_ABA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclFromAba", beginOv4IclFromAba,OV_4_ICL_FROM_ABA_LEN);
    }
   	}
     int localOv4IclToAbaCounter = -1;
     public boolean isOv4IclToAbaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclToAbaCounter != sharedCounter;
         localOv4IclToAbaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4IclToAba
	 *	@return ov4IclToAba
	 */
	public char[]  getOv4IclToAbaString() {
	     return getCharArray(beginOv4IclToAba,OV_4_ICL_TO_ABA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclToAbaIsNumeric() {
	    return isNumeric(beginOv4IclToAba
	                    ,beginOv4IclToAba + OV_4_ICL_TO_ABA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ICL_TO_ABA_LEN = 9;
  	/**
	 * serializeOv4IclToAba
	 */
	protected void serializeOv4IclToAba(long ov4IclToAba) {
		 putNumber(beginOv4IclToAba,ov4IclToAba,OV_4_ICL_TO_ABA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclToAbaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4IclToAba
	 */
   	protected  long serializeOv4IclToAba(char[] value) {
	    long  ov4IclToAba;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4IclToAba = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginOv4IclToAba
		       ,9
		      );
		 localOv4IclToAbaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4IclToAba;
    }

   protected long checkOv4IclToAbaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4IclToAba is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4IclToAba() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4IclToAba
			                 ,OV_4_ICL_TO_ABA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclToAba", beginOv4IclToAba,OV_4_ICL_TO_ABA_LEN);
    }
   	}
     int localOv4IclSerialNoCounter = -1;
     public boolean isOv4IclSerialNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclSerialNoCounter != sharedCounter;
         localOv4IclSerialNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4IclSerialNo
	 *	@return ov4IclSerialNo
	 */
	public char[]  getOv4IclSerialNoString() {
	     return getCharArray(beginOv4IclSerialNo,OV_4_ICL_SERIAL_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclSerialNoIsNumeric() {
	    return isNumeric(beginOv4IclSerialNo
	                    ,beginOv4IclSerialNo + OV_4_ICL_SERIAL_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ICL_SERIAL_NO_LEN = 6;
  	/**
	 * serializeOv4IclSerialNo
	 */
	protected void serializeOv4IclSerialNo(long ov4IclSerialNo) {
		 putNumber(beginOv4IclSerialNo,ov4IclSerialNo,OV_4_ICL_SERIAL_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclSerialNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4IclSerialNo
	 */
   	protected  long serializeOv4IclSerialNo(char[] value) {
	    long  ov4IclSerialNo;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4IclSerialNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginOv4IclSerialNo
		       ,6
		      );
		 localOv4IclSerialNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4IclSerialNo;
    }

   protected long checkOv4IclSerialNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4IclSerialNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4IclSerialNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4IclSerialNo
			                 ,OV_4_ICL_SERIAL_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclSerialNo", beginOv4IclSerialNo,OV_4_ICL_SERIAL_NO_LEN);
    }
   	}




}
  
