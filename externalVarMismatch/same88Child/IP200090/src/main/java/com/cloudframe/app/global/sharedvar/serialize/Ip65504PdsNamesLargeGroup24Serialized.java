package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup24Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup24Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup24Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_24_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P714ExchngTktamtS;
            protected  int beginIp65504P714ExchngTktamtL;
            protected  int beginIp65504P715ExchngFeeamtS;
            protected  int beginIp65504P715ExchngFeeamtL;
            protected  int beginIp65504P716TravlAuthCdS;
            protected  int beginIp65504P716TravlAuthCdL;
            protected  int beginIp65504P717IataClientS;
            protected  int beginIp65504P717IataClientL;
            protected  int beginIp65504P718CardAccPhnoS;
            protected  int beginIp65504P718CardAccPhnoL;
            protected  int beginIp65504P719ReservdS;
            protected  int beginIp65504P719ReservdL;
            protected  int beginIp65504P720ReservdS;
            protected  int beginIp65504P720ReservdL;
            protected  int beginIp65504P721ReservdS;
            protected  int beginIp65504P721ReservdL;
            protected  int beginIp65504P722ReservdS;
            protected  int beginIp65504P722ReservdL;
            protected  int beginIp65504P723ReservdS;
            protected  int beginIp65504P723ReservdL;
            protected  int beginIp65504P724ReservdS;
            protected  int beginIp65504P724ReservdL;
            protected  int beginIp65504P725ReservdS;
            protected  int beginIp65504P725ReservdL;
            protected  int beginIp65504P726ReservdS;
            protected  int beginIp65504P726ReservdL;
            protected  int beginIp65504P727ReservdS;
            protected  int beginIp65504P727ReservdL;
            protected  int beginIp65504P728ReservdS;
            protected  int beginIp65504P728ReservdL;
            protected  int beginIp65504P729ReservdS;
            protected  int beginIp65504P729ReservdL;
            protected  int beginIp65504P730ReservdS;
            protected  int beginIp65504P730ReservdL;
            protected  int beginIp65504P731ReservdS;
            protected  int beginIp65504P731ReservdL;
            protected  int beginIp65504P732ReservdS;
            protected  int beginIp65504P732ReservdL;
            protected  int beginIp65504P733ReservdS;
            protected  int beginIp65504P733ReservdL;
            protected  int beginIp65504P734ReservdS;
            protected  int beginIp65504P734ReservdL;
            protected  int beginIp65504P735ReservdS;
            protected  int beginIp65504P735ReservdL;
            protected  int beginIp65504P736ReservdS;
            protected  int beginIp65504P736ReservdL;
            protected  int beginIp65504P737ReservdS;
            protected  int beginIp65504P737ReservdL;
            protected  int beginIp65504P738ReservdS;
            protected  int beginIp65504P738ReservdL;
            protected  int beginIp65504P739ReservdS;
            protected  int beginIp65504P739ReservdL;
            protected  int beginIp65504P740ReservdS;
            protected  int beginIp65504P740ReservdL;
            protected  int beginIp65504P741ReservdS;
            protected  int beginIp65504P741ReservdL;
            protected  int beginIp65504P742ReservdS;
            protected  int beginIp65504P742ReservdL;
            protected  int beginIp65504P743ReservdS;
            protected  int beginIp65504P743ReservdL;
            protected  int beginIp65504P744ReservdS;
            protected  int beginIp65504P744ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup24Serialized
	**/
    public Ip65504PdsNamesLargeGroup24Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup24Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup24Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup24Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5700); // serialize this field at offset 5700 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup24Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5700 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup24Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_24_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P714ExchngTktamtS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P714ExchngTktamtL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P715ExchngFeeamtS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P715ExchngFeeamtL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P716TravlAuthCdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P716TravlAuthCdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P717IataClientS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P717IataClientL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P718CardAccPhnoS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P718CardAccPhnoL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P719ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P719ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P720ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P720ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P721ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P721ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P722ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P722ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P723ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P723ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P724ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P724ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P725ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P725ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P726ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P726ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P727ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P727ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P728ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P728ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P729ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P729ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P730ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P730ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P731ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P731ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P732ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P732ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P733ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P733ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P734ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P734ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P735ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P735ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P736ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P736ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P737ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P737ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P738ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P738ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P739ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P739ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P740ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P740ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P741ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P741ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P742ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P742ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P743ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P743ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P744ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P744ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P714ExchngTktamtSCounter = -1;
         public boolean isIp65504P714ExchngTktamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P714ExchngTktamtSCounter != sharedCounter;
            localIp65504P714ExchngTktamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_714_EXCHNG_TKTAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P714ExchngTktamtS
	 */
	protected void serializeIp65504P714ExchngTktamtS(short ip65504P714ExchngTktamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P714ExchngTktamtS,IP_65504_P_714_EXCHNG_TKTAMT_S_LEN)
                  ,beginIp65504P714ExchngTktamtS
                  ,IP_65504_P_714_EXCHNG_TKTAMT_S_LEN
                 );
            localIp65504P714ExchngTktamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P714ExchngTktamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P714ExchngTktamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P714ExchngTktamtS() {	 
			return (getShort(beginIp65504P714ExchngTktamtS));
   	}
         int localIp65504P714ExchngTktamtLCounter = -1;
         public boolean isIp65504P714ExchngTktamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P714ExchngTktamtLCounter != sharedCounter;
            localIp65504P714ExchngTktamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_714_EXCHNG_TKTAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P714ExchngTktamtL
	 */
	protected void serializeIp65504P714ExchngTktamtL(short ip65504P714ExchngTktamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P714ExchngTktamtL,IP_65504_P_714_EXCHNG_TKTAMT_L_LEN)
                  ,beginIp65504P714ExchngTktamtL
                  ,IP_65504_P_714_EXCHNG_TKTAMT_L_LEN
                 );
            localIp65504P714ExchngTktamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P714ExchngTktamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P714ExchngTktamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P714ExchngTktamtL() {	 
			return (getShort(beginIp65504P714ExchngTktamtL));
   	}
         int localIp65504P715ExchngFeeamtSCounter = -1;
         public boolean isIp65504P715ExchngFeeamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P715ExchngFeeamtSCounter != sharedCounter;
            localIp65504P715ExchngFeeamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_715_EXCHNG_FEEAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P715ExchngFeeamtS
	 */
	protected void serializeIp65504P715ExchngFeeamtS(short ip65504P715ExchngFeeamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P715ExchngFeeamtS,IP_65504_P_715_EXCHNG_FEEAMT_S_LEN)
                  ,beginIp65504P715ExchngFeeamtS
                  ,IP_65504_P_715_EXCHNG_FEEAMT_S_LEN
                 );
            localIp65504P715ExchngFeeamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P715ExchngFeeamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P715ExchngFeeamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P715ExchngFeeamtS() {	 
			return (getShort(beginIp65504P715ExchngFeeamtS));
   	}
         int localIp65504P715ExchngFeeamtLCounter = -1;
         public boolean isIp65504P715ExchngFeeamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P715ExchngFeeamtLCounter != sharedCounter;
            localIp65504P715ExchngFeeamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_715_EXCHNG_FEEAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P715ExchngFeeamtL
	 */
	protected void serializeIp65504P715ExchngFeeamtL(short ip65504P715ExchngFeeamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P715ExchngFeeamtL,IP_65504_P_715_EXCHNG_FEEAMT_L_LEN)
                  ,beginIp65504P715ExchngFeeamtL
                  ,IP_65504_P_715_EXCHNG_FEEAMT_L_LEN
                 );
            localIp65504P715ExchngFeeamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P715ExchngFeeamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P715ExchngFeeamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P715ExchngFeeamtL() {	 
			return (getShort(beginIp65504P715ExchngFeeamtL));
   	}
         int localIp65504P716TravlAuthCdSCounter = -1;
         public boolean isIp65504P716TravlAuthCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P716TravlAuthCdSCounter != sharedCounter;
            localIp65504P716TravlAuthCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_716_TRAVL_AUTH_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P716TravlAuthCdS
	 */
	protected void serializeIp65504P716TravlAuthCdS(short ip65504P716TravlAuthCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P716TravlAuthCdS,IP_65504_P_716_TRAVL_AUTH_CD_S_LEN)
                  ,beginIp65504P716TravlAuthCdS
                  ,IP_65504_P_716_TRAVL_AUTH_CD_S_LEN
                 );
            localIp65504P716TravlAuthCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P716TravlAuthCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P716TravlAuthCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P716TravlAuthCdS() {	 
			return (getShort(beginIp65504P716TravlAuthCdS));
   	}
         int localIp65504P716TravlAuthCdLCounter = -1;
         public boolean isIp65504P716TravlAuthCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P716TravlAuthCdLCounter != sharedCounter;
            localIp65504P716TravlAuthCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_716_TRAVL_AUTH_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P716TravlAuthCdL
	 */
	protected void serializeIp65504P716TravlAuthCdL(short ip65504P716TravlAuthCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P716TravlAuthCdL,IP_65504_P_716_TRAVL_AUTH_CD_L_LEN)
                  ,beginIp65504P716TravlAuthCdL
                  ,IP_65504_P_716_TRAVL_AUTH_CD_L_LEN
                 );
            localIp65504P716TravlAuthCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P716TravlAuthCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P716TravlAuthCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P716TravlAuthCdL() {	 
			return (getShort(beginIp65504P716TravlAuthCdL));
   	}
         int localIp65504P717IataClientSCounter = -1;
         public boolean isIp65504P717IataClientSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P717IataClientSCounter != sharedCounter;
            localIp65504P717IataClientSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_717_IATA_CLIENT_S_LEN = 2;
  	/**
	 * serializeIp65504P717IataClientS
	 */
	protected void serializeIp65504P717IataClientS(short ip65504P717IataClientS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P717IataClientS,IP_65504_P_717_IATA_CLIENT_S_LEN)
                  ,beginIp65504P717IataClientS
                  ,IP_65504_P_717_IATA_CLIENT_S_LEN
                 );
            localIp65504P717IataClientSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P717IataClientSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P717IataClientS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P717IataClientS() {	 
			return (getShort(beginIp65504P717IataClientS));
   	}
         int localIp65504P717IataClientLCounter = -1;
         public boolean isIp65504P717IataClientLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P717IataClientLCounter != sharedCounter;
            localIp65504P717IataClientLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_717_IATA_CLIENT_L_LEN = 2;
  	/**
	 * serializeIp65504P717IataClientL
	 */
	protected void serializeIp65504P717IataClientL(short ip65504P717IataClientL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P717IataClientL,IP_65504_P_717_IATA_CLIENT_L_LEN)
                  ,beginIp65504P717IataClientL
                  ,IP_65504_P_717_IATA_CLIENT_L_LEN
                 );
            localIp65504P717IataClientLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P717IataClientLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P717IataClientL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P717IataClientL() {	 
			return (getShort(beginIp65504P717IataClientL));
   	}
         int localIp65504P718CardAccPhnoSCounter = -1;
         public boolean isIp65504P718CardAccPhnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P718CardAccPhnoSCounter != sharedCounter;
            localIp65504P718CardAccPhnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_718_CARD_ACC_PHNO_S_LEN = 2;
  	/**
	 * serializeIp65504P718CardAccPhnoS
	 */
	protected void serializeIp65504P718CardAccPhnoS(short ip65504P718CardAccPhnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P718CardAccPhnoS,IP_65504_P_718_CARD_ACC_PHNO_S_LEN)
                  ,beginIp65504P718CardAccPhnoS
                  ,IP_65504_P_718_CARD_ACC_PHNO_S_LEN
                 );
            localIp65504P718CardAccPhnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P718CardAccPhnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P718CardAccPhnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P718CardAccPhnoS() {	 
			return (getShort(beginIp65504P718CardAccPhnoS));
   	}
         int localIp65504P718CardAccPhnoLCounter = -1;
         public boolean isIp65504P718CardAccPhnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P718CardAccPhnoLCounter != sharedCounter;
            localIp65504P718CardAccPhnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_718_CARD_ACC_PHNO_L_LEN = 2;
  	/**
	 * serializeIp65504P718CardAccPhnoL
	 */
	protected void serializeIp65504P718CardAccPhnoL(short ip65504P718CardAccPhnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P718CardAccPhnoL,IP_65504_P_718_CARD_ACC_PHNO_L_LEN)
                  ,beginIp65504P718CardAccPhnoL
                  ,IP_65504_P_718_CARD_ACC_PHNO_L_LEN
                 );
            localIp65504P718CardAccPhnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P718CardAccPhnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P718CardAccPhnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P718CardAccPhnoL() {	 
			return (getShort(beginIp65504P718CardAccPhnoL));
   	}
         int localIp65504P719ReservdSCounter = -1;
         public boolean isIp65504P719ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P719ReservdSCounter != sharedCounter;
            localIp65504P719ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_719_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P719ReservdS
	 */
	protected void serializeIp65504P719ReservdS(short ip65504P719ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P719ReservdS,IP_65504_P_719_RESERVD_S_LEN)
                  ,beginIp65504P719ReservdS
                  ,IP_65504_P_719_RESERVD_S_LEN
                 );
            localIp65504P719ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P719ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P719ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P719ReservdS() {	 
			return (getShort(beginIp65504P719ReservdS));
   	}
         int localIp65504P719ReservdLCounter = -1;
         public boolean isIp65504P719ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P719ReservdLCounter != sharedCounter;
            localIp65504P719ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_719_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P719ReservdL
	 */
	protected void serializeIp65504P719ReservdL(short ip65504P719ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P719ReservdL,IP_65504_P_719_RESERVD_L_LEN)
                  ,beginIp65504P719ReservdL
                  ,IP_65504_P_719_RESERVD_L_LEN
                 );
            localIp65504P719ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P719ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P719ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P719ReservdL() {	 
			return (getShort(beginIp65504P719ReservdL));
   	}
         int localIp65504P720ReservdSCounter = -1;
         public boolean isIp65504P720ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P720ReservdSCounter != sharedCounter;
            localIp65504P720ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_720_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P720ReservdS
	 */
	protected void serializeIp65504P720ReservdS(short ip65504P720ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P720ReservdS,IP_65504_P_720_RESERVD_S_LEN)
                  ,beginIp65504P720ReservdS
                  ,IP_65504_P_720_RESERVD_S_LEN
                 );
            localIp65504P720ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P720ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P720ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P720ReservdS() {	 
			return (getShort(beginIp65504P720ReservdS));
   	}
         int localIp65504P720ReservdLCounter = -1;
         public boolean isIp65504P720ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P720ReservdLCounter != sharedCounter;
            localIp65504P720ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_720_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P720ReservdL
	 */
	protected void serializeIp65504P720ReservdL(short ip65504P720ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P720ReservdL,IP_65504_P_720_RESERVD_L_LEN)
                  ,beginIp65504P720ReservdL
                  ,IP_65504_P_720_RESERVD_L_LEN
                 );
            localIp65504P720ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P720ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P720ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P720ReservdL() {	 
			return (getShort(beginIp65504P720ReservdL));
   	}
         int localIp65504P721ReservdSCounter = -1;
         public boolean isIp65504P721ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P721ReservdSCounter != sharedCounter;
            localIp65504P721ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_721_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P721ReservdS
	 */
	protected void serializeIp65504P721ReservdS(short ip65504P721ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P721ReservdS,IP_65504_P_721_RESERVD_S_LEN)
                  ,beginIp65504P721ReservdS
                  ,IP_65504_P_721_RESERVD_S_LEN
                 );
            localIp65504P721ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P721ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P721ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P721ReservdS() {	 
			return (getShort(beginIp65504P721ReservdS));
   	}
         int localIp65504P721ReservdLCounter = -1;
         public boolean isIp65504P721ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P721ReservdLCounter != sharedCounter;
            localIp65504P721ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_721_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P721ReservdL
	 */
	protected void serializeIp65504P721ReservdL(short ip65504P721ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P721ReservdL,IP_65504_P_721_RESERVD_L_LEN)
                  ,beginIp65504P721ReservdL
                  ,IP_65504_P_721_RESERVD_L_LEN
                 );
            localIp65504P721ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P721ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P721ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P721ReservdL() {	 
			return (getShort(beginIp65504P721ReservdL));
   	}
         int localIp65504P722ReservdSCounter = -1;
         public boolean isIp65504P722ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P722ReservdSCounter != sharedCounter;
            localIp65504P722ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_722_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P722ReservdS
	 */
	protected void serializeIp65504P722ReservdS(short ip65504P722ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P722ReservdS,IP_65504_P_722_RESERVD_S_LEN)
                  ,beginIp65504P722ReservdS
                  ,IP_65504_P_722_RESERVD_S_LEN
                 );
            localIp65504P722ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P722ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P722ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P722ReservdS() {	 
			return (getShort(beginIp65504P722ReservdS));
   	}
         int localIp65504P722ReservdLCounter = -1;
         public boolean isIp65504P722ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P722ReservdLCounter != sharedCounter;
            localIp65504P722ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_722_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P722ReservdL
	 */
	protected void serializeIp65504P722ReservdL(short ip65504P722ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P722ReservdL,IP_65504_P_722_RESERVD_L_LEN)
                  ,beginIp65504P722ReservdL
                  ,IP_65504_P_722_RESERVD_L_LEN
                 );
            localIp65504P722ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P722ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P722ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P722ReservdL() {	 
			return (getShort(beginIp65504P722ReservdL));
   	}
         int localIp65504P723ReservdSCounter = -1;
         public boolean isIp65504P723ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P723ReservdSCounter != sharedCounter;
            localIp65504P723ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_723_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P723ReservdS
	 */
	protected void serializeIp65504P723ReservdS(short ip65504P723ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P723ReservdS,IP_65504_P_723_RESERVD_S_LEN)
                  ,beginIp65504P723ReservdS
                  ,IP_65504_P_723_RESERVD_S_LEN
                 );
            localIp65504P723ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P723ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P723ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P723ReservdS() {	 
			return (getShort(beginIp65504P723ReservdS));
   	}
         int localIp65504P723ReservdLCounter = -1;
         public boolean isIp65504P723ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P723ReservdLCounter != sharedCounter;
            localIp65504P723ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_723_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P723ReservdL
	 */
	protected void serializeIp65504P723ReservdL(short ip65504P723ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P723ReservdL,IP_65504_P_723_RESERVD_L_LEN)
                  ,beginIp65504P723ReservdL
                  ,IP_65504_P_723_RESERVD_L_LEN
                 );
            localIp65504P723ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P723ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P723ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P723ReservdL() {	 
			return (getShort(beginIp65504P723ReservdL));
   	}
         int localIp65504P724ReservdSCounter = -1;
         public boolean isIp65504P724ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P724ReservdSCounter != sharedCounter;
            localIp65504P724ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_724_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P724ReservdS
	 */
	protected void serializeIp65504P724ReservdS(short ip65504P724ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P724ReservdS,IP_65504_P_724_RESERVD_S_LEN)
                  ,beginIp65504P724ReservdS
                  ,IP_65504_P_724_RESERVD_S_LEN
                 );
            localIp65504P724ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P724ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P724ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P724ReservdS() {	 
			return (getShort(beginIp65504P724ReservdS));
   	}
         int localIp65504P724ReservdLCounter = -1;
         public boolean isIp65504P724ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P724ReservdLCounter != sharedCounter;
            localIp65504P724ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_724_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P724ReservdL
	 */
	protected void serializeIp65504P724ReservdL(short ip65504P724ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P724ReservdL,IP_65504_P_724_RESERVD_L_LEN)
                  ,beginIp65504P724ReservdL
                  ,IP_65504_P_724_RESERVD_L_LEN
                 );
            localIp65504P724ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P724ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P724ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P724ReservdL() {	 
			return (getShort(beginIp65504P724ReservdL));
   	}
         int localIp65504P725ReservdSCounter = -1;
         public boolean isIp65504P725ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P725ReservdSCounter != sharedCounter;
            localIp65504P725ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_725_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P725ReservdS
	 */
	protected void serializeIp65504P725ReservdS(short ip65504P725ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P725ReservdS,IP_65504_P_725_RESERVD_S_LEN)
                  ,beginIp65504P725ReservdS
                  ,IP_65504_P_725_RESERVD_S_LEN
                 );
            localIp65504P725ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P725ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P725ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P725ReservdS() {	 
			return (getShort(beginIp65504P725ReservdS));
   	}
         int localIp65504P725ReservdLCounter = -1;
         public boolean isIp65504P725ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P725ReservdLCounter != sharedCounter;
            localIp65504P725ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_725_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P725ReservdL
	 */
	protected void serializeIp65504P725ReservdL(short ip65504P725ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P725ReservdL,IP_65504_P_725_RESERVD_L_LEN)
                  ,beginIp65504P725ReservdL
                  ,IP_65504_P_725_RESERVD_L_LEN
                 );
            localIp65504P725ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P725ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P725ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P725ReservdL() {	 
			return (getShort(beginIp65504P725ReservdL));
   	}
         int localIp65504P726ReservdSCounter = -1;
         public boolean isIp65504P726ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P726ReservdSCounter != sharedCounter;
            localIp65504P726ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_726_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P726ReservdS
	 */
	protected void serializeIp65504P726ReservdS(short ip65504P726ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P726ReservdS,IP_65504_P_726_RESERVD_S_LEN)
                  ,beginIp65504P726ReservdS
                  ,IP_65504_P_726_RESERVD_S_LEN
                 );
            localIp65504P726ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P726ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P726ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P726ReservdS() {	 
			return (getShort(beginIp65504P726ReservdS));
   	}
         int localIp65504P726ReservdLCounter = -1;
         public boolean isIp65504P726ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P726ReservdLCounter != sharedCounter;
            localIp65504P726ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_726_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P726ReservdL
	 */
	protected void serializeIp65504P726ReservdL(short ip65504P726ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P726ReservdL,IP_65504_P_726_RESERVD_L_LEN)
                  ,beginIp65504P726ReservdL
                  ,IP_65504_P_726_RESERVD_L_LEN
                 );
            localIp65504P726ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P726ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P726ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P726ReservdL() {	 
			return (getShort(beginIp65504P726ReservdL));
   	}
         int localIp65504P727ReservdSCounter = -1;
         public boolean isIp65504P727ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P727ReservdSCounter != sharedCounter;
            localIp65504P727ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_727_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P727ReservdS
	 */
	protected void serializeIp65504P727ReservdS(short ip65504P727ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P727ReservdS,IP_65504_P_727_RESERVD_S_LEN)
                  ,beginIp65504P727ReservdS
                  ,IP_65504_P_727_RESERVD_S_LEN
                 );
            localIp65504P727ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P727ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P727ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P727ReservdS() {	 
			return (getShort(beginIp65504P727ReservdS));
   	}
         int localIp65504P727ReservdLCounter = -1;
         public boolean isIp65504P727ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P727ReservdLCounter != sharedCounter;
            localIp65504P727ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_727_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P727ReservdL
	 */
	protected void serializeIp65504P727ReservdL(short ip65504P727ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P727ReservdL,IP_65504_P_727_RESERVD_L_LEN)
                  ,beginIp65504P727ReservdL
                  ,IP_65504_P_727_RESERVD_L_LEN
                 );
            localIp65504P727ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P727ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P727ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P727ReservdL() {	 
			return (getShort(beginIp65504P727ReservdL));
   	}
         int localIp65504P728ReservdSCounter = -1;
         public boolean isIp65504P728ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P728ReservdSCounter != sharedCounter;
            localIp65504P728ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_728_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P728ReservdS
	 */
	protected void serializeIp65504P728ReservdS(short ip65504P728ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P728ReservdS,IP_65504_P_728_RESERVD_S_LEN)
                  ,beginIp65504P728ReservdS
                  ,IP_65504_P_728_RESERVD_S_LEN
                 );
            localIp65504P728ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P728ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P728ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P728ReservdS() {	 
			return (getShort(beginIp65504P728ReservdS));
   	}
         int localIp65504P728ReservdLCounter = -1;
         public boolean isIp65504P728ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P728ReservdLCounter != sharedCounter;
            localIp65504P728ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_728_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P728ReservdL
	 */
	protected void serializeIp65504P728ReservdL(short ip65504P728ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P728ReservdL,IP_65504_P_728_RESERVD_L_LEN)
                  ,beginIp65504P728ReservdL
                  ,IP_65504_P_728_RESERVD_L_LEN
                 );
            localIp65504P728ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P728ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P728ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P728ReservdL() {	 
			return (getShort(beginIp65504P728ReservdL));
   	}
         int localIp65504P729ReservdSCounter = -1;
         public boolean isIp65504P729ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P729ReservdSCounter != sharedCounter;
            localIp65504P729ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_729_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P729ReservdS
	 */
	protected void serializeIp65504P729ReservdS(short ip65504P729ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P729ReservdS,IP_65504_P_729_RESERVD_S_LEN)
                  ,beginIp65504P729ReservdS
                  ,IP_65504_P_729_RESERVD_S_LEN
                 );
            localIp65504P729ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P729ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P729ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P729ReservdS() {	 
			return (getShort(beginIp65504P729ReservdS));
   	}
         int localIp65504P729ReservdLCounter = -1;
         public boolean isIp65504P729ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P729ReservdLCounter != sharedCounter;
            localIp65504P729ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_729_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P729ReservdL
	 */
	protected void serializeIp65504P729ReservdL(short ip65504P729ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P729ReservdL,IP_65504_P_729_RESERVD_L_LEN)
                  ,beginIp65504P729ReservdL
                  ,IP_65504_P_729_RESERVD_L_LEN
                 );
            localIp65504P729ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P729ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P729ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P729ReservdL() {	 
			return (getShort(beginIp65504P729ReservdL));
   	}
         int localIp65504P730ReservdSCounter = -1;
         public boolean isIp65504P730ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P730ReservdSCounter != sharedCounter;
            localIp65504P730ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_730_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P730ReservdS
	 */
	protected void serializeIp65504P730ReservdS(short ip65504P730ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P730ReservdS,IP_65504_P_730_RESERVD_S_LEN)
                  ,beginIp65504P730ReservdS
                  ,IP_65504_P_730_RESERVD_S_LEN
                 );
            localIp65504P730ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P730ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P730ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P730ReservdS() {	 
			return (getShort(beginIp65504P730ReservdS));
   	}
         int localIp65504P730ReservdLCounter = -1;
         public boolean isIp65504P730ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P730ReservdLCounter != sharedCounter;
            localIp65504P730ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_730_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P730ReservdL
	 */
	protected void serializeIp65504P730ReservdL(short ip65504P730ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P730ReservdL,IP_65504_P_730_RESERVD_L_LEN)
                  ,beginIp65504P730ReservdL
                  ,IP_65504_P_730_RESERVD_L_LEN
                 );
            localIp65504P730ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P730ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P730ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P730ReservdL() {	 
			return (getShort(beginIp65504P730ReservdL));
   	}
         int localIp65504P731ReservdSCounter = -1;
         public boolean isIp65504P731ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P731ReservdSCounter != sharedCounter;
            localIp65504P731ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_731_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P731ReservdS
	 */
	protected void serializeIp65504P731ReservdS(short ip65504P731ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P731ReservdS,IP_65504_P_731_RESERVD_S_LEN)
                  ,beginIp65504P731ReservdS
                  ,IP_65504_P_731_RESERVD_S_LEN
                 );
            localIp65504P731ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P731ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P731ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P731ReservdS() {	 
			return (getShort(beginIp65504P731ReservdS));
   	}
         int localIp65504P731ReservdLCounter = -1;
         public boolean isIp65504P731ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P731ReservdLCounter != sharedCounter;
            localIp65504P731ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_731_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P731ReservdL
	 */
	protected void serializeIp65504P731ReservdL(short ip65504P731ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P731ReservdL,IP_65504_P_731_RESERVD_L_LEN)
                  ,beginIp65504P731ReservdL
                  ,IP_65504_P_731_RESERVD_L_LEN
                 );
            localIp65504P731ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P731ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P731ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P731ReservdL() {	 
			return (getShort(beginIp65504P731ReservdL));
   	}
         int localIp65504P732ReservdSCounter = -1;
         public boolean isIp65504P732ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P732ReservdSCounter != sharedCounter;
            localIp65504P732ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_732_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P732ReservdS
	 */
	protected void serializeIp65504P732ReservdS(short ip65504P732ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P732ReservdS,IP_65504_P_732_RESERVD_S_LEN)
                  ,beginIp65504P732ReservdS
                  ,IP_65504_P_732_RESERVD_S_LEN
                 );
            localIp65504P732ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P732ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P732ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P732ReservdS() {	 
			return (getShort(beginIp65504P732ReservdS));
   	}
         int localIp65504P732ReservdLCounter = -1;
         public boolean isIp65504P732ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P732ReservdLCounter != sharedCounter;
            localIp65504P732ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_732_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P732ReservdL
	 */
	protected void serializeIp65504P732ReservdL(short ip65504P732ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P732ReservdL,IP_65504_P_732_RESERVD_L_LEN)
                  ,beginIp65504P732ReservdL
                  ,IP_65504_P_732_RESERVD_L_LEN
                 );
            localIp65504P732ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P732ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P732ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P732ReservdL() {	 
			return (getShort(beginIp65504P732ReservdL));
   	}
         int localIp65504P733ReservdSCounter = -1;
         public boolean isIp65504P733ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P733ReservdSCounter != sharedCounter;
            localIp65504P733ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_733_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P733ReservdS
	 */
	protected void serializeIp65504P733ReservdS(short ip65504P733ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P733ReservdS,IP_65504_P_733_RESERVD_S_LEN)
                  ,beginIp65504P733ReservdS
                  ,IP_65504_P_733_RESERVD_S_LEN
                 );
            localIp65504P733ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P733ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P733ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P733ReservdS() {	 
			return (getShort(beginIp65504P733ReservdS));
   	}
         int localIp65504P733ReservdLCounter = -1;
         public boolean isIp65504P733ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P733ReservdLCounter != sharedCounter;
            localIp65504P733ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_733_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P733ReservdL
	 */
	protected void serializeIp65504P733ReservdL(short ip65504P733ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P733ReservdL,IP_65504_P_733_RESERVD_L_LEN)
                  ,beginIp65504P733ReservdL
                  ,IP_65504_P_733_RESERVD_L_LEN
                 );
            localIp65504P733ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P733ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P733ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P733ReservdL() {	 
			return (getShort(beginIp65504P733ReservdL));
   	}
         int localIp65504P734ReservdSCounter = -1;
         public boolean isIp65504P734ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P734ReservdSCounter != sharedCounter;
            localIp65504P734ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_734_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P734ReservdS
	 */
	protected void serializeIp65504P734ReservdS(short ip65504P734ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P734ReservdS,IP_65504_P_734_RESERVD_S_LEN)
                  ,beginIp65504P734ReservdS
                  ,IP_65504_P_734_RESERVD_S_LEN
                 );
            localIp65504P734ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P734ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P734ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P734ReservdS() {	 
			return (getShort(beginIp65504P734ReservdS));
   	}
         int localIp65504P734ReservdLCounter = -1;
         public boolean isIp65504P734ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P734ReservdLCounter != sharedCounter;
            localIp65504P734ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_734_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P734ReservdL
	 */
	protected void serializeIp65504P734ReservdL(short ip65504P734ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P734ReservdL,IP_65504_P_734_RESERVD_L_LEN)
                  ,beginIp65504P734ReservdL
                  ,IP_65504_P_734_RESERVD_L_LEN
                 );
            localIp65504P734ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P734ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P734ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P734ReservdL() {	 
			return (getShort(beginIp65504P734ReservdL));
   	}
         int localIp65504P735ReservdSCounter = -1;
         public boolean isIp65504P735ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P735ReservdSCounter != sharedCounter;
            localIp65504P735ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_735_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P735ReservdS
	 */
	protected void serializeIp65504P735ReservdS(short ip65504P735ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P735ReservdS,IP_65504_P_735_RESERVD_S_LEN)
                  ,beginIp65504P735ReservdS
                  ,IP_65504_P_735_RESERVD_S_LEN
                 );
            localIp65504P735ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P735ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P735ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P735ReservdS() {	 
			return (getShort(beginIp65504P735ReservdS));
   	}
         int localIp65504P735ReservdLCounter = -1;
         public boolean isIp65504P735ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P735ReservdLCounter != sharedCounter;
            localIp65504P735ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_735_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P735ReservdL
	 */
	protected void serializeIp65504P735ReservdL(short ip65504P735ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P735ReservdL,IP_65504_P_735_RESERVD_L_LEN)
                  ,beginIp65504P735ReservdL
                  ,IP_65504_P_735_RESERVD_L_LEN
                 );
            localIp65504P735ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P735ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P735ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P735ReservdL() {	 
			return (getShort(beginIp65504P735ReservdL));
   	}
         int localIp65504P736ReservdSCounter = -1;
         public boolean isIp65504P736ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P736ReservdSCounter != sharedCounter;
            localIp65504P736ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_736_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P736ReservdS
	 */
	protected void serializeIp65504P736ReservdS(short ip65504P736ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P736ReservdS,IP_65504_P_736_RESERVD_S_LEN)
                  ,beginIp65504P736ReservdS
                  ,IP_65504_P_736_RESERVD_S_LEN
                 );
            localIp65504P736ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P736ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P736ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P736ReservdS() {	 
			return (getShort(beginIp65504P736ReservdS));
   	}
         int localIp65504P736ReservdLCounter = -1;
         public boolean isIp65504P736ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P736ReservdLCounter != sharedCounter;
            localIp65504P736ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_736_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P736ReservdL
	 */
	protected void serializeIp65504P736ReservdL(short ip65504P736ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P736ReservdL,IP_65504_P_736_RESERVD_L_LEN)
                  ,beginIp65504P736ReservdL
                  ,IP_65504_P_736_RESERVD_L_LEN
                 );
            localIp65504P736ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P736ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P736ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P736ReservdL() {	 
			return (getShort(beginIp65504P736ReservdL));
   	}
         int localIp65504P737ReservdSCounter = -1;
         public boolean isIp65504P737ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P737ReservdSCounter != sharedCounter;
            localIp65504P737ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_737_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P737ReservdS
	 */
	protected void serializeIp65504P737ReservdS(short ip65504P737ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P737ReservdS,IP_65504_P_737_RESERVD_S_LEN)
                  ,beginIp65504P737ReservdS
                  ,IP_65504_P_737_RESERVD_S_LEN
                 );
            localIp65504P737ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P737ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P737ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P737ReservdS() {	 
			return (getShort(beginIp65504P737ReservdS));
   	}
         int localIp65504P737ReservdLCounter = -1;
         public boolean isIp65504P737ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P737ReservdLCounter != sharedCounter;
            localIp65504P737ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_737_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P737ReservdL
	 */
	protected void serializeIp65504P737ReservdL(short ip65504P737ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P737ReservdL,IP_65504_P_737_RESERVD_L_LEN)
                  ,beginIp65504P737ReservdL
                  ,IP_65504_P_737_RESERVD_L_LEN
                 );
            localIp65504P737ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P737ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P737ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P737ReservdL() {	 
			return (getShort(beginIp65504P737ReservdL));
   	}
         int localIp65504P738ReservdSCounter = -1;
         public boolean isIp65504P738ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P738ReservdSCounter != sharedCounter;
            localIp65504P738ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_738_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P738ReservdS
	 */
	protected void serializeIp65504P738ReservdS(short ip65504P738ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P738ReservdS,IP_65504_P_738_RESERVD_S_LEN)
                  ,beginIp65504P738ReservdS
                  ,IP_65504_P_738_RESERVD_S_LEN
                 );
            localIp65504P738ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P738ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P738ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P738ReservdS() {	 
			return (getShort(beginIp65504P738ReservdS));
   	}
         int localIp65504P738ReservdLCounter = -1;
         public boolean isIp65504P738ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P738ReservdLCounter != sharedCounter;
            localIp65504P738ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_738_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P738ReservdL
	 */
	protected void serializeIp65504P738ReservdL(short ip65504P738ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P738ReservdL,IP_65504_P_738_RESERVD_L_LEN)
                  ,beginIp65504P738ReservdL
                  ,IP_65504_P_738_RESERVD_L_LEN
                 );
            localIp65504P738ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P738ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P738ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P738ReservdL() {	 
			return (getShort(beginIp65504P738ReservdL));
   	}
         int localIp65504P739ReservdSCounter = -1;
         public boolean isIp65504P739ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P739ReservdSCounter != sharedCounter;
            localIp65504P739ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_739_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P739ReservdS
	 */
	protected void serializeIp65504P739ReservdS(short ip65504P739ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P739ReservdS,IP_65504_P_739_RESERVD_S_LEN)
                  ,beginIp65504P739ReservdS
                  ,IP_65504_P_739_RESERVD_S_LEN
                 );
            localIp65504P739ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P739ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P739ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P739ReservdS() {	 
			return (getShort(beginIp65504P739ReservdS));
   	}
         int localIp65504P739ReservdLCounter = -1;
         public boolean isIp65504P739ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P739ReservdLCounter != sharedCounter;
            localIp65504P739ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_739_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P739ReservdL
	 */
	protected void serializeIp65504P739ReservdL(short ip65504P739ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P739ReservdL,IP_65504_P_739_RESERVD_L_LEN)
                  ,beginIp65504P739ReservdL
                  ,IP_65504_P_739_RESERVD_L_LEN
                 );
            localIp65504P739ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P739ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P739ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P739ReservdL() {	 
			return (getShort(beginIp65504P739ReservdL));
   	}
         int localIp65504P740ReservdSCounter = -1;
         public boolean isIp65504P740ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P740ReservdSCounter != sharedCounter;
            localIp65504P740ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_740_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P740ReservdS
	 */
	protected void serializeIp65504P740ReservdS(short ip65504P740ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P740ReservdS,IP_65504_P_740_RESERVD_S_LEN)
                  ,beginIp65504P740ReservdS
                  ,IP_65504_P_740_RESERVD_S_LEN
                 );
            localIp65504P740ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P740ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P740ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P740ReservdS() {	 
			return (getShort(beginIp65504P740ReservdS));
   	}
         int localIp65504P740ReservdLCounter = -1;
         public boolean isIp65504P740ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P740ReservdLCounter != sharedCounter;
            localIp65504P740ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_740_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P740ReservdL
	 */
	protected void serializeIp65504P740ReservdL(short ip65504P740ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P740ReservdL,IP_65504_P_740_RESERVD_L_LEN)
                  ,beginIp65504P740ReservdL
                  ,IP_65504_P_740_RESERVD_L_LEN
                 );
            localIp65504P740ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P740ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P740ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P740ReservdL() {	 
			return (getShort(beginIp65504P740ReservdL));
   	}
         int localIp65504P741ReservdSCounter = -1;
         public boolean isIp65504P741ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P741ReservdSCounter != sharedCounter;
            localIp65504P741ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_741_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P741ReservdS
	 */
	protected void serializeIp65504P741ReservdS(short ip65504P741ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P741ReservdS,IP_65504_P_741_RESERVD_S_LEN)
                  ,beginIp65504P741ReservdS
                  ,IP_65504_P_741_RESERVD_S_LEN
                 );
            localIp65504P741ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P741ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P741ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P741ReservdS() {	 
			return (getShort(beginIp65504P741ReservdS));
   	}
         int localIp65504P741ReservdLCounter = -1;
         public boolean isIp65504P741ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P741ReservdLCounter != sharedCounter;
            localIp65504P741ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_741_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P741ReservdL
	 */
	protected void serializeIp65504P741ReservdL(short ip65504P741ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P741ReservdL,IP_65504_P_741_RESERVD_L_LEN)
                  ,beginIp65504P741ReservdL
                  ,IP_65504_P_741_RESERVD_L_LEN
                 );
            localIp65504P741ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P741ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P741ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P741ReservdL() {	 
			return (getShort(beginIp65504P741ReservdL));
   	}
         int localIp65504P742ReservdSCounter = -1;
         public boolean isIp65504P742ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P742ReservdSCounter != sharedCounter;
            localIp65504P742ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_742_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P742ReservdS
	 */
	protected void serializeIp65504P742ReservdS(short ip65504P742ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P742ReservdS,IP_65504_P_742_RESERVD_S_LEN)
                  ,beginIp65504P742ReservdS
                  ,IP_65504_P_742_RESERVD_S_LEN
                 );
            localIp65504P742ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P742ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P742ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P742ReservdS() {	 
			return (getShort(beginIp65504P742ReservdS));
   	}
         int localIp65504P742ReservdLCounter = -1;
         public boolean isIp65504P742ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P742ReservdLCounter != sharedCounter;
            localIp65504P742ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_742_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P742ReservdL
	 */
	protected void serializeIp65504P742ReservdL(short ip65504P742ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P742ReservdL,IP_65504_P_742_RESERVD_L_LEN)
                  ,beginIp65504P742ReservdL
                  ,IP_65504_P_742_RESERVD_L_LEN
                 );
            localIp65504P742ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P742ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P742ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P742ReservdL() {	 
			return (getShort(beginIp65504P742ReservdL));
   	}
         int localIp65504P743ReservdSCounter = -1;
         public boolean isIp65504P743ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P743ReservdSCounter != sharedCounter;
            localIp65504P743ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_743_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P743ReservdS
	 */
	protected void serializeIp65504P743ReservdS(short ip65504P743ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P743ReservdS,IP_65504_P_743_RESERVD_S_LEN)
                  ,beginIp65504P743ReservdS
                  ,IP_65504_P_743_RESERVD_S_LEN
                 );
            localIp65504P743ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P743ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P743ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P743ReservdS() {	 
			return (getShort(beginIp65504P743ReservdS));
   	}
         int localIp65504P743ReservdLCounter = -1;
         public boolean isIp65504P743ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P743ReservdLCounter != sharedCounter;
            localIp65504P743ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_743_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P743ReservdL
	 */
	protected void serializeIp65504P743ReservdL(short ip65504P743ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P743ReservdL,IP_65504_P_743_RESERVD_L_LEN)
                  ,beginIp65504P743ReservdL
                  ,IP_65504_P_743_RESERVD_L_LEN
                 );
            localIp65504P743ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P743ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P743ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P743ReservdL() {	 
			return (getShort(beginIp65504P743ReservdL));
   	}
         int localIp65504P744ReservdSCounter = -1;
         public boolean isIp65504P744ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P744ReservdSCounter != sharedCounter;
            localIp65504P744ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_744_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P744ReservdS
	 */
	protected void serializeIp65504P744ReservdS(short ip65504P744ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P744ReservdS,IP_65504_P_744_RESERVD_S_LEN)
                  ,beginIp65504P744ReservdS
                  ,IP_65504_P_744_RESERVD_S_LEN
                 );
            localIp65504P744ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P744ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P744ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P744ReservdS() {	 
			return (getShort(beginIp65504P744ReservdS));
   	}
         int localIp65504P744ReservdLCounter = -1;
         public boolean isIp65504P744ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P744ReservdLCounter != sharedCounter;
            localIp65504P744ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_744_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P744ReservdL
	 */
	protected void serializeIp65504P744ReservdL(short ip65504P744ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P744ReservdL,IP_65504_P_744_RESERVD_L_LEN)
                  ,beginIp65504P744ReservdL
                  ,IP_65504_P_744_RESERVD_L_LEN
                 );
            localIp65504P744ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P744ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P744ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P744ReservdL() {	 
			return (getShort(beginIp65504P744ReservdL));
   	}




}
  
