package com.cloudframe.app.mdsnum.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginImpDec;
            protected  int beginImpAmt;
            protected  int beginImpAmte;
            protected  int beginImpAmtT4;
	
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
             beginImpDec = getStartOffset() + 0;	// set offset for serialization
  
             beginImpAmt = getStartOffset() + 1;	// set offset for serialization
  
             beginImpAmte = getStartOffset() + 19;	// set offset for serialization
  
             beginImpAmtT4 = getStartOffset() + 37;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localImpDecCounter = -1;
     public boolean isImpDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpDecCounter != sharedCounter;
         localImpDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impDec
	 *	@return impDec
	 */
	public char[]  getImpDecString() {
	     return getCharArray(beginImpDec,IMP_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impDecIsNumeric() {
	    return isNumeric(beginImpDec
	                    ,beginImpDec + IMP_DEC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_DEC_LEN = 1;
  	/**
	 * serializeImpDec
	 */
	protected void serializeImpDec(int impDec) {
		 putNumber(beginImpDec,impDec,IMP_DEC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpDec
	 */
   	protected  int serializeImpDec(char[] value) {
	    int  impDec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impDec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginImpDec
		       ,1
		      );
		 localImpDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  impDec;
    }

   protected int checkImpDecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshImpDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshImpDec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginImpDec
			                 ,IMP_DEC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impDec", beginImpDec,IMP_DEC_LEN);
    }
   	}
     int localImpAmtCounter = -1;
     public boolean isImpAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmtCounter != sharedCounter;
         localImpAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmt
	 *	@return impAmt
	 */
	public char[]  getImpAmtString() {
	     return getCharArray(beginImpAmt,IMP_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtIsNumeric() {
	    return isNumeric(beginImpAmt
	                    ,beginImpAmt + IMP_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMT_LEN = 18;
  	/**
	 * serializeImpAmt
	 */
	protected void serializeImpAmt(long impAmt) {
		 putNumber(beginImpAmt,impAmt,IMP_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmt
	 */
   	protected  long serializeImpAmt(char[] value) {
	    long  impAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginImpAmt
		       ,18
		      );
		 localImpAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  impAmt;
    }

   protected long checkImpAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmt
			                 ,IMP_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmt", beginImpAmt,IMP_AMT_LEN);
    }
   	}
     int localImpAmteCounter = -1;
     public boolean isImpAmteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmteCounter != sharedCounter;
         localImpAmteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmte
	 *	@return impAmte
	 */
	public char[]  getImpAmteString() {
	     return getCharArray(beginImpAmte,IMP_AMTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmteIsNumeric() {
	    return isNumeric(beginImpAmte
	                    ,beginImpAmte + IMP_AMTE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMTE_LEN = 18;
  	/**
	 * serializeImpAmte
	 */
	protected void serializeImpAmte(long impAmte) {
		 putNumber(beginImpAmte,impAmte,IMP_AMTE_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmte
	 */
   	protected  long serializeImpAmte(char[] value) {
	    long  impAmte;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmte = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginImpAmte
		       ,18
		      );
		 localImpAmteCounter = shareString.getSerializedField().getModifiedCounter();
		return  impAmte;
    }

   protected long checkImpAmteMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmte() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmte
			                 ,IMP_AMTE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmte", beginImpAmte,IMP_AMTE_LEN);
    }
   	}
     int localImpAmtT4Counter = -1;
     public boolean isImpAmtT4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmtT4Counter != sharedCounter;
         localImpAmtT4Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmtT4
	 *	@return impAmtT4
	 */
	public char[]  getImpAmtT4String() {
	     return getCharArray(beginImpAmtT4,IMP_AMT_T_4_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtT4IsNumeric() {
	    return isNumeric(beginImpAmtT4
	                    ,beginImpAmtT4 + IMP_AMT_T_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMT_T_4_LEN = 24;
  	/**
	 * serializeImpAmtT4
	 */
	protected void serializeImpAmtT4(long impAmtT4) {
		 putNumber(beginImpAmtT4,impAmtT4,IMP_AMT_T_4_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmtT4Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmtT4
	 */
   	protected  long serializeImpAmtT4(char[] value) {
	    long  impAmtT4;
	    if(value.length >0 && value.length!= 24)
            value = new String(value).trim().toCharArray();
	    if (value.length < 24) value = pad(24, value, ' ', LEFT_PAD);
	    else if (value.length > 24) value = substring(value,0,24);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmtT4 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(24,value,true/*isSigned?*/)
		       ,beginImpAmtT4
		       ,24
		      );
		 localImpAmtT4Counter = shareString.getSerializedField().getModifiedCounter();
		return  impAmtT4;
    }

   protected long checkImpAmtT4MaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmtT4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmtT4() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmtT4
			                 ,IMP_AMT_T_4_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmtT4", beginImpAmtT4,IMP_AMT_T_4_LEN);
    }
   	}




}
  
