package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeNamesLargeGroup5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeNamesLargeGroup5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeNamesLargeGroup5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_NAMES_LARGE_GROUP_5_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504D125ReservdS;
            protected  int beginIp65504D125ReservdL;
            protected  int beginIp65504D126ConvdatS;
            protected  int beginIp65504D126ConvdatL;
            protected  int beginIp65504D127NetworkS;
            protected  int beginIp65504D127NetworkL;
            protected  int beginIp65504D128MacCodS;
            protected  int beginIp65504D128MacCodL;
	
	/**
	* Constructor for Ip65504DeNamesLargeGroup5Serialized
	**/
    public Ip65504DeNamesLargeGroup5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeNamesLargeGroup5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,988); // serialize this field at offset 988 by default 
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 988 by default
    }    
	/**
	* initializes the field in Ip65504DeNamesLargeGroup5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_NAMES_LARGE_GROUP_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504D125ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504D125ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504D126ConvdatS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504D126ConvdatL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504D127NetworkS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504D127NetworkL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504D128MacCodS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504D128MacCodL = getStartOffset() + 30;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504D125ReservdSCounter = -1;
         public boolean isIp65504D125ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D125ReservdSCounter != sharedCounter;
            localIp65504D125ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_125_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D125ReservdS
	 */
	protected void serializeIp65504D125ReservdS(short ip65504D125ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D125ReservdS,IP_65504_D_125_RESERVD_S_LEN)
                  ,beginIp65504D125ReservdS
                  ,IP_65504_D_125_RESERVD_S_LEN
                 );
            localIp65504D125ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D125ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D125ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D125ReservdS() {	 
			return (getShort(beginIp65504D125ReservdS));
   	}
         int localIp65504D125ReservdLCounter = -1;
         public boolean isIp65504D125ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D125ReservdLCounter != sharedCounter;
            localIp65504D125ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_125_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D125ReservdL
	 */
	protected void serializeIp65504D125ReservdL(short ip65504D125ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D125ReservdL,IP_65504_D_125_RESERVD_L_LEN)
                  ,beginIp65504D125ReservdL
                  ,IP_65504_D_125_RESERVD_L_LEN
                 );
            localIp65504D125ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D125ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D125ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D125ReservdL() {	 
			return (getShort(beginIp65504D125ReservdL));
   	}
         int localIp65504D126ConvdatSCounter = -1;
         public boolean isIp65504D126ConvdatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D126ConvdatSCounter != sharedCounter;
            localIp65504D126ConvdatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_126_CONVDAT_S_LEN = 2;
  	/**
	 * serializeIp65504D126ConvdatS
	 */
	protected void serializeIp65504D126ConvdatS(short ip65504D126ConvdatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D126ConvdatS,IP_65504_D_126_CONVDAT_S_LEN)
                  ,beginIp65504D126ConvdatS
                  ,IP_65504_D_126_CONVDAT_S_LEN
                 );
            localIp65504D126ConvdatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D126ConvdatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D126ConvdatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D126ConvdatS() {	 
			return (getShort(beginIp65504D126ConvdatS));
   	}
         int localIp65504D126ConvdatLCounter = -1;
         public boolean isIp65504D126ConvdatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D126ConvdatLCounter != sharedCounter;
            localIp65504D126ConvdatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_126_CONVDAT_L_LEN = 2;
  	/**
	 * serializeIp65504D126ConvdatL
	 */
	protected void serializeIp65504D126ConvdatL(short ip65504D126ConvdatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D126ConvdatL,IP_65504_D_126_CONVDAT_L_LEN)
                  ,beginIp65504D126ConvdatL
                  ,IP_65504_D_126_CONVDAT_L_LEN
                 );
            localIp65504D126ConvdatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D126ConvdatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D126ConvdatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D126ConvdatL() {	 
			return (getShort(beginIp65504D126ConvdatL));
   	}
         int localIp65504D127NetworkSCounter = -1;
         public boolean isIp65504D127NetworkSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D127NetworkSCounter != sharedCounter;
            localIp65504D127NetworkSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_127_NETWORK_S_LEN = 2;
  	/**
	 * serializeIp65504D127NetworkS
	 */
	protected void serializeIp65504D127NetworkS(short ip65504D127NetworkS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D127NetworkS,IP_65504_D_127_NETWORK_S_LEN)
                  ,beginIp65504D127NetworkS
                  ,IP_65504_D_127_NETWORK_S_LEN
                 );
            localIp65504D127NetworkSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D127NetworkSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D127NetworkS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D127NetworkS() {	 
			return (getShort(beginIp65504D127NetworkS));
   	}
         int localIp65504D127NetworkLCounter = -1;
         public boolean isIp65504D127NetworkLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D127NetworkLCounter != sharedCounter;
            localIp65504D127NetworkLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_127_NETWORK_L_LEN = 2;
  	/**
	 * serializeIp65504D127NetworkL
	 */
	protected void serializeIp65504D127NetworkL(short ip65504D127NetworkL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D127NetworkL,IP_65504_D_127_NETWORK_L_LEN)
                  ,beginIp65504D127NetworkL
                  ,IP_65504_D_127_NETWORK_L_LEN
                 );
            localIp65504D127NetworkLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D127NetworkLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D127NetworkL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D127NetworkL() {	 
			return (getShort(beginIp65504D127NetworkL));
   	}
         int localIp65504D128MacCodSCounter = -1;
         public boolean isIp65504D128MacCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D128MacCodSCounter != sharedCounter;
            localIp65504D128MacCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_128_MAC_COD_S_LEN = 2;
  	/**
	 * serializeIp65504D128MacCodS
	 */
	protected void serializeIp65504D128MacCodS(short ip65504D128MacCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D128MacCodS,IP_65504_D_128_MAC_COD_S_LEN)
                  ,beginIp65504D128MacCodS
                  ,IP_65504_D_128_MAC_COD_S_LEN
                 );
            localIp65504D128MacCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D128MacCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D128MacCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D128MacCodS() {	 
			return (getShort(beginIp65504D128MacCodS));
   	}
         int localIp65504D128MacCodLCounter = -1;
         public boolean isIp65504D128MacCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D128MacCodLCounter != sharedCounter;
            localIp65504D128MacCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_128_MAC_COD_L_LEN = 2;
  	/**
	 * serializeIp65504D128MacCodL
	 */
	protected void serializeIp65504D128MacCodL(short ip65504D128MacCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D128MacCodL,IP_65504_D_128_MAC_COD_L_LEN)
                  ,beginIp65504D128MacCodL
                  ,IP_65504_D_128_MAC_COD_L_LEN
                 );
            localIp65504D128MacCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D128MacCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D128MacCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D128MacCodL() {	 
			return (getShort(beginIp65504D128MacCodL));
   	}




}
  
