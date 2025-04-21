package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class RedExpon0GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class RedExpon0GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RedExpon0GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RED_EXPON_0_GROUP_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRedExpon0;
            protected  int beginRedExpon1;
            protected  int beginRedExpon2;
            protected  int beginRedExpon3;
            protected  int beginRedExpon4;
            protected  int beginRedExpon5;
            protected  int beginRedExpon6;
            protected  int beginRedExpon7;
            protected  int beginRedExpon8;
            protected  int beginRedExpon9;
	
	/**
	* Constructor for RedExpon0GroupSerialized
	**/
    public RedExpon0GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RedExpon0GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RED_EXPON_0_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRedExpon0 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon1 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon2 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon3 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon4 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon5 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon6 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon7 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon8 = getStartOffset() + 0;	// set offset for serialization
  
             beginRedExpon9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRedExpon0Counter = -1;
     public boolean isRedExpon0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon0Counter != sharedCounter;
         localRedExpon0Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of redExpon0
	 *	@return redExpon0
	 */
	public char[]  getRedExpon0String() {
	     return getCharArray(beginRedExpon0,RED_EXPON_0_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon0IsNumeric() {
	    return isNumeric(beginRedExpon0
	                    ,beginRedExpon0 + RED_EXPON_0_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RED_EXPON_0_LEN = 15;
  	/**
	 * serializeRedExpon0
	 */
	protected void serializeRedExpon0(long redExpon0) {
		 putNumber(beginRedExpon0,redExpon0,RED_EXPON_0_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon0Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRedExpon0
	 */
   	protected  long serializeRedExpon0(char[] value) {
	    long  redExpon0;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    redExpon0 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon0
		       ,15
		      );
		 localRedExpon0Counter = shareString.getSerializedField().getModifiedCounter();
		return  redExpon0;
    }

   protected long checkRedExpon0MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshRedExpon0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRedExpon0() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRedExpon0
			                 ,RED_EXPON_0_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon0", beginRedExpon0,RED_EXPON_0_LEN);
    }
   	}
     int localRedExpon1Counter = -1;
     
     public boolean isRedExpon1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon1Counter != sharedCounter;
         localRedExpon1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon1
	 *	@return redExpon1
	 */
	public char[]  getRedExpon1String() {
	    return getCharArray(beginRedExpon1,RED_EXPON_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon1IsNumeric() {
		    return isNumeric(beginRedExpon1
	                    ,beginRedExpon1 + RED_EXPON_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_1_LEN = 15;
  protected  static final int RED_EXPON_1_SCALE = 1;

   protected BigDecimal checkRedExpon1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon1
	 */
	protected void serializeRedExpon1(BigDecimal redExpon1) {
	       putNumber(beginRedExpon1,redExpon1,RED_EXPON_1_LEN,RED_EXPON_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon1
	 */
   	protected  BigDecimal serializeRedExpon1(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon1
		       ,15
		      );		 localRedExpon1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_1_LEN,RED_EXPON_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon1", beginRedExpon1,RED_EXPON_1_LEN);
    	}
    }
    /**
	 *	refreshRedExpon1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon1
			            ,RED_EXPON_1_LEN
			            ,RED_EXPON_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon1", beginRedExpon1,RED_EXPON_1_LEN);
    }
   	}
     int localRedExpon2Counter = -1;
     
     public boolean isRedExpon2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon2Counter != sharedCounter;
         localRedExpon2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon2
	 *	@return redExpon2
	 */
	public char[]  getRedExpon2String() {
	    return getCharArray(beginRedExpon2,RED_EXPON_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon2IsNumeric() {
		    return isNumeric(beginRedExpon2
	                    ,beginRedExpon2 + RED_EXPON_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_2_LEN = 15;
  protected  static final int RED_EXPON_2_SCALE = 2;

   protected BigDecimal checkRedExpon2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon2
	 */
	protected void serializeRedExpon2(BigDecimal redExpon2) {
	       putNumber(beginRedExpon2,redExpon2,RED_EXPON_2_LEN,RED_EXPON_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon2
	 */
   	protected  BigDecimal serializeRedExpon2(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon2
		       ,15
		      );		 localRedExpon2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_2_LEN,RED_EXPON_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon2", beginRedExpon2,RED_EXPON_2_LEN);
    	}
    }
    /**
	 *	refreshRedExpon2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon2
			            ,RED_EXPON_2_LEN
			            ,RED_EXPON_2_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon2", beginRedExpon2,RED_EXPON_2_LEN);
    }
   	}
     int localRedExpon3Counter = -1;
     
     public boolean isRedExpon3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon3Counter != sharedCounter;
         localRedExpon3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon3
	 *	@return redExpon3
	 */
	public char[]  getRedExpon3String() {
	    return getCharArray(beginRedExpon3,RED_EXPON_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon3IsNumeric() {
		    return isNumeric(beginRedExpon3
	                    ,beginRedExpon3 + RED_EXPON_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_3_LEN = 15;
  protected  static final int RED_EXPON_3_SCALE = 3;

   protected BigDecimal checkRedExpon3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon3
	 */
	protected void serializeRedExpon3(BigDecimal redExpon3) {
	       putNumber(beginRedExpon3,redExpon3,RED_EXPON_3_LEN,RED_EXPON_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon3
	 */
   	protected  BigDecimal serializeRedExpon3(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon3
		       ,15
		      );		 localRedExpon3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_3_LEN,RED_EXPON_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon3", beginRedExpon3,RED_EXPON_3_LEN);
    	}
    }
    /**
	 *	refreshRedExpon3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon3
			            ,RED_EXPON_3_LEN
			            ,RED_EXPON_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon3", beginRedExpon3,RED_EXPON_3_LEN);
    }
   	}
     int localRedExpon4Counter = -1;
     
     public boolean isRedExpon4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon4Counter != sharedCounter;
         localRedExpon4Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon4
	 *	@return redExpon4
	 */
	public char[]  getRedExpon4String() {
	    return getCharArray(beginRedExpon4,RED_EXPON_4_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon4IsNumeric() {
		    return isNumeric(beginRedExpon4
	                    ,beginRedExpon4 + RED_EXPON_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_4_LEN = 15;
  protected  static final int RED_EXPON_4_SCALE = 4;

   protected BigDecimal checkRedExpon4MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon4
	 */
	protected void serializeRedExpon4(BigDecimal redExpon4) {
	       putNumber(beginRedExpon4,redExpon4,RED_EXPON_4_LEN,RED_EXPON_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon4Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon4
	 */
   	protected  BigDecimal serializeRedExpon4(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon4
		       ,15
		      );		 localRedExpon4Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_4_LEN,RED_EXPON_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon4", beginRedExpon4,RED_EXPON_4_LEN);
    	}
    }
    /**
	 *	refreshRedExpon4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon4() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon4
			            ,RED_EXPON_4_LEN
			            ,RED_EXPON_4_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon4", beginRedExpon4,RED_EXPON_4_LEN);
    }
   	}
     int localRedExpon5Counter = -1;
     
     public boolean isRedExpon5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon5Counter != sharedCounter;
         localRedExpon5Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon5
	 *	@return redExpon5
	 */
	public char[]  getRedExpon5String() {
	    return getCharArray(beginRedExpon5,RED_EXPON_5_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon5IsNumeric() {
		    return isNumeric(beginRedExpon5
	                    ,beginRedExpon5 + RED_EXPON_5_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_5_LEN = 15;
  protected  static final int RED_EXPON_5_SCALE = 5;

   protected BigDecimal checkRedExpon5MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon5
	 */
	protected void serializeRedExpon5(BigDecimal redExpon5) {
	       putNumber(beginRedExpon5,redExpon5,RED_EXPON_5_LEN,RED_EXPON_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon5Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon5
	 */
   	protected  BigDecimal serializeRedExpon5(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon5
		       ,15
		      );		 localRedExpon5Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_5_LEN,RED_EXPON_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon5", beginRedExpon5,RED_EXPON_5_LEN);
    	}
    }
    /**
	 *	refreshRedExpon5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon5() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon5
			            ,RED_EXPON_5_LEN
			            ,RED_EXPON_5_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon5", beginRedExpon5,RED_EXPON_5_LEN);
    }
   	}
     int localRedExpon6Counter = -1;
     
     public boolean isRedExpon6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon6Counter != sharedCounter;
         localRedExpon6Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon6
	 *	@return redExpon6
	 */
	public char[]  getRedExpon6String() {
	    return getCharArray(beginRedExpon6,RED_EXPON_6_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon6IsNumeric() {
		    return isNumeric(beginRedExpon6
	                    ,beginRedExpon6 + RED_EXPON_6_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_6_LEN = 15;
  protected  static final int RED_EXPON_6_SCALE = 6;

   protected BigDecimal checkRedExpon6MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon6
	 */
	protected void serializeRedExpon6(BigDecimal redExpon6) {
	       putNumber(beginRedExpon6,redExpon6,RED_EXPON_6_LEN,RED_EXPON_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon6Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon6
	 */
   	protected  BigDecimal serializeRedExpon6(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon6
		       ,15
		      );		 localRedExpon6Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_6_LEN,RED_EXPON_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon6", beginRedExpon6,RED_EXPON_6_LEN);
    	}
    }
    /**
	 *	refreshRedExpon6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon6() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon6
			            ,RED_EXPON_6_LEN
			            ,RED_EXPON_6_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon6", beginRedExpon6,RED_EXPON_6_LEN);
    }
   	}
     int localRedExpon7Counter = -1;
     
     public boolean isRedExpon7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon7Counter != sharedCounter;
         localRedExpon7Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon7
	 *	@return redExpon7
	 */
	public char[]  getRedExpon7String() {
	    return getCharArray(beginRedExpon7,RED_EXPON_7_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon7IsNumeric() {
		    return isNumeric(beginRedExpon7
	                    ,beginRedExpon7 + RED_EXPON_7_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_7_LEN = 15;
  protected  static final int RED_EXPON_7_SCALE = 7;

   protected BigDecimal checkRedExpon7MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon7
	 */
	protected void serializeRedExpon7(BigDecimal redExpon7) {
	       putNumber(beginRedExpon7,redExpon7,RED_EXPON_7_LEN,RED_EXPON_7_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon7Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon7
	 */
   	protected  BigDecimal serializeRedExpon7(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon7
		       ,15
		      );		 localRedExpon7Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_7_LEN,RED_EXPON_7_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon7", beginRedExpon7,RED_EXPON_7_LEN);
    	}
    }
    /**
	 *	refreshRedExpon7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon7() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon7
			            ,RED_EXPON_7_LEN
			            ,RED_EXPON_7_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon7", beginRedExpon7,RED_EXPON_7_LEN);
    }
   	}
     int localRedExpon8Counter = -1;
     
     public boolean isRedExpon8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon8Counter != sharedCounter;
         localRedExpon8Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon8
	 *	@return redExpon8
	 */
	public char[]  getRedExpon8String() {
	    return getCharArray(beginRedExpon8,RED_EXPON_8_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon8IsNumeric() {
		    return isNumeric(beginRedExpon8
	                    ,beginRedExpon8 + RED_EXPON_8_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_8_LEN = 15;
  protected  static final int RED_EXPON_8_SCALE = 8;

   protected BigDecimal checkRedExpon8MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon8
	 */
	protected void serializeRedExpon8(BigDecimal redExpon8) {
	       putNumber(beginRedExpon8,redExpon8,RED_EXPON_8_LEN,RED_EXPON_8_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon8Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon8
	 */
   	protected  BigDecimal serializeRedExpon8(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon8
		       ,15
		      );		 localRedExpon8Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_8_LEN,RED_EXPON_8_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon8", beginRedExpon8,RED_EXPON_8_LEN);
    	}
    }
    /**
	 *	refreshRedExpon8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon8() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon8
			            ,RED_EXPON_8_LEN
			            ,RED_EXPON_8_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon8", beginRedExpon8,RED_EXPON_8_LEN);
    }
   	}
     int localRedExpon9Counter = -1;
     
     public boolean isRedExpon9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRedExpon9Counter != sharedCounter;
         localRedExpon9Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of redExpon9
	 *	@return redExpon9
	 */
	public char[]  getRedExpon9String() {
	    return getCharArray(beginRedExpon9,RED_EXPON_9_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean redExpon9IsNumeric() {
		    return isNumeric(beginRedExpon9
	                    ,beginRedExpon9 + RED_EXPON_9_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RED_EXPON_9_LEN = 15;
  protected  static final int RED_EXPON_9_SCALE = 9;

   protected BigDecimal checkRedExpon9MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,9/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeRedExpon9
	 */
	protected void serializeRedExpon9(BigDecimal redExpon9) {
	       putNumber(beginRedExpon9,redExpon9,RED_EXPON_9_LEN,RED_EXPON_9_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRedExpon9Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRedExpon9
	 */
   	protected  BigDecimal serializeRedExpon9(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginRedExpon9
		       ,15
		      );		 localRedExpon9Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RED_EXPON_9_LEN,RED_EXPON_9_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("redExpon9", beginRedExpon9,RED_EXPON_9_LEN);
    	}
    }
    /**
	 *	refreshRedExpon9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRedExpon9() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRedExpon9
			            ,RED_EXPON_9_LEN
			            ,RED_EXPON_9_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("redExpon9", beginRedExpon9,RED_EXPON_9_LEN);
    }
   	}




}
  
