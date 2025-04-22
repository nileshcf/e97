package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01CanadaBondSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01CanadaBondSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01CanadaBondSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_CANADA_BOND_SEG_DATA_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01CanBondSegSqlcd;
            protected  int beginBdms01ClsBooksBondDt;
            protected  int beginBdms01OfferingBondDt;
            protected  int beginBdms01ParFctrPct;
            protected  int beginBdms01PayMadeNbr;
	
	/**
	* Constructor for Bdms01CanadaBondSegDataSerialized
	**/
    public Bdms01CanadaBondSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01CanadaBondSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CanadaBondSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01CanadaBondSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5233); // serialize this field at offset 5233 by default 
    }
    
	/**
	* sets parent for this Bdms01CanadaBondSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5233 by default
    }    
	/**
	* initializes the field in Bdms01CanadaBondSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_CANADA_BOND_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01CanBondSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01ClsBooksBondDt = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01OfferingBondDt = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01ParFctrPct = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01PayMadeNbr = getStartOffset() + 42;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01CanBondSegSqlcdCounter = -1;
     public boolean isBdms01CanBondSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CanBondSegSqlcdCounter != sharedCounter;
         localBdms01CanBondSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01CanBondSegSqlcd
	 *	@return bdms01CanBondSegSqlcd
	 */
	public char[]  getBdms01CanBondSegSqlcdString() {
	     return getCharArray(beginBdms01CanBondSegSqlcd,BDMS_01_CAN_BOND_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CanBondSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01CanBondSegSqlcd
	                    ,beginBdms01CanBondSegSqlcd + BDMS_01_CAN_BOND_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_CAN_BOND_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01CanBondSegSqlcd
	 */
	protected void serializeBdms01CanBondSegSqlcd(int bdms01CanBondSegSqlcd) {
		 putNumber(beginBdms01CanBondSegSqlcd,bdms01CanBondSegSqlcd,BDMS_01_CAN_BOND_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CanBondSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01CanBondSegSqlcd
	 */
   	protected  int serializeBdms01CanBondSegSqlcd(char[] value) {
	    int  bdms01CanBondSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01CanBondSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01CanBondSegSqlcd
		       ,4
		      );
		 localBdms01CanBondSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01CanBondSegSqlcd;
    }

   protected int checkBdms01CanBondSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01CanBondSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01CanBondSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01CanBondSegSqlcd
			                 ,BDMS_01_CAN_BOND_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CanBondSegSqlcd", beginBdms01CanBondSegSqlcd,BDMS_01_CAN_BOND_SEG_SQLCD_LEN);
    }
   	}
     int localBdms01ClsBooksBondDtCounter = -1;
     public boolean isBdms01ClsBooksBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ClsBooksBondDtCounter != sharedCounter;
         localBdms01ClsBooksBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CLS_BOOKS_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01ClsBooksBondDt
	 */
   protected void serializeBdms01ClsBooksBondDt(char[] bdms01ClsBooksBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ClsBooksBondDt,0,getStringValue(),beginBdms01ClsBooksBondDt,BDMS_01_CLS_BOOKS_BOND_DT_LEN);
       localBdms01ClsBooksBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ClsBooksBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01ClsBooksBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ClsBooksBondDt() {	 
   		return (substring(getStringValue(),beginBdms01ClsBooksBondDt,beginBdms01ClsBooksBondDt + BDMS_01_CLS_BOOKS_BOND_DT_LEN));
   	}
     int localBdms01OfferingBondDtCounter = -1;
     public boolean isBdms01OfferingBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OfferingBondDtCounter != sharedCounter;
         localBdms01OfferingBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OFFERING_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01OfferingBondDt
	 */
   protected void serializeBdms01OfferingBondDt(char[] bdms01OfferingBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OfferingBondDt,0,getStringValue(),beginBdms01OfferingBondDt,BDMS_01_OFFERING_BOND_DT_LEN);
       localBdms01OfferingBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OfferingBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01OfferingBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OfferingBondDt() {	 
   		return (substring(getStringValue(),beginBdms01OfferingBondDt,beginBdms01OfferingBondDt + BDMS_01_OFFERING_BOND_DT_LEN));
   	}
     int localBdms01ParFctrPctCounter = -1;
     
     public boolean isBdms01ParFctrPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ParFctrPctCounter != sharedCounter;
         localBdms01ParFctrPctCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01ParFctrPct
	 *	@return bdms01ParFctrPct
	 */
	public char[]  getBdms01ParFctrPctString() {
	    return getCharArray(beginBdms01ParFctrPct,BDMS_01_PAR_FCTR_PCT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01ParFctrPctIsNumeric() {
		    return isNumeric(beginBdms01ParFctrPct
	                    ,beginBdms01ParFctrPct + BDMS_01_PAR_FCTR_PCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_PAR_FCTR_PCT_LEN = 18;
  protected  static final int BDMS_01_PAR_FCTR_PCT_SCALE = 8;

   protected BigDecimal checkBdms01ParFctrPctMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01ParFctrPct
	 */
	protected void serializeBdms01ParFctrPct(BigDecimal bdms01ParFctrPct) {
	       putNumber(beginBdms01ParFctrPct,bdms01ParFctrPct,BDMS_01_PAR_FCTR_PCT_LEN,BDMS_01_PAR_FCTR_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01ParFctrPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01ParFctrPct
	 */
   	protected  BigDecimal serializeBdms01ParFctrPct(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01ParFctrPct
		       ,18
		      );		 localBdms01ParFctrPctCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_PAR_FCTR_PCT_LEN,BDMS_01_PAR_FCTR_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01ParFctrPct", beginBdms01ParFctrPct,BDMS_01_PAR_FCTR_PCT_LEN);
    	}
    }
    /**
	 *	refreshBdms01ParFctrPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01ParFctrPct() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01ParFctrPct
			            ,BDMS_01_PAR_FCTR_PCT_LEN
			            ,BDMS_01_PAR_FCTR_PCT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01ParFctrPct", beginBdms01ParFctrPct,BDMS_01_PAR_FCTR_PCT_LEN);
    }
   	}
     int localBdms01PayMadeNbrCounter = -1;
     public boolean isBdms01PayMadeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PayMadeNbrCounter != sharedCounter;
         localBdms01PayMadeNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01PayMadeNbr
	 *	@return bdms01PayMadeNbr
	 */
	public char[]  getBdms01PayMadeNbrString() {
	     return getCharArray(beginBdms01PayMadeNbr,BDMS_01_PAY_MADE_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01PayMadeNbrIsNumeric() {
	    return isNumeric(beginBdms01PayMadeNbr
	                    ,beginBdms01PayMadeNbr + BDMS_01_PAY_MADE_NBR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_PAY_MADE_NBR_LEN = 2;
  	/**
	 * serializeBdms01PayMadeNbr
	 */
	protected void serializeBdms01PayMadeNbr(short bdms01PayMadeNbr) {
		 putNumber(beginBdms01PayMadeNbr,bdms01PayMadeNbr,BDMS_01_PAY_MADE_NBR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01PayMadeNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01PayMadeNbr
	 */
   	protected  short serializeBdms01PayMadeNbr(char[] value) {
	    short  bdms01PayMadeNbr;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01PayMadeNbr = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,true/*isSigned?*/)
		       ,beginBdms01PayMadeNbr
		       ,2
		      );
		 localBdms01PayMadeNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01PayMadeNbr;
    }

   protected short checkBdms01PayMadeNbrMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_100/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshBdms01PayMadeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBdms01PayMadeNbr() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginBdms01PayMadeNbr
			                 ,BDMS_01_PAY_MADE_NBR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01PayMadeNbr", beginBdms01PayMadeNbr,BDMS_01_PAY_MADE_NBR_LEN);
    }
   	}




}
  
