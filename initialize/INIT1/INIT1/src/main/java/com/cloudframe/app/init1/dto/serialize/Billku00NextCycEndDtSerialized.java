package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Billku00NextCycEndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Billku00NextCycEndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Billku00NextCycEndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BILLKU_00_NEXT_CYC_END_DT_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBillku00NextCycEndDtMm;
            protected  int beginBillku00NextCycEndDtDd;
            protected  int beginBillku00NextCycEndDtYyyy;
            protected  int beginBillku00Number;
            protected  int beginBillku00Pointer;
            protected  int beginBillku00Number1;
	
	/**
	* Constructor for Billku00NextCycEndDtSerialized
	**/
    public Billku00NextCycEndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Billku00NextCycEndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Billku00NextCycEndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Billku00NextCycEndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Billku00NextCycEndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Billku00NextCycEndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BILLKU_00_NEXT_CYC_END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBillku00NextCycEndDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginBillku00NextCycEndDtDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginBillku00NextCycEndDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
             beginBillku00Number = getStartOffset() + 10;	// set offset for serialization
  
             beginBillku00Pointer = getStartOffset() + 14;	// set offset for serialization
  
             beginBillku00Number1 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBillku00NextCycEndDtMmCounter = -1;
     public boolean isBillku00NextCycEndDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00NextCycEndDtMmCounter != sharedCounter;
         localBillku00NextCycEndDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of billku00NextCycEndDtMm
	 *	@return billku00NextCycEndDtMm
	 */
	public char[]  getBillku00NextCycEndDtMmString() {
	     return getCharArray(beginBillku00NextCycEndDtMm,BILLKU_00_NEXT_CYC_END_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean billku00NextCycEndDtMmIsNumeric() {
	    return isNumeric(beginBillku00NextCycEndDtMm
	                    ,beginBillku00NextCycEndDtMm + BILLKU_00_NEXT_CYC_END_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BILLKU_00_NEXT_CYC_END_DT_MM_LEN = 2;
  	/**
	 * serializeBillku00NextCycEndDtMm
	 */
	protected void serializeBillku00NextCycEndDtMm(int billku00NextCycEndDtMm) {
		 putNumber(beginBillku00NextCycEndDtMm,billku00NextCycEndDtMm,BILLKU_00_NEXT_CYC_END_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBillku00NextCycEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBillku00NextCycEndDtMm
	 */
   	protected  int serializeBillku00NextCycEndDtMm(char[] value) {
	    int  billku00NextCycEndDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    billku00NextCycEndDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginBillku00NextCycEndDtMm
		       ,2
		      );
		 localBillku00NextCycEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  billku00NextCycEndDtMm;
    }

   protected int checkBillku00NextCycEndDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBillku00NextCycEndDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillku00NextCycEndDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBillku00NextCycEndDtMm
			                 ,BILLKU_00_NEXT_CYC_END_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("billku00NextCycEndDtMm", beginBillku00NextCycEndDtMm,BILLKU_00_NEXT_CYC_END_DT_MM_LEN);
    }
   	}
     int localBillku00NextCycEndDtDdCounter = -1;
     public boolean isBillku00NextCycEndDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00NextCycEndDtDdCounter != sharedCounter;
         localBillku00NextCycEndDtDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of billku00NextCycEndDtDd
	 *	@return billku00NextCycEndDtDd
	 */
	public char[]  getBillku00NextCycEndDtDdString() {
	     return getCharArray(beginBillku00NextCycEndDtDd,BILLKU_00_NEXT_CYC_END_DT_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean billku00NextCycEndDtDdIsNumeric() {
	    return isNumeric(beginBillku00NextCycEndDtDd
	                    ,beginBillku00NextCycEndDtDd + BILLKU_00_NEXT_CYC_END_DT_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BILLKU_00_NEXT_CYC_END_DT_DD_LEN = 2;
  	/**
	 * serializeBillku00NextCycEndDtDd
	 */
	protected void serializeBillku00NextCycEndDtDd(int billku00NextCycEndDtDd) {
		 putNumber(beginBillku00NextCycEndDtDd,billku00NextCycEndDtDd,BILLKU_00_NEXT_CYC_END_DT_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBillku00NextCycEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBillku00NextCycEndDtDd
	 */
   	protected  int serializeBillku00NextCycEndDtDd(char[] value) {
	    int  billku00NextCycEndDtDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    billku00NextCycEndDtDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginBillku00NextCycEndDtDd
		       ,2
		      );
		 localBillku00NextCycEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  billku00NextCycEndDtDd;
    }

   protected int checkBillku00NextCycEndDtDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBillku00NextCycEndDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillku00NextCycEndDtDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBillku00NextCycEndDtDd
			                 ,BILLKU_00_NEXT_CYC_END_DT_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("billku00NextCycEndDtDd", beginBillku00NextCycEndDtDd,BILLKU_00_NEXT_CYC_END_DT_DD_LEN);
    }
   	}
     int localBillku00NextCycEndDtYyyyCounter = -1;
     public boolean isBillku00NextCycEndDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00NextCycEndDtYyyyCounter != sharedCounter;
         localBillku00NextCycEndDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of billku00NextCycEndDtYyyy
	 *	@return billku00NextCycEndDtYyyy
	 */
	public char[]  getBillku00NextCycEndDtYyyyString() {
	     return getCharArray(beginBillku00NextCycEndDtYyyy,BILLKU_00_NEXT_CYC_END_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean billku00NextCycEndDtYyyyIsNumeric() {
	    return isNumeric(beginBillku00NextCycEndDtYyyy
	                    ,beginBillku00NextCycEndDtYyyy + BILLKU_00_NEXT_CYC_END_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BILLKU_00_NEXT_CYC_END_DT_YYYY_LEN = 4;
  	/**
	 * serializeBillku00NextCycEndDtYyyy
	 */
	protected void serializeBillku00NextCycEndDtYyyy(int billku00NextCycEndDtYyyy) {
		 putNumber(beginBillku00NextCycEndDtYyyy,billku00NextCycEndDtYyyy,BILLKU_00_NEXT_CYC_END_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBillku00NextCycEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBillku00NextCycEndDtYyyy
	 */
   	protected  int serializeBillku00NextCycEndDtYyyy(char[] value) {
	    int  billku00NextCycEndDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    billku00NextCycEndDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBillku00NextCycEndDtYyyy
		       ,4
		      );
		 localBillku00NextCycEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  billku00NextCycEndDtYyyy;
    }

   protected int checkBillku00NextCycEndDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBillku00NextCycEndDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillku00NextCycEndDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBillku00NextCycEndDtYyyy
			                 ,BILLKU_00_NEXT_CYC_END_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("billku00NextCycEndDtYyyy", beginBillku00NextCycEndDtYyyy,BILLKU_00_NEXT_CYC_END_DT_YYYY_LEN);
    }
   	}
     int localBillku00NumberCounter = -1;
     public boolean isBillku00NumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00NumberCounter != sharedCounter;
         localBillku00NumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of billku00Number
	 *	@return billku00Number
	 */
	public char[]  getBillku00NumberString() {
	     return getCharArray(beginBillku00Number,BILLKU_00_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean billku00NumberIsNumeric() {
	    return isNumeric(beginBillku00Number
	                    ,beginBillku00Number + BILLKU_00_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BILLKU_00_NUMBER_LEN = 4;
  	/**
	 * serializeBillku00Number
	 */
	protected void serializeBillku00Number(int billku00Number) {
		 putNumber(beginBillku00Number,billku00Number,BILLKU_00_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBillku00NumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBillku00Number
	 */
   	protected  int serializeBillku00Number(char[] value) {
	    int  billku00Number;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    billku00Number = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBillku00Number
		       ,4
		      );
		 localBillku00NumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  billku00Number;
    }

   protected int checkBillku00NumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBillku00Number is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillku00Number() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBillku00Number
			                 ,BILLKU_00_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("billku00Number", beginBillku00Number,BILLKU_00_NUMBER_LEN);
    }
   	}
     int localBillku00PointerCounter = -1;
     public boolean isBillku00PointerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00PointerCounter != sharedCounter;
         localBillku00PointerCounter = sharedCounter; return hasModified; 
     }
   protected static final int BILLKU_00_POINTER_LEN = 4;
  	/**
	 * serializeBillku00Pointer
	 */
	protected void serializeBillku00Pointer(int billku00Pointer) {
           replaceValue( //  save the value as string
                   getBinaryString( billku00Pointer,BILLKU_00_POINTER_LEN)
                  ,beginBillku00Pointer
                  ,BILLKU_00_POINTER_LEN
                 );
            localBillku00PointerCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBillku00PointerMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBillku00Pointer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillku00Pointer() {	 
			return (getInt(beginBillku00Pointer));
   	}
     int localBillku00Number1Counter = -1;
     public boolean isBillku00Number1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00Number1Counter != sharedCounter;
         localBillku00Number1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of billku00Number1
	 *	@return billku00Number1
	 */
	public char[]  getBillku00Number1String() {
	     return getCharArray(beginBillku00Number1,BILLKU_00_NUMBER_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean billku00Number1IsNumeric() {
	    return isNumeric(beginBillku00Number1
	                    ,beginBillku00Number1 + BILLKU_00_NUMBER_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BILLKU_00_NUMBER_1_LEN = 4;
  	/**
	 * serializeBillku00Number1
	 */
	protected void serializeBillku00Number1(int billku00Number1) {
		 putNumber(beginBillku00Number1,billku00Number1,BILLKU_00_NUMBER_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBillku00Number1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBillku00Number1
	 */
   	protected  int serializeBillku00Number1(char[] value) {
	    int  billku00Number1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    billku00Number1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBillku00Number1
		       ,4
		      );
		 localBillku00Number1Counter = shareString.getSerializedField().getModifiedCounter();
		return  billku00Number1;
    }

   protected int checkBillku00Number1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBillku00Number1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillku00Number1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBillku00Number1
			                 ,BILLKU_00_NUMBER_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("billku00Number1", beginBillku00Number1,BILLKU_00_NUMBER_1_LEN);
    }
   	}




}
  
