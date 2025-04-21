package com.cloudframe.app.u918test.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 102;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTgt10;
            protected  int beginTgt12;
            protected  int beginTgt13;
            protected  int beginTgt14;
            protected  int beginTgt15;
            protected  int beginTgt16;
            protected  int beginTgt17;
            protected  int beginTgt25;
            protected  int beginTgt27;
            protected  int beginTgt28;
            protected  int beginTgt29;
            protected  int beginTgt30;
            protected  int beginTgt31;
            protected  int beginTgt32;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginTgt10 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginTgt12 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginTgt13 = getStartOffset() + 10;	// set offset for serialization
  
  
             beginTgt14 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginTgt15 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginTgt16 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginTgt17 = getStartOffset() + 41;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginTgt25 = getStartOffset() + 51;	// set offset for serialization
  
  
  
  
             beginTgt27 = getStartOffset() + 56;	// set offset for serialization
  
  
             beginTgt28 = getStartOffset() + 61;	// set offset for serialization
  
  
             beginTgt29 = getStartOffset() + 69;	// set offset for serialization
  
  
             beginTgt30 = getStartOffset() + 74;	// set offset for serialization
  
  
             beginTgt31 = getStartOffset() + 82;	// set offset for serialization
  
  
             beginTgt32 = getStartOffset() + 92;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSrc3Counter = -1;
         public boolean isSrc3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc3Counter != sharedCounter;
            localSrc3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt3Counter = -1;
         public boolean isTgt3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt3Counter != sharedCounter;
            localTgt3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc4Counter = -1;
         public boolean isSrc4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc4Counter != sharedCounter;
            localSrc4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt4Counter = -1;
         public boolean isTgt4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt4Counter != sharedCounter;
            localTgt4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc5Counter = -1;
         public boolean isSrc5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc5Counter != sharedCounter;
            localSrc5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc5MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt5Counter = -1;
         public boolean isTgt5Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localTgt5Counter != sharedCounter;
             localTgt5Counter = sharedCounter; return hasModified;
         }
         int localSrc6Counter = -1;
         public boolean isSrc6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc6Counter != sharedCounter;
            localSrc6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt6Counter = -1;
         public boolean isTgt6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt6Counter != sharedCounter;
            localTgt6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt6MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc7Counter = -1;
         public boolean isSrc7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc7Counter != sharedCounter;
            localSrc7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc7MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt7Counter = -1;
         public boolean isTgt7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt7Counter != sharedCounter;
            localTgt7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt7MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc8Counter = -1;
         public boolean isSrc8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc8Counter != sharedCounter;
            localSrc8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc8MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt8Counter = -1;
         public boolean isTgt8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt8Counter != sharedCounter;
            localTgt8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt8MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc9Counter = -1;
         public boolean isSrc9Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc9Counter != sharedCounter;
            localSrc9Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc9MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt9Counter = -1;
         public boolean isTgt9Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt9Counter != sharedCounter;
            localTgt9Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt9MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc10Counter = -1;
         public boolean isSrc10Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc10Counter != sharedCounter;
            localSrc10Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc10MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt10Counter = -1;
     public boolean isTgt10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt10Counter != sharedCounter;
         localTgt10Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_10_LEN = 5;
	/**
	 * 	serialize this Tgt10
	 */
   protected void serializeTgt10(char[] tgt10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt10,0,getStringValue(),beginTgt10,TGT_10_LEN);
       localTgt10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt10Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshTgt10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt10() {	 
   		return (substring(getStringValue(),beginTgt10,beginTgt10 + TGT_10_LEN));
   	}
         int localSrc11Counter = -1;
         public boolean isSrc11Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc11Counter != sharedCounter;
            localSrc11Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc11MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt11Counter = -1;
     public boolean isTgt11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt11Counter != sharedCounter;
         localTgt11Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt11Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
         int localSrc12Counter = -1;
         public boolean isSrc12Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc12Counter != sharedCounter;
            localSrc12Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc12MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt12Counter = -1;
        public boolean isTgt12Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt12Counter != sharedCounter;
           localTgt12Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt12IsNumeric() {
	      return decimalIsNumeric(beginTgt12,TGT_12_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt12String() {
            return getPackedString(beginTgt12,TGT_12_LEN);
         }
   protected static final int TGT_12_LEN = 5;
   protected static final int TGT_12_SCALE = 2;
  	/**
	 * 	serializeTgt12
	 */
	protected void serializeTgt12(BigDecimal tgt12) {
		   putDecimal(beginTgt12,tgt12,TGT_12_LEN,TGT_12_SCALE,false);
		 localTgt12Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt12MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt12() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt12,TGT_12_LEN,TGT_12_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt12", beginTgt12,TGT_12_LEN);
     }
   	}
         int localSrc13Counter = -1;
         public boolean isSrc13Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc13Counter != sharedCounter;
            localSrc13Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc13MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt13Counter = -1;
        public boolean isTgt13Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt13Counter != sharedCounter;
           localTgt13Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt13IsNumeric() {
	      return decimalIsNumeric(beginTgt13,TGT_13_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt13String() {
            return getPackedString(beginTgt13,TGT_13_LEN);
         }
   protected static final int TGT_13_LEN = 8;
   protected static final int TGT_13_SCALE = 11;
  	/**
	 * 	serializeTgt13
	 */
	protected void serializeTgt13(BigDecimal tgt13) {
		   putDecimal(beginTgt13,tgt13,TGT_13_LEN,TGT_13_SCALE,false);
		 localTgt13Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt13MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTgt13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt13() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt13,TGT_13_LEN,TGT_13_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt13", beginTgt13,TGT_13_LEN);
     }
   	}
         int localSrc14Counter = -1;
         public boolean isSrc14Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc14Counter != sharedCounter;
            localSrc14Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc14MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt14Counter = -1;
        public boolean isTgt14Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt14Counter != sharedCounter;
           localTgt14Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt14IsNumeric() {
	      return decimalIsNumeric(beginTgt14,TGT_14_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt14String() {
            return getPackedString(beginTgt14,TGT_14_LEN);
         }
   protected static final int TGT_14_LEN = 5;
   protected static final int TGT_14_SCALE = 2;
  	/**
	 * 	serializeTgt14
	 */
	protected void serializeTgt14(BigDecimal tgt14) {
		   putDecimal(beginTgt14,tgt14,TGT_14_LEN,TGT_14_SCALE,true);
		 localTgt14Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt14MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt14() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt14,TGT_14_LEN,TGT_14_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt14", beginTgt14,TGT_14_LEN);
     }
   	}
         int localSrc15Counter = -1;
         public boolean isSrc15Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc15Counter != sharedCounter;
            localSrc15Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc15MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt15Counter = -1;
        public boolean isTgt15Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt15Counter != sharedCounter;
           localTgt15Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt15IsNumeric() {
	      return decimalIsNumeric(beginTgt15,TGT_15_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt15String() {
            return getPackedString(beginTgt15,TGT_15_LEN);
         }
   protected static final int TGT_15_LEN = 8;
   protected static final int TGT_15_SCALE = 11;
  	/**
	 * 	serializeTgt15
	 */
	protected void serializeTgt15(BigDecimal tgt15) {
		   putDecimal(beginTgt15,tgt15,TGT_15_LEN,TGT_15_SCALE,true);
		 localTgt15Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt15MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTgt15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt15() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt15,TGT_15_LEN,TGT_15_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt15", beginTgt15,TGT_15_LEN);
     }
   	}
         int localSrc16Counter = -1;
         public boolean isSrc16Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc16Counter != sharedCounter;
            localSrc16Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc16MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt16Counter = -1;
     public boolean isTgt16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt16Counter != sharedCounter;
         localTgt16Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt16
	 *	@return tgt16
	 */
	public char[]  getTgt16String() {
	     return getCharArray(beginTgt16,TGT_16_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt16IsNumeric() {
	    return isNumeric(beginTgt16
	                    ,beginTgt16 + TGT_16_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_16_LEN = 10;
  	/**
	 * serializeTgt16
	 */
	protected void serializeTgt16(long tgt16) {
		 putNumber(beginTgt16,tgt16,TGT_16_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt16Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt16
	 */
   	protected  long serializeTgt16(char[] value) {
	    long  tgt16;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt16 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt16
		       ,10
		      );
		 localTgt16Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt16;
    }

   protected long checkTgt16MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt16() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt16
			                 ,TGT_16_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt16", beginTgt16,TGT_16_LEN);
    }
   	}
         int localSrc17Counter = -1;
         public boolean isSrc17Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc17Counter != sharedCounter;
            localSrc17Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc17MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt17Counter = -1;
     public boolean isTgt17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt17Counter != sharedCounter;
         localTgt17Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt17
	 *	@return tgt17
	 */
	public char[]  getTgt17String() {
	     return getCharArray(beginTgt17,TGT_17_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt17IsNumeric() {
	    return isNumeric(beginTgt17
	                    ,beginTgt17 + TGT_17_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_17_LEN = 10;
  	/**
	 * serializeTgt17
	 */
	protected void serializeTgt17(long tgt17) {
		 putNumber(beginTgt17,tgt17,TGT_17_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt17Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt17
	 */
   	protected  long serializeTgt17(char[] value) {
	    long  tgt17;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt17 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginTgt17
		       ,10
		      );
		 localTgt17Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt17;
    }

   protected long checkTgt17MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt17() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt17
			                 ,TGT_17_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt17", beginTgt17,TGT_17_LEN);
    }
   	}
         int localSrc18Counter = -1;
         public boolean isSrc18Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc18Counter != sharedCounter;
            localSrc18Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc18MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt18Counter = -1;
         public boolean isTgt18Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt18Counter != sharedCounter;
            localTgt18Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt18MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc19Counter = -1;
         public boolean isSrc19Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc19Counter != sharedCounter;
            localSrc19Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc19MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt19Counter = -1;
         public boolean isTgt19Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt19Counter != sharedCounter;
            localTgt19Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt19MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc20Counter = -1;
         public boolean isSrc20Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc20Counter != sharedCounter;
            localSrc20Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc20MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt20Counter = -1;
         public boolean isTgt20Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localTgt20Counter != sharedCounter;
             localTgt20Counter = sharedCounter; return hasModified;
         }
         int localSrc21Counter = -1;
         public boolean isSrc21Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc21Counter != sharedCounter;
            localSrc21Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc21MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt21Counter = -1;
         public boolean isTgt21Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt21Counter != sharedCounter;
            localTgt21Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt21MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc22Counter = -1;
         public boolean isSrc22Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc22Counter != sharedCounter;
            localSrc22Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc22MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt22Counter = -1;
         public boolean isTgt22Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt22Counter != sharedCounter;
            localTgt22Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt22MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc23Counter = -1;
         public boolean isSrc23Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc23Counter != sharedCounter;
            localSrc23Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc23MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt23Counter = -1;
         public boolean isTgt23Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt23Counter != sharedCounter;
            localTgt23Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt23MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc24Counter = -1;
         public boolean isSrc24Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc24Counter != sharedCounter;
            localSrc24Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc24MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt24Counter = -1;
         public boolean isTgt24Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt24Counter != sharedCounter;
            localTgt24Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt24MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc25Counter = -1;
         public boolean isSrc25Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc25Counter != sharedCounter;
            localSrc25Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc25MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt25Counter = -1;
     public boolean isTgt25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt25Counter != sharedCounter;
         localTgt25Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_25_LEN = 5;
	/**
	 * 	serialize this Tgt25
	 */
   protected void serializeTgt25(char[] tgt25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt25,0,getStringValue(),beginTgt25,TGT_25_LEN);
       localTgt25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt25Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshTgt25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt25() {	 
   		return (substring(getStringValue(),beginTgt25,beginTgt25 + TGT_25_LEN));
   	}
         int localSrc26Counter = -1;
         public boolean isSrc26Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc26Counter != sharedCounter;
            localSrc26Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc26MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt26Counter = -1;
     public boolean isTgt26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt26Counter != sharedCounter;
         localTgt26Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt26Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
         int localSrc27Counter = -1;
         public boolean isSrc27Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc27Counter != sharedCounter;
            localSrc27Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc27MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt27Counter = -1;
        public boolean isTgt27Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt27Counter != sharedCounter;
           localTgt27Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt27IsNumeric() {
	      return decimalIsNumeric(beginTgt27,TGT_27_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt27String() {
            return getPackedString(beginTgt27,TGT_27_LEN);
         }
   protected static final int TGT_27_LEN = 5;
   protected static final int TGT_27_SCALE = 2;
  	/**
	 * 	serializeTgt27
	 */
	protected void serializeTgt27(BigDecimal tgt27) {
		   putDecimal(beginTgt27,tgt27,TGT_27_LEN,TGT_27_SCALE,false);
		 localTgt27Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt27MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt27() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt27,TGT_27_LEN,TGT_27_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt27", beginTgt27,TGT_27_LEN);
     }
   	}
         int localSrc28Counter = -1;
         public boolean isSrc28Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc28Counter != sharedCounter;
            localSrc28Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc28MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt28Counter = -1;
        public boolean isTgt28Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt28Counter != sharedCounter;
           localTgt28Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt28IsNumeric() {
	      return decimalIsNumeric(beginTgt28,TGT_28_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt28String() {
            return getPackedString(beginTgt28,TGT_28_LEN);
         }
   protected static final int TGT_28_LEN = 8;
   protected static final int TGT_28_SCALE = 11;
  	/**
	 * 	serializeTgt28
	 */
	protected void serializeTgt28(BigDecimal tgt28) {
		   putDecimal(beginTgt28,tgt28,TGT_28_LEN,TGT_28_SCALE,false);
		 localTgt28Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt28MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTgt28 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt28() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt28,TGT_28_LEN,TGT_28_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt28", beginTgt28,TGT_28_LEN);
     }
   	}
         int localSrc29Counter = -1;
         public boolean isSrc29Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc29Counter != sharedCounter;
            localSrc29Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc29MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt29Counter = -1;
        public boolean isTgt29Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt29Counter != sharedCounter;
           localTgt29Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt29IsNumeric() {
	      return decimalIsNumeric(beginTgt29,TGT_29_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt29String() {
            return getPackedString(beginTgt29,TGT_29_LEN);
         }
   protected static final int TGT_29_LEN = 5;
   protected static final int TGT_29_SCALE = 2;
  	/**
	 * 	serializeTgt29
	 */
	protected void serializeTgt29(BigDecimal tgt29) {
		   putDecimal(beginTgt29,tgt29,TGT_29_LEN,TGT_29_SCALE,true);
		 localTgt29Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt29MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt29 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt29() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt29,TGT_29_LEN,TGT_29_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt29", beginTgt29,TGT_29_LEN);
     }
   	}
         int localSrc30Counter = -1;
         public boolean isSrc30Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc30Counter != sharedCounter;
            localSrc30Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc30MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
        int localTgt30Counter = -1;
        public boolean isTgt30Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt30Counter != sharedCounter;
           localTgt30Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt30IsNumeric() {
	      return decimalIsNumeric(beginTgt30,TGT_30_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt30String() {
            return getPackedString(beginTgt30,TGT_30_LEN);
         }
   protected static final int TGT_30_LEN = 8;
   protected static final int TGT_30_SCALE = 11;
  	/**
	 * 	serializeTgt30
	 */
	protected void serializeTgt30(BigDecimal tgt30) {
		   putDecimal(beginTgt30,tgt30,TGT_30_LEN,TGT_30_SCALE,true);
		 localTgt30Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt30MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTgt30 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt30() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt30,TGT_30_LEN,TGT_30_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt30", beginTgt30,TGT_30_LEN);
     }
   	}
         int localSrc31Counter = -1;
         public boolean isSrc31Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc31Counter != sharedCounter;
            localSrc31Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc31MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt31Counter = -1;
     public boolean isTgt31Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt31Counter != sharedCounter;
         localTgt31Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt31
	 *	@return tgt31
	 */
	public char[]  getTgt31String() {
	     return getCharArray(beginTgt31,TGT_31_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt31IsNumeric() {
	    return isNumeric(beginTgt31
	                    ,beginTgt31 + TGT_31_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_31_LEN = 10;
  	/**
	 * serializeTgt31
	 */
	protected void serializeTgt31(long tgt31) {
		 putNumber(beginTgt31,tgt31,TGT_31_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt31Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt31
	 */
   	protected  long serializeTgt31(char[] value) {
	    long  tgt31;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt31 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt31
		       ,10
		      );
		 localTgt31Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt31;
    }

   protected long checkTgt31MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt31 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt31() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt31
			                 ,TGT_31_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt31", beginTgt31,TGT_31_LEN);
    }
   	}
         int localSrc32Counter = -1;
         public boolean isSrc32Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc32Counter != sharedCounter;
            localSrc32Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc32MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt32Counter = -1;
     public boolean isTgt32Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt32Counter != sharedCounter;
         localTgt32Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt32
	 *	@return tgt32
	 */
	public char[]  getTgt32String() {
	     return getCharArray(beginTgt32,TGT_32_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt32IsNumeric() {
	    return isNumeric(beginTgt32
	                    ,beginTgt32 + TGT_32_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_32_LEN = 10;
  	/**
	 * serializeTgt32
	 */
	protected void serializeTgt32(long tgt32) {
		 putNumber(beginTgt32,tgt32,TGT_32_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt32Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt32
	 */
   	protected  long serializeTgt32(char[] value) {
	    long  tgt32;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt32 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginTgt32
		       ,10
		      );
		 localTgt32Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt32;
    }

   protected long checkTgt32MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt32 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt32() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt32
			                 ,TGT_32_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt32", beginTgt32,TGT_32_LEN);
    }
   	}




}
  
