package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class DcltbdemsecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbdemsecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbdemsecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBDEMSEC_LENGTH = 175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsin01;
            protected  int beginSedol01;
            protected  int beginRic01;
            protected  int beginIntlkey01;
            protected  int beginCompany01;
            protected  int beginCountry01;
            protected  int beginCurrency1;
            protected  int beginIndustry;
            protected  int beginSector;
            protected  int beginFfmcapmilusd;
            protected  int beginSectorweight;
	
	/**
	* Constructor for DcltbdemsecSerialized
	**/
    public DcltbdemsecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbdemsecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBDEMSEC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsin01 = getStartOffset() + 0;	// set offset for serialization
  
             beginSedol01 = getStartOffset() + 12;	// set offset for serialization
  
             beginRic01 = getStartOffset() + 20;	// set offset for serialization
  
             beginIntlkey01 = getStartOffset() + 30;	// set offset for serialization
  
             beginCompany01 = getStartOffset() + 38;	// set offset for serialization
  
             beginCountry01 = getStartOffset() + 78;	// set offset for serialization
  
             beginCurrency1 = getStartOffset() + 80;	// set offset for serialization
  
             beginIndustry = getStartOffset() + 83;	// set offset for serialization
  
             beginSector = getStartOffset() + 123;	// set offset for serialization
  
             beginFfmcapmilusd = getStartOffset() + 163;	// set offset for serialization
  
             beginSectorweight = getStartOffset() + 167;	// set offset for serialization
  
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
     int localCurrency1Counter = -1;
     public boolean isCurrency1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrency1Counter != sharedCounter;
         localCurrency1Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_1_LEN = 3;
	/**
	 * 	serialize this Currency1
	 */
   protected void serializeCurrency1(char[] currency1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currency1,0,getStringValue(),beginCurrency1,CURRENCY_1_LEN);
       localCurrency1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrency1Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrency1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrency1() {	 
   		return (substring(getStringValue(),beginCurrency1,beginCurrency1 + CURRENCY_1_LEN));
   	}
     int localIndustryCounter = -1;
     public boolean isIndustryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIndustryCounter != sharedCounter;
         localIndustryCounter = sharedCounter; return hasModified;
     }
	protected static final int INDUSTRY_LEN = 40;
	/**
	 * 	serialize this Industry
	 */
   protected void serializeIndustry(char[] industry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(industry,0,getStringValue(),beginIndustry,INDUSTRY_LEN);
       localIndustryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIndustryConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshIndustry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIndustry() {	 
   		return (substring(getStringValue(),beginIndustry,beginIndustry + INDUSTRY_LEN));
   	}
     int localSectorCounter = -1;
     public boolean isSectorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSectorCounter != sharedCounter;
         localSectorCounter = sharedCounter; return hasModified;
     }
	protected static final int SECTOR_LEN = 40;
	/**
	 * 	serialize this Sector
	 */
   protected void serializeSector(char[] sector) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sector,0,getStringValue(),beginSector,SECTOR_LEN);
       localSectorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSectorConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSector is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSector() {	 
   		return (substring(getStringValue(),beginSector,beginSector + SECTOR_LEN));
   	}
         int localFfmcapmilusdCounter = -1;
         public boolean isFfmcapmilusdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFfmcapmilusdCounter != sharedCounter;
            localFfmcapmilusdCounter = sharedCounter; return hasModified; 
         }
   protected static final int FFMCAPMILUSD_LEN = 4;
  	/**
	 * serializeFfmcapmilusd
	 */
	protected void serializeFfmcapmilusd(int ffmcapmilusd) {
           replaceValue( //  save the value as string
                   getBinaryString( ffmcapmilusd,FFMCAPMILUSD_LEN)
                  ,beginFfmcapmilusd
                  ,FFMCAPMILUSD_LEN
                 );
            localFfmcapmilusdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFfmcapmilusdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFfmcapmilusd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFfmcapmilusd() {	 
			return (getInt(beginFfmcapmilusd));
   	}
     int localSectorweightCounter = -1;
     public boolean isSectorweightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSectorweightCounter != sharedCounter;
         localSectorweightCounter = sharedCounter; return hasModified;
     }
	protected static final int SECTORWEIGHT_LEN = 8;
	/**
	 * 	serialize this Sectorweight
	 */
   protected void serializeSectorweight(char[] sectorweight) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sectorweight,0,getStringValue(),beginSectorweight,SECTORWEIGHT_LEN);
       localSectorweightCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSectorweightConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSectorweight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSectorweight() {	 
   		return (substring(getStringValue(),beginSectorweight,beginSectorweight + SECTORWEIGHT_LEN));
   	}




}
  
