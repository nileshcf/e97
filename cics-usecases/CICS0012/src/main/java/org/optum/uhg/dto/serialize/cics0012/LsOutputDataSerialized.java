package org.optum.uhg.dto.serialize.cics0012;

/**
*  The class LsOutputDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:12. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsOutputDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsOutputDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_OUTPUT_DATA_LENGTH = 175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsin01;
            protected  int beginSedol01;
            protected  int beginRic01;
            protected  int beginIntlkey01;
            protected  int beginCompany01;
            protected  int beginCountry01;
            protected  int beginCurrencycd01;
            protected  int beginIndustry01;
            protected  int beginSector01;
            protected  int beginFfmcapmilusd01;
            protected  int beginSectorweight01;
	
	/**
	* Constructor for LsOutputDataSerialized
	**/
    public LsOutputDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LsOutputDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsOutputDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LsOutputDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,62); // serialize this field at offset 62 by default 
    }
    
	/**
	* sets parent for this LsOutputDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 62 by default
    }    
	/**
	* initializes the field in LsOutputDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_OUTPUT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsin01 = getStartOffset() + 0;	// set offset for serialization
  
             beginSedol01 = getStartOffset() + 12;	// set offset for serialization
  
             beginRic01 = getStartOffset() + 20;	// set offset for serialization
  
             beginIntlkey01 = getStartOffset() + 30;	// set offset for serialization
  
             beginCompany01 = getStartOffset() + 38;	// set offset for serialization
  
             beginCountry01 = getStartOffset() + 78;	// set offset for serialization
  
             beginCurrencycd01 = getStartOffset() + 80;	// set offset for serialization
  
             beginIndustry01 = getStartOffset() + 83;	// set offset for serialization
  
             beginSector01 = getStartOffset() + 123;	// set offset for serialization
  
             beginFfmcapmilusd01 = getStartOffset() + 163;	// set offset for serialization
  
             beginSectorweight01 = getStartOffset() + 167;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsin01Counter = -1;
     public boolean isIsin01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsin01Counter != sharedCounter;
         localIsin01Counter = sharedCounter; return hasModified;
     }
	protected static final int ISIN_01_LEN = 12;
	/**
	 * 	serialize this Isin01
	 */
   protected void serializeIsin01(char[] isin01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isin01,0,getStringValue(),beginIsin01,ISIN_01_LEN);
       localIsin01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsin01Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIsin01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsin01() {	 
   		return (substring(getStringValue(),beginIsin01,beginIsin01 + ISIN_01_LEN));
   	}
     int localSedol01Counter = -1;
     public boolean isSedol01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSedol01Counter != sharedCounter;
         localSedol01Counter = sharedCounter; return hasModified;
     }
	protected static final int SEDOL_01_LEN = 8;
	/**
	 * 	serialize this Sedol01
	 */
   protected void serializeSedol01(char[] sedol01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sedol01,0,getStringValue(),beginSedol01,SEDOL_01_LEN);
       localSedol01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSedol01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSedol01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSedol01() {	 
   		return (substring(getStringValue(),beginSedol01,beginSedol01 + SEDOL_01_LEN));
   	}
     int localRic01Counter = -1;
     public boolean isRic01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRic01Counter != sharedCounter;
         localRic01Counter = sharedCounter; return hasModified;
     }
	protected static final int RIC_01_LEN = 10;
	/**
	 * 	serialize this Ric01
	 */
   protected void serializeRic01(char[] ric01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ric01,0,getStringValue(),beginRic01,RIC_01_LEN);
       localRic01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRic01Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRic01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRic01() {	 
   		return (substring(getStringValue(),beginRic01,beginRic01 + RIC_01_LEN));
   	}
     int localIntlkey01Counter = -1;
     public boolean isIntlkey01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntlkey01Counter != sharedCounter;
         localIntlkey01Counter = sharedCounter; return hasModified;
     }
	protected static final int INTLKEY_01_LEN = 8;
	/**
	 * 	serialize this Intlkey01
	 */
   protected void serializeIntlkey01(char[] intlkey01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(intlkey01,0,getStringValue(),beginIntlkey01,INTLKEY_01_LEN);
       localIntlkey01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIntlkey01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIntlkey01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIntlkey01() {	 
   		return (substring(getStringValue(),beginIntlkey01,beginIntlkey01 + INTLKEY_01_LEN));
   	}
     int localCompany01Counter = -1;
     public boolean isCompany01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompany01Counter != sharedCounter;
         localCompany01Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPANY_01_LEN = 40;
	/**
	 * 	serialize this Company01
	 */
   protected void serializeCompany01(char[] company01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(company01,0,getStringValue(),beginCompany01,COMPANY_01_LEN);
       localCompany01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompany01Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCompany01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompany01() {	 
   		return (substring(getStringValue(),beginCompany01,beginCompany01 + COMPANY_01_LEN));
   	}
     int localCountry01Counter = -1;
     public boolean isCountry01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountry01Counter != sharedCounter;
         localCountry01Counter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_01_LEN = 2;
	/**
	 * 	serialize this Country01
	 */
   protected void serializeCountry01(char[] country01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(country01,0,getStringValue(),beginCountry01,COUNTRY_01_LEN);
       localCountry01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountry01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCountry01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountry01() {	 
   		return (substring(getStringValue(),beginCountry01,beginCountry01 + COUNTRY_01_LEN));
   	}
     int localCurrencycd01Counter = -1;
     public boolean isCurrencycd01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrencycd01Counter != sharedCounter;
         localCurrencycd01Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCYCD_01_LEN = 3;
	/**
	 * 	serialize this Currencycd01
	 */
   protected void serializeCurrencycd01(char[] currencycd01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currencycd01,0,getStringValue(),beginCurrencycd01,CURRENCYCD_01_LEN);
       localCurrencycd01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrencycd01Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrencycd01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrencycd01() {	 
   		return (substring(getStringValue(),beginCurrencycd01,beginCurrencycd01 + CURRENCYCD_01_LEN));
   	}
     int localIndustry01Counter = -1;
     public boolean isIndustry01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIndustry01Counter != sharedCounter;
         localIndustry01Counter = sharedCounter; return hasModified;
     }
	protected static final int INDUSTRY_01_LEN = 40;
	/**
	 * 	serialize this Industry01
	 */
   protected void serializeIndustry01(char[] industry01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(industry01,0,getStringValue(),beginIndustry01,INDUSTRY_01_LEN);
       localIndustry01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIndustry01Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshIndustry01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIndustry01() {	 
   		return (substring(getStringValue(),beginIndustry01,beginIndustry01 + INDUSTRY_01_LEN));
   	}
     int localSector01Counter = -1;
     public boolean isSector01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSector01Counter != sharedCounter;
         localSector01Counter = sharedCounter; return hasModified;
     }
	protected static final int SECTOR_01_LEN = 40;
	/**
	 * 	serialize this Sector01
	 */
   protected void serializeSector01(char[] sector01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sector01,0,getStringValue(),beginSector01,SECTOR_01_LEN);
       localSector01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSector01Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSector01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSector01() {	 
   		return (substring(getStringValue(),beginSector01,beginSector01 + SECTOR_01_LEN));
   	}
         int localFfmcapmilusd01Counter = -1;
         public boolean isFfmcapmilusd01Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFfmcapmilusd01Counter != sharedCounter;
            localFfmcapmilusd01Counter = sharedCounter; return hasModified; 
         }
   protected static final int FFMCAPMILUSD_01_LEN = 4;
  	/**
	 * serializeFfmcapmilusd01
	 */
	protected void serializeFfmcapmilusd01(int ffmcapmilusd01) {
           replaceValue( //  save the value as string
                   getBinaryString( ffmcapmilusd01,FFMCAPMILUSD_01_LEN)
                  ,beginFfmcapmilusd01
                  ,FFMCAPMILUSD_01_LEN
                 );
            localFfmcapmilusd01Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFfmcapmilusd01MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFfmcapmilusd01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFfmcapmilusd01() {	 
			return (getInt(beginFfmcapmilusd01));
   	}
     int localSectorweight01Counter = -1;
     public boolean isSectorweight01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSectorweight01Counter != sharedCounter;
         localSectorweight01Counter = sharedCounter; return hasModified;
     }
	protected static final int SECTORWEIGHT_01_LEN = 8;
	/**
	 * 	serialize this Sectorweight01
	 */
   protected void serializeSectorweight01(char[] sectorweight01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sectorweight01,0,getStringValue(),beginSectorweight01,SECTORWEIGHT_01_LEN);
       localSectorweight01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSectorweight01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSectorweight01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSectorweight01() {	 
   		return (substring(getStringValue(),beginSectorweight01,beginSectorweight01 + SECTORWEIGHT_01_LEN));
   	}




}
  
