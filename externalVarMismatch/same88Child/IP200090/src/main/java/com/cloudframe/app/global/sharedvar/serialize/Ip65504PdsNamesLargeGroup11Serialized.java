package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_11_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P311CrRamtS;
            protected  int beginIp65504P311CrRamtL;
            protected  int beginIp65504P312DbNumbS;
            protected  int beginIp65504P312DbNumbL;
            protected  int beginIp65504P313CrNmbrS;
            protected  int beginIp65504P313CrNmbrL;
            protected  int beginIp65504P314DbcbamtS;
            protected  int beginIp65504P314DbcbamtL;
            protected  int beginIp65504P315CrcbamtS;
            protected  int beginIp65504P315CrcbamtL;
            protected  int beginIp65504P316DbrvamtS;
            protected  int beginIp65504P316DbrvamtL;
            protected  int beginIp65504P317CrrvamtS;
            protected  int beginIp65504P317CrrvamtL;
            protected  int beginIp65504P318DbrvfeeS;
            protected  int beginIp65504P318DbrvfeeL;
            protected  int beginIp65504P319CrrvfeeS;
            protected  int beginIp65504P319CrrvfeeL;
            protected  int beginIp65504P320DbrvnbrS;
            protected  int beginIp65504P320DbrvnbrL;
            protected  int beginIp65504P321CrrvnbrS;
            protected  int beginIp65504P321CrrvnbrL;
            protected  int beginIp65504P322DbcbnbrS;
            protected  int beginIp65504P322DbcbnbrL;
            protected  int beginIp65504P323CrcbnbrS;
            protected  int beginIp65504P323CrcbnbrL;
            protected  int beginIp65504P324Db2damtS;
            protected  int beginIp65504P324Db2damtL;
            protected  int beginIp65504P325Cr2damtS;
            protected  int beginIp65504P325Cr2damtL;
            protected  int beginIp65504P326Db2dfeeS;
            protected  int beginIp65504P326Db2dfeeL;
            protected  int beginIp65504P327Cr2dfeeS;
            protected  int beginIp65504P327Cr2dfeeL;
            protected  int beginIp65504P328Dbrv2atS;
            protected  int beginIp65504P328Dbrv2atL;
            protected  int beginIp65504P329Crrv2atS;
            protected  int beginIp65504P329Crrv2atL;
            protected  int beginIp65504P330Dbrv2feS;
            protected  int beginIp65504P330Dbrv2feL;
            protected  int beginIp65504P331Crrv2feS;
            protected  int beginIp65504P331Crrv2feL;
            protected  int beginIp65504P332ReservdS;
            protected  int beginIp65504P332ReservdL;
            protected  int beginIp65504P333ReservdS;
            protected  int beginIp65504P333ReservdL;
            protected  int beginIp65504P334ReservdS;
            protected  int beginIp65504P334ReservdL;
            protected  int beginIp65504P335ReservdS;
            protected  int beginIp65504P335ReservdL;
            protected  int beginIp65504P336ReservdS;
            protected  int beginIp65504P336ReservdL;
            protected  int beginIp65504P337ReservdS;
            protected  int beginIp65504P337ReservdL;
            protected  int beginIp65504P338ReservdS;
            protected  int beginIp65504P338ReservdL;
            protected  int beginIp65504P339ReservdS;
            protected  int beginIp65504P339ReservdL;
            protected  int beginIp65504P340ReservdS;
            protected  int beginIp65504P340ReservdL;
            protected  int beginIp65504P341ReservdS;
            protected  int beginIp65504P341ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup11Serialized
	**/
    public Ip65504PdsNamesLargeGroup11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup11Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup11Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup11Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2476); // serialize this field at offset 2476 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup11Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2476 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P311CrRamtS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P311CrRamtL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P312DbNumbS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P312DbNumbL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P313CrNmbrS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P313CrNmbrL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P314DbcbamtS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P314DbcbamtL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P315CrcbamtS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P315CrcbamtL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P316DbrvamtS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P316DbrvamtL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P317CrrvamtS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P317CrrvamtL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P318DbrvfeeS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P318DbrvfeeL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P319CrrvfeeS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P319CrrvfeeL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P320DbrvnbrS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P320DbrvnbrL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P321CrrvnbrS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P321CrrvnbrL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P322DbcbnbrS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P322DbcbnbrL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P323CrcbnbrS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P323CrcbnbrL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P324Db2damtS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P324Db2damtL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P325Cr2damtS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P325Cr2damtL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P326Db2dfeeS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P326Db2dfeeL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P327Cr2dfeeS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P327Cr2dfeeL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P328Dbrv2atS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P328Dbrv2atL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P329Crrv2atS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P329Crrv2atL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P330Dbrv2feS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P330Dbrv2feL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P331Crrv2feS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P331Crrv2feL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P332ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P332ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P333ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P333ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P334ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P334ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P335ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P335ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P336ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P336ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P337ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P337ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P338ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P338ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P339ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P339ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P340ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P340ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P341ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P341ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P311CrRamtSCounter = -1;
         public boolean isIp65504P311CrRamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P311CrRamtSCounter != sharedCounter;
            localIp65504P311CrRamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_311_CR_RAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P311CrRamtS
	 */
	protected void serializeIp65504P311CrRamtS(short ip65504P311CrRamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P311CrRamtS,IP_65504_P_311_CR_RAMT_S_LEN)
                  ,beginIp65504P311CrRamtS
                  ,IP_65504_P_311_CR_RAMT_S_LEN
                 );
            localIp65504P311CrRamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P311CrRamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P311CrRamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P311CrRamtS() {	 
			return (getShort(beginIp65504P311CrRamtS));
   	}
         int localIp65504P311CrRamtLCounter = -1;
         public boolean isIp65504P311CrRamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P311CrRamtLCounter != sharedCounter;
            localIp65504P311CrRamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_311_CR_RAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P311CrRamtL
	 */
	protected void serializeIp65504P311CrRamtL(short ip65504P311CrRamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P311CrRamtL,IP_65504_P_311_CR_RAMT_L_LEN)
                  ,beginIp65504P311CrRamtL
                  ,IP_65504_P_311_CR_RAMT_L_LEN
                 );
            localIp65504P311CrRamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P311CrRamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P311CrRamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P311CrRamtL() {	 
			return (getShort(beginIp65504P311CrRamtL));
   	}
         int localIp65504P312DbNumbSCounter = -1;
         public boolean isIp65504P312DbNumbSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P312DbNumbSCounter != sharedCounter;
            localIp65504P312DbNumbSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_312_DB_NUMB_S_LEN = 2;
  	/**
	 * serializeIp65504P312DbNumbS
	 */
	protected void serializeIp65504P312DbNumbS(short ip65504P312DbNumbS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P312DbNumbS,IP_65504_P_312_DB_NUMB_S_LEN)
                  ,beginIp65504P312DbNumbS
                  ,IP_65504_P_312_DB_NUMB_S_LEN
                 );
            localIp65504P312DbNumbSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P312DbNumbSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P312DbNumbS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P312DbNumbS() {	 
			return (getShort(beginIp65504P312DbNumbS));
   	}
         int localIp65504P312DbNumbLCounter = -1;
         public boolean isIp65504P312DbNumbLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P312DbNumbLCounter != sharedCounter;
            localIp65504P312DbNumbLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_312_DB_NUMB_L_LEN = 2;
  	/**
	 * serializeIp65504P312DbNumbL
	 */
	protected void serializeIp65504P312DbNumbL(short ip65504P312DbNumbL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P312DbNumbL,IP_65504_P_312_DB_NUMB_L_LEN)
                  ,beginIp65504P312DbNumbL
                  ,IP_65504_P_312_DB_NUMB_L_LEN
                 );
            localIp65504P312DbNumbLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P312DbNumbLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P312DbNumbL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P312DbNumbL() {	 
			return (getShort(beginIp65504P312DbNumbL));
   	}
         int localIp65504P313CrNmbrSCounter = -1;
         public boolean isIp65504P313CrNmbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P313CrNmbrSCounter != sharedCounter;
            localIp65504P313CrNmbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_313_CR_NMBR_S_LEN = 2;
  	/**
	 * serializeIp65504P313CrNmbrS
	 */
	protected void serializeIp65504P313CrNmbrS(short ip65504P313CrNmbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P313CrNmbrS,IP_65504_P_313_CR_NMBR_S_LEN)
                  ,beginIp65504P313CrNmbrS
                  ,IP_65504_P_313_CR_NMBR_S_LEN
                 );
            localIp65504P313CrNmbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P313CrNmbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P313CrNmbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P313CrNmbrS() {	 
			return (getShort(beginIp65504P313CrNmbrS));
   	}
         int localIp65504P313CrNmbrLCounter = -1;
         public boolean isIp65504P313CrNmbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P313CrNmbrLCounter != sharedCounter;
            localIp65504P313CrNmbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_313_CR_NMBR_L_LEN = 2;
  	/**
	 * serializeIp65504P313CrNmbrL
	 */
	protected void serializeIp65504P313CrNmbrL(short ip65504P313CrNmbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P313CrNmbrL,IP_65504_P_313_CR_NMBR_L_LEN)
                  ,beginIp65504P313CrNmbrL
                  ,IP_65504_P_313_CR_NMBR_L_LEN
                 );
            localIp65504P313CrNmbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P313CrNmbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P313CrNmbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P313CrNmbrL() {	 
			return (getShort(beginIp65504P313CrNmbrL));
   	}
         int localIp65504P314DbcbamtSCounter = -1;
         public boolean isIp65504P314DbcbamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P314DbcbamtSCounter != sharedCounter;
            localIp65504P314DbcbamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_314_DBCBAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P314DbcbamtS
	 */
	protected void serializeIp65504P314DbcbamtS(short ip65504P314DbcbamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P314DbcbamtS,IP_65504_P_314_DBCBAMT_S_LEN)
                  ,beginIp65504P314DbcbamtS
                  ,IP_65504_P_314_DBCBAMT_S_LEN
                 );
            localIp65504P314DbcbamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P314DbcbamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P314DbcbamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P314DbcbamtS() {	 
			return (getShort(beginIp65504P314DbcbamtS));
   	}
         int localIp65504P314DbcbamtLCounter = -1;
         public boolean isIp65504P314DbcbamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P314DbcbamtLCounter != sharedCounter;
            localIp65504P314DbcbamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_314_DBCBAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P314DbcbamtL
	 */
	protected void serializeIp65504P314DbcbamtL(short ip65504P314DbcbamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P314DbcbamtL,IP_65504_P_314_DBCBAMT_L_LEN)
                  ,beginIp65504P314DbcbamtL
                  ,IP_65504_P_314_DBCBAMT_L_LEN
                 );
            localIp65504P314DbcbamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P314DbcbamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P314DbcbamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P314DbcbamtL() {	 
			return (getShort(beginIp65504P314DbcbamtL));
   	}
         int localIp65504P315CrcbamtSCounter = -1;
         public boolean isIp65504P315CrcbamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P315CrcbamtSCounter != sharedCounter;
            localIp65504P315CrcbamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_315_CRCBAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P315CrcbamtS
	 */
	protected void serializeIp65504P315CrcbamtS(short ip65504P315CrcbamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P315CrcbamtS,IP_65504_P_315_CRCBAMT_S_LEN)
                  ,beginIp65504P315CrcbamtS
                  ,IP_65504_P_315_CRCBAMT_S_LEN
                 );
            localIp65504P315CrcbamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P315CrcbamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P315CrcbamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P315CrcbamtS() {	 
			return (getShort(beginIp65504P315CrcbamtS));
   	}
         int localIp65504P315CrcbamtLCounter = -1;
         public boolean isIp65504P315CrcbamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P315CrcbamtLCounter != sharedCounter;
            localIp65504P315CrcbamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_315_CRCBAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P315CrcbamtL
	 */
	protected void serializeIp65504P315CrcbamtL(short ip65504P315CrcbamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P315CrcbamtL,IP_65504_P_315_CRCBAMT_L_LEN)
                  ,beginIp65504P315CrcbamtL
                  ,IP_65504_P_315_CRCBAMT_L_LEN
                 );
            localIp65504P315CrcbamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P315CrcbamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P315CrcbamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P315CrcbamtL() {	 
			return (getShort(beginIp65504P315CrcbamtL));
   	}
         int localIp65504P316DbrvamtSCounter = -1;
         public boolean isIp65504P316DbrvamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P316DbrvamtSCounter != sharedCounter;
            localIp65504P316DbrvamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_316_DBRVAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P316DbrvamtS
	 */
	protected void serializeIp65504P316DbrvamtS(short ip65504P316DbrvamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P316DbrvamtS,IP_65504_P_316_DBRVAMT_S_LEN)
                  ,beginIp65504P316DbrvamtS
                  ,IP_65504_P_316_DBRVAMT_S_LEN
                 );
            localIp65504P316DbrvamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P316DbrvamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P316DbrvamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P316DbrvamtS() {	 
			return (getShort(beginIp65504P316DbrvamtS));
   	}
         int localIp65504P316DbrvamtLCounter = -1;
         public boolean isIp65504P316DbrvamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P316DbrvamtLCounter != sharedCounter;
            localIp65504P316DbrvamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_316_DBRVAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P316DbrvamtL
	 */
	protected void serializeIp65504P316DbrvamtL(short ip65504P316DbrvamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P316DbrvamtL,IP_65504_P_316_DBRVAMT_L_LEN)
                  ,beginIp65504P316DbrvamtL
                  ,IP_65504_P_316_DBRVAMT_L_LEN
                 );
            localIp65504P316DbrvamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P316DbrvamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P316DbrvamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P316DbrvamtL() {	 
			return (getShort(beginIp65504P316DbrvamtL));
   	}
         int localIp65504P317CrrvamtSCounter = -1;
         public boolean isIp65504P317CrrvamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P317CrrvamtSCounter != sharedCounter;
            localIp65504P317CrrvamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_317_CRRVAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P317CrrvamtS
	 */
	protected void serializeIp65504P317CrrvamtS(short ip65504P317CrrvamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P317CrrvamtS,IP_65504_P_317_CRRVAMT_S_LEN)
                  ,beginIp65504P317CrrvamtS
                  ,IP_65504_P_317_CRRVAMT_S_LEN
                 );
            localIp65504P317CrrvamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P317CrrvamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P317CrrvamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P317CrrvamtS() {	 
			return (getShort(beginIp65504P317CrrvamtS));
   	}
         int localIp65504P317CrrvamtLCounter = -1;
         public boolean isIp65504P317CrrvamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P317CrrvamtLCounter != sharedCounter;
            localIp65504P317CrrvamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_317_CRRVAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P317CrrvamtL
	 */
	protected void serializeIp65504P317CrrvamtL(short ip65504P317CrrvamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P317CrrvamtL,IP_65504_P_317_CRRVAMT_L_LEN)
                  ,beginIp65504P317CrrvamtL
                  ,IP_65504_P_317_CRRVAMT_L_LEN
                 );
            localIp65504P317CrrvamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P317CrrvamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P317CrrvamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P317CrrvamtL() {	 
			return (getShort(beginIp65504P317CrrvamtL));
   	}
         int localIp65504P318DbrvfeeSCounter = -1;
         public boolean isIp65504P318DbrvfeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P318DbrvfeeSCounter != sharedCounter;
            localIp65504P318DbrvfeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_318_DBRVFEE_S_LEN = 2;
  	/**
	 * serializeIp65504P318DbrvfeeS
	 */
	protected void serializeIp65504P318DbrvfeeS(short ip65504P318DbrvfeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P318DbrvfeeS,IP_65504_P_318_DBRVFEE_S_LEN)
                  ,beginIp65504P318DbrvfeeS
                  ,IP_65504_P_318_DBRVFEE_S_LEN
                 );
            localIp65504P318DbrvfeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P318DbrvfeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P318DbrvfeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P318DbrvfeeS() {	 
			return (getShort(beginIp65504P318DbrvfeeS));
   	}
         int localIp65504P318DbrvfeeLCounter = -1;
         public boolean isIp65504P318DbrvfeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P318DbrvfeeLCounter != sharedCounter;
            localIp65504P318DbrvfeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_318_DBRVFEE_L_LEN = 2;
  	/**
	 * serializeIp65504P318DbrvfeeL
	 */
	protected void serializeIp65504P318DbrvfeeL(short ip65504P318DbrvfeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P318DbrvfeeL,IP_65504_P_318_DBRVFEE_L_LEN)
                  ,beginIp65504P318DbrvfeeL
                  ,IP_65504_P_318_DBRVFEE_L_LEN
                 );
            localIp65504P318DbrvfeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P318DbrvfeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P318DbrvfeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P318DbrvfeeL() {	 
			return (getShort(beginIp65504P318DbrvfeeL));
   	}
         int localIp65504P319CrrvfeeSCounter = -1;
         public boolean isIp65504P319CrrvfeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P319CrrvfeeSCounter != sharedCounter;
            localIp65504P319CrrvfeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_319_CRRVFEE_S_LEN = 2;
  	/**
	 * serializeIp65504P319CrrvfeeS
	 */
	protected void serializeIp65504P319CrrvfeeS(short ip65504P319CrrvfeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P319CrrvfeeS,IP_65504_P_319_CRRVFEE_S_LEN)
                  ,beginIp65504P319CrrvfeeS
                  ,IP_65504_P_319_CRRVFEE_S_LEN
                 );
            localIp65504P319CrrvfeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P319CrrvfeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P319CrrvfeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P319CrrvfeeS() {	 
			return (getShort(beginIp65504P319CrrvfeeS));
   	}
         int localIp65504P319CrrvfeeLCounter = -1;
         public boolean isIp65504P319CrrvfeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P319CrrvfeeLCounter != sharedCounter;
            localIp65504P319CrrvfeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_319_CRRVFEE_L_LEN = 2;
  	/**
	 * serializeIp65504P319CrrvfeeL
	 */
	protected void serializeIp65504P319CrrvfeeL(short ip65504P319CrrvfeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P319CrrvfeeL,IP_65504_P_319_CRRVFEE_L_LEN)
                  ,beginIp65504P319CrrvfeeL
                  ,IP_65504_P_319_CRRVFEE_L_LEN
                 );
            localIp65504P319CrrvfeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P319CrrvfeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P319CrrvfeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P319CrrvfeeL() {	 
			return (getShort(beginIp65504P319CrrvfeeL));
   	}
         int localIp65504P320DbrvnbrSCounter = -1;
         public boolean isIp65504P320DbrvnbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P320DbrvnbrSCounter != sharedCounter;
            localIp65504P320DbrvnbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_320_DBRVNBR_S_LEN = 2;
  	/**
	 * serializeIp65504P320DbrvnbrS
	 */
	protected void serializeIp65504P320DbrvnbrS(short ip65504P320DbrvnbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P320DbrvnbrS,IP_65504_P_320_DBRVNBR_S_LEN)
                  ,beginIp65504P320DbrvnbrS
                  ,IP_65504_P_320_DBRVNBR_S_LEN
                 );
            localIp65504P320DbrvnbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P320DbrvnbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P320DbrvnbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P320DbrvnbrS() {	 
			return (getShort(beginIp65504P320DbrvnbrS));
   	}
         int localIp65504P320DbrvnbrLCounter = -1;
         public boolean isIp65504P320DbrvnbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P320DbrvnbrLCounter != sharedCounter;
            localIp65504P320DbrvnbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_320_DBRVNBR_L_LEN = 2;
  	/**
	 * serializeIp65504P320DbrvnbrL
	 */
	protected void serializeIp65504P320DbrvnbrL(short ip65504P320DbrvnbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P320DbrvnbrL,IP_65504_P_320_DBRVNBR_L_LEN)
                  ,beginIp65504P320DbrvnbrL
                  ,IP_65504_P_320_DBRVNBR_L_LEN
                 );
            localIp65504P320DbrvnbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P320DbrvnbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P320DbrvnbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P320DbrvnbrL() {	 
			return (getShort(beginIp65504P320DbrvnbrL));
   	}
         int localIp65504P321CrrvnbrSCounter = -1;
         public boolean isIp65504P321CrrvnbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P321CrrvnbrSCounter != sharedCounter;
            localIp65504P321CrrvnbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_321_CRRVNBR_S_LEN = 2;
  	/**
	 * serializeIp65504P321CrrvnbrS
	 */
	protected void serializeIp65504P321CrrvnbrS(short ip65504P321CrrvnbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P321CrrvnbrS,IP_65504_P_321_CRRVNBR_S_LEN)
                  ,beginIp65504P321CrrvnbrS
                  ,IP_65504_P_321_CRRVNBR_S_LEN
                 );
            localIp65504P321CrrvnbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P321CrrvnbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P321CrrvnbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P321CrrvnbrS() {	 
			return (getShort(beginIp65504P321CrrvnbrS));
   	}
         int localIp65504P321CrrvnbrLCounter = -1;
         public boolean isIp65504P321CrrvnbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P321CrrvnbrLCounter != sharedCounter;
            localIp65504P321CrrvnbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_321_CRRVNBR_L_LEN = 2;
  	/**
	 * serializeIp65504P321CrrvnbrL
	 */
	protected void serializeIp65504P321CrrvnbrL(short ip65504P321CrrvnbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P321CrrvnbrL,IP_65504_P_321_CRRVNBR_L_LEN)
                  ,beginIp65504P321CrrvnbrL
                  ,IP_65504_P_321_CRRVNBR_L_LEN
                 );
            localIp65504P321CrrvnbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P321CrrvnbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P321CrrvnbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P321CrrvnbrL() {	 
			return (getShort(beginIp65504P321CrrvnbrL));
   	}
         int localIp65504P322DbcbnbrSCounter = -1;
         public boolean isIp65504P322DbcbnbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P322DbcbnbrSCounter != sharedCounter;
            localIp65504P322DbcbnbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_322_DBCBNBR_S_LEN = 2;
  	/**
	 * serializeIp65504P322DbcbnbrS
	 */
	protected void serializeIp65504P322DbcbnbrS(short ip65504P322DbcbnbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P322DbcbnbrS,IP_65504_P_322_DBCBNBR_S_LEN)
                  ,beginIp65504P322DbcbnbrS
                  ,IP_65504_P_322_DBCBNBR_S_LEN
                 );
            localIp65504P322DbcbnbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P322DbcbnbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P322DbcbnbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P322DbcbnbrS() {	 
			return (getShort(beginIp65504P322DbcbnbrS));
   	}
         int localIp65504P322DbcbnbrLCounter = -1;
         public boolean isIp65504P322DbcbnbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P322DbcbnbrLCounter != sharedCounter;
            localIp65504P322DbcbnbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_322_DBCBNBR_L_LEN = 2;
  	/**
	 * serializeIp65504P322DbcbnbrL
	 */
	protected void serializeIp65504P322DbcbnbrL(short ip65504P322DbcbnbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P322DbcbnbrL,IP_65504_P_322_DBCBNBR_L_LEN)
                  ,beginIp65504P322DbcbnbrL
                  ,IP_65504_P_322_DBCBNBR_L_LEN
                 );
            localIp65504P322DbcbnbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P322DbcbnbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P322DbcbnbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P322DbcbnbrL() {	 
			return (getShort(beginIp65504P322DbcbnbrL));
   	}
         int localIp65504P323CrcbnbrSCounter = -1;
         public boolean isIp65504P323CrcbnbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P323CrcbnbrSCounter != sharedCounter;
            localIp65504P323CrcbnbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_323_CRCBNBR_S_LEN = 2;
  	/**
	 * serializeIp65504P323CrcbnbrS
	 */
	protected void serializeIp65504P323CrcbnbrS(short ip65504P323CrcbnbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P323CrcbnbrS,IP_65504_P_323_CRCBNBR_S_LEN)
                  ,beginIp65504P323CrcbnbrS
                  ,IP_65504_P_323_CRCBNBR_S_LEN
                 );
            localIp65504P323CrcbnbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P323CrcbnbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P323CrcbnbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P323CrcbnbrS() {	 
			return (getShort(beginIp65504P323CrcbnbrS));
   	}
         int localIp65504P323CrcbnbrLCounter = -1;
         public boolean isIp65504P323CrcbnbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P323CrcbnbrLCounter != sharedCounter;
            localIp65504P323CrcbnbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_323_CRCBNBR_L_LEN = 2;
  	/**
	 * serializeIp65504P323CrcbnbrL
	 */
	protected void serializeIp65504P323CrcbnbrL(short ip65504P323CrcbnbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P323CrcbnbrL,IP_65504_P_323_CRCBNBR_L_LEN)
                  ,beginIp65504P323CrcbnbrL
                  ,IP_65504_P_323_CRCBNBR_L_LEN
                 );
            localIp65504P323CrcbnbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P323CrcbnbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P323CrcbnbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P323CrcbnbrL() {	 
			return (getShort(beginIp65504P323CrcbnbrL));
   	}
         int localIp65504P324Db2damtSCounter = -1;
         public boolean isIp65504P324Db2damtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P324Db2damtSCounter != sharedCounter;
            localIp65504P324Db2damtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_324_DB_2DAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P324Db2damtS
	 */
	protected void serializeIp65504P324Db2damtS(short ip65504P324Db2damtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P324Db2damtS,IP_65504_P_324_DB_2DAMT_S_LEN)
                  ,beginIp65504P324Db2damtS
                  ,IP_65504_P_324_DB_2DAMT_S_LEN
                 );
            localIp65504P324Db2damtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P324Db2damtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P324Db2damtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P324Db2damtS() {	 
			return (getShort(beginIp65504P324Db2damtS));
   	}
         int localIp65504P324Db2damtLCounter = -1;
         public boolean isIp65504P324Db2damtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P324Db2damtLCounter != sharedCounter;
            localIp65504P324Db2damtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_324_DB_2DAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P324Db2damtL
	 */
	protected void serializeIp65504P324Db2damtL(short ip65504P324Db2damtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P324Db2damtL,IP_65504_P_324_DB_2DAMT_L_LEN)
                  ,beginIp65504P324Db2damtL
                  ,IP_65504_P_324_DB_2DAMT_L_LEN
                 );
            localIp65504P324Db2damtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P324Db2damtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P324Db2damtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P324Db2damtL() {	 
			return (getShort(beginIp65504P324Db2damtL));
   	}
         int localIp65504P325Cr2damtSCounter = -1;
         public boolean isIp65504P325Cr2damtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P325Cr2damtSCounter != sharedCounter;
            localIp65504P325Cr2damtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_325_CR_2DAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P325Cr2damtS
	 */
	protected void serializeIp65504P325Cr2damtS(short ip65504P325Cr2damtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P325Cr2damtS,IP_65504_P_325_CR_2DAMT_S_LEN)
                  ,beginIp65504P325Cr2damtS
                  ,IP_65504_P_325_CR_2DAMT_S_LEN
                 );
            localIp65504P325Cr2damtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P325Cr2damtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P325Cr2damtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P325Cr2damtS() {	 
			return (getShort(beginIp65504P325Cr2damtS));
   	}
         int localIp65504P325Cr2damtLCounter = -1;
         public boolean isIp65504P325Cr2damtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P325Cr2damtLCounter != sharedCounter;
            localIp65504P325Cr2damtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_325_CR_2DAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P325Cr2damtL
	 */
	protected void serializeIp65504P325Cr2damtL(short ip65504P325Cr2damtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P325Cr2damtL,IP_65504_P_325_CR_2DAMT_L_LEN)
                  ,beginIp65504P325Cr2damtL
                  ,IP_65504_P_325_CR_2DAMT_L_LEN
                 );
            localIp65504P325Cr2damtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P325Cr2damtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P325Cr2damtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P325Cr2damtL() {	 
			return (getShort(beginIp65504P325Cr2damtL));
   	}
         int localIp65504P326Db2dfeeSCounter = -1;
         public boolean isIp65504P326Db2dfeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P326Db2dfeeSCounter != sharedCounter;
            localIp65504P326Db2dfeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_326_DB_2DFEE_S_LEN = 2;
  	/**
	 * serializeIp65504P326Db2dfeeS
	 */
	protected void serializeIp65504P326Db2dfeeS(short ip65504P326Db2dfeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P326Db2dfeeS,IP_65504_P_326_DB_2DFEE_S_LEN)
                  ,beginIp65504P326Db2dfeeS
                  ,IP_65504_P_326_DB_2DFEE_S_LEN
                 );
            localIp65504P326Db2dfeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P326Db2dfeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P326Db2dfeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P326Db2dfeeS() {	 
			return (getShort(beginIp65504P326Db2dfeeS));
   	}
         int localIp65504P326Db2dfeeLCounter = -1;
         public boolean isIp65504P326Db2dfeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P326Db2dfeeLCounter != sharedCounter;
            localIp65504P326Db2dfeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_326_DB_2DFEE_L_LEN = 2;
  	/**
	 * serializeIp65504P326Db2dfeeL
	 */
	protected void serializeIp65504P326Db2dfeeL(short ip65504P326Db2dfeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P326Db2dfeeL,IP_65504_P_326_DB_2DFEE_L_LEN)
                  ,beginIp65504P326Db2dfeeL
                  ,IP_65504_P_326_DB_2DFEE_L_LEN
                 );
            localIp65504P326Db2dfeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P326Db2dfeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P326Db2dfeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P326Db2dfeeL() {	 
			return (getShort(beginIp65504P326Db2dfeeL));
   	}
         int localIp65504P327Cr2dfeeSCounter = -1;
         public boolean isIp65504P327Cr2dfeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P327Cr2dfeeSCounter != sharedCounter;
            localIp65504P327Cr2dfeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_327_CR_2DFEE_S_LEN = 2;
  	/**
	 * serializeIp65504P327Cr2dfeeS
	 */
	protected void serializeIp65504P327Cr2dfeeS(short ip65504P327Cr2dfeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P327Cr2dfeeS,IP_65504_P_327_CR_2DFEE_S_LEN)
                  ,beginIp65504P327Cr2dfeeS
                  ,IP_65504_P_327_CR_2DFEE_S_LEN
                 );
            localIp65504P327Cr2dfeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P327Cr2dfeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P327Cr2dfeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P327Cr2dfeeS() {	 
			return (getShort(beginIp65504P327Cr2dfeeS));
   	}
         int localIp65504P327Cr2dfeeLCounter = -1;
         public boolean isIp65504P327Cr2dfeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P327Cr2dfeeLCounter != sharedCounter;
            localIp65504P327Cr2dfeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_327_CR_2DFEE_L_LEN = 2;
  	/**
	 * serializeIp65504P327Cr2dfeeL
	 */
	protected void serializeIp65504P327Cr2dfeeL(short ip65504P327Cr2dfeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P327Cr2dfeeL,IP_65504_P_327_CR_2DFEE_L_LEN)
                  ,beginIp65504P327Cr2dfeeL
                  ,IP_65504_P_327_CR_2DFEE_L_LEN
                 );
            localIp65504P327Cr2dfeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P327Cr2dfeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P327Cr2dfeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P327Cr2dfeeL() {	 
			return (getShort(beginIp65504P327Cr2dfeeL));
   	}
         int localIp65504P328Dbrv2atSCounter = -1;
         public boolean isIp65504P328Dbrv2atSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P328Dbrv2atSCounter != sharedCounter;
            localIp65504P328Dbrv2atSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_328_DBRV_2AT_S_LEN = 2;
  	/**
	 * serializeIp65504P328Dbrv2atS
	 */
	protected void serializeIp65504P328Dbrv2atS(short ip65504P328Dbrv2atS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P328Dbrv2atS,IP_65504_P_328_DBRV_2AT_S_LEN)
                  ,beginIp65504P328Dbrv2atS
                  ,IP_65504_P_328_DBRV_2AT_S_LEN
                 );
            localIp65504P328Dbrv2atSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P328Dbrv2atSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P328Dbrv2atS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P328Dbrv2atS() {	 
			return (getShort(beginIp65504P328Dbrv2atS));
   	}
         int localIp65504P328Dbrv2atLCounter = -1;
         public boolean isIp65504P328Dbrv2atLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P328Dbrv2atLCounter != sharedCounter;
            localIp65504P328Dbrv2atLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_328_DBRV_2AT_L_LEN = 2;
  	/**
	 * serializeIp65504P328Dbrv2atL
	 */
	protected void serializeIp65504P328Dbrv2atL(short ip65504P328Dbrv2atL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P328Dbrv2atL,IP_65504_P_328_DBRV_2AT_L_LEN)
                  ,beginIp65504P328Dbrv2atL
                  ,IP_65504_P_328_DBRV_2AT_L_LEN
                 );
            localIp65504P328Dbrv2atLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P328Dbrv2atLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P328Dbrv2atL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P328Dbrv2atL() {	 
			return (getShort(beginIp65504P328Dbrv2atL));
   	}
         int localIp65504P329Crrv2atSCounter = -1;
         public boolean isIp65504P329Crrv2atSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P329Crrv2atSCounter != sharedCounter;
            localIp65504P329Crrv2atSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_329_CRRV_2AT_S_LEN = 2;
  	/**
	 * serializeIp65504P329Crrv2atS
	 */
	protected void serializeIp65504P329Crrv2atS(short ip65504P329Crrv2atS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P329Crrv2atS,IP_65504_P_329_CRRV_2AT_S_LEN)
                  ,beginIp65504P329Crrv2atS
                  ,IP_65504_P_329_CRRV_2AT_S_LEN
                 );
            localIp65504P329Crrv2atSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P329Crrv2atSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P329Crrv2atS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P329Crrv2atS() {	 
			return (getShort(beginIp65504P329Crrv2atS));
   	}
         int localIp65504P329Crrv2atLCounter = -1;
         public boolean isIp65504P329Crrv2atLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P329Crrv2atLCounter != sharedCounter;
            localIp65504P329Crrv2atLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_329_CRRV_2AT_L_LEN = 2;
  	/**
	 * serializeIp65504P329Crrv2atL
	 */
	protected void serializeIp65504P329Crrv2atL(short ip65504P329Crrv2atL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P329Crrv2atL,IP_65504_P_329_CRRV_2AT_L_LEN)
                  ,beginIp65504P329Crrv2atL
                  ,IP_65504_P_329_CRRV_2AT_L_LEN
                 );
            localIp65504P329Crrv2atLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P329Crrv2atLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P329Crrv2atL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P329Crrv2atL() {	 
			return (getShort(beginIp65504P329Crrv2atL));
   	}
         int localIp65504P330Dbrv2feSCounter = -1;
         public boolean isIp65504P330Dbrv2feSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P330Dbrv2feSCounter != sharedCounter;
            localIp65504P330Dbrv2feSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_330_DBRV_2FE_S_LEN = 2;
  	/**
	 * serializeIp65504P330Dbrv2feS
	 */
	protected void serializeIp65504P330Dbrv2feS(short ip65504P330Dbrv2feS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P330Dbrv2feS,IP_65504_P_330_DBRV_2FE_S_LEN)
                  ,beginIp65504P330Dbrv2feS
                  ,IP_65504_P_330_DBRV_2FE_S_LEN
                 );
            localIp65504P330Dbrv2feSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P330Dbrv2feSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P330Dbrv2feS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P330Dbrv2feS() {	 
			return (getShort(beginIp65504P330Dbrv2feS));
   	}
         int localIp65504P330Dbrv2feLCounter = -1;
         public boolean isIp65504P330Dbrv2feLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P330Dbrv2feLCounter != sharedCounter;
            localIp65504P330Dbrv2feLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_330_DBRV_2FE_L_LEN = 2;
  	/**
	 * serializeIp65504P330Dbrv2feL
	 */
	protected void serializeIp65504P330Dbrv2feL(short ip65504P330Dbrv2feL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P330Dbrv2feL,IP_65504_P_330_DBRV_2FE_L_LEN)
                  ,beginIp65504P330Dbrv2feL
                  ,IP_65504_P_330_DBRV_2FE_L_LEN
                 );
            localIp65504P330Dbrv2feLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P330Dbrv2feLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P330Dbrv2feL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P330Dbrv2feL() {	 
			return (getShort(beginIp65504P330Dbrv2feL));
   	}
         int localIp65504P331Crrv2feSCounter = -1;
         public boolean isIp65504P331Crrv2feSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P331Crrv2feSCounter != sharedCounter;
            localIp65504P331Crrv2feSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_331_CRRV_2FE_S_LEN = 2;
  	/**
	 * serializeIp65504P331Crrv2feS
	 */
	protected void serializeIp65504P331Crrv2feS(short ip65504P331Crrv2feS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P331Crrv2feS,IP_65504_P_331_CRRV_2FE_S_LEN)
                  ,beginIp65504P331Crrv2feS
                  ,IP_65504_P_331_CRRV_2FE_S_LEN
                 );
            localIp65504P331Crrv2feSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P331Crrv2feSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P331Crrv2feS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P331Crrv2feS() {	 
			return (getShort(beginIp65504P331Crrv2feS));
   	}
         int localIp65504P331Crrv2feLCounter = -1;
         public boolean isIp65504P331Crrv2feLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P331Crrv2feLCounter != sharedCounter;
            localIp65504P331Crrv2feLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_331_CRRV_2FE_L_LEN = 2;
  	/**
	 * serializeIp65504P331Crrv2feL
	 */
	protected void serializeIp65504P331Crrv2feL(short ip65504P331Crrv2feL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P331Crrv2feL,IP_65504_P_331_CRRV_2FE_L_LEN)
                  ,beginIp65504P331Crrv2feL
                  ,IP_65504_P_331_CRRV_2FE_L_LEN
                 );
            localIp65504P331Crrv2feLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P331Crrv2feLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P331Crrv2feL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P331Crrv2feL() {	 
			return (getShort(beginIp65504P331Crrv2feL));
   	}
         int localIp65504P332ReservdSCounter = -1;
         public boolean isIp65504P332ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P332ReservdSCounter != sharedCounter;
            localIp65504P332ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_332_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P332ReservdS
	 */
	protected void serializeIp65504P332ReservdS(short ip65504P332ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P332ReservdS,IP_65504_P_332_RESERVD_S_LEN)
                  ,beginIp65504P332ReservdS
                  ,IP_65504_P_332_RESERVD_S_LEN
                 );
            localIp65504P332ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P332ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P332ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P332ReservdS() {	 
			return (getShort(beginIp65504P332ReservdS));
   	}
         int localIp65504P332ReservdLCounter = -1;
         public boolean isIp65504P332ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P332ReservdLCounter != sharedCounter;
            localIp65504P332ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_332_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P332ReservdL
	 */
	protected void serializeIp65504P332ReservdL(short ip65504P332ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P332ReservdL,IP_65504_P_332_RESERVD_L_LEN)
                  ,beginIp65504P332ReservdL
                  ,IP_65504_P_332_RESERVD_L_LEN
                 );
            localIp65504P332ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P332ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P332ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P332ReservdL() {	 
			return (getShort(beginIp65504P332ReservdL));
   	}
         int localIp65504P333ReservdSCounter = -1;
         public boolean isIp65504P333ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P333ReservdSCounter != sharedCounter;
            localIp65504P333ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_333_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P333ReservdS
	 */
	protected void serializeIp65504P333ReservdS(short ip65504P333ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P333ReservdS,IP_65504_P_333_RESERVD_S_LEN)
                  ,beginIp65504P333ReservdS
                  ,IP_65504_P_333_RESERVD_S_LEN
                 );
            localIp65504P333ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P333ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P333ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P333ReservdS() {	 
			return (getShort(beginIp65504P333ReservdS));
   	}
         int localIp65504P333ReservdLCounter = -1;
         public boolean isIp65504P333ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P333ReservdLCounter != sharedCounter;
            localIp65504P333ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_333_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P333ReservdL
	 */
	protected void serializeIp65504P333ReservdL(short ip65504P333ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P333ReservdL,IP_65504_P_333_RESERVD_L_LEN)
                  ,beginIp65504P333ReservdL
                  ,IP_65504_P_333_RESERVD_L_LEN
                 );
            localIp65504P333ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P333ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P333ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P333ReservdL() {	 
			return (getShort(beginIp65504P333ReservdL));
   	}
         int localIp65504P334ReservdSCounter = -1;
         public boolean isIp65504P334ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P334ReservdSCounter != sharedCounter;
            localIp65504P334ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_334_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P334ReservdS
	 */
	protected void serializeIp65504P334ReservdS(short ip65504P334ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P334ReservdS,IP_65504_P_334_RESERVD_S_LEN)
                  ,beginIp65504P334ReservdS
                  ,IP_65504_P_334_RESERVD_S_LEN
                 );
            localIp65504P334ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P334ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P334ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P334ReservdS() {	 
			return (getShort(beginIp65504P334ReservdS));
   	}
         int localIp65504P334ReservdLCounter = -1;
         public boolean isIp65504P334ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P334ReservdLCounter != sharedCounter;
            localIp65504P334ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_334_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P334ReservdL
	 */
	protected void serializeIp65504P334ReservdL(short ip65504P334ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P334ReservdL,IP_65504_P_334_RESERVD_L_LEN)
                  ,beginIp65504P334ReservdL
                  ,IP_65504_P_334_RESERVD_L_LEN
                 );
            localIp65504P334ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P334ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P334ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P334ReservdL() {	 
			return (getShort(beginIp65504P334ReservdL));
   	}
         int localIp65504P335ReservdSCounter = -1;
         public boolean isIp65504P335ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P335ReservdSCounter != sharedCounter;
            localIp65504P335ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_335_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P335ReservdS
	 */
	protected void serializeIp65504P335ReservdS(short ip65504P335ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P335ReservdS,IP_65504_P_335_RESERVD_S_LEN)
                  ,beginIp65504P335ReservdS
                  ,IP_65504_P_335_RESERVD_S_LEN
                 );
            localIp65504P335ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P335ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P335ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P335ReservdS() {	 
			return (getShort(beginIp65504P335ReservdS));
   	}
         int localIp65504P335ReservdLCounter = -1;
         public boolean isIp65504P335ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P335ReservdLCounter != sharedCounter;
            localIp65504P335ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_335_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P335ReservdL
	 */
	protected void serializeIp65504P335ReservdL(short ip65504P335ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P335ReservdL,IP_65504_P_335_RESERVD_L_LEN)
                  ,beginIp65504P335ReservdL
                  ,IP_65504_P_335_RESERVD_L_LEN
                 );
            localIp65504P335ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P335ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P335ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P335ReservdL() {	 
			return (getShort(beginIp65504P335ReservdL));
   	}
         int localIp65504P336ReservdSCounter = -1;
         public boolean isIp65504P336ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P336ReservdSCounter != sharedCounter;
            localIp65504P336ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_336_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P336ReservdS
	 */
	protected void serializeIp65504P336ReservdS(short ip65504P336ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P336ReservdS,IP_65504_P_336_RESERVD_S_LEN)
                  ,beginIp65504P336ReservdS
                  ,IP_65504_P_336_RESERVD_S_LEN
                 );
            localIp65504P336ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P336ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P336ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P336ReservdS() {	 
			return (getShort(beginIp65504P336ReservdS));
   	}
         int localIp65504P336ReservdLCounter = -1;
         public boolean isIp65504P336ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P336ReservdLCounter != sharedCounter;
            localIp65504P336ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_336_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P336ReservdL
	 */
	protected void serializeIp65504P336ReservdL(short ip65504P336ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P336ReservdL,IP_65504_P_336_RESERVD_L_LEN)
                  ,beginIp65504P336ReservdL
                  ,IP_65504_P_336_RESERVD_L_LEN
                 );
            localIp65504P336ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P336ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P336ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P336ReservdL() {	 
			return (getShort(beginIp65504P336ReservdL));
   	}
         int localIp65504P337ReservdSCounter = -1;
         public boolean isIp65504P337ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P337ReservdSCounter != sharedCounter;
            localIp65504P337ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_337_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P337ReservdS
	 */
	protected void serializeIp65504P337ReservdS(short ip65504P337ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P337ReservdS,IP_65504_P_337_RESERVD_S_LEN)
                  ,beginIp65504P337ReservdS
                  ,IP_65504_P_337_RESERVD_S_LEN
                 );
            localIp65504P337ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P337ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P337ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P337ReservdS() {	 
			return (getShort(beginIp65504P337ReservdS));
   	}
         int localIp65504P337ReservdLCounter = -1;
         public boolean isIp65504P337ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P337ReservdLCounter != sharedCounter;
            localIp65504P337ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_337_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P337ReservdL
	 */
	protected void serializeIp65504P337ReservdL(short ip65504P337ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P337ReservdL,IP_65504_P_337_RESERVD_L_LEN)
                  ,beginIp65504P337ReservdL
                  ,IP_65504_P_337_RESERVD_L_LEN
                 );
            localIp65504P337ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P337ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P337ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P337ReservdL() {	 
			return (getShort(beginIp65504P337ReservdL));
   	}
         int localIp65504P338ReservdSCounter = -1;
         public boolean isIp65504P338ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P338ReservdSCounter != sharedCounter;
            localIp65504P338ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_338_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P338ReservdS
	 */
	protected void serializeIp65504P338ReservdS(short ip65504P338ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P338ReservdS,IP_65504_P_338_RESERVD_S_LEN)
                  ,beginIp65504P338ReservdS
                  ,IP_65504_P_338_RESERVD_S_LEN
                 );
            localIp65504P338ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P338ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P338ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P338ReservdS() {	 
			return (getShort(beginIp65504P338ReservdS));
   	}
         int localIp65504P338ReservdLCounter = -1;
         public boolean isIp65504P338ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P338ReservdLCounter != sharedCounter;
            localIp65504P338ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_338_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P338ReservdL
	 */
	protected void serializeIp65504P338ReservdL(short ip65504P338ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P338ReservdL,IP_65504_P_338_RESERVD_L_LEN)
                  ,beginIp65504P338ReservdL
                  ,IP_65504_P_338_RESERVD_L_LEN
                 );
            localIp65504P338ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P338ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P338ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P338ReservdL() {	 
			return (getShort(beginIp65504P338ReservdL));
   	}
         int localIp65504P339ReservdSCounter = -1;
         public boolean isIp65504P339ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P339ReservdSCounter != sharedCounter;
            localIp65504P339ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_339_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P339ReservdS
	 */
	protected void serializeIp65504P339ReservdS(short ip65504P339ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P339ReservdS,IP_65504_P_339_RESERVD_S_LEN)
                  ,beginIp65504P339ReservdS
                  ,IP_65504_P_339_RESERVD_S_LEN
                 );
            localIp65504P339ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P339ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P339ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P339ReservdS() {	 
			return (getShort(beginIp65504P339ReservdS));
   	}
         int localIp65504P339ReservdLCounter = -1;
         public boolean isIp65504P339ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P339ReservdLCounter != sharedCounter;
            localIp65504P339ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_339_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P339ReservdL
	 */
	protected void serializeIp65504P339ReservdL(short ip65504P339ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P339ReservdL,IP_65504_P_339_RESERVD_L_LEN)
                  ,beginIp65504P339ReservdL
                  ,IP_65504_P_339_RESERVD_L_LEN
                 );
            localIp65504P339ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P339ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P339ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P339ReservdL() {	 
			return (getShort(beginIp65504P339ReservdL));
   	}
         int localIp65504P340ReservdSCounter = -1;
         public boolean isIp65504P340ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P340ReservdSCounter != sharedCounter;
            localIp65504P340ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_340_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P340ReservdS
	 */
	protected void serializeIp65504P340ReservdS(short ip65504P340ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P340ReservdS,IP_65504_P_340_RESERVD_S_LEN)
                  ,beginIp65504P340ReservdS
                  ,IP_65504_P_340_RESERVD_S_LEN
                 );
            localIp65504P340ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P340ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P340ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P340ReservdS() {	 
			return (getShort(beginIp65504P340ReservdS));
   	}
         int localIp65504P340ReservdLCounter = -1;
         public boolean isIp65504P340ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P340ReservdLCounter != sharedCounter;
            localIp65504P340ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_340_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P340ReservdL
	 */
	protected void serializeIp65504P340ReservdL(short ip65504P340ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P340ReservdL,IP_65504_P_340_RESERVD_L_LEN)
                  ,beginIp65504P340ReservdL
                  ,IP_65504_P_340_RESERVD_L_LEN
                 );
            localIp65504P340ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P340ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P340ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P340ReservdL() {	 
			return (getShort(beginIp65504P340ReservdL));
   	}
         int localIp65504P341ReservdSCounter = -1;
         public boolean isIp65504P341ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P341ReservdSCounter != sharedCounter;
            localIp65504P341ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_341_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P341ReservdS
	 */
	protected void serializeIp65504P341ReservdS(short ip65504P341ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P341ReservdS,IP_65504_P_341_RESERVD_S_LEN)
                  ,beginIp65504P341ReservdS
                  ,IP_65504_P_341_RESERVD_S_LEN
                 );
            localIp65504P341ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P341ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P341ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P341ReservdS() {	 
			return (getShort(beginIp65504P341ReservdS));
   	}
         int localIp65504P341ReservdLCounter = -1;
         public boolean isIp65504P341ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P341ReservdLCounter != sharedCounter;
            localIp65504P341ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_341_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P341ReservdL
	 */
	protected void serializeIp65504P341ReservdL(short ip65504P341ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P341ReservdL,IP_65504_P_341_RESERVD_L_LEN)
                  ,beginIp65504P341ReservdL
                  ,IP_65504_P_341_RESERVD_L_LEN
                 );
            localIp65504P341ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P341ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P341ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P341ReservdL() {	 
			return (getShort(beginIp65504P341ReservdL));
   	}




}
  
