package com.cloudframe.app.cobpgmor.dto.serialize;

/**
*  The class HvErecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class HvErecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvErecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_EREC_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvEno;
            protected  int beginHvEname;
            protected  int beginHvEadd;
            protected  int beginHvEsal;
            protected  int beginHvEdoj;
	
	/**
	* Constructor for HvErecSerialized
	**/
    public HvErecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvErecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_EREC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvEno = getStartOffset() + 0;	// set offset for serialization
  
             beginHvEname = getStartOffset() + 2;	// set offset for serialization
  
             beginHvEadd = getStartOffset() + 17;	// set offset for serialization
  
             beginHvEsal = getStartOffset() + 37;	// set offset for serialization
  
             beginHvEdoj = getStartOffset() + 42;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localHvEnoCounter = -1;
         public boolean isHvEnoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvEnoCounter != sharedCounter;
            localHvEnoCounter = sharedCounter; return hasModified; 
         }
   protected static final int HV_ENO_LEN = 2;
  	/**
	 * serializeHvEno
	 */
	protected void serializeHvEno(short hvEno) {
           replaceValue( //  save the value as string
                   getBinaryString( hvEno,HV_ENO_LEN)
                  ,beginHvEno
                  ,HV_ENO_LEN
                 );
            localHvEnoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvEnoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvEno is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvEno() {	 
			return (getShort(beginHvEno));
   	}
     int localHvEnameCounter = -1;
     public boolean isHvEnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEnameCounter != sharedCounter;
         localHvEnameCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_ENAME_LEN = 15;
	/**
	 * 	serialize this HvEname
	 */
   protected void serializeHvEname(char[] hvEname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvEname,0,getStringValue(),beginHvEname,HV_ENAME_LEN);
       localHvEnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvEnameConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshHvEname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvEname() {	 
   		return (substring(getStringValue(),beginHvEname,beginHvEname + HV_ENAME_LEN));
   	}
     int localHvEaddCounter = -1;
     public boolean isHvEaddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEaddCounter != sharedCounter;
         localHvEaddCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_EADD_LEN = 20;
	/**
	 * 	serialize this HvEadd
	 */
   protected void serializeHvEadd(char[] hvEadd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvEadd,0,getStringValue(),beginHvEadd,HV_EADD_LEN);
       localHvEaddCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvEaddConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshHvEadd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvEadd() {	 
   		return (substring(getStringValue(),beginHvEadd,beginHvEadd + HV_EADD_LEN));
   	}
        int localHvEsalCounter = -1;
        public boolean isHvEsalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localHvEsalCounter != sharedCounter;
           localHvEsalCounter = sharedCounter; return hasModified; 
        }
	    public boolean hvEsalIsNumeric() {
	      return decimalIsNumeric(beginHvEsal,HV_ESAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] hvEsalString() {
            return getPackedString(beginHvEsal,HV_ESAL_LEN);
         }
   protected static final int HV_ESAL_LEN = 5;
   protected static final int HV_ESAL_SCALE = 2;
  	/**
	 * 	serializeHvEsal
	 */
	protected void serializeHvEsal(BigDecimal hvEsal) {
		   putDecimal(beginHvEsal,hvEsal,HV_ESAL_LEN,HV_ESAL_SCALE,true);
		 localHvEsalCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkHvEsalMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshHvEsal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshHvEsal() throws CFException {	
   	try { 
		 return (getDecimal(beginHvEsal,HV_ESAL_LEN,HV_ESAL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("hvEsal", beginHvEsal,HV_ESAL_LEN);
     }
   	}
     int localHvEdojCounter = -1;
     public boolean isHvEdojModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEdojCounter != sharedCounter;
         localHvEdojCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_EDOJ_LEN = 10;
	/**
	 * 	serialize this HvEdoj
	 */
   protected void serializeHvEdoj(char[] hvEdoj) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvEdoj,0,getStringValue(),beginHvEdoj,HV_EDOJ_LEN);
       localHvEdojCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvEdojConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvEdoj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvEdoj() {	 
   		return (substring(getStringValue(),beginHvEdoj,beginHvEdoj + HV_EDOJ_LEN));
   	}




}
  
