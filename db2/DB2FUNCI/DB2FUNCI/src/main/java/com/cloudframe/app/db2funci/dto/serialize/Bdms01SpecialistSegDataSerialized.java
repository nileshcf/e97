package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01SpecialistSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01SpecialistSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01SpecialistSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_SPECIALIST_SEG_DATA_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SpecialistSegSqlcd;
            protected  int beginMsdSpecAcctBbbaaaaat;
            protected  int beginMsdSpecAcctCkdg;
            protected  int beginBdms01SpecExchangeCd;
            protected  int beginBdms01SpecClientNbr;
	
	/**
	* Constructor for Bdms01SpecialistSegDataSerialized
	**/
    public Bdms01SpecialistSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01SpecialistSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SpecialistSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01SpecialistSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1281); // serialize this field at offset 1281 by default 
    }
    
	/**
	* sets parent for this Bdms01SpecialistSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1281 by default
    }    
	/**
	* initializes the field in Bdms01SpecialistSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_SPECIALIST_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01SpecialistSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSpecAcctBbbaaaaat = getStartOffset() + 4;	// set offset for serialization
  
  
             beginMsdSpecAcctCkdg = getStartOffset() + 13;	// set offset for serialization
  
             beginBdms01SpecExchangeCd = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01SpecClientNbr = getStartOffset() + 24;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01SpecialistSegSqlcdCounter = -1;
     public boolean isBdms01SpecialistSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SpecialistSegSqlcdCounter != sharedCounter;
         localBdms01SpecialistSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01SpecialistSegSqlcd
	 *	@return bdms01SpecialistSegSqlcd
	 */
	public char[]  getBdms01SpecialistSegSqlcdString() {
	     return getCharArray(beginBdms01SpecialistSegSqlcd,BDMS_01_SPECIALIST_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01SpecialistSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01SpecialistSegSqlcd
	                    ,beginBdms01SpecialistSegSqlcd + BDMS_01_SPECIALIST_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_SPECIALIST_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01SpecialistSegSqlcd
	 */
	protected void serializeBdms01SpecialistSegSqlcd(int bdms01SpecialistSegSqlcd) {
		 putNumber(beginBdms01SpecialistSegSqlcd,bdms01SpecialistSegSqlcd,BDMS_01_SPECIALIST_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01SpecialistSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01SpecialistSegSqlcd
	 */
   	protected  int serializeBdms01SpecialistSegSqlcd(char[] value) {
	    int  bdms01SpecialistSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01SpecialistSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01SpecialistSegSqlcd
		       ,4
		      );
		 localBdms01SpecialistSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01SpecialistSegSqlcd;
    }

   protected int checkBdms01SpecialistSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01SpecialistSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01SpecialistSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01SpecialistSegSqlcd
			                 ,BDMS_01_SPECIALIST_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01SpecialistSegSqlcd", beginBdms01SpecialistSegSqlcd,BDMS_01_SPECIALIST_SEG_SQLCD_LEN);
    }
   	}
     int localMsdSpecAcctBbbaaaaatCounter = -1;
     public boolean isMsdSpecAcctBbbaaaaatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSpecAcctBbbaaaaatCounter != sharedCounter;
         localMsdSpecAcctBbbaaaaatCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSpecAcctBbbaaaaat
	 *	@return msdSpecAcctBbbaaaaat
	 */
	public char[]  getMsdSpecAcctBbbaaaaatString() {
	     return getCharArray(beginMsdSpecAcctBbbaaaaat,MSD_SPEC_ACCT_BBBAAAAAT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSpecAcctBbbaaaaatIsNumeric() {
	    return isNumeric(beginMsdSpecAcctBbbaaaaat
	                    ,beginMsdSpecAcctBbbaaaaat + MSD_SPEC_ACCT_BBBAAAAAT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPEC_ACCT_BBBAAAAAT_LEN = 9;
  	/**
	 * serializeMsdSpecAcctBbbaaaaat
	 */
	protected void serializeMsdSpecAcctBbbaaaaat(long msdSpecAcctBbbaaaaat) {
		 putNumber(beginMsdSpecAcctBbbaaaaat,msdSpecAcctBbbaaaaat,MSD_SPEC_ACCT_BBBAAAAAT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSpecAcctBbbaaaaatCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSpecAcctBbbaaaaat
	 */
   	protected  long serializeMsdSpecAcctBbbaaaaat(char[] value) {
	    long  msdSpecAcctBbbaaaaat;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSpecAcctBbbaaaaat = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginMsdSpecAcctBbbaaaaat
		       ,9
		      );
		 localMsdSpecAcctBbbaaaaatCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSpecAcctBbbaaaaat;
    }

   protected long checkMsdSpecAcctBbbaaaaatMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSpecAcctBbbaaaaat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdSpecAcctBbbaaaaat() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdSpecAcctBbbaaaaat
			                 ,MSD_SPEC_ACCT_BBBAAAAAT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSpecAcctBbbaaaaat", beginMsdSpecAcctBbbaaaaat,MSD_SPEC_ACCT_BBBAAAAAT_LEN);
    }
   	}
     int localMsdSpecAcctCkdgCounter = -1;
     public boolean isMsdSpecAcctCkdgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSpecAcctCkdgCounter != sharedCounter;
         localMsdSpecAcctCkdgCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPEC_ACCT_CKDG_LEN = 1;
	/**
	 * 	serialize this MsdSpecAcctCkdg
	 */
   protected void serializeMsdSpecAcctCkdg(char[] msdSpecAcctCkdg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSpecAcctCkdg,0,getStringValue(),beginMsdSpecAcctCkdg,MSD_SPEC_ACCT_CKDG_LEN);
       localMsdSpecAcctCkdgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSpecAcctCkdgConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSpecAcctCkdg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSpecAcctCkdg() {	 
   		return (substring(getStringValue(),beginMsdSpecAcctCkdg,beginMsdSpecAcctCkdg + MSD_SPEC_ACCT_CKDG_LEN));
   	}
     int localBdms01SpecExchangeCdCounter = -1;
     public boolean isBdms01SpecExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SpecExchangeCdCounter != sharedCounter;
         localBdms01SpecExchangeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPEC_EXCHANGE_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01SpecExchangeCd
	 */
   protected void serializeBdms01SpecExchangeCd(char[] bdms01SpecExchangeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SpecExchangeCd,0,getStringValue(),beginBdms01SpecExchangeCd,BDMS_01_SPEC_EXCHANGE_CD_LEN);
       localBdms01SpecExchangeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SpecExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01SpecExchangeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SpecExchangeCd() {	 
   		return (substring(getStringValue(),beginBdms01SpecExchangeCd,beginBdms01SpecExchangeCd + BDMS_01_SPEC_EXCHANGE_CD_LEN));
   	}
     int localBdms01SpecClientNbrCounter = -1;
     public boolean isBdms01SpecClientNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SpecClientNbrCounter != sharedCounter;
         localBdms01SpecClientNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPEC_CLIENT_NBR_LEN = 4;
	/**
	 * 	serialize this Bdms01SpecClientNbr
	 */
   protected void serializeBdms01SpecClientNbr(char[] bdms01SpecClientNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SpecClientNbr,0,getStringValue(),beginBdms01SpecClientNbr,BDMS_01_SPEC_CLIENT_NBR_LEN);
       localBdms01SpecClientNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SpecClientNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01SpecClientNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SpecClientNbr() {	 
   		return (substring(getStringValue(),beginBdms01SpecClientNbr,beginBdms01SpecClientNbr + BDMS_01_SPEC_CLIENT_NBR_LEN));
   	}




}
  
