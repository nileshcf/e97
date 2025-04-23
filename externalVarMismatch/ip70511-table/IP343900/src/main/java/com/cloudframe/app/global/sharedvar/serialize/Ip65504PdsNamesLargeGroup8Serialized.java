package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_8_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P218ReservdS;
            protected  int beginIp65504P218ReservdL;
            protected  int beginIp65504P219ReservdS;
            protected  int beginIp65504P219ReservdL;
            protected  int beginIp65504P220ReservdS;
            protected  int beginIp65504P220ReservdL;
            protected  int beginIp65504P221ReservdS;
            protected  int beginIp65504P221ReservdL;
            protected  int beginIp65504P222ReservdS;
            protected  int beginIp65504P222ReservdL;
            protected  int beginIp65504P223ReservdS;
            protected  int beginIp65504P223ReservdL;
            protected  int beginIp65504P224ReservdS;
            protected  int beginIp65504P224ReservdL;
            protected  int beginIp65504P225CovacctS;
            protected  int beginIp65504P225CovacctL;
            protected  int beginIp65504P226ReservdS;
            protected  int beginIp65504P226ReservdL;
            protected  int beginIp65504P227ReservdS;
            protected  int beginIp65504P227ReservdL;
            protected  int beginIp65504P228RetrCdS;
            protected  int beginIp65504P228RetrCdL;
            protected  int beginIp65504P229ReservdS;
            protected  int beginIp65504P229ReservdL;
            protected  int beginIp65504P230FfillcdS;
            protected  int beginIp65504P230FfillcdL;
            protected  int beginIp65504P231ReservdS;
            protected  int beginIp65504P231ReservdL;
            protected  int beginIp65504P232ReservdS;
            protected  int beginIp65504P232ReservdL;
            protected  int beginIp65504P233ReservdS;
            protected  int beginIp65504P233ReservdL;
            protected  int beginIp65504P234ReservdS;
            protected  int beginIp65504P234ReservdL;
            protected  int beginIp65504P235ReservdS;
            protected  int beginIp65504P235ReservdL;
            protected  int beginIp65504P236ReservdS;
            protected  int beginIp65504P236ReservdL;
            protected  int beginIp65504P237ReservdS;
            protected  int beginIp65504P237ReservdL;
            protected  int beginIp65504P238ReservdS;
            protected  int beginIp65504P238ReservdL;
            protected  int beginIp65504P239ReservdS;
            protected  int beginIp65504P239ReservdL;
            protected  int beginIp65504P240ReservdS;
            protected  int beginIp65504P240ReservdL;
            protected  int beginIp65504P241McmNbrS;
            protected  int beginIp65504P241McmNbrL;
            protected  int beginIp65504P242McmIndS;
            protected  int beginIp65504P242McmIndL;
            protected  int beginIp65504P243McmRspS;
            protected  int beginIp65504P243McmRspL;
            protected  int beginIp65504P244McmcbdtS;
            protected  int beginIp65504P244McmcbdtL;
            protected  int beginIp65504P245ReservdS;
            protected  int beginIp65504P245ReservdL;
            protected  int beginIp65504P246ReservdS;
            protected  int beginIp65504P246ReservdL;
            protected  int beginIp65504P247ReservdS;
            protected  int beginIp65504P247ReservdL;
            protected  int beginIp65504P248ReservdS;
            protected  int beginIp65504P248ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup8Serialized
	**/
    public Ip65504PdsNamesLargeGroup8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1732); // serialize this field at offset 1732 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1732 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P218ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P218ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P219ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P219ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P220ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P220ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P221ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P221ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P222ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P222ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P223ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P223ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P224ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P224ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P225CovacctS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P225CovacctL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P226ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P226ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P227ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P227ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P228RetrCdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P228RetrCdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P229ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P229ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P230FfillcdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P230FfillcdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P231ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P231ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P232ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P232ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P233ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P233ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P234ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P234ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P235ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P235ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P236ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P236ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P237ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P237ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P238ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P238ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P239ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P239ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P240ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P240ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P241McmNbrS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P241McmNbrL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P242McmIndS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P242McmIndL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P243McmRspS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P243McmRspL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P244McmcbdtS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P244McmcbdtL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P245ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P245ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P246ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P246ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P247ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P247ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P248ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P248ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P218ReservdSCounter = -1;
         public boolean isIp65504P218ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P218ReservdSCounter != sharedCounter;
            localIp65504P218ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_218_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P218ReservdS
	 */
	protected void serializeIp65504P218ReservdS(short ip65504P218ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P218ReservdS,IP_65504_P_218_RESERVD_S_LEN)
                  ,beginIp65504P218ReservdS
                  ,IP_65504_P_218_RESERVD_S_LEN
                 );
            localIp65504P218ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P218ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P218ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P218ReservdS() {	 
			return (getShort(beginIp65504P218ReservdS));
   	}
         int localIp65504P218ReservdLCounter = -1;
         public boolean isIp65504P218ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P218ReservdLCounter != sharedCounter;
            localIp65504P218ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_218_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P218ReservdL
	 */
	protected void serializeIp65504P218ReservdL(short ip65504P218ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P218ReservdL,IP_65504_P_218_RESERVD_L_LEN)
                  ,beginIp65504P218ReservdL
                  ,IP_65504_P_218_RESERVD_L_LEN
                 );
            localIp65504P218ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P218ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P218ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P218ReservdL() {	 
			return (getShort(beginIp65504P218ReservdL));
   	}
         int localIp65504P219ReservdSCounter = -1;
         public boolean isIp65504P219ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P219ReservdSCounter != sharedCounter;
            localIp65504P219ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_219_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P219ReservdS
	 */
	protected void serializeIp65504P219ReservdS(short ip65504P219ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P219ReservdS,IP_65504_P_219_RESERVD_S_LEN)
                  ,beginIp65504P219ReservdS
                  ,IP_65504_P_219_RESERVD_S_LEN
                 );
            localIp65504P219ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P219ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P219ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P219ReservdS() {	 
			return (getShort(beginIp65504P219ReservdS));
   	}
         int localIp65504P219ReservdLCounter = -1;
         public boolean isIp65504P219ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P219ReservdLCounter != sharedCounter;
            localIp65504P219ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_219_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P219ReservdL
	 */
	protected void serializeIp65504P219ReservdL(short ip65504P219ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P219ReservdL,IP_65504_P_219_RESERVD_L_LEN)
                  ,beginIp65504P219ReservdL
                  ,IP_65504_P_219_RESERVD_L_LEN
                 );
            localIp65504P219ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P219ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P219ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P219ReservdL() {	 
			return (getShort(beginIp65504P219ReservdL));
   	}
         int localIp65504P220ReservdSCounter = -1;
         public boolean isIp65504P220ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P220ReservdSCounter != sharedCounter;
            localIp65504P220ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_220_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P220ReservdS
	 */
	protected void serializeIp65504P220ReservdS(short ip65504P220ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P220ReservdS,IP_65504_P_220_RESERVD_S_LEN)
                  ,beginIp65504P220ReservdS
                  ,IP_65504_P_220_RESERVD_S_LEN
                 );
            localIp65504P220ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P220ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P220ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P220ReservdS() {	 
			return (getShort(beginIp65504P220ReservdS));
   	}
         int localIp65504P220ReservdLCounter = -1;
         public boolean isIp65504P220ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P220ReservdLCounter != sharedCounter;
            localIp65504P220ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_220_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P220ReservdL
	 */
	protected void serializeIp65504P220ReservdL(short ip65504P220ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P220ReservdL,IP_65504_P_220_RESERVD_L_LEN)
                  ,beginIp65504P220ReservdL
                  ,IP_65504_P_220_RESERVD_L_LEN
                 );
            localIp65504P220ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P220ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P220ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P220ReservdL() {	 
			return (getShort(beginIp65504P220ReservdL));
   	}
         int localIp65504P221ReservdSCounter = -1;
         public boolean isIp65504P221ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P221ReservdSCounter != sharedCounter;
            localIp65504P221ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_221_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P221ReservdS
	 */
	protected void serializeIp65504P221ReservdS(short ip65504P221ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P221ReservdS,IP_65504_P_221_RESERVD_S_LEN)
                  ,beginIp65504P221ReservdS
                  ,IP_65504_P_221_RESERVD_S_LEN
                 );
            localIp65504P221ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P221ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P221ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P221ReservdS() {	 
			return (getShort(beginIp65504P221ReservdS));
   	}
         int localIp65504P221ReservdLCounter = -1;
         public boolean isIp65504P221ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P221ReservdLCounter != sharedCounter;
            localIp65504P221ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_221_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P221ReservdL
	 */
	protected void serializeIp65504P221ReservdL(short ip65504P221ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P221ReservdL,IP_65504_P_221_RESERVD_L_LEN)
                  ,beginIp65504P221ReservdL
                  ,IP_65504_P_221_RESERVD_L_LEN
                 );
            localIp65504P221ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P221ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P221ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P221ReservdL() {	 
			return (getShort(beginIp65504P221ReservdL));
   	}
         int localIp65504P222ReservdSCounter = -1;
         public boolean isIp65504P222ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P222ReservdSCounter != sharedCounter;
            localIp65504P222ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_222_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P222ReservdS
	 */
	protected void serializeIp65504P222ReservdS(short ip65504P222ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P222ReservdS,IP_65504_P_222_RESERVD_S_LEN)
                  ,beginIp65504P222ReservdS
                  ,IP_65504_P_222_RESERVD_S_LEN
                 );
            localIp65504P222ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P222ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P222ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P222ReservdS() {	 
			return (getShort(beginIp65504P222ReservdS));
   	}
         int localIp65504P222ReservdLCounter = -1;
         public boolean isIp65504P222ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P222ReservdLCounter != sharedCounter;
            localIp65504P222ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_222_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P222ReservdL
	 */
	protected void serializeIp65504P222ReservdL(short ip65504P222ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P222ReservdL,IP_65504_P_222_RESERVD_L_LEN)
                  ,beginIp65504P222ReservdL
                  ,IP_65504_P_222_RESERVD_L_LEN
                 );
            localIp65504P222ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P222ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P222ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P222ReservdL() {	 
			return (getShort(beginIp65504P222ReservdL));
   	}
         int localIp65504P223ReservdSCounter = -1;
         public boolean isIp65504P223ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P223ReservdSCounter != sharedCounter;
            localIp65504P223ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_223_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P223ReservdS
	 */
	protected void serializeIp65504P223ReservdS(short ip65504P223ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P223ReservdS,IP_65504_P_223_RESERVD_S_LEN)
                  ,beginIp65504P223ReservdS
                  ,IP_65504_P_223_RESERVD_S_LEN
                 );
            localIp65504P223ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P223ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P223ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P223ReservdS() {	 
			return (getShort(beginIp65504P223ReservdS));
   	}
         int localIp65504P223ReservdLCounter = -1;
         public boolean isIp65504P223ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P223ReservdLCounter != sharedCounter;
            localIp65504P223ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_223_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P223ReservdL
	 */
	protected void serializeIp65504P223ReservdL(short ip65504P223ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P223ReservdL,IP_65504_P_223_RESERVD_L_LEN)
                  ,beginIp65504P223ReservdL
                  ,IP_65504_P_223_RESERVD_L_LEN
                 );
            localIp65504P223ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P223ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P223ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P223ReservdL() {	 
			return (getShort(beginIp65504P223ReservdL));
   	}
         int localIp65504P224ReservdSCounter = -1;
         public boolean isIp65504P224ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P224ReservdSCounter != sharedCounter;
            localIp65504P224ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_224_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P224ReservdS
	 */
	protected void serializeIp65504P224ReservdS(short ip65504P224ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P224ReservdS,IP_65504_P_224_RESERVD_S_LEN)
                  ,beginIp65504P224ReservdS
                  ,IP_65504_P_224_RESERVD_S_LEN
                 );
            localIp65504P224ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P224ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P224ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P224ReservdS() {	 
			return (getShort(beginIp65504P224ReservdS));
   	}
         int localIp65504P224ReservdLCounter = -1;
         public boolean isIp65504P224ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P224ReservdLCounter != sharedCounter;
            localIp65504P224ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_224_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P224ReservdL
	 */
	protected void serializeIp65504P224ReservdL(short ip65504P224ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P224ReservdL,IP_65504_P_224_RESERVD_L_LEN)
                  ,beginIp65504P224ReservdL
                  ,IP_65504_P_224_RESERVD_L_LEN
                 );
            localIp65504P224ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P224ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P224ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P224ReservdL() {	 
			return (getShort(beginIp65504P224ReservdL));
   	}
         int localIp65504P225CovacctSCounter = -1;
         public boolean isIp65504P225CovacctSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P225CovacctSCounter != sharedCounter;
            localIp65504P225CovacctSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_225_COVACCT_S_LEN = 2;
  	/**
	 * serializeIp65504P225CovacctS
	 */
	protected void serializeIp65504P225CovacctS(short ip65504P225CovacctS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P225CovacctS,IP_65504_P_225_COVACCT_S_LEN)
                  ,beginIp65504P225CovacctS
                  ,IP_65504_P_225_COVACCT_S_LEN
                 );
            localIp65504P225CovacctSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P225CovacctSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P225CovacctS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P225CovacctS() {	 
			return (getShort(beginIp65504P225CovacctS));
   	}
         int localIp65504P225CovacctLCounter = -1;
         public boolean isIp65504P225CovacctLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P225CovacctLCounter != sharedCounter;
            localIp65504P225CovacctLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_225_COVACCT_L_LEN = 2;
  	/**
	 * serializeIp65504P225CovacctL
	 */
	protected void serializeIp65504P225CovacctL(short ip65504P225CovacctL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P225CovacctL,IP_65504_P_225_COVACCT_L_LEN)
                  ,beginIp65504P225CovacctL
                  ,IP_65504_P_225_COVACCT_L_LEN
                 );
            localIp65504P225CovacctLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P225CovacctLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P225CovacctL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P225CovacctL() {	 
			return (getShort(beginIp65504P225CovacctL));
   	}
         int localIp65504P226ReservdSCounter = -1;
         public boolean isIp65504P226ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P226ReservdSCounter != sharedCounter;
            localIp65504P226ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_226_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P226ReservdS
	 */
	protected void serializeIp65504P226ReservdS(short ip65504P226ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P226ReservdS,IP_65504_P_226_RESERVD_S_LEN)
                  ,beginIp65504P226ReservdS
                  ,IP_65504_P_226_RESERVD_S_LEN
                 );
            localIp65504P226ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P226ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P226ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P226ReservdS() {	 
			return (getShort(beginIp65504P226ReservdS));
   	}
         int localIp65504P226ReservdLCounter = -1;
         public boolean isIp65504P226ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P226ReservdLCounter != sharedCounter;
            localIp65504P226ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_226_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P226ReservdL
	 */
	protected void serializeIp65504P226ReservdL(short ip65504P226ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P226ReservdL,IP_65504_P_226_RESERVD_L_LEN)
                  ,beginIp65504P226ReservdL
                  ,IP_65504_P_226_RESERVD_L_LEN
                 );
            localIp65504P226ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P226ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P226ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P226ReservdL() {	 
			return (getShort(beginIp65504P226ReservdL));
   	}
         int localIp65504P227ReservdSCounter = -1;
         public boolean isIp65504P227ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P227ReservdSCounter != sharedCounter;
            localIp65504P227ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_227_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P227ReservdS
	 */
	protected void serializeIp65504P227ReservdS(short ip65504P227ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P227ReservdS,IP_65504_P_227_RESERVD_S_LEN)
                  ,beginIp65504P227ReservdS
                  ,IP_65504_P_227_RESERVD_S_LEN
                 );
            localIp65504P227ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P227ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P227ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P227ReservdS() {	 
			return (getShort(beginIp65504P227ReservdS));
   	}
         int localIp65504P227ReservdLCounter = -1;
         public boolean isIp65504P227ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P227ReservdLCounter != sharedCounter;
            localIp65504P227ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_227_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P227ReservdL
	 */
	protected void serializeIp65504P227ReservdL(short ip65504P227ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P227ReservdL,IP_65504_P_227_RESERVD_L_LEN)
                  ,beginIp65504P227ReservdL
                  ,IP_65504_P_227_RESERVD_L_LEN
                 );
            localIp65504P227ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P227ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P227ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P227ReservdL() {	 
			return (getShort(beginIp65504P227ReservdL));
   	}
         int localIp65504P228RetrCdSCounter = -1;
         public boolean isIp65504P228RetrCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P228RetrCdSCounter != sharedCounter;
            localIp65504P228RetrCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_228_RETR_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P228RetrCdS
	 */
	protected void serializeIp65504P228RetrCdS(short ip65504P228RetrCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P228RetrCdS,IP_65504_P_228_RETR_CD_S_LEN)
                  ,beginIp65504P228RetrCdS
                  ,IP_65504_P_228_RETR_CD_S_LEN
                 );
            localIp65504P228RetrCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P228RetrCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P228RetrCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P228RetrCdS() {	 
			return (getShort(beginIp65504P228RetrCdS));
   	}
         int localIp65504P228RetrCdLCounter = -1;
         public boolean isIp65504P228RetrCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P228RetrCdLCounter != sharedCounter;
            localIp65504P228RetrCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_228_RETR_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P228RetrCdL
	 */
	protected void serializeIp65504P228RetrCdL(short ip65504P228RetrCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P228RetrCdL,IP_65504_P_228_RETR_CD_L_LEN)
                  ,beginIp65504P228RetrCdL
                  ,IP_65504_P_228_RETR_CD_L_LEN
                 );
            localIp65504P228RetrCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P228RetrCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P228RetrCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P228RetrCdL() {	 
			return (getShort(beginIp65504P228RetrCdL));
   	}
         int localIp65504P229ReservdSCounter = -1;
         public boolean isIp65504P229ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P229ReservdSCounter != sharedCounter;
            localIp65504P229ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_229_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P229ReservdS
	 */
	protected void serializeIp65504P229ReservdS(short ip65504P229ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P229ReservdS,IP_65504_P_229_RESERVD_S_LEN)
                  ,beginIp65504P229ReservdS
                  ,IP_65504_P_229_RESERVD_S_LEN
                 );
            localIp65504P229ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P229ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P229ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P229ReservdS() {	 
			return (getShort(beginIp65504P229ReservdS));
   	}
         int localIp65504P229ReservdLCounter = -1;
         public boolean isIp65504P229ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P229ReservdLCounter != sharedCounter;
            localIp65504P229ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_229_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P229ReservdL
	 */
	protected void serializeIp65504P229ReservdL(short ip65504P229ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P229ReservdL,IP_65504_P_229_RESERVD_L_LEN)
                  ,beginIp65504P229ReservdL
                  ,IP_65504_P_229_RESERVD_L_LEN
                 );
            localIp65504P229ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P229ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P229ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P229ReservdL() {	 
			return (getShort(beginIp65504P229ReservdL));
   	}
         int localIp65504P230FfillcdSCounter = -1;
         public boolean isIp65504P230FfillcdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P230FfillcdSCounter != sharedCounter;
            localIp65504P230FfillcdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_230_FFILLCD_S_LEN = 2;
  	/**
	 * serializeIp65504P230FfillcdS
	 */
	protected void serializeIp65504P230FfillcdS(short ip65504P230FfillcdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P230FfillcdS,IP_65504_P_230_FFILLCD_S_LEN)
                  ,beginIp65504P230FfillcdS
                  ,IP_65504_P_230_FFILLCD_S_LEN
                 );
            localIp65504P230FfillcdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P230FfillcdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P230FfillcdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P230FfillcdS() {	 
			return (getShort(beginIp65504P230FfillcdS));
   	}
         int localIp65504P230FfillcdLCounter = -1;
         public boolean isIp65504P230FfillcdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P230FfillcdLCounter != sharedCounter;
            localIp65504P230FfillcdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_230_FFILLCD_L_LEN = 2;
  	/**
	 * serializeIp65504P230FfillcdL
	 */
	protected void serializeIp65504P230FfillcdL(short ip65504P230FfillcdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P230FfillcdL,IP_65504_P_230_FFILLCD_L_LEN)
                  ,beginIp65504P230FfillcdL
                  ,IP_65504_P_230_FFILLCD_L_LEN
                 );
            localIp65504P230FfillcdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P230FfillcdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P230FfillcdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P230FfillcdL() {	 
			return (getShort(beginIp65504P230FfillcdL));
   	}
         int localIp65504P231ReservdSCounter = -1;
         public boolean isIp65504P231ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P231ReservdSCounter != sharedCounter;
            localIp65504P231ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_231_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P231ReservdS
	 */
	protected void serializeIp65504P231ReservdS(short ip65504P231ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P231ReservdS,IP_65504_P_231_RESERVD_S_LEN)
                  ,beginIp65504P231ReservdS
                  ,IP_65504_P_231_RESERVD_S_LEN
                 );
            localIp65504P231ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P231ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P231ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P231ReservdS() {	 
			return (getShort(beginIp65504P231ReservdS));
   	}
         int localIp65504P231ReservdLCounter = -1;
         public boolean isIp65504P231ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P231ReservdLCounter != sharedCounter;
            localIp65504P231ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_231_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P231ReservdL
	 */
	protected void serializeIp65504P231ReservdL(short ip65504P231ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P231ReservdL,IP_65504_P_231_RESERVD_L_LEN)
                  ,beginIp65504P231ReservdL
                  ,IP_65504_P_231_RESERVD_L_LEN
                 );
            localIp65504P231ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P231ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P231ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P231ReservdL() {	 
			return (getShort(beginIp65504P231ReservdL));
   	}
         int localIp65504P232ReservdSCounter = -1;
         public boolean isIp65504P232ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P232ReservdSCounter != sharedCounter;
            localIp65504P232ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_232_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P232ReservdS
	 */
	protected void serializeIp65504P232ReservdS(short ip65504P232ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P232ReservdS,IP_65504_P_232_RESERVD_S_LEN)
                  ,beginIp65504P232ReservdS
                  ,IP_65504_P_232_RESERVD_S_LEN
                 );
            localIp65504P232ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P232ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P232ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P232ReservdS() {	 
			return (getShort(beginIp65504P232ReservdS));
   	}
         int localIp65504P232ReservdLCounter = -1;
         public boolean isIp65504P232ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P232ReservdLCounter != sharedCounter;
            localIp65504P232ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_232_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P232ReservdL
	 */
	protected void serializeIp65504P232ReservdL(short ip65504P232ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P232ReservdL,IP_65504_P_232_RESERVD_L_LEN)
                  ,beginIp65504P232ReservdL
                  ,IP_65504_P_232_RESERVD_L_LEN
                 );
            localIp65504P232ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P232ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P232ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P232ReservdL() {	 
			return (getShort(beginIp65504P232ReservdL));
   	}
         int localIp65504P233ReservdSCounter = -1;
         public boolean isIp65504P233ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P233ReservdSCounter != sharedCounter;
            localIp65504P233ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_233_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P233ReservdS
	 */
	protected void serializeIp65504P233ReservdS(short ip65504P233ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P233ReservdS,IP_65504_P_233_RESERVD_S_LEN)
                  ,beginIp65504P233ReservdS
                  ,IP_65504_P_233_RESERVD_S_LEN
                 );
            localIp65504P233ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P233ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P233ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P233ReservdS() {	 
			return (getShort(beginIp65504P233ReservdS));
   	}
         int localIp65504P233ReservdLCounter = -1;
         public boolean isIp65504P233ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P233ReservdLCounter != sharedCounter;
            localIp65504P233ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_233_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P233ReservdL
	 */
	protected void serializeIp65504P233ReservdL(short ip65504P233ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P233ReservdL,IP_65504_P_233_RESERVD_L_LEN)
                  ,beginIp65504P233ReservdL
                  ,IP_65504_P_233_RESERVD_L_LEN
                 );
            localIp65504P233ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P233ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P233ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P233ReservdL() {	 
			return (getShort(beginIp65504P233ReservdL));
   	}
         int localIp65504P234ReservdSCounter = -1;
         public boolean isIp65504P234ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P234ReservdSCounter != sharedCounter;
            localIp65504P234ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_234_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P234ReservdS
	 */
	protected void serializeIp65504P234ReservdS(short ip65504P234ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P234ReservdS,IP_65504_P_234_RESERVD_S_LEN)
                  ,beginIp65504P234ReservdS
                  ,IP_65504_P_234_RESERVD_S_LEN
                 );
            localIp65504P234ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P234ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P234ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P234ReservdS() {	 
			return (getShort(beginIp65504P234ReservdS));
   	}
         int localIp65504P234ReservdLCounter = -1;
         public boolean isIp65504P234ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P234ReservdLCounter != sharedCounter;
            localIp65504P234ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_234_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P234ReservdL
	 */
	protected void serializeIp65504P234ReservdL(short ip65504P234ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P234ReservdL,IP_65504_P_234_RESERVD_L_LEN)
                  ,beginIp65504P234ReservdL
                  ,IP_65504_P_234_RESERVD_L_LEN
                 );
            localIp65504P234ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P234ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P234ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P234ReservdL() {	 
			return (getShort(beginIp65504P234ReservdL));
   	}
         int localIp65504P235ReservdSCounter = -1;
         public boolean isIp65504P235ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P235ReservdSCounter != sharedCounter;
            localIp65504P235ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_235_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P235ReservdS
	 */
	protected void serializeIp65504P235ReservdS(short ip65504P235ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P235ReservdS,IP_65504_P_235_RESERVD_S_LEN)
                  ,beginIp65504P235ReservdS
                  ,IP_65504_P_235_RESERVD_S_LEN
                 );
            localIp65504P235ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P235ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P235ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P235ReservdS() {	 
			return (getShort(beginIp65504P235ReservdS));
   	}
         int localIp65504P235ReservdLCounter = -1;
         public boolean isIp65504P235ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P235ReservdLCounter != sharedCounter;
            localIp65504P235ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_235_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P235ReservdL
	 */
	protected void serializeIp65504P235ReservdL(short ip65504P235ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P235ReservdL,IP_65504_P_235_RESERVD_L_LEN)
                  ,beginIp65504P235ReservdL
                  ,IP_65504_P_235_RESERVD_L_LEN
                 );
            localIp65504P235ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P235ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P235ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P235ReservdL() {	 
			return (getShort(beginIp65504P235ReservdL));
   	}
         int localIp65504P236ReservdSCounter = -1;
         public boolean isIp65504P236ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P236ReservdSCounter != sharedCounter;
            localIp65504P236ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_236_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P236ReservdS
	 */
	protected void serializeIp65504P236ReservdS(short ip65504P236ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P236ReservdS,IP_65504_P_236_RESERVD_S_LEN)
                  ,beginIp65504P236ReservdS
                  ,IP_65504_P_236_RESERVD_S_LEN
                 );
            localIp65504P236ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P236ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P236ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P236ReservdS() {	 
			return (getShort(beginIp65504P236ReservdS));
   	}
         int localIp65504P236ReservdLCounter = -1;
         public boolean isIp65504P236ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P236ReservdLCounter != sharedCounter;
            localIp65504P236ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_236_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P236ReservdL
	 */
	protected void serializeIp65504P236ReservdL(short ip65504P236ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P236ReservdL,IP_65504_P_236_RESERVD_L_LEN)
                  ,beginIp65504P236ReservdL
                  ,IP_65504_P_236_RESERVD_L_LEN
                 );
            localIp65504P236ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P236ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P236ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P236ReservdL() {	 
			return (getShort(beginIp65504P236ReservdL));
   	}
         int localIp65504P237ReservdSCounter = -1;
         public boolean isIp65504P237ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P237ReservdSCounter != sharedCounter;
            localIp65504P237ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_237_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P237ReservdS
	 */
	protected void serializeIp65504P237ReservdS(short ip65504P237ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P237ReservdS,IP_65504_P_237_RESERVD_S_LEN)
                  ,beginIp65504P237ReservdS
                  ,IP_65504_P_237_RESERVD_S_LEN
                 );
            localIp65504P237ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P237ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P237ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P237ReservdS() {	 
			return (getShort(beginIp65504P237ReservdS));
   	}
         int localIp65504P237ReservdLCounter = -1;
         public boolean isIp65504P237ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P237ReservdLCounter != sharedCounter;
            localIp65504P237ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_237_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P237ReservdL
	 */
	protected void serializeIp65504P237ReservdL(short ip65504P237ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P237ReservdL,IP_65504_P_237_RESERVD_L_LEN)
                  ,beginIp65504P237ReservdL
                  ,IP_65504_P_237_RESERVD_L_LEN
                 );
            localIp65504P237ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P237ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P237ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P237ReservdL() {	 
			return (getShort(beginIp65504P237ReservdL));
   	}
         int localIp65504P238ReservdSCounter = -1;
         public boolean isIp65504P238ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P238ReservdSCounter != sharedCounter;
            localIp65504P238ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_238_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P238ReservdS
	 */
	protected void serializeIp65504P238ReservdS(short ip65504P238ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P238ReservdS,IP_65504_P_238_RESERVD_S_LEN)
                  ,beginIp65504P238ReservdS
                  ,IP_65504_P_238_RESERVD_S_LEN
                 );
            localIp65504P238ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P238ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P238ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P238ReservdS() {	 
			return (getShort(beginIp65504P238ReservdS));
   	}
         int localIp65504P238ReservdLCounter = -1;
         public boolean isIp65504P238ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P238ReservdLCounter != sharedCounter;
            localIp65504P238ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_238_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P238ReservdL
	 */
	protected void serializeIp65504P238ReservdL(short ip65504P238ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P238ReservdL,IP_65504_P_238_RESERVD_L_LEN)
                  ,beginIp65504P238ReservdL
                  ,IP_65504_P_238_RESERVD_L_LEN
                 );
            localIp65504P238ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P238ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P238ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P238ReservdL() {	 
			return (getShort(beginIp65504P238ReservdL));
   	}
         int localIp65504P239ReservdSCounter = -1;
         public boolean isIp65504P239ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P239ReservdSCounter != sharedCounter;
            localIp65504P239ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_239_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P239ReservdS
	 */
	protected void serializeIp65504P239ReservdS(short ip65504P239ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P239ReservdS,IP_65504_P_239_RESERVD_S_LEN)
                  ,beginIp65504P239ReservdS
                  ,IP_65504_P_239_RESERVD_S_LEN
                 );
            localIp65504P239ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P239ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P239ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P239ReservdS() {	 
			return (getShort(beginIp65504P239ReservdS));
   	}
         int localIp65504P239ReservdLCounter = -1;
         public boolean isIp65504P239ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P239ReservdLCounter != sharedCounter;
            localIp65504P239ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_239_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P239ReservdL
	 */
	protected void serializeIp65504P239ReservdL(short ip65504P239ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P239ReservdL,IP_65504_P_239_RESERVD_L_LEN)
                  ,beginIp65504P239ReservdL
                  ,IP_65504_P_239_RESERVD_L_LEN
                 );
            localIp65504P239ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P239ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P239ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P239ReservdL() {	 
			return (getShort(beginIp65504P239ReservdL));
   	}
         int localIp65504P240ReservdSCounter = -1;
         public boolean isIp65504P240ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P240ReservdSCounter != sharedCounter;
            localIp65504P240ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_240_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P240ReservdS
	 */
	protected void serializeIp65504P240ReservdS(short ip65504P240ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P240ReservdS,IP_65504_P_240_RESERVD_S_LEN)
                  ,beginIp65504P240ReservdS
                  ,IP_65504_P_240_RESERVD_S_LEN
                 );
            localIp65504P240ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P240ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P240ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P240ReservdS() {	 
			return (getShort(beginIp65504P240ReservdS));
   	}
         int localIp65504P240ReservdLCounter = -1;
         public boolean isIp65504P240ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P240ReservdLCounter != sharedCounter;
            localIp65504P240ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_240_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P240ReservdL
	 */
	protected void serializeIp65504P240ReservdL(short ip65504P240ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P240ReservdL,IP_65504_P_240_RESERVD_L_LEN)
                  ,beginIp65504P240ReservdL
                  ,IP_65504_P_240_RESERVD_L_LEN
                 );
            localIp65504P240ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P240ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P240ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P240ReservdL() {	 
			return (getShort(beginIp65504P240ReservdL));
   	}
         int localIp65504P241McmNbrSCounter = -1;
         public boolean isIp65504P241McmNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P241McmNbrSCounter != sharedCounter;
            localIp65504P241McmNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_241_MCM_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504P241McmNbrS
	 */
	protected void serializeIp65504P241McmNbrS(short ip65504P241McmNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P241McmNbrS,IP_65504_P_241_MCM_NBR_S_LEN)
                  ,beginIp65504P241McmNbrS
                  ,IP_65504_P_241_MCM_NBR_S_LEN
                 );
            localIp65504P241McmNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P241McmNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P241McmNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P241McmNbrS() {	 
			return (getShort(beginIp65504P241McmNbrS));
   	}
         int localIp65504P241McmNbrLCounter = -1;
         public boolean isIp65504P241McmNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P241McmNbrLCounter != sharedCounter;
            localIp65504P241McmNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_241_MCM_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504P241McmNbrL
	 */
	protected void serializeIp65504P241McmNbrL(short ip65504P241McmNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P241McmNbrL,IP_65504_P_241_MCM_NBR_L_LEN)
                  ,beginIp65504P241McmNbrL
                  ,IP_65504_P_241_MCM_NBR_L_LEN
                 );
            localIp65504P241McmNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P241McmNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P241McmNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P241McmNbrL() {	 
			return (getShort(beginIp65504P241McmNbrL));
   	}
         int localIp65504P242McmIndSCounter = -1;
         public boolean isIp65504P242McmIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P242McmIndSCounter != sharedCounter;
            localIp65504P242McmIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_242_MCM_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P242McmIndS
	 */
	protected void serializeIp65504P242McmIndS(short ip65504P242McmIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P242McmIndS,IP_65504_P_242_MCM_IND_S_LEN)
                  ,beginIp65504P242McmIndS
                  ,IP_65504_P_242_MCM_IND_S_LEN
                 );
            localIp65504P242McmIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P242McmIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P242McmIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P242McmIndS() {	 
			return (getShort(beginIp65504P242McmIndS));
   	}
         int localIp65504P242McmIndLCounter = -1;
         public boolean isIp65504P242McmIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P242McmIndLCounter != sharedCounter;
            localIp65504P242McmIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_242_MCM_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P242McmIndL
	 */
	protected void serializeIp65504P242McmIndL(short ip65504P242McmIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P242McmIndL,IP_65504_P_242_MCM_IND_L_LEN)
                  ,beginIp65504P242McmIndL
                  ,IP_65504_P_242_MCM_IND_L_LEN
                 );
            localIp65504P242McmIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P242McmIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P242McmIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P242McmIndL() {	 
			return (getShort(beginIp65504P242McmIndL));
   	}
         int localIp65504P243McmRspSCounter = -1;
         public boolean isIp65504P243McmRspSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P243McmRspSCounter != sharedCounter;
            localIp65504P243McmRspSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_243_MCM_RSP_S_LEN = 2;
  	/**
	 * serializeIp65504P243McmRspS
	 */
	protected void serializeIp65504P243McmRspS(short ip65504P243McmRspS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P243McmRspS,IP_65504_P_243_MCM_RSP_S_LEN)
                  ,beginIp65504P243McmRspS
                  ,IP_65504_P_243_MCM_RSP_S_LEN
                 );
            localIp65504P243McmRspSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P243McmRspSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P243McmRspS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P243McmRspS() {	 
			return (getShort(beginIp65504P243McmRspS));
   	}
         int localIp65504P243McmRspLCounter = -1;
         public boolean isIp65504P243McmRspLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P243McmRspLCounter != sharedCounter;
            localIp65504P243McmRspLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_243_MCM_RSP_L_LEN = 2;
  	/**
	 * serializeIp65504P243McmRspL
	 */
	protected void serializeIp65504P243McmRspL(short ip65504P243McmRspL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P243McmRspL,IP_65504_P_243_MCM_RSP_L_LEN)
                  ,beginIp65504P243McmRspL
                  ,IP_65504_P_243_MCM_RSP_L_LEN
                 );
            localIp65504P243McmRspLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P243McmRspLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P243McmRspL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P243McmRspL() {	 
			return (getShort(beginIp65504P243McmRspL));
   	}
         int localIp65504P244McmcbdtSCounter = -1;
         public boolean isIp65504P244McmcbdtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P244McmcbdtSCounter != sharedCounter;
            localIp65504P244McmcbdtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_244_MCMCBDT_S_LEN = 2;
  	/**
	 * serializeIp65504P244McmcbdtS
	 */
	protected void serializeIp65504P244McmcbdtS(short ip65504P244McmcbdtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P244McmcbdtS,IP_65504_P_244_MCMCBDT_S_LEN)
                  ,beginIp65504P244McmcbdtS
                  ,IP_65504_P_244_MCMCBDT_S_LEN
                 );
            localIp65504P244McmcbdtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P244McmcbdtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P244McmcbdtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P244McmcbdtS() {	 
			return (getShort(beginIp65504P244McmcbdtS));
   	}
         int localIp65504P244McmcbdtLCounter = -1;
         public boolean isIp65504P244McmcbdtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P244McmcbdtLCounter != sharedCounter;
            localIp65504P244McmcbdtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_244_MCMCBDT_L_LEN = 2;
  	/**
	 * serializeIp65504P244McmcbdtL
	 */
	protected void serializeIp65504P244McmcbdtL(short ip65504P244McmcbdtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P244McmcbdtL,IP_65504_P_244_MCMCBDT_L_LEN)
                  ,beginIp65504P244McmcbdtL
                  ,IP_65504_P_244_MCMCBDT_L_LEN
                 );
            localIp65504P244McmcbdtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P244McmcbdtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P244McmcbdtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P244McmcbdtL() {	 
			return (getShort(beginIp65504P244McmcbdtL));
   	}
         int localIp65504P245ReservdSCounter = -1;
         public boolean isIp65504P245ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P245ReservdSCounter != sharedCounter;
            localIp65504P245ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_245_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P245ReservdS
	 */
	protected void serializeIp65504P245ReservdS(short ip65504P245ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P245ReservdS,IP_65504_P_245_RESERVD_S_LEN)
                  ,beginIp65504P245ReservdS
                  ,IP_65504_P_245_RESERVD_S_LEN
                 );
            localIp65504P245ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P245ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P245ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P245ReservdS() {	 
			return (getShort(beginIp65504P245ReservdS));
   	}
         int localIp65504P245ReservdLCounter = -1;
         public boolean isIp65504P245ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P245ReservdLCounter != sharedCounter;
            localIp65504P245ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_245_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P245ReservdL
	 */
	protected void serializeIp65504P245ReservdL(short ip65504P245ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P245ReservdL,IP_65504_P_245_RESERVD_L_LEN)
                  ,beginIp65504P245ReservdL
                  ,IP_65504_P_245_RESERVD_L_LEN
                 );
            localIp65504P245ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P245ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P245ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P245ReservdL() {	 
			return (getShort(beginIp65504P245ReservdL));
   	}
         int localIp65504P246ReservdSCounter = -1;
         public boolean isIp65504P246ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P246ReservdSCounter != sharedCounter;
            localIp65504P246ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_246_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P246ReservdS
	 */
	protected void serializeIp65504P246ReservdS(short ip65504P246ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P246ReservdS,IP_65504_P_246_RESERVD_S_LEN)
                  ,beginIp65504P246ReservdS
                  ,IP_65504_P_246_RESERVD_S_LEN
                 );
            localIp65504P246ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P246ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P246ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P246ReservdS() {	 
			return (getShort(beginIp65504P246ReservdS));
   	}
         int localIp65504P246ReservdLCounter = -1;
         public boolean isIp65504P246ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P246ReservdLCounter != sharedCounter;
            localIp65504P246ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_246_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P246ReservdL
	 */
	protected void serializeIp65504P246ReservdL(short ip65504P246ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P246ReservdL,IP_65504_P_246_RESERVD_L_LEN)
                  ,beginIp65504P246ReservdL
                  ,IP_65504_P_246_RESERVD_L_LEN
                 );
            localIp65504P246ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P246ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P246ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P246ReservdL() {	 
			return (getShort(beginIp65504P246ReservdL));
   	}
         int localIp65504P247ReservdSCounter = -1;
         public boolean isIp65504P247ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P247ReservdSCounter != sharedCounter;
            localIp65504P247ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_247_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P247ReservdS
	 */
	protected void serializeIp65504P247ReservdS(short ip65504P247ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P247ReservdS,IP_65504_P_247_RESERVD_S_LEN)
                  ,beginIp65504P247ReservdS
                  ,IP_65504_P_247_RESERVD_S_LEN
                 );
            localIp65504P247ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P247ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P247ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P247ReservdS() {	 
			return (getShort(beginIp65504P247ReservdS));
   	}
         int localIp65504P247ReservdLCounter = -1;
         public boolean isIp65504P247ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P247ReservdLCounter != sharedCounter;
            localIp65504P247ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_247_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P247ReservdL
	 */
	protected void serializeIp65504P247ReservdL(short ip65504P247ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P247ReservdL,IP_65504_P_247_RESERVD_L_LEN)
                  ,beginIp65504P247ReservdL
                  ,IP_65504_P_247_RESERVD_L_LEN
                 );
            localIp65504P247ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P247ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P247ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P247ReservdL() {	 
			return (getShort(beginIp65504P247ReservdL));
   	}
         int localIp65504P248ReservdSCounter = -1;
         public boolean isIp65504P248ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P248ReservdSCounter != sharedCounter;
            localIp65504P248ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_248_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P248ReservdS
	 */
	protected void serializeIp65504P248ReservdS(short ip65504P248ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P248ReservdS,IP_65504_P_248_RESERVD_S_LEN)
                  ,beginIp65504P248ReservdS
                  ,IP_65504_P_248_RESERVD_S_LEN
                 );
            localIp65504P248ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P248ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P248ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P248ReservdS() {	 
			return (getShort(beginIp65504P248ReservdS));
   	}
         int localIp65504P248ReservdLCounter = -1;
         public boolean isIp65504P248ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P248ReservdLCounter != sharedCounter;
            localIp65504P248ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_248_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P248ReservdL
	 */
	protected void serializeIp65504P248ReservdL(short ip65504P248ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P248ReservdL,IP_65504_P_248_RESERVD_L_LEN)
                  ,beginIp65504P248ReservdL
                  ,IP_65504_P_248_RESERVD_L_LEN
                 );
            localIp65504P248ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P248ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P248ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P248ReservdL() {	 
			return (getShort(beginIp65504P248ReservdL));
   	}




}
  
