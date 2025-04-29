package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup20Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup20Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup20Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_20_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P590ReservdS;
            protected  int beginIp65504P590ReservdL;
            protected  int beginIp65504P591ReservdS;
            protected  int beginIp65504P591ReservdL;
            protected  int beginIp65504P592ReservdS;
            protected  int beginIp65504P592ReservdL;
            protected  int beginIp65504P593ReservdS;
            protected  int beginIp65504P593ReservdL;
            protected  int beginIp65504P594ReservdS;
            protected  int beginIp65504P594ReservdL;
            protected  int beginIp65504P595MerTypS;
            protected  int beginIp65504P595MerTypL;
            protected  int beginIp65504P596MerTaxS;
            protected  int beginIp65504P596MerTaxL;
            protected  int beginIp65504P597TaxAmtS;
            protected  int beginIp65504P597TaxAmtL;
            protected  int beginIp65504P598TaxcollS;
            protected  int beginIp65504P598TaxcollL;
            protected  int beginIp65504P599CorVatS;
            protected  int beginIp65504P599CorVatL;
            protected  int beginIp65504P600MerRefS;
            protected  int beginIp65504P600MerRefL;
            protected  int beginIp65504P601ReservdS;
            protected  int beginIp65504P601ReservdL;
            protected  int beginIp65504P602ReservdS;
            protected  int beginIp65504P602ReservdL;
            protected  int beginIp65504P603ReservdS;
            protected  int beginIp65504P603ReservdL;
            protected  int beginIp65504P604ReservdS;
            protected  int beginIp65504P604ReservdL;
            protected  int beginIp65504P605ReservdS;
            protected  int beginIp65504P605ReservdL;
            protected  int beginIp65504P606FrtAmtS;
            protected  int beginIp65504P606FrtAmtL;
            protected  int beginIp65504P607DtyAmtS;
            protected  int beginIp65504P607DtyAmtL;
            protected  int beginIp65504P608DestZpS;
            protected  int beginIp65504P608DestZpL;
            protected  int beginIp65504P609DestStS;
            protected  int beginIp65504P609DestStL;
            protected  int beginIp65504P610DestCyS;
            protected  int beginIp65504P610DestCyL;
            protected  int beginIp65504P611AltTaxS;
            protected  int beginIp65504P611AltTaxL;
            protected  int beginIp65504P612ReservdS;
            protected  int beginIp65504P612ReservdL;
            protected  int beginIp65504P613ShpZipS;
            protected  int beginIp65504P613ShpZipL;
            protected  int beginIp65504P614OrdDteS;
            protected  int beginIp65504P614OrdDteL;
            protected  int beginIp65504P615ReservdS;
            protected  int beginIp65504P615ReservdL;
            protected  int beginIp65504P616ReservdS;
            protected  int beginIp65504P616ReservdL;
            protected  int beginIp65504P617ReservdS;
            protected  int beginIp65504P617ReservdL;
            protected  int beginIp65504P618ReservdS;
            protected  int beginIp65504P618ReservdL;
            protected  int beginIp65504P619ReservdS;
            protected  int beginIp65504P619ReservdL;
            protected  int beginIp65504P620OilconmS;
            protected  int beginIp65504P620OilconmL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup20Serialized
	**/
    public Ip65504PdsNamesLargeGroup20Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup20Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup20Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup20Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4708); // serialize this field at offset 4708 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup20Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4708 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup20Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_20_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P590ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P590ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P591ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P591ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P592ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P592ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P593ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P593ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P594ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P594ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P595MerTypS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P595MerTypL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P596MerTaxS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P596MerTaxL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P597TaxAmtS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P597TaxAmtL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P598TaxcollS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P598TaxcollL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P599CorVatS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P599CorVatL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P600MerRefS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P600MerRefL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P601ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P601ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P602ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P602ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P603ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P603ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P604ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P604ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P605ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P605ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P606FrtAmtS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P606FrtAmtL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P607DtyAmtS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P607DtyAmtL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P608DestZpS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P608DestZpL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P609DestStS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P609DestStL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P610DestCyS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P610DestCyL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P611AltTaxS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P611AltTaxL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P612ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P612ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P613ShpZipS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P613ShpZipL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P614OrdDteS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P614OrdDteL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P615ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P615ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P616ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P616ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P617ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P617ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P618ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P618ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P619ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P619ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P620OilconmS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P620OilconmL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P590ReservdSCounter = -1;
         public boolean isIp65504P590ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P590ReservdSCounter != sharedCounter;
            localIp65504P590ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_590_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P590ReservdS
	 */
	protected void serializeIp65504P590ReservdS(short ip65504P590ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P590ReservdS,IP_65504_P_590_RESERVD_S_LEN)
                  ,beginIp65504P590ReservdS
                  ,IP_65504_P_590_RESERVD_S_LEN
                 );
            localIp65504P590ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P590ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P590ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P590ReservdS() {	 
			return (getShort(beginIp65504P590ReservdS));
   	}
         int localIp65504P590ReservdLCounter = -1;
         public boolean isIp65504P590ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P590ReservdLCounter != sharedCounter;
            localIp65504P590ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_590_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P590ReservdL
	 */
	protected void serializeIp65504P590ReservdL(short ip65504P590ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P590ReservdL,IP_65504_P_590_RESERVD_L_LEN)
                  ,beginIp65504P590ReservdL
                  ,IP_65504_P_590_RESERVD_L_LEN
                 );
            localIp65504P590ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P590ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P590ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P590ReservdL() {	 
			return (getShort(beginIp65504P590ReservdL));
   	}
         int localIp65504P591ReservdSCounter = -1;
         public boolean isIp65504P591ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P591ReservdSCounter != sharedCounter;
            localIp65504P591ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_591_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P591ReservdS
	 */
	protected void serializeIp65504P591ReservdS(short ip65504P591ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P591ReservdS,IP_65504_P_591_RESERVD_S_LEN)
                  ,beginIp65504P591ReservdS
                  ,IP_65504_P_591_RESERVD_S_LEN
                 );
            localIp65504P591ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P591ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P591ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P591ReservdS() {	 
			return (getShort(beginIp65504P591ReservdS));
   	}
         int localIp65504P591ReservdLCounter = -1;
         public boolean isIp65504P591ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P591ReservdLCounter != sharedCounter;
            localIp65504P591ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_591_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P591ReservdL
	 */
	protected void serializeIp65504P591ReservdL(short ip65504P591ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P591ReservdL,IP_65504_P_591_RESERVD_L_LEN)
                  ,beginIp65504P591ReservdL
                  ,IP_65504_P_591_RESERVD_L_LEN
                 );
            localIp65504P591ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P591ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P591ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P591ReservdL() {	 
			return (getShort(beginIp65504P591ReservdL));
   	}
         int localIp65504P592ReservdSCounter = -1;
         public boolean isIp65504P592ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P592ReservdSCounter != sharedCounter;
            localIp65504P592ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_592_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P592ReservdS
	 */
	protected void serializeIp65504P592ReservdS(short ip65504P592ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P592ReservdS,IP_65504_P_592_RESERVD_S_LEN)
                  ,beginIp65504P592ReservdS
                  ,IP_65504_P_592_RESERVD_S_LEN
                 );
            localIp65504P592ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P592ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P592ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P592ReservdS() {	 
			return (getShort(beginIp65504P592ReservdS));
   	}
         int localIp65504P592ReservdLCounter = -1;
         public boolean isIp65504P592ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P592ReservdLCounter != sharedCounter;
            localIp65504P592ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_592_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P592ReservdL
	 */
	protected void serializeIp65504P592ReservdL(short ip65504P592ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P592ReservdL,IP_65504_P_592_RESERVD_L_LEN)
                  ,beginIp65504P592ReservdL
                  ,IP_65504_P_592_RESERVD_L_LEN
                 );
            localIp65504P592ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P592ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P592ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P592ReservdL() {	 
			return (getShort(beginIp65504P592ReservdL));
   	}
         int localIp65504P593ReservdSCounter = -1;
         public boolean isIp65504P593ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P593ReservdSCounter != sharedCounter;
            localIp65504P593ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_593_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P593ReservdS
	 */
	protected void serializeIp65504P593ReservdS(short ip65504P593ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P593ReservdS,IP_65504_P_593_RESERVD_S_LEN)
                  ,beginIp65504P593ReservdS
                  ,IP_65504_P_593_RESERVD_S_LEN
                 );
            localIp65504P593ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P593ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P593ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P593ReservdS() {	 
			return (getShort(beginIp65504P593ReservdS));
   	}
         int localIp65504P593ReservdLCounter = -1;
         public boolean isIp65504P593ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P593ReservdLCounter != sharedCounter;
            localIp65504P593ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_593_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P593ReservdL
	 */
	protected void serializeIp65504P593ReservdL(short ip65504P593ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P593ReservdL,IP_65504_P_593_RESERVD_L_LEN)
                  ,beginIp65504P593ReservdL
                  ,IP_65504_P_593_RESERVD_L_LEN
                 );
            localIp65504P593ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P593ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P593ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P593ReservdL() {	 
			return (getShort(beginIp65504P593ReservdL));
   	}
         int localIp65504P594ReservdSCounter = -1;
         public boolean isIp65504P594ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P594ReservdSCounter != sharedCounter;
            localIp65504P594ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_594_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P594ReservdS
	 */
	protected void serializeIp65504P594ReservdS(short ip65504P594ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P594ReservdS,IP_65504_P_594_RESERVD_S_LEN)
                  ,beginIp65504P594ReservdS
                  ,IP_65504_P_594_RESERVD_S_LEN
                 );
            localIp65504P594ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P594ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P594ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P594ReservdS() {	 
			return (getShort(beginIp65504P594ReservdS));
   	}
         int localIp65504P594ReservdLCounter = -1;
         public boolean isIp65504P594ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P594ReservdLCounter != sharedCounter;
            localIp65504P594ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_594_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P594ReservdL
	 */
	protected void serializeIp65504P594ReservdL(short ip65504P594ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P594ReservdL,IP_65504_P_594_RESERVD_L_LEN)
                  ,beginIp65504P594ReservdL
                  ,IP_65504_P_594_RESERVD_L_LEN
                 );
            localIp65504P594ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P594ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P594ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P594ReservdL() {	 
			return (getShort(beginIp65504P594ReservdL));
   	}
         int localIp65504P595MerTypSCounter = -1;
         public boolean isIp65504P595MerTypSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P595MerTypSCounter != sharedCounter;
            localIp65504P595MerTypSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_595_MER_TYP_S_LEN = 2;
  	/**
	 * serializeIp65504P595MerTypS
	 */
	protected void serializeIp65504P595MerTypS(short ip65504P595MerTypS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P595MerTypS,IP_65504_P_595_MER_TYP_S_LEN)
                  ,beginIp65504P595MerTypS
                  ,IP_65504_P_595_MER_TYP_S_LEN
                 );
            localIp65504P595MerTypSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P595MerTypSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P595MerTypS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P595MerTypS() {	 
			return (getShort(beginIp65504P595MerTypS));
   	}
         int localIp65504P595MerTypLCounter = -1;
         public boolean isIp65504P595MerTypLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P595MerTypLCounter != sharedCounter;
            localIp65504P595MerTypLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_595_MER_TYP_L_LEN = 2;
  	/**
	 * serializeIp65504P595MerTypL
	 */
	protected void serializeIp65504P595MerTypL(short ip65504P595MerTypL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P595MerTypL,IP_65504_P_595_MER_TYP_L_LEN)
                  ,beginIp65504P595MerTypL
                  ,IP_65504_P_595_MER_TYP_L_LEN
                 );
            localIp65504P595MerTypLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P595MerTypLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P595MerTypL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P595MerTypL() {	 
			return (getShort(beginIp65504P595MerTypL));
   	}
         int localIp65504P596MerTaxSCounter = -1;
         public boolean isIp65504P596MerTaxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P596MerTaxSCounter != sharedCounter;
            localIp65504P596MerTaxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_596_MER_TAX_S_LEN = 2;
  	/**
	 * serializeIp65504P596MerTaxS
	 */
	protected void serializeIp65504P596MerTaxS(short ip65504P596MerTaxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P596MerTaxS,IP_65504_P_596_MER_TAX_S_LEN)
                  ,beginIp65504P596MerTaxS
                  ,IP_65504_P_596_MER_TAX_S_LEN
                 );
            localIp65504P596MerTaxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P596MerTaxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P596MerTaxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P596MerTaxS() {	 
			return (getShort(beginIp65504P596MerTaxS));
   	}
         int localIp65504P596MerTaxLCounter = -1;
         public boolean isIp65504P596MerTaxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P596MerTaxLCounter != sharedCounter;
            localIp65504P596MerTaxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_596_MER_TAX_L_LEN = 2;
  	/**
	 * serializeIp65504P596MerTaxL
	 */
	protected void serializeIp65504P596MerTaxL(short ip65504P596MerTaxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P596MerTaxL,IP_65504_P_596_MER_TAX_L_LEN)
                  ,beginIp65504P596MerTaxL
                  ,IP_65504_P_596_MER_TAX_L_LEN
                 );
            localIp65504P596MerTaxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P596MerTaxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P596MerTaxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P596MerTaxL() {	 
			return (getShort(beginIp65504P596MerTaxL));
   	}
         int localIp65504P597TaxAmtSCounter = -1;
         public boolean isIp65504P597TaxAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P597TaxAmtSCounter != sharedCounter;
            localIp65504P597TaxAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_597_TAX_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P597TaxAmtS
	 */
	protected void serializeIp65504P597TaxAmtS(short ip65504P597TaxAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P597TaxAmtS,IP_65504_P_597_TAX_AMT_S_LEN)
                  ,beginIp65504P597TaxAmtS
                  ,IP_65504_P_597_TAX_AMT_S_LEN
                 );
            localIp65504P597TaxAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P597TaxAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P597TaxAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P597TaxAmtS() {	 
			return (getShort(beginIp65504P597TaxAmtS));
   	}
         int localIp65504P597TaxAmtLCounter = -1;
         public boolean isIp65504P597TaxAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P597TaxAmtLCounter != sharedCounter;
            localIp65504P597TaxAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_597_TAX_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P597TaxAmtL
	 */
	protected void serializeIp65504P597TaxAmtL(short ip65504P597TaxAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P597TaxAmtL,IP_65504_P_597_TAX_AMT_L_LEN)
                  ,beginIp65504P597TaxAmtL
                  ,IP_65504_P_597_TAX_AMT_L_LEN
                 );
            localIp65504P597TaxAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P597TaxAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P597TaxAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P597TaxAmtL() {	 
			return (getShort(beginIp65504P597TaxAmtL));
   	}
         int localIp65504P598TaxcollSCounter = -1;
         public boolean isIp65504P598TaxcollSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P598TaxcollSCounter != sharedCounter;
            localIp65504P598TaxcollSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_598_TAXCOLL_S_LEN = 2;
  	/**
	 * serializeIp65504P598TaxcollS
	 */
	protected void serializeIp65504P598TaxcollS(short ip65504P598TaxcollS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P598TaxcollS,IP_65504_P_598_TAXCOLL_S_LEN)
                  ,beginIp65504P598TaxcollS
                  ,IP_65504_P_598_TAXCOLL_S_LEN
                 );
            localIp65504P598TaxcollSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P598TaxcollSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P598TaxcollS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P598TaxcollS() {	 
			return (getShort(beginIp65504P598TaxcollS));
   	}
         int localIp65504P598TaxcollLCounter = -1;
         public boolean isIp65504P598TaxcollLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P598TaxcollLCounter != sharedCounter;
            localIp65504P598TaxcollLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_598_TAXCOLL_L_LEN = 2;
  	/**
	 * serializeIp65504P598TaxcollL
	 */
	protected void serializeIp65504P598TaxcollL(short ip65504P598TaxcollL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P598TaxcollL,IP_65504_P_598_TAXCOLL_L_LEN)
                  ,beginIp65504P598TaxcollL
                  ,IP_65504_P_598_TAXCOLL_L_LEN
                 );
            localIp65504P598TaxcollLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P598TaxcollLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P598TaxcollL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P598TaxcollL() {	 
			return (getShort(beginIp65504P598TaxcollL));
   	}
         int localIp65504P599CorVatSCounter = -1;
         public boolean isIp65504P599CorVatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P599CorVatSCounter != sharedCounter;
            localIp65504P599CorVatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_599_COR_VAT_S_LEN = 2;
  	/**
	 * serializeIp65504P599CorVatS
	 */
	protected void serializeIp65504P599CorVatS(short ip65504P599CorVatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P599CorVatS,IP_65504_P_599_COR_VAT_S_LEN)
                  ,beginIp65504P599CorVatS
                  ,IP_65504_P_599_COR_VAT_S_LEN
                 );
            localIp65504P599CorVatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P599CorVatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P599CorVatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P599CorVatS() {	 
			return (getShort(beginIp65504P599CorVatS));
   	}
         int localIp65504P599CorVatLCounter = -1;
         public boolean isIp65504P599CorVatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P599CorVatLCounter != sharedCounter;
            localIp65504P599CorVatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_599_COR_VAT_L_LEN = 2;
  	/**
	 * serializeIp65504P599CorVatL
	 */
	protected void serializeIp65504P599CorVatL(short ip65504P599CorVatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P599CorVatL,IP_65504_P_599_COR_VAT_L_LEN)
                  ,beginIp65504P599CorVatL
                  ,IP_65504_P_599_COR_VAT_L_LEN
                 );
            localIp65504P599CorVatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P599CorVatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P599CorVatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P599CorVatL() {	 
			return (getShort(beginIp65504P599CorVatL));
   	}
         int localIp65504P600MerRefSCounter = -1;
         public boolean isIp65504P600MerRefSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P600MerRefSCounter != sharedCounter;
            localIp65504P600MerRefSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_600_MER_REF_S_LEN = 2;
  	/**
	 * serializeIp65504P600MerRefS
	 */
	protected void serializeIp65504P600MerRefS(short ip65504P600MerRefS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P600MerRefS,IP_65504_P_600_MER_REF_S_LEN)
                  ,beginIp65504P600MerRefS
                  ,IP_65504_P_600_MER_REF_S_LEN
                 );
            localIp65504P600MerRefSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P600MerRefSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P600MerRefS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P600MerRefS() {	 
			return (getShort(beginIp65504P600MerRefS));
   	}
         int localIp65504P600MerRefLCounter = -1;
         public boolean isIp65504P600MerRefLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P600MerRefLCounter != sharedCounter;
            localIp65504P600MerRefLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_600_MER_REF_L_LEN = 2;
  	/**
	 * serializeIp65504P600MerRefL
	 */
	protected void serializeIp65504P600MerRefL(short ip65504P600MerRefL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P600MerRefL,IP_65504_P_600_MER_REF_L_LEN)
                  ,beginIp65504P600MerRefL
                  ,IP_65504_P_600_MER_REF_L_LEN
                 );
            localIp65504P600MerRefLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P600MerRefLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P600MerRefL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P600MerRefL() {	 
			return (getShort(beginIp65504P600MerRefL));
   	}
         int localIp65504P601ReservdSCounter = -1;
         public boolean isIp65504P601ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P601ReservdSCounter != sharedCounter;
            localIp65504P601ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_601_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P601ReservdS
	 */
	protected void serializeIp65504P601ReservdS(short ip65504P601ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P601ReservdS,IP_65504_P_601_RESERVD_S_LEN)
                  ,beginIp65504P601ReservdS
                  ,IP_65504_P_601_RESERVD_S_LEN
                 );
            localIp65504P601ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P601ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P601ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P601ReservdS() {	 
			return (getShort(beginIp65504P601ReservdS));
   	}
         int localIp65504P601ReservdLCounter = -1;
         public boolean isIp65504P601ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P601ReservdLCounter != sharedCounter;
            localIp65504P601ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_601_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P601ReservdL
	 */
	protected void serializeIp65504P601ReservdL(short ip65504P601ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P601ReservdL,IP_65504_P_601_RESERVD_L_LEN)
                  ,beginIp65504P601ReservdL
                  ,IP_65504_P_601_RESERVD_L_LEN
                 );
            localIp65504P601ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P601ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P601ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P601ReservdL() {	 
			return (getShort(beginIp65504P601ReservdL));
   	}
         int localIp65504P602ReservdSCounter = -1;
         public boolean isIp65504P602ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P602ReservdSCounter != sharedCounter;
            localIp65504P602ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_602_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P602ReservdS
	 */
	protected void serializeIp65504P602ReservdS(short ip65504P602ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P602ReservdS,IP_65504_P_602_RESERVD_S_LEN)
                  ,beginIp65504P602ReservdS
                  ,IP_65504_P_602_RESERVD_S_LEN
                 );
            localIp65504P602ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P602ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P602ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P602ReservdS() {	 
			return (getShort(beginIp65504P602ReservdS));
   	}
         int localIp65504P602ReservdLCounter = -1;
         public boolean isIp65504P602ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P602ReservdLCounter != sharedCounter;
            localIp65504P602ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_602_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P602ReservdL
	 */
	protected void serializeIp65504P602ReservdL(short ip65504P602ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P602ReservdL,IP_65504_P_602_RESERVD_L_LEN)
                  ,beginIp65504P602ReservdL
                  ,IP_65504_P_602_RESERVD_L_LEN
                 );
            localIp65504P602ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P602ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P602ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P602ReservdL() {	 
			return (getShort(beginIp65504P602ReservdL));
   	}
         int localIp65504P603ReservdSCounter = -1;
         public boolean isIp65504P603ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P603ReservdSCounter != sharedCounter;
            localIp65504P603ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_603_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P603ReservdS
	 */
	protected void serializeIp65504P603ReservdS(short ip65504P603ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P603ReservdS,IP_65504_P_603_RESERVD_S_LEN)
                  ,beginIp65504P603ReservdS
                  ,IP_65504_P_603_RESERVD_S_LEN
                 );
            localIp65504P603ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P603ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P603ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P603ReservdS() {	 
			return (getShort(beginIp65504P603ReservdS));
   	}
         int localIp65504P603ReservdLCounter = -1;
         public boolean isIp65504P603ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P603ReservdLCounter != sharedCounter;
            localIp65504P603ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_603_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P603ReservdL
	 */
	protected void serializeIp65504P603ReservdL(short ip65504P603ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P603ReservdL,IP_65504_P_603_RESERVD_L_LEN)
                  ,beginIp65504P603ReservdL
                  ,IP_65504_P_603_RESERVD_L_LEN
                 );
            localIp65504P603ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P603ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P603ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P603ReservdL() {	 
			return (getShort(beginIp65504P603ReservdL));
   	}
         int localIp65504P604ReservdSCounter = -1;
         public boolean isIp65504P604ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P604ReservdSCounter != sharedCounter;
            localIp65504P604ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_604_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P604ReservdS
	 */
	protected void serializeIp65504P604ReservdS(short ip65504P604ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P604ReservdS,IP_65504_P_604_RESERVD_S_LEN)
                  ,beginIp65504P604ReservdS
                  ,IP_65504_P_604_RESERVD_S_LEN
                 );
            localIp65504P604ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P604ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P604ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P604ReservdS() {	 
			return (getShort(beginIp65504P604ReservdS));
   	}
         int localIp65504P604ReservdLCounter = -1;
         public boolean isIp65504P604ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P604ReservdLCounter != sharedCounter;
            localIp65504P604ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_604_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P604ReservdL
	 */
	protected void serializeIp65504P604ReservdL(short ip65504P604ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P604ReservdL,IP_65504_P_604_RESERVD_L_LEN)
                  ,beginIp65504P604ReservdL
                  ,IP_65504_P_604_RESERVD_L_LEN
                 );
            localIp65504P604ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P604ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P604ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P604ReservdL() {	 
			return (getShort(beginIp65504P604ReservdL));
   	}
         int localIp65504P605ReservdSCounter = -1;
         public boolean isIp65504P605ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P605ReservdSCounter != sharedCounter;
            localIp65504P605ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_605_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P605ReservdS
	 */
	protected void serializeIp65504P605ReservdS(short ip65504P605ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P605ReservdS,IP_65504_P_605_RESERVD_S_LEN)
                  ,beginIp65504P605ReservdS
                  ,IP_65504_P_605_RESERVD_S_LEN
                 );
            localIp65504P605ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P605ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P605ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P605ReservdS() {	 
			return (getShort(beginIp65504P605ReservdS));
   	}
         int localIp65504P605ReservdLCounter = -1;
         public boolean isIp65504P605ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P605ReservdLCounter != sharedCounter;
            localIp65504P605ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_605_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P605ReservdL
	 */
	protected void serializeIp65504P605ReservdL(short ip65504P605ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P605ReservdL,IP_65504_P_605_RESERVD_L_LEN)
                  ,beginIp65504P605ReservdL
                  ,IP_65504_P_605_RESERVD_L_LEN
                 );
            localIp65504P605ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P605ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P605ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P605ReservdL() {	 
			return (getShort(beginIp65504P605ReservdL));
   	}
         int localIp65504P606FrtAmtSCounter = -1;
         public boolean isIp65504P606FrtAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P606FrtAmtSCounter != sharedCounter;
            localIp65504P606FrtAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_606_FRT_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P606FrtAmtS
	 */
	protected void serializeIp65504P606FrtAmtS(short ip65504P606FrtAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P606FrtAmtS,IP_65504_P_606_FRT_AMT_S_LEN)
                  ,beginIp65504P606FrtAmtS
                  ,IP_65504_P_606_FRT_AMT_S_LEN
                 );
            localIp65504P606FrtAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P606FrtAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P606FrtAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P606FrtAmtS() {	 
			return (getShort(beginIp65504P606FrtAmtS));
   	}
         int localIp65504P606FrtAmtLCounter = -1;
         public boolean isIp65504P606FrtAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P606FrtAmtLCounter != sharedCounter;
            localIp65504P606FrtAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_606_FRT_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P606FrtAmtL
	 */
	protected void serializeIp65504P606FrtAmtL(short ip65504P606FrtAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P606FrtAmtL,IP_65504_P_606_FRT_AMT_L_LEN)
                  ,beginIp65504P606FrtAmtL
                  ,IP_65504_P_606_FRT_AMT_L_LEN
                 );
            localIp65504P606FrtAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P606FrtAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P606FrtAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P606FrtAmtL() {	 
			return (getShort(beginIp65504P606FrtAmtL));
   	}
         int localIp65504P607DtyAmtSCounter = -1;
         public boolean isIp65504P607DtyAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P607DtyAmtSCounter != sharedCounter;
            localIp65504P607DtyAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_607_DTY_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P607DtyAmtS
	 */
	protected void serializeIp65504P607DtyAmtS(short ip65504P607DtyAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P607DtyAmtS,IP_65504_P_607_DTY_AMT_S_LEN)
                  ,beginIp65504P607DtyAmtS
                  ,IP_65504_P_607_DTY_AMT_S_LEN
                 );
            localIp65504P607DtyAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P607DtyAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P607DtyAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P607DtyAmtS() {	 
			return (getShort(beginIp65504P607DtyAmtS));
   	}
         int localIp65504P607DtyAmtLCounter = -1;
         public boolean isIp65504P607DtyAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P607DtyAmtLCounter != sharedCounter;
            localIp65504P607DtyAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_607_DTY_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P607DtyAmtL
	 */
	protected void serializeIp65504P607DtyAmtL(short ip65504P607DtyAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P607DtyAmtL,IP_65504_P_607_DTY_AMT_L_LEN)
                  ,beginIp65504P607DtyAmtL
                  ,IP_65504_P_607_DTY_AMT_L_LEN
                 );
            localIp65504P607DtyAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P607DtyAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P607DtyAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P607DtyAmtL() {	 
			return (getShort(beginIp65504P607DtyAmtL));
   	}
         int localIp65504P608DestZpSCounter = -1;
         public boolean isIp65504P608DestZpSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P608DestZpSCounter != sharedCounter;
            localIp65504P608DestZpSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_608_DEST_ZP_S_LEN = 2;
  	/**
	 * serializeIp65504P608DestZpS
	 */
	protected void serializeIp65504P608DestZpS(short ip65504P608DestZpS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P608DestZpS,IP_65504_P_608_DEST_ZP_S_LEN)
                  ,beginIp65504P608DestZpS
                  ,IP_65504_P_608_DEST_ZP_S_LEN
                 );
            localIp65504P608DestZpSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P608DestZpSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P608DestZpS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P608DestZpS() {	 
			return (getShort(beginIp65504P608DestZpS));
   	}
         int localIp65504P608DestZpLCounter = -1;
         public boolean isIp65504P608DestZpLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P608DestZpLCounter != sharedCounter;
            localIp65504P608DestZpLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_608_DEST_ZP_L_LEN = 2;
  	/**
	 * serializeIp65504P608DestZpL
	 */
	protected void serializeIp65504P608DestZpL(short ip65504P608DestZpL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P608DestZpL,IP_65504_P_608_DEST_ZP_L_LEN)
                  ,beginIp65504P608DestZpL
                  ,IP_65504_P_608_DEST_ZP_L_LEN
                 );
            localIp65504P608DestZpLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P608DestZpLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P608DestZpL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P608DestZpL() {	 
			return (getShort(beginIp65504P608DestZpL));
   	}
         int localIp65504P609DestStSCounter = -1;
         public boolean isIp65504P609DestStSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P609DestStSCounter != sharedCounter;
            localIp65504P609DestStSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_609_DEST_ST_S_LEN = 2;
  	/**
	 * serializeIp65504P609DestStS
	 */
	protected void serializeIp65504P609DestStS(short ip65504P609DestStS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P609DestStS,IP_65504_P_609_DEST_ST_S_LEN)
                  ,beginIp65504P609DestStS
                  ,IP_65504_P_609_DEST_ST_S_LEN
                 );
            localIp65504P609DestStSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P609DestStSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P609DestStS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P609DestStS() {	 
			return (getShort(beginIp65504P609DestStS));
   	}
         int localIp65504P609DestStLCounter = -1;
         public boolean isIp65504P609DestStLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P609DestStLCounter != sharedCounter;
            localIp65504P609DestStLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_609_DEST_ST_L_LEN = 2;
  	/**
	 * serializeIp65504P609DestStL
	 */
	protected void serializeIp65504P609DestStL(short ip65504P609DestStL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P609DestStL,IP_65504_P_609_DEST_ST_L_LEN)
                  ,beginIp65504P609DestStL
                  ,IP_65504_P_609_DEST_ST_L_LEN
                 );
            localIp65504P609DestStLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P609DestStLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P609DestStL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P609DestStL() {	 
			return (getShort(beginIp65504P609DestStL));
   	}
         int localIp65504P610DestCySCounter = -1;
         public boolean isIp65504P610DestCySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P610DestCySCounter != sharedCounter;
            localIp65504P610DestCySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_610_DEST_CY_S_LEN = 2;
  	/**
	 * serializeIp65504P610DestCyS
	 */
	protected void serializeIp65504P610DestCyS(short ip65504P610DestCyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P610DestCyS,IP_65504_P_610_DEST_CY_S_LEN)
                  ,beginIp65504P610DestCyS
                  ,IP_65504_P_610_DEST_CY_S_LEN
                 );
            localIp65504P610DestCySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P610DestCySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P610DestCyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P610DestCyS() {	 
			return (getShort(beginIp65504P610DestCyS));
   	}
         int localIp65504P610DestCyLCounter = -1;
         public boolean isIp65504P610DestCyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P610DestCyLCounter != sharedCounter;
            localIp65504P610DestCyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_610_DEST_CY_L_LEN = 2;
  	/**
	 * serializeIp65504P610DestCyL
	 */
	protected void serializeIp65504P610DestCyL(short ip65504P610DestCyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P610DestCyL,IP_65504_P_610_DEST_CY_L_LEN)
                  ,beginIp65504P610DestCyL
                  ,IP_65504_P_610_DEST_CY_L_LEN
                 );
            localIp65504P610DestCyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P610DestCyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P610DestCyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P610DestCyL() {	 
			return (getShort(beginIp65504P610DestCyL));
   	}
         int localIp65504P611AltTaxSCounter = -1;
         public boolean isIp65504P611AltTaxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P611AltTaxSCounter != sharedCounter;
            localIp65504P611AltTaxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_611_ALT_TAX_S_LEN = 2;
  	/**
	 * serializeIp65504P611AltTaxS
	 */
	protected void serializeIp65504P611AltTaxS(short ip65504P611AltTaxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P611AltTaxS,IP_65504_P_611_ALT_TAX_S_LEN)
                  ,beginIp65504P611AltTaxS
                  ,IP_65504_P_611_ALT_TAX_S_LEN
                 );
            localIp65504P611AltTaxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P611AltTaxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P611AltTaxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P611AltTaxS() {	 
			return (getShort(beginIp65504P611AltTaxS));
   	}
         int localIp65504P611AltTaxLCounter = -1;
         public boolean isIp65504P611AltTaxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P611AltTaxLCounter != sharedCounter;
            localIp65504P611AltTaxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_611_ALT_TAX_L_LEN = 2;
  	/**
	 * serializeIp65504P611AltTaxL
	 */
	protected void serializeIp65504P611AltTaxL(short ip65504P611AltTaxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P611AltTaxL,IP_65504_P_611_ALT_TAX_L_LEN)
                  ,beginIp65504P611AltTaxL
                  ,IP_65504_P_611_ALT_TAX_L_LEN
                 );
            localIp65504P611AltTaxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P611AltTaxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P611AltTaxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P611AltTaxL() {	 
			return (getShort(beginIp65504P611AltTaxL));
   	}
         int localIp65504P612ReservdSCounter = -1;
         public boolean isIp65504P612ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P612ReservdSCounter != sharedCounter;
            localIp65504P612ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_612_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P612ReservdS
	 */
	protected void serializeIp65504P612ReservdS(short ip65504P612ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P612ReservdS,IP_65504_P_612_RESERVD_S_LEN)
                  ,beginIp65504P612ReservdS
                  ,IP_65504_P_612_RESERVD_S_LEN
                 );
            localIp65504P612ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P612ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P612ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P612ReservdS() {	 
			return (getShort(beginIp65504P612ReservdS));
   	}
         int localIp65504P612ReservdLCounter = -1;
         public boolean isIp65504P612ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P612ReservdLCounter != sharedCounter;
            localIp65504P612ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_612_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P612ReservdL
	 */
	protected void serializeIp65504P612ReservdL(short ip65504P612ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P612ReservdL,IP_65504_P_612_RESERVD_L_LEN)
                  ,beginIp65504P612ReservdL
                  ,IP_65504_P_612_RESERVD_L_LEN
                 );
            localIp65504P612ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P612ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P612ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P612ReservdL() {	 
			return (getShort(beginIp65504P612ReservdL));
   	}
         int localIp65504P613ShpZipSCounter = -1;
         public boolean isIp65504P613ShpZipSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P613ShpZipSCounter != sharedCounter;
            localIp65504P613ShpZipSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_613_SHP_ZIP_S_LEN = 2;
  	/**
	 * serializeIp65504P613ShpZipS
	 */
	protected void serializeIp65504P613ShpZipS(short ip65504P613ShpZipS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P613ShpZipS,IP_65504_P_613_SHP_ZIP_S_LEN)
                  ,beginIp65504P613ShpZipS
                  ,IP_65504_P_613_SHP_ZIP_S_LEN
                 );
            localIp65504P613ShpZipSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P613ShpZipSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P613ShpZipS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P613ShpZipS() {	 
			return (getShort(beginIp65504P613ShpZipS));
   	}
         int localIp65504P613ShpZipLCounter = -1;
         public boolean isIp65504P613ShpZipLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P613ShpZipLCounter != sharedCounter;
            localIp65504P613ShpZipLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_613_SHP_ZIP_L_LEN = 2;
  	/**
	 * serializeIp65504P613ShpZipL
	 */
	protected void serializeIp65504P613ShpZipL(short ip65504P613ShpZipL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P613ShpZipL,IP_65504_P_613_SHP_ZIP_L_LEN)
                  ,beginIp65504P613ShpZipL
                  ,IP_65504_P_613_SHP_ZIP_L_LEN
                 );
            localIp65504P613ShpZipLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P613ShpZipLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P613ShpZipL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P613ShpZipL() {	 
			return (getShort(beginIp65504P613ShpZipL));
   	}
         int localIp65504P614OrdDteSCounter = -1;
         public boolean isIp65504P614OrdDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P614OrdDteSCounter != sharedCounter;
            localIp65504P614OrdDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_614_ORD_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504P614OrdDteS
	 */
	protected void serializeIp65504P614OrdDteS(short ip65504P614OrdDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P614OrdDteS,IP_65504_P_614_ORD_DTE_S_LEN)
                  ,beginIp65504P614OrdDteS
                  ,IP_65504_P_614_ORD_DTE_S_LEN
                 );
            localIp65504P614OrdDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P614OrdDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P614OrdDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P614OrdDteS() {	 
			return (getShort(beginIp65504P614OrdDteS));
   	}
         int localIp65504P614OrdDteLCounter = -1;
         public boolean isIp65504P614OrdDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P614OrdDteLCounter != sharedCounter;
            localIp65504P614OrdDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_614_ORD_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504P614OrdDteL
	 */
	protected void serializeIp65504P614OrdDteL(short ip65504P614OrdDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P614OrdDteL,IP_65504_P_614_ORD_DTE_L_LEN)
                  ,beginIp65504P614OrdDteL
                  ,IP_65504_P_614_ORD_DTE_L_LEN
                 );
            localIp65504P614OrdDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P614OrdDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P614OrdDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P614OrdDteL() {	 
			return (getShort(beginIp65504P614OrdDteL));
   	}
         int localIp65504P615ReservdSCounter = -1;
         public boolean isIp65504P615ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P615ReservdSCounter != sharedCounter;
            localIp65504P615ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_615_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P615ReservdS
	 */
	protected void serializeIp65504P615ReservdS(short ip65504P615ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P615ReservdS,IP_65504_P_615_RESERVD_S_LEN)
                  ,beginIp65504P615ReservdS
                  ,IP_65504_P_615_RESERVD_S_LEN
                 );
            localIp65504P615ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P615ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P615ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P615ReservdS() {	 
			return (getShort(beginIp65504P615ReservdS));
   	}
         int localIp65504P615ReservdLCounter = -1;
         public boolean isIp65504P615ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P615ReservdLCounter != sharedCounter;
            localIp65504P615ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_615_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P615ReservdL
	 */
	protected void serializeIp65504P615ReservdL(short ip65504P615ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P615ReservdL,IP_65504_P_615_RESERVD_L_LEN)
                  ,beginIp65504P615ReservdL
                  ,IP_65504_P_615_RESERVD_L_LEN
                 );
            localIp65504P615ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P615ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P615ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P615ReservdL() {	 
			return (getShort(beginIp65504P615ReservdL));
   	}
         int localIp65504P616ReservdSCounter = -1;
         public boolean isIp65504P616ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P616ReservdSCounter != sharedCounter;
            localIp65504P616ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_616_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P616ReservdS
	 */
	protected void serializeIp65504P616ReservdS(short ip65504P616ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P616ReservdS,IP_65504_P_616_RESERVD_S_LEN)
                  ,beginIp65504P616ReservdS
                  ,IP_65504_P_616_RESERVD_S_LEN
                 );
            localIp65504P616ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P616ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P616ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P616ReservdS() {	 
			return (getShort(beginIp65504P616ReservdS));
   	}
         int localIp65504P616ReservdLCounter = -1;
         public boolean isIp65504P616ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P616ReservdLCounter != sharedCounter;
            localIp65504P616ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_616_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P616ReservdL
	 */
	protected void serializeIp65504P616ReservdL(short ip65504P616ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P616ReservdL,IP_65504_P_616_RESERVD_L_LEN)
                  ,beginIp65504P616ReservdL
                  ,IP_65504_P_616_RESERVD_L_LEN
                 );
            localIp65504P616ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P616ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P616ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P616ReservdL() {	 
			return (getShort(beginIp65504P616ReservdL));
   	}
         int localIp65504P617ReservdSCounter = -1;
         public boolean isIp65504P617ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P617ReservdSCounter != sharedCounter;
            localIp65504P617ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_617_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P617ReservdS
	 */
	protected void serializeIp65504P617ReservdS(short ip65504P617ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P617ReservdS,IP_65504_P_617_RESERVD_S_LEN)
                  ,beginIp65504P617ReservdS
                  ,IP_65504_P_617_RESERVD_S_LEN
                 );
            localIp65504P617ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P617ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P617ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P617ReservdS() {	 
			return (getShort(beginIp65504P617ReservdS));
   	}
         int localIp65504P617ReservdLCounter = -1;
         public boolean isIp65504P617ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P617ReservdLCounter != sharedCounter;
            localIp65504P617ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_617_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P617ReservdL
	 */
	protected void serializeIp65504P617ReservdL(short ip65504P617ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P617ReservdL,IP_65504_P_617_RESERVD_L_LEN)
                  ,beginIp65504P617ReservdL
                  ,IP_65504_P_617_RESERVD_L_LEN
                 );
            localIp65504P617ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P617ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P617ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P617ReservdL() {	 
			return (getShort(beginIp65504P617ReservdL));
   	}
         int localIp65504P618ReservdSCounter = -1;
         public boolean isIp65504P618ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P618ReservdSCounter != sharedCounter;
            localIp65504P618ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_618_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P618ReservdS
	 */
	protected void serializeIp65504P618ReservdS(short ip65504P618ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P618ReservdS,IP_65504_P_618_RESERVD_S_LEN)
                  ,beginIp65504P618ReservdS
                  ,IP_65504_P_618_RESERVD_S_LEN
                 );
            localIp65504P618ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P618ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P618ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P618ReservdS() {	 
			return (getShort(beginIp65504P618ReservdS));
   	}
         int localIp65504P618ReservdLCounter = -1;
         public boolean isIp65504P618ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P618ReservdLCounter != sharedCounter;
            localIp65504P618ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_618_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P618ReservdL
	 */
	protected void serializeIp65504P618ReservdL(short ip65504P618ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P618ReservdL,IP_65504_P_618_RESERVD_L_LEN)
                  ,beginIp65504P618ReservdL
                  ,IP_65504_P_618_RESERVD_L_LEN
                 );
            localIp65504P618ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P618ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P618ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P618ReservdL() {	 
			return (getShort(beginIp65504P618ReservdL));
   	}
         int localIp65504P619ReservdSCounter = -1;
         public boolean isIp65504P619ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P619ReservdSCounter != sharedCounter;
            localIp65504P619ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_619_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P619ReservdS
	 */
	protected void serializeIp65504P619ReservdS(short ip65504P619ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P619ReservdS,IP_65504_P_619_RESERVD_S_LEN)
                  ,beginIp65504P619ReservdS
                  ,IP_65504_P_619_RESERVD_S_LEN
                 );
            localIp65504P619ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P619ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P619ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P619ReservdS() {	 
			return (getShort(beginIp65504P619ReservdS));
   	}
         int localIp65504P619ReservdLCounter = -1;
         public boolean isIp65504P619ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P619ReservdLCounter != sharedCounter;
            localIp65504P619ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_619_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P619ReservdL
	 */
	protected void serializeIp65504P619ReservdL(short ip65504P619ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P619ReservdL,IP_65504_P_619_RESERVD_L_LEN)
                  ,beginIp65504P619ReservdL
                  ,IP_65504_P_619_RESERVD_L_LEN
                 );
            localIp65504P619ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P619ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P619ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P619ReservdL() {	 
			return (getShort(beginIp65504P619ReservdL));
   	}
         int localIp65504P620OilconmSCounter = -1;
         public boolean isIp65504P620OilconmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P620OilconmSCounter != sharedCounter;
            localIp65504P620OilconmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_620_OILCONM_S_LEN = 2;
  	/**
	 * serializeIp65504P620OilconmS
	 */
	protected void serializeIp65504P620OilconmS(short ip65504P620OilconmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P620OilconmS,IP_65504_P_620_OILCONM_S_LEN)
                  ,beginIp65504P620OilconmS
                  ,IP_65504_P_620_OILCONM_S_LEN
                 );
            localIp65504P620OilconmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P620OilconmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P620OilconmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P620OilconmS() {	 
			return (getShort(beginIp65504P620OilconmS));
   	}
         int localIp65504P620OilconmLCounter = -1;
         public boolean isIp65504P620OilconmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P620OilconmLCounter != sharedCounter;
            localIp65504P620OilconmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_620_OILCONM_L_LEN = 2;
  	/**
	 * serializeIp65504P620OilconmL
	 */
	protected void serializeIp65504P620OilconmL(short ip65504P620OilconmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P620OilconmL,IP_65504_P_620_OILCONM_L_LEN)
                  ,beginIp65504P620OilconmL
                  ,IP_65504_P_620_OILCONM_L_LEN
                 );
            localIp65504P620OilconmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P620OilconmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P620OilconmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P620OilconmL() {	 
			return (getShort(beginIp65504P620OilconmL));
   	}




}
  
