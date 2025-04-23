package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class Expon0GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Expon0GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Expon0GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXPON_0_GROUP_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExpon0;
            protected  int beginExpon1;
            protected  int beginExpon2;
            protected  int beginExpon3;
            protected  int beginExpon4;
            protected  int beginExpon5;
            protected  int beginExpon6;
            protected  int beginExpon7;
            protected  int beginExpon8;
            protected  int beginExpon9;
	
	/**
	* Constructor for Expon0GroupSerialized
	**/
    public Expon0GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Expon0GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXPON_0_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExpon0 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon1 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon2 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon3 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon4 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon5 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon6 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon7 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon8 = getStartOffset() + 0;	// set offset for serialization
  
             beginExpon9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExpon0Counter = -1;
     public boolean isExpon0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon0Counter != sharedCounter;
         localExpon0Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of expon0
	 *	@return expon0
	 */
	public char[]  getExpon0String() {
	     return getCharArray(beginExpon0,EXPON_0_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon0IsNumeric() {
	    return isNumeric(beginExpon0
	                    ,beginExpon0 + EXPON_0_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXPON_0_LEN = 17;
  	/**
	 * serializeExpon0
	 */
	protected void serializeExpon0(long expon0) {
		 putNumber(beginExpon0,expon0,EXPON_0_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon0Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExpon0
	 */
   	protected  long serializeExpon0(char[] value) {
	    long  expon0;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    expon0 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon0
		       ,17
		      );
		 localExpon0Counter = shareString.getSerializedField().getModifiedCounter();
		return  expon0;
    }

   protected long checkExpon0MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshExpon0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExpon0() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExpon0
			                 ,EXPON_0_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("expon0", beginExpon0,EXPON_0_LEN);
    }
   	}
     int localExpon1Counter = -1;
     
     public boolean isExpon1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon1Counter != sharedCounter;
         localExpon1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon1
	 *	@return expon1
	 */
	public char[]  getExpon1String() {
	    return getCharArray(beginExpon1,EXPON_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon1IsNumeric() {
		    return isNumeric(beginExpon1
	                    ,beginExpon1 + EXPON_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_1_LEN = 17;
  protected  static final int EXPON_1_SCALE = 1;

   protected BigDecimal checkExpon1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon1
	 */
	protected void serializeExpon1(BigDecimal expon1) {
	       putNumber(beginExpon1,expon1,EXPON_1_LEN,EXPON_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon1
	 */
   	protected  BigDecimal serializeExpon1(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon1
		       ,17
		      );		 localExpon1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_1_LEN,EXPON_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon1", beginExpon1,EXPON_1_LEN);
    	}
    }
    /**
	 *	refreshExpon1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon1
			            ,EXPON_1_LEN
			            ,EXPON_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon1", beginExpon1,EXPON_1_LEN);
    }
   	}
     int localExpon2Counter = -1;
     
     public boolean isExpon2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon2Counter != sharedCounter;
         localExpon2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon2
	 *	@return expon2
	 */
	public char[]  getExpon2String() {
	    return getCharArray(beginExpon2,EXPON_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon2IsNumeric() {
		    return isNumeric(beginExpon2
	                    ,beginExpon2 + EXPON_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_2_LEN = 17;
  protected  static final int EXPON_2_SCALE = 2;

   protected BigDecimal checkExpon2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon2
	 */
	protected void serializeExpon2(BigDecimal expon2) {
	       putNumber(beginExpon2,expon2,EXPON_2_LEN,EXPON_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon2
	 */
   	protected  BigDecimal serializeExpon2(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon2
		       ,17
		      );		 localExpon2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_2_LEN,EXPON_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon2", beginExpon2,EXPON_2_LEN);
    	}
    }
    /**
	 *	refreshExpon2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon2
			            ,EXPON_2_LEN
			            ,EXPON_2_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon2", beginExpon2,EXPON_2_LEN);
    }
   	}
     int localExpon3Counter = -1;
     
     public boolean isExpon3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon3Counter != sharedCounter;
         localExpon3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon3
	 *	@return expon3
	 */
	public char[]  getExpon3String() {
	    return getCharArray(beginExpon3,EXPON_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon3IsNumeric() {
		    return isNumeric(beginExpon3
	                    ,beginExpon3 + EXPON_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_3_LEN = 17;
  protected  static final int EXPON_3_SCALE = 3;

   protected BigDecimal checkExpon3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon3
	 */
	protected void serializeExpon3(BigDecimal expon3) {
	       putNumber(beginExpon3,expon3,EXPON_3_LEN,EXPON_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon3
	 */
   	protected  BigDecimal serializeExpon3(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon3
		       ,17
		      );		 localExpon3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_3_LEN,EXPON_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon3", beginExpon3,EXPON_3_LEN);
    	}
    }
    /**
	 *	refreshExpon3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon3
			            ,EXPON_3_LEN
			            ,EXPON_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon3", beginExpon3,EXPON_3_LEN);
    }
   	}
     int localExpon4Counter = -1;
     
     public boolean isExpon4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon4Counter != sharedCounter;
         localExpon4Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon4
	 *	@return expon4
	 */
	public char[]  getExpon4String() {
	    return getCharArray(beginExpon4,EXPON_4_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon4IsNumeric() {
		    return isNumeric(beginExpon4
	                    ,beginExpon4 + EXPON_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_4_LEN = 17;
  protected  static final int EXPON_4_SCALE = 4;

   protected BigDecimal checkExpon4MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon4
	 */
	protected void serializeExpon4(BigDecimal expon4) {
	       putNumber(beginExpon4,expon4,EXPON_4_LEN,EXPON_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon4Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon4
	 */
   	protected  BigDecimal serializeExpon4(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon4
		       ,17
		      );		 localExpon4Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_4_LEN,EXPON_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon4", beginExpon4,EXPON_4_LEN);
    	}
    }
    /**
	 *	refreshExpon4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon4() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon4
			            ,EXPON_4_LEN
			            ,EXPON_4_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon4", beginExpon4,EXPON_4_LEN);
    }
   	}
     int localExpon5Counter = -1;
     
     public boolean isExpon5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon5Counter != sharedCounter;
         localExpon5Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon5
	 *	@return expon5
	 */
	public char[]  getExpon5String() {
	    return getCharArray(beginExpon5,EXPON_5_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon5IsNumeric() {
		    return isNumeric(beginExpon5
	                    ,beginExpon5 + EXPON_5_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_5_LEN = 17;
  protected  static final int EXPON_5_SCALE = 5;

   protected BigDecimal checkExpon5MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon5
	 */
	protected void serializeExpon5(BigDecimal expon5) {
	       putNumber(beginExpon5,expon5,EXPON_5_LEN,EXPON_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon5Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon5
	 */
   	protected  BigDecimal serializeExpon5(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon5
		       ,17
		      );		 localExpon5Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_5_LEN,EXPON_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon5", beginExpon5,EXPON_5_LEN);
    	}
    }
    /**
	 *	refreshExpon5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon5() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon5
			            ,EXPON_5_LEN
			            ,EXPON_5_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon5", beginExpon5,EXPON_5_LEN);
    }
   	}
     int localExpon6Counter = -1;
     
     public boolean isExpon6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon6Counter != sharedCounter;
         localExpon6Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon6
	 *	@return expon6
	 */
	public char[]  getExpon6String() {
	    return getCharArray(beginExpon6,EXPON_6_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon6IsNumeric() {
		    return isNumeric(beginExpon6
	                    ,beginExpon6 + EXPON_6_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_6_LEN = 17;
  protected  static final int EXPON_6_SCALE = 6;

   protected BigDecimal checkExpon6MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon6
	 */
	protected void serializeExpon6(BigDecimal expon6) {
	       putNumber(beginExpon6,expon6,EXPON_6_LEN,EXPON_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon6Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon6
	 */
   	protected  BigDecimal serializeExpon6(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon6
		       ,17
		      );		 localExpon6Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_6_LEN,EXPON_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon6", beginExpon6,EXPON_6_LEN);
    	}
    }
    /**
	 *	refreshExpon6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon6() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon6
			            ,EXPON_6_LEN
			            ,EXPON_6_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon6", beginExpon6,EXPON_6_LEN);
    }
   	}
     int localExpon7Counter = -1;
     
     public boolean isExpon7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon7Counter != sharedCounter;
         localExpon7Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon7
	 *	@return expon7
	 */
	public char[]  getExpon7String() {
	    return getCharArray(beginExpon7,EXPON_7_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon7IsNumeric() {
		    return isNumeric(beginExpon7
	                    ,beginExpon7 + EXPON_7_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_7_LEN = 17;
  protected  static final int EXPON_7_SCALE = 7;

   protected BigDecimal checkExpon7MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon7
	 */
	protected void serializeExpon7(BigDecimal expon7) {
	       putNumber(beginExpon7,expon7,EXPON_7_LEN,EXPON_7_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon7Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon7
	 */
   	protected  BigDecimal serializeExpon7(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon7
		       ,17
		      );		 localExpon7Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_7_LEN,EXPON_7_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon7", beginExpon7,EXPON_7_LEN);
    	}
    }
    /**
	 *	refreshExpon7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon7() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon7
			            ,EXPON_7_LEN
			            ,EXPON_7_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon7", beginExpon7,EXPON_7_LEN);
    }
   	}
     int localExpon8Counter = -1;
     
     public boolean isExpon8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon8Counter != sharedCounter;
         localExpon8Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon8
	 *	@return expon8
	 */
	public char[]  getExpon8String() {
	    return getCharArray(beginExpon8,EXPON_8_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon8IsNumeric() {
		    return isNumeric(beginExpon8
	                    ,beginExpon8 + EXPON_8_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_8_LEN = 17;
  protected  static final int EXPON_8_SCALE = 8;

   protected BigDecimal checkExpon8MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon8
	 */
	protected void serializeExpon8(BigDecimal expon8) {
	       putNumber(beginExpon8,expon8,EXPON_8_LEN,EXPON_8_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon8Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon8
	 */
   	protected  BigDecimal serializeExpon8(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon8
		       ,17
		      );		 localExpon8Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_8_LEN,EXPON_8_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon8", beginExpon8,EXPON_8_LEN);
    	}
    }
    /**
	 *	refreshExpon8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon8() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon8
			            ,EXPON_8_LEN
			            ,EXPON_8_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon8", beginExpon8,EXPON_8_LEN);
    }
   	}
     int localExpon9Counter = -1;
     
     public boolean isExpon9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpon9Counter != sharedCounter;
         localExpon9Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of expon9
	 *	@return expon9
	 */
	public char[]  getExpon9String() {
	    return getCharArray(beginExpon9,EXPON_9_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean expon9IsNumeric() {
		    return isNumeric(beginExpon9
	                    ,beginExpon9 + EXPON_9_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EXPON_9_LEN = 17;
  protected  static final int EXPON_9_SCALE = 9;

   protected BigDecimal checkExpon9MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,9/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeExpon9
	 */
	protected void serializeExpon9(BigDecimal expon9) {
	       putNumber(beginExpon9,expon9,EXPON_9_LEN,EXPON_9_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExpon9Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeExpon9
	 */
   	protected  BigDecimal serializeExpon9(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginExpon9
		       ,17
		      );		 localExpon9Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EXPON_9_LEN,EXPON_9_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("expon9", beginExpon9,EXPON_9_LEN);
    	}
    }
    /**
	 *	refreshExpon9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshExpon9() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginExpon9
			            ,EXPON_9_LEN
			            ,EXPON_9_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("expon9", beginExpon9,EXPON_9_LEN);
    }
   	}




}
  
