package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class L1CtlValues800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class L1CtlValues800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(L1CtlValues800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_1_CTL_VALUES_800_LENGTH = 33;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginL1CtlAb800;
            protected  int beginL1CtlMti800;
            protected  int beginL1CtlFunc800;
            protected  int beginL1CtlSi800;
            protected  int beginL1CtlRi800;
            protected  int beginL1CtlProcess800;
            protected  int beginL1CtlMsgrc800;
            protected  int beginL1CtlExrc800;
            protected  int beginL1CtlMccgrp800;
            protected  int beginL1CtlPrdcode800;
            protected  int beginL1CtlBussl800;
            protected  int beginL1CtlBussi800;
            protected  int beginL1CtlIrd800;
	
	/**
	* Constructor for L1CtlValues800Serialized
	**/
    public L1CtlValues800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in L1CtlValues800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_1_CTL_VALUES_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginL1CtlAb800 = getStartOffset() + 0;	// set offset for serialization
  
             beginL1CtlMti800 = getStartOffset() + 3;	// set offset for serialization
  
             beginL1CtlFunc800 = getStartOffset() + 7;	// set offset for serialization
  
             beginL1CtlSi800 = getStartOffset() + 10;	// set offset for serialization
  
             beginL1CtlRi800 = getStartOffset() + 11;	// set offset for serialization
  
             beginL1CtlProcess800 = getStartOffset() + 12;	// set offset for serialization
  
             beginL1CtlMsgrc800 = getStartOffset() + 14;	// set offset for serialization
  
             beginL1CtlExrc800 = getStartOffset() + 18;	// set offset for serialization
  
             beginL1CtlMccgrp800 = getStartOffset() + 20;	// set offset for serialization
  
             beginL1CtlPrdcode800 = getStartOffset() + 21;	// set offset for serialization
  
             beginL1CtlBussl800 = getStartOffset() + 24;	// set offset for serialization
  
             beginL1CtlBussi800 = getStartOffset() + 25;	// set offset for serialization
  
             beginL1CtlIrd800 = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localL1CtlAb800Counter = -1;
     public boolean isL1CtlAb800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlAb800Counter != sharedCounter;
         localL1CtlAb800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_AB_800_LEN = 3;
	/**
	 * 	serialize this L1CtlAb800
	 */
   protected void serializeL1CtlAb800(char[] l1CtlAb800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlAb800,0,getStringValue(),beginL1CtlAb800,L_1_CTL_AB_800_LEN);
       localL1CtlAb800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlAb800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshL1CtlAb800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlAb800() {	 
   		return (substring(getStringValue(),beginL1CtlAb800,beginL1CtlAb800 + L_1_CTL_AB_800_LEN));
   	}
     int localL1CtlMti800Counter = -1;
     public boolean isL1CtlMti800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlMti800Counter != sharedCounter;
         localL1CtlMti800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of l1CtlMti800
	 *	@return l1CtlMti800
	 */
	public char[]  getL1CtlMti800String() {
	     return getCharArray(beginL1CtlMti800,L_1_CTL_MTI_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlMti800IsNumeric() {
	    return isNumeric(beginL1CtlMti800
	                    ,beginL1CtlMti800 + L_1_CTL_MTI_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int L_1_CTL_MTI_800_LEN = 4;
  	/**
	 * serializeL1CtlMti800
	 */
	protected void serializeL1CtlMti800(int l1CtlMti800) {
		 putNumber(beginL1CtlMti800,l1CtlMti800,L_1_CTL_MTI_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localL1CtlMti800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeL1CtlMti800
	 */
   	protected  int serializeL1CtlMti800(char[] value) {
	    int  l1CtlMti800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    l1CtlMti800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginL1CtlMti800
		       ,4
		      );
		 localL1CtlMti800Counter = shareString.getSerializedField().getModifiedCounter();
		return  l1CtlMti800;
    }

   protected int checkL1CtlMti800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshL1CtlMti800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshL1CtlMti800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginL1CtlMti800
			                 ,L_1_CTL_MTI_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("l1CtlMti800", beginL1CtlMti800,L_1_CTL_MTI_800_LEN);
    }
   	}
     int localL1CtlFunc800Counter = -1;
     public boolean isL1CtlFunc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlFunc800Counter != sharedCounter;
         localL1CtlFunc800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of l1CtlFunc800
	 *	@return l1CtlFunc800
	 */
	public char[]  getL1CtlFunc800String() {
	     return getCharArray(beginL1CtlFunc800,L_1_CTL_FUNC_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlFunc800IsNumeric() {
	    return isNumeric(beginL1CtlFunc800
	                    ,beginL1CtlFunc800 + L_1_CTL_FUNC_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int L_1_CTL_FUNC_800_LEN = 3;
  	/**
	 * serializeL1CtlFunc800
	 */
	protected void serializeL1CtlFunc800(int l1CtlFunc800) {
		 putNumber(beginL1CtlFunc800,l1CtlFunc800,L_1_CTL_FUNC_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localL1CtlFunc800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeL1CtlFunc800
	 */
   	protected  int serializeL1CtlFunc800(char[] value) {
	    int  l1CtlFunc800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    l1CtlFunc800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginL1CtlFunc800
		       ,3
		      );
		 localL1CtlFunc800Counter = shareString.getSerializedField().getModifiedCounter();
		return  l1CtlFunc800;
    }

   protected int checkL1CtlFunc800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshL1CtlFunc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshL1CtlFunc800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginL1CtlFunc800
			                 ,L_1_CTL_FUNC_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("l1CtlFunc800", beginL1CtlFunc800,L_1_CTL_FUNC_800_LEN);
    }
   	}
     int localL1CtlSi800Counter = -1;
     public boolean isL1CtlSi800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlSi800Counter != sharedCounter;
         localL1CtlSi800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_SI_800_LEN = 1;
	/**
	 * 	serialize this L1CtlSi800
	 */
   protected void serializeL1CtlSi800(char[] l1CtlSi800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlSi800,0,getStringValue(),beginL1CtlSi800,L_1_CTL_SI_800_LEN);
       localL1CtlSi800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlSi800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL1CtlSi800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlSi800() {	 
   		return (substring(getStringValue(),beginL1CtlSi800,beginL1CtlSi800 + L_1_CTL_SI_800_LEN));
   	}
     int localL1CtlRi800Counter = -1;
     public boolean isL1CtlRi800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlRi800Counter != sharedCounter;
         localL1CtlRi800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_RI_800_LEN = 1;
	/**
	 * 	serialize this L1CtlRi800
	 */
   protected void serializeL1CtlRi800(char[] l1CtlRi800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlRi800,0,getStringValue(),beginL1CtlRi800,L_1_CTL_RI_800_LEN);
       localL1CtlRi800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlRi800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL1CtlRi800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlRi800() {	 
   		return (substring(getStringValue(),beginL1CtlRi800,beginL1CtlRi800 + L_1_CTL_RI_800_LEN));
   	}
     int localL1CtlProcess800Counter = -1;
     public boolean isL1CtlProcess800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlProcess800Counter != sharedCounter;
         localL1CtlProcess800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of l1CtlProcess800
	 *	@return l1CtlProcess800
	 */
	public char[]  getL1CtlProcess800String() {
	     return getCharArray(beginL1CtlProcess800,L_1_CTL_PROCESS_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlProcess800IsNumeric() {
	    return isNumeric(beginL1CtlProcess800
	                    ,beginL1CtlProcess800 + L_1_CTL_PROCESS_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int L_1_CTL_PROCESS_800_LEN = 2;
  	/**
	 * serializeL1CtlProcess800
	 */
	protected void serializeL1CtlProcess800(int l1CtlProcess800) {
		 putNumber(beginL1CtlProcess800,l1CtlProcess800,L_1_CTL_PROCESS_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localL1CtlProcess800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeL1CtlProcess800
	 */
   	protected  int serializeL1CtlProcess800(char[] value) {
	    int  l1CtlProcess800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    l1CtlProcess800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginL1CtlProcess800
		       ,2
		      );
		 localL1CtlProcess800Counter = shareString.getSerializedField().getModifiedCounter();
		return  l1CtlProcess800;
    }

   protected int checkL1CtlProcess800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshL1CtlProcess800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshL1CtlProcess800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginL1CtlProcess800
			                 ,L_1_CTL_PROCESS_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("l1CtlProcess800", beginL1CtlProcess800,L_1_CTL_PROCESS_800_LEN);
    }
   	}
     int localL1CtlMsgrc800Counter = -1;
     public boolean isL1CtlMsgrc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlMsgrc800Counter != sharedCounter;
         localL1CtlMsgrc800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of l1CtlMsgrc800
	 *	@return l1CtlMsgrc800
	 */
	public char[]  getL1CtlMsgrc800String() {
	     return getCharArray(beginL1CtlMsgrc800,L_1_CTL_MSGRC_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlMsgrc800IsNumeric() {
	    return isNumeric(beginL1CtlMsgrc800
	                    ,beginL1CtlMsgrc800 + L_1_CTL_MSGRC_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int L_1_CTL_MSGRC_800_LEN = 4;
  	/**
	 * serializeL1CtlMsgrc800
	 */
	protected void serializeL1CtlMsgrc800(int l1CtlMsgrc800) {
		 putNumber(beginL1CtlMsgrc800,l1CtlMsgrc800,L_1_CTL_MSGRC_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localL1CtlMsgrc800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeL1CtlMsgrc800
	 */
   	protected  int serializeL1CtlMsgrc800(char[] value) {
	    int  l1CtlMsgrc800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    l1CtlMsgrc800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginL1CtlMsgrc800
		       ,4
		      );
		 localL1CtlMsgrc800Counter = shareString.getSerializedField().getModifiedCounter();
		return  l1CtlMsgrc800;
    }

   protected int checkL1CtlMsgrc800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshL1CtlMsgrc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshL1CtlMsgrc800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginL1CtlMsgrc800
			                 ,L_1_CTL_MSGRC_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("l1CtlMsgrc800", beginL1CtlMsgrc800,L_1_CTL_MSGRC_800_LEN);
    }
   	}
     int localL1CtlExrc800Counter = -1;
     public boolean isL1CtlExrc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlExrc800Counter != sharedCounter;
         localL1CtlExrc800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_EXRC_800_LEN = 2;
	/**
	 * 	serialize this L1CtlExrc800
	 */
   protected void serializeL1CtlExrc800(char[] l1CtlExrc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlExrc800,0,getStringValue(),beginL1CtlExrc800,L_1_CTL_EXRC_800_LEN);
       localL1CtlExrc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlExrc800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshL1CtlExrc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlExrc800() {	 
   		return (substring(getStringValue(),beginL1CtlExrc800,beginL1CtlExrc800 + L_1_CTL_EXRC_800_LEN));
   	}
     int localL1CtlMccgrp800Counter = -1;
     public boolean isL1CtlMccgrp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlMccgrp800Counter != sharedCounter;
         localL1CtlMccgrp800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_MCCGRP_800_LEN = 1;
	/**
	 * 	serialize this L1CtlMccgrp800
	 */
   protected void serializeL1CtlMccgrp800(char[] l1CtlMccgrp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlMccgrp800,0,getStringValue(),beginL1CtlMccgrp800,L_1_CTL_MCCGRP_800_LEN);
       localL1CtlMccgrp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlMccgrp800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL1CtlMccgrp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlMccgrp800() {	 
   		return (substring(getStringValue(),beginL1CtlMccgrp800,beginL1CtlMccgrp800 + L_1_CTL_MCCGRP_800_LEN));
   	}
     int localL1CtlPrdcode800Counter = -1;
     public boolean isL1CtlPrdcode800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlPrdcode800Counter != sharedCounter;
         localL1CtlPrdcode800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_PRDCODE_800_LEN = 3;
	/**
	 * 	serialize this L1CtlPrdcode800
	 */
   protected void serializeL1CtlPrdcode800(char[] l1CtlPrdcode800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlPrdcode800,0,getStringValue(),beginL1CtlPrdcode800,L_1_CTL_PRDCODE_800_LEN);
       localL1CtlPrdcode800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlPrdcode800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshL1CtlPrdcode800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlPrdcode800() {	 
   		return (substring(getStringValue(),beginL1CtlPrdcode800,beginL1CtlPrdcode800 + L_1_CTL_PRDCODE_800_LEN));
   	}
     int localL1CtlBussl800Counter = -1;
     public boolean isL1CtlBussl800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlBussl800Counter != sharedCounter;
         localL1CtlBussl800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of l1CtlBussl800
	 *	@return l1CtlBussl800
	 */
	public char[]  getL1CtlBussl800String() {
	     return getCharArray(beginL1CtlBussl800,L_1_CTL_BUSSL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlBussl800IsNumeric() {
	    return isNumeric(beginL1CtlBussl800
	                    ,beginL1CtlBussl800 + L_1_CTL_BUSSL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int L_1_CTL_BUSSL_800_LEN = 1;
  	/**
	 * serializeL1CtlBussl800
	 */
	protected void serializeL1CtlBussl800(int l1CtlBussl800) {
		 putNumber(beginL1CtlBussl800,l1CtlBussl800,L_1_CTL_BUSSL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localL1CtlBussl800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeL1CtlBussl800
	 */
   	protected  int serializeL1CtlBussl800(char[] value) {
	    int  l1CtlBussl800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    l1CtlBussl800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginL1CtlBussl800
		       ,1
		      );
		 localL1CtlBussl800Counter = shareString.getSerializedField().getModifiedCounter();
		return  l1CtlBussl800;
    }

   protected int checkL1CtlBussl800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshL1CtlBussl800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshL1CtlBussl800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginL1CtlBussl800
			                 ,L_1_CTL_BUSSL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("l1CtlBussl800", beginL1CtlBussl800,L_1_CTL_BUSSL_800_LEN);
    }
   	}
     int localL1CtlBussi800Counter = -1;
     public boolean isL1CtlBussi800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlBussi800Counter != sharedCounter;
         localL1CtlBussi800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of l1CtlBussi800
	 *	@return l1CtlBussi800
	 */
	public char[]  getL1CtlBussi800String() {
	     return getCharArray(beginL1CtlBussi800,L_1_CTL_BUSSI_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlBussi800IsNumeric() {
	    return isNumeric(beginL1CtlBussi800
	                    ,beginL1CtlBussi800 + L_1_CTL_BUSSI_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int L_1_CTL_BUSSI_800_LEN = 6;
  	/**
	 * serializeL1CtlBussi800
	 */
	protected void serializeL1CtlBussi800(long l1CtlBussi800) {
		 putNumber(beginL1CtlBussi800,l1CtlBussi800,L_1_CTL_BUSSI_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localL1CtlBussi800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeL1CtlBussi800
	 */
   	protected  long serializeL1CtlBussi800(char[] value) {
	    long  l1CtlBussi800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    l1CtlBussi800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginL1CtlBussi800
		       ,6
		      );
		 localL1CtlBussi800Counter = shareString.getSerializedField().getModifiedCounter();
		return  l1CtlBussi800;
    }

   protected long checkL1CtlBussi800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshL1CtlBussi800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshL1CtlBussi800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginL1CtlBussi800
			                 ,L_1_CTL_BUSSI_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("l1CtlBussi800", beginL1CtlBussi800,L_1_CTL_BUSSI_800_LEN);
    }
   	}
     int localL1CtlIrd800Counter = -1;
     public boolean isL1CtlIrd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL1CtlIrd800Counter != sharedCounter;
         localL1CtlIrd800Counter = sharedCounter; return hasModified;
     }
	protected static final int L_1_CTL_IRD_800_LEN = 2;
	/**
	 * 	serialize this L1CtlIrd800
	 */
   protected void serializeL1CtlIrd800(char[] l1CtlIrd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l1CtlIrd800,0,getStringValue(),beginL1CtlIrd800,L_1_CTL_IRD_800_LEN);
       localL1CtlIrd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL1CtlIrd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshL1CtlIrd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL1CtlIrd800() {	 
   		return (substring(getStringValue(),beginL1CtlIrd800,beginL1CtlIrd800 + L_1_CTL_IRD_800_LEN));
   	}




}
  
