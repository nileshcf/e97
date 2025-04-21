package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01DescSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01DescSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01DescSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_DESC_SEG_DATA_LENGTH = 299;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01DescSegSqlcd;
            protected  int beginMsdSecurityDesc2;
            protected  int beginMsdSecurityDesc3;
            protected  int beginMsdBondDesc3;
            protected  int beginMsdStkDesc3;
           protected int beginBdms01CallParametersArray1;
           protected static final int BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE = 5;
	
	/**
	* Constructor for Bdms01DescSegDataSerialized
	**/
    public Bdms01DescSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01DescSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01DescSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01DescSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,982); // serialize this field at offset 982 by default 
    }
    
	/**
	* sets parent for this Bdms01DescSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 982 by default
    }    
	/**
	* initializes the field in Bdms01DescSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_DESC_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01DescSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSecurityDesc2 = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdSecurityDesc3 = getStartOffset() + 34;	// set offset for serialization
  
             beginMsdBondDesc3 = getStartOffset() + 34;	// set offset for serialization
  
             beginMsdStkDesc3 = getStartOffset() + 34;	// set offset for serialization
  
	        beginBdms01CallParametersArray1 = getStartOffset() + 64; // set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01DescSegSqlcdCounter = -1;
     public boolean isBdms01DescSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DescSegSqlcdCounter != sharedCounter;
         localBdms01DescSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01DescSegSqlcd
	 *	@return bdms01DescSegSqlcd
	 */
	public char[]  getBdms01DescSegSqlcdString() {
	     return getCharArray(beginBdms01DescSegSqlcd,BDMS_01_DESC_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01DescSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01DescSegSqlcd
	                    ,beginBdms01DescSegSqlcd + BDMS_01_DESC_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_DESC_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01DescSegSqlcd
	 */
	protected void serializeBdms01DescSegSqlcd(int bdms01DescSegSqlcd) {
		 putNumber(beginBdms01DescSegSqlcd,bdms01DescSegSqlcd,BDMS_01_DESC_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01DescSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01DescSegSqlcd
	 */
   	protected  int serializeBdms01DescSegSqlcd(char[] value) {
	    int  bdms01DescSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01DescSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01DescSegSqlcd
		       ,4
		      );
		 localBdms01DescSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01DescSegSqlcd;
    }

   protected int checkBdms01DescSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01DescSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01DescSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01DescSegSqlcd
			                 ,BDMS_01_DESC_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01DescSegSqlcd", beginBdms01DescSegSqlcd,BDMS_01_DESC_SEG_SQLCD_LEN);
    }
   	}
     int localMsdSecurityDesc2Counter = -1;
     public boolean isMsdSecurityDesc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityDesc2Counter != sharedCounter;
         localMsdSecurityDesc2Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_DESC_2_LEN = 30;
	/**
	 * 	serialize this MsdSecurityDesc2
	 */
   protected void serializeMsdSecurityDesc2(char[] msdSecurityDesc2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecurityDesc2,0,getStringValue(),beginMsdSecurityDesc2,MSD_SECURITY_DESC_2_LEN);
       localMsdSecurityDesc2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecurityDesc2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshMsdSecurityDesc2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecurityDesc2() {	 
   		return (substring(getStringValue(),beginMsdSecurityDesc2,beginMsdSecurityDesc2 + MSD_SECURITY_DESC_2_LEN));
   	}
     int localMsdSecurityDesc3Counter = -1;
     public boolean isMsdSecurityDesc3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityDesc3Counter != sharedCounter;
         localMsdSecurityDesc3Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_DESC_3_LEN = 30;
	/**
	 * 	serialize this MsdSecurityDesc3
	 */
   protected void serializeMsdSecurityDesc3(char[] msdSecurityDesc3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecurityDesc3,0,getStringValue(),beginMsdSecurityDesc3,MSD_SECURITY_DESC_3_LEN);
       localMsdSecurityDesc3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecurityDesc3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshMsdSecurityDesc3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecurityDesc3() {	 
   		return (substring(getStringValue(),beginMsdSecurityDesc3,beginMsdSecurityDesc3 + MSD_SECURITY_DESC_3_LEN));
   	}
     int localMsdBondDesc3Counter = -1;
     public boolean isMsdBondDesc3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondDesc3Counter != sharedCounter;
         localMsdBondDesc3Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BOND_DESC_3_LEN = 30;
	/**
	 * 	serialize this MsdBondDesc3
	 */
   protected void serializeMsdBondDesc3(char[] msdBondDesc3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBondDesc3,0,getStringValue(),beginMsdBondDesc3,MSD_BOND_DESC_3_LEN);
       localMsdBondDesc3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBondDesc3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshMsdBondDesc3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBondDesc3() {	 
   		return (substring(getStringValue(),beginMsdBondDesc3,beginMsdBondDesc3 + MSD_BOND_DESC_3_LEN));
   	}
     int localMsdStkDesc3Counter = -1;
     public boolean isMsdStkDesc3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStkDesc3Counter != sharedCounter;
         localMsdStkDesc3Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_STK_DESC_3_LEN = 30;
	/**
	 * 	serialize this MsdStkDesc3
	 */
   protected void serializeMsdStkDesc3(char[] msdStkDesc3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdStkDesc3,0,getStringValue(),beginMsdStkDesc3,MSD_STK_DESC_3_LEN);
       localMsdStkDesc3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdStkDesc3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshMsdStkDesc3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdStkDesc3() {	 
   		return (substring(getStringValue(),beginMsdStkDesc3,beginMsdStkDesc3 + MSD_STK_DESC_3_LEN));
   	}

		public int bdms01CallParametersArray1Size() {
			return BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;
		}



}
  
