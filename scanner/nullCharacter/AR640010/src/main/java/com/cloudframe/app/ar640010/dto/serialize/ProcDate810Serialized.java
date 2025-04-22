package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ProcDate810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProcDate810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProcDate810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROC_DATE_810_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProcYear810;
            protected  int beginProcDlm1810;
            protected  int beginProcMonth810;
            protected  int beginProcDlm2810;
            protected  int beginProcDay810;
	
	/**
	* Constructor for ProcDate810Serialized
	**/
    public ProcDate810Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProcDate810Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProcDate810Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProcDate810Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,190); // serialize this field at offset 190 by default 
    }
    
	/**
	* sets parent for this ProcDate810Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 190 by default
    }    
	/**
	* initializes the field in ProcDate810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROC_DATE_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginProcYear810 = getStartOffset() + 0;	// set offset for serialization
  
             beginProcDlm1810 = getStartOffset() + 4;	// set offset for serialization
  
             beginProcMonth810 = getStartOffset() + 5;	// set offset for serialization
  
             beginProcDlm2810 = getStartOffset() + 7;	// set offset for serialization
  
             beginProcDay810 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localProcYear810Counter = -1;
     public boolean isProcYear810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcYear810Counter != sharedCounter;
         localProcYear810Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of procYear810
	 *	@return procYear810
	 */
	public char[]  getProcYear810String() {
	     return getCharArray(beginProcYear810,PROC_YEAR_810_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean procYear810IsNumeric() {
	    return isNumeric(beginProcYear810
	                    ,beginProcYear810 + PROC_YEAR_810_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROC_YEAR_810_LEN = 4;
  	/**
	 * serializeProcYear810
	 */
	protected void serializeProcYear810(int procYear810) {
		 putNumber(beginProcYear810,procYear810,PROC_YEAR_810_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcYear810Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcYear810
	 */
   	protected  int serializeProcYear810(char[] value) {
	    int  procYear810;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    procYear810 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginProcYear810
		       ,4
		      );
		 localProcYear810Counter = shareString.getSerializedField().getModifiedCounter();
		return  procYear810;
    }

   protected int checkProcYear810MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcYear810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshProcYear810() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginProcYear810
			                 ,PROC_YEAR_810_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("procYear810", beginProcYear810,PROC_YEAR_810_LEN);
    }
   	}
     int localProcDlm1810Counter = -1;
     public boolean isProcDlm1810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDlm1810Counter != sharedCounter;
         localProcDlm1810Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DLM_1810_LEN = 1;
	/**
	 * 	serialize this ProcDlm1810
	 */
   protected void serializeProcDlm1810(char[] procDlm1810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDlm1810,0,getStringValue(),beginProcDlm1810,PROC_DLM_1810_LEN);
       localProcDlm1810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDlm1810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshProcDlm1810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDlm1810() {	 
   		return (substring(getStringValue(),beginProcDlm1810,beginProcDlm1810 + PROC_DLM_1810_LEN));
   	}
     int localProcMonth810Counter = -1;
     public boolean isProcMonth810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcMonth810Counter != sharedCounter;
         localProcMonth810Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of procMonth810
	 *	@return procMonth810
	 */
	public char[]  getProcMonth810String() {
	     return getCharArray(beginProcMonth810,PROC_MONTH_810_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean procMonth810IsNumeric() {
	    return isNumeric(beginProcMonth810
	                    ,beginProcMonth810 + PROC_MONTH_810_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROC_MONTH_810_LEN = 2;
  	/**
	 * serializeProcMonth810
	 */
	protected void serializeProcMonth810(int procMonth810) {
		 putNumber(beginProcMonth810,procMonth810,PROC_MONTH_810_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcMonth810Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcMonth810
	 */
   	protected  int serializeProcMonth810(char[] value) {
	    int  procMonth810;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    procMonth810 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginProcMonth810
		       ,2
		      );
		 localProcMonth810Counter = shareString.getSerializedField().getModifiedCounter();
		return  procMonth810;
    }

   protected int checkProcMonth810MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcMonth810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshProcMonth810() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginProcMonth810
			                 ,PROC_MONTH_810_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("procMonth810", beginProcMonth810,PROC_MONTH_810_LEN);
    }
   	}
     int localProcDlm2810Counter = -1;
     public boolean isProcDlm2810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDlm2810Counter != sharedCounter;
         localProcDlm2810Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DLM_2810_LEN = 1;
	/**
	 * 	serialize this ProcDlm2810
	 */
   protected void serializeProcDlm2810(char[] procDlm2810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDlm2810,0,getStringValue(),beginProcDlm2810,PROC_DLM_2810_LEN);
       localProcDlm2810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDlm2810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshProcDlm2810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDlm2810() {	 
   		return (substring(getStringValue(),beginProcDlm2810,beginProcDlm2810 + PROC_DLM_2810_LEN));
   	}
     int localProcDay810Counter = -1;
     public boolean isProcDay810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDay810Counter != sharedCounter;
         localProcDay810Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of procDay810
	 *	@return procDay810
	 */
	public char[]  getProcDay810String() {
	     return getCharArray(beginProcDay810,PROC_DAY_810_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean procDay810IsNumeric() {
	    return isNumeric(beginProcDay810
	                    ,beginProcDay810 + PROC_DAY_810_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROC_DAY_810_LEN = 2;
  	/**
	 * serializeProcDay810
	 */
	protected void serializeProcDay810(int procDay810) {
		 putNumber(beginProcDay810,procDay810,PROC_DAY_810_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcDay810Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcDay810
	 */
   	protected  int serializeProcDay810(char[] value) {
	    int  procDay810;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    procDay810 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginProcDay810
		       ,2
		      );
		 localProcDay810Counter = shareString.getSerializedField().getModifiedCounter();
		return  procDay810;
    }

   protected int checkProcDay810MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcDay810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshProcDay810() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginProcDay810
			                 ,PROC_DAY_810_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("procDay810", beginProcDay810,PROC_DAY_810_LEN);
    }
   	}




}
  
