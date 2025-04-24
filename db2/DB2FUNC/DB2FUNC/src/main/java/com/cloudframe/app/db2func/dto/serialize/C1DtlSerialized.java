package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class C1DtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class C1DtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(C1DtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_1_DTL_LENGTH = 97;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsin;
            protected  int beginSedol;
            protected  int beginRic;
            protected  int beginIntlkey;
            protected  int beginCompany;
            protected  int beginCountry;
            protected  int beginCurrency;
	
	/**
	* Constructor for C1DtlSerialized
	**/
    public C1DtlSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in C1DtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_1_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIsin = getStartOffset() + 2;	// set offset for serialization
  
  
             beginSedol = getStartOffset() + 16;	// set offset for serialization
  
  
             beginRic = getStartOffset() + 26;	// set offset for serialization
  
  
             beginIntlkey = getStartOffset() + 38;	// set offset for serialization
  
  
             beginCompany = getStartOffset() + 48;	// set offset for serialization
  
  
             beginCountry = getStartOffset() + 90;	// set offset for serialization
  
  
             beginCurrency = getStartOffset() + 94;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsinCounter = -1;
     public boolean isIsinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsinCounter != sharedCounter;
         localIsinCounter = sharedCounter; return hasModified;
     }
	protected static final int ISIN_LEN = 12;
	/**
	 * 	serialize this Isin
	 */
   protected void serializeIsin(char[] isin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isin,0,getStringValue(),beginIsin,ISIN_LEN);
       localIsinCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsinConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIsin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsin() {	 
   		return (substring(getStringValue(),beginIsin,beginIsin + ISIN_LEN));
   	}
     int localSedolCounter = -1;
     public boolean isSedolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSedolCounter != sharedCounter;
         localSedolCounter = sharedCounter; return hasModified;
     }
	protected static final int SEDOL_LEN = 8;
	/**
	 * 	serialize this Sedol
	 */
   protected void serializeSedol(char[] sedol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sedol,0,getStringValue(),beginSedol,SEDOL_LEN);
       localSedolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSedolConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSedol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSedol() {	 
   		return (substring(getStringValue(),beginSedol,beginSedol + SEDOL_LEN));
   	}
     int localRicCounter = -1;
     public boolean isRicModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicCounter != sharedCounter;
         localRicCounter = sharedCounter; return hasModified;
     }
	protected static final int RIC_LEN = 10;
	/**
	 * 	serialize this Ric
	 */
   protected void serializeRic(char[] ric) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ric,0,getStringValue(),beginRic,RIC_LEN);
       localRicCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRic is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRic() {	 
   		return (substring(getStringValue(),beginRic,beginRic + RIC_LEN));
   	}
     int localIntlkeyCounter = -1;
     public boolean isIntlkeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntlkeyCounter != sharedCounter;
         localIntlkeyCounter = sharedCounter; return hasModified;
     }
	protected static final int INTLKEY_LEN = 8;
	/**
	 * 	serialize this Intlkey
	 */
   protected void serializeIntlkey(char[] intlkey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(intlkey,0,getStringValue(),beginIntlkey,INTLKEY_LEN);
       localIntlkeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIntlkeyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIntlkey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIntlkey() {	 
   		return (substring(getStringValue(),beginIntlkey,beginIntlkey + INTLKEY_LEN));
   	}
     int localCompanyCounter = -1;
     public boolean isCompanyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompanyCounter != sharedCounter;
         localCompanyCounter = sharedCounter; return hasModified;
     }
	protected static final int COMPANY_LEN = 40;
	/**
	 * 	serialize this Company
	 */
   protected void serializeCompany(char[] company) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(company,0,getStringValue(),beginCompany,COMPANY_LEN);
       localCompanyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompanyConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCompany is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompany() {	 
   		return (substring(getStringValue(),beginCompany,beginCompany + COMPANY_LEN));
   	}
     int localCountryCounter = -1;
     public boolean isCountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountryCounter != sharedCounter;
         localCountryCounter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_LEN = 2;
	/**
	 * 	serialize this Country
	 */
   protected void serializeCountry(char[] country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(country,0,getStringValue(),beginCountry,COUNTRY_LEN);
       localCountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountryConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCountry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountry() {	 
   		return (substring(getStringValue(),beginCountry,beginCountry + COUNTRY_LEN));
   	}
     int localCurrencyCounter = -1;
     public boolean isCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrencyCounter != sharedCounter;
         localCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_LEN = 3;
	/**
	 * 	serialize this Currency
	 */
   protected void serializeCurrency(char[] currency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currency,0,getStringValue(),beginCurrency,CURRENCY_LEN);
       localCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrency() {	 
   		return (substring(getStringValue(),beginCurrency,beginCurrency + CURRENCY_LEN));
   	}




}
  
