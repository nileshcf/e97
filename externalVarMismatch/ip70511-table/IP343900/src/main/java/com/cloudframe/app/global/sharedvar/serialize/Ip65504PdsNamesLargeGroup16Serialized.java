package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_16_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P466ReservdS;
            protected  int beginIp65504P466ReservdL;
            protected  int beginIp65504P467ReservdS;
            protected  int beginIp65504P467ReservdL;
            protected  int beginIp65504P468ReservdS;
            protected  int beginIp65504P468ReservdL;
            protected  int beginIp65504P469ReservdS;
            protected  int beginIp65504P469ReservdL;
            protected  int beginIp65504P470ReservdS;
            protected  int beginIp65504P470ReservdL;
            protected  int beginIp65504P471ReservdS;
            protected  int beginIp65504P471ReservdL;
            protected  int beginIp65504P472ReservdS;
            protected  int beginIp65504P472ReservdL;
            protected  int beginIp65504P473ReservdS;
            protected  int beginIp65504P473ReservdL;
            protected  int beginIp65504P474ReservdS;
            protected  int beginIp65504P474ReservdL;
            protected  int beginIp65504P475ReservdS;
            protected  int beginIp65504P475ReservdL;
            protected  int beginIp65504P476ReservdS;
            protected  int beginIp65504P476ReservdL;
            protected  int beginIp65504P477ReservdS;
            protected  int beginIp65504P477ReservdL;
            protected  int beginIp65504P478ReservdS;
            protected  int beginIp65504P478ReservdL;
            protected  int beginIp65504P479ReservdS;
            protected  int beginIp65504P479ReservdL;
            protected  int beginIp65504P480ReservdS;
            protected  int beginIp65504P480ReservdL;
            protected  int beginIp65504P481ReservdS;
            protected  int beginIp65504P481ReservdL;
            protected  int beginIp65504P482ReservdS;
            protected  int beginIp65504P482ReservdL;
            protected  int beginIp65504P483ReservdS;
            protected  int beginIp65504P483ReservdL;
            protected  int beginIp65504P484ReservdS;
            protected  int beginIp65504P484ReservdL;
            protected  int beginIp65504P485ReservdS;
            protected  int beginIp65504P485ReservdL;
            protected  int beginIp65504P486ReservdS;
            protected  int beginIp65504P486ReservdL;
            protected  int beginIp65504P487ReservdS;
            protected  int beginIp65504P487ReservdL;
            protected  int beginIp65504P488ReservdS;
            protected  int beginIp65504P488ReservdL;
            protected  int beginIp65504P489ReservdS;
            protected  int beginIp65504P489ReservdL;
            protected  int beginIp65504P490ReservdS;
            protected  int beginIp65504P490ReservdL;
            protected  int beginIp65504P491ReservdS;
            protected  int beginIp65504P491ReservdL;
            protected  int beginIp65504P492ReservdS;
            protected  int beginIp65504P492ReservdL;
            protected  int beginIp65504P493ReservdS;
            protected  int beginIp65504P493ReservdL;
            protected  int beginIp65504P494ReservdS;
            protected  int beginIp65504P494ReservdL;
            protected  int beginIp65504P495ReservdS;
            protected  int beginIp65504P495ReservdL;
            protected  int beginIp65504P496ReservdS;
            protected  int beginIp65504P496ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup16Serialized
	**/
    public Ip65504PdsNamesLargeGroup16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup16Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup16Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup16Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3716); // serialize this field at offset 3716 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup16Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3716 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P466ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P466ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P467ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P467ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P468ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P468ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P469ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P469ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P470ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P470ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P471ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P471ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P472ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P472ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P473ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P473ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P474ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P474ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P475ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P475ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P476ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P476ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P477ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P477ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P478ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P478ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P479ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P479ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P480ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P480ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P481ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P481ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P482ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P482ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P483ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P483ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P484ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P484ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P485ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P485ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P486ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P486ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P487ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P487ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P488ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P488ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P489ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P489ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P490ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P490ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P491ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P491ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P492ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P492ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P493ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P493ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P494ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P494ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P495ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P495ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P496ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P496ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P466ReservdSCounter = -1;
         public boolean isIp65504P466ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P466ReservdSCounter != sharedCounter;
            localIp65504P466ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_466_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P466ReservdS
	 */
	protected void serializeIp65504P466ReservdS(short ip65504P466ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P466ReservdS,IP_65504_P_466_RESERVD_S_LEN)
                  ,beginIp65504P466ReservdS
                  ,IP_65504_P_466_RESERVD_S_LEN
                 );
            localIp65504P466ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P466ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P466ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P466ReservdS() {	 
			return (getShort(beginIp65504P466ReservdS));
   	}
         int localIp65504P466ReservdLCounter = -1;
         public boolean isIp65504P466ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P466ReservdLCounter != sharedCounter;
            localIp65504P466ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_466_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P466ReservdL
	 */
	protected void serializeIp65504P466ReservdL(short ip65504P466ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P466ReservdL,IP_65504_P_466_RESERVD_L_LEN)
                  ,beginIp65504P466ReservdL
                  ,IP_65504_P_466_RESERVD_L_LEN
                 );
            localIp65504P466ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P466ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P466ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P466ReservdL() {	 
			return (getShort(beginIp65504P466ReservdL));
   	}
         int localIp65504P467ReservdSCounter = -1;
         public boolean isIp65504P467ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P467ReservdSCounter != sharedCounter;
            localIp65504P467ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_467_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P467ReservdS
	 */
	protected void serializeIp65504P467ReservdS(short ip65504P467ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P467ReservdS,IP_65504_P_467_RESERVD_S_LEN)
                  ,beginIp65504P467ReservdS
                  ,IP_65504_P_467_RESERVD_S_LEN
                 );
            localIp65504P467ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P467ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P467ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P467ReservdS() {	 
			return (getShort(beginIp65504P467ReservdS));
   	}
         int localIp65504P467ReservdLCounter = -1;
         public boolean isIp65504P467ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P467ReservdLCounter != sharedCounter;
            localIp65504P467ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_467_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P467ReservdL
	 */
	protected void serializeIp65504P467ReservdL(short ip65504P467ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P467ReservdL,IP_65504_P_467_RESERVD_L_LEN)
                  ,beginIp65504P467ReservdL
                  ,IP_65504_P_467_RESERVD_L_LEN
                 );
            localIp65504P467ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P467ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P467ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P467ReservdL() {	 
			return (getShort(beginIp65504P467ReservdL));
   	}
         int localIp65504P468ReservdSCounter = -1;
         public boolean isIp65504P468ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P468ReservdSCounter != sharedCounter;
            localIp65504P468ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_468_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P468ReservdS
	 */
	protected void serializeIp65504P468ReservdS(short ip65504P468ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P468ReservdS,IP_65504_P_468_RESERVD_S_LEN)
                  ,beginIp65504P468ReservdS
                  ,IP_65504_P_468_RESERVD_S_LEN
                 );
            localIp65504P468ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P468ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P468ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P468ReservdS() {	 
			return (getShort(beginIp65504P468ReservdS));
   	}
         int localIp65504P468ReservdLCounter = -1;
         public boolean isIp65504P468ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P468ReservdLCounter != sharedCounter;
            localIp65504P468ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_468_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P468ReservdL
	 */
	protected void serializeIp65504P468ReservdL(short ip65504P468ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P468ReservdL,IP_65504_P_468_RESERVD_L_LEN)
                  ,beginIp65504P468ReservdL
                  ,IP_65504_P_468_RESERVD_L_LEN
                 );
            localIp65504P468ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P468ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P468ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P468ReservdL() {	 
			return (getShort(beginIp65504P468ReservdL));
   	}
         int localIp65504P469ReservdSCounter = -1;
         public boolean isIp65504P469ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P469ReservdSCounter != sharedCounter;
            localIp65504P469ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_469_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P469ReservdS
	 */
	protected void serializeIp65504P469ReservdS(short ip65504P469ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P469ReservdS,IP_65504_P_469_RESERVD_S_LEN)
                  ,beginIp65504P469ReservdS
                  ,IP_65504_P_469_RESERVD_S_LEN
                 );
            localIp65504P469ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P469ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P469ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P469ReservdS() {	 
			return (getShort(beginIp65504P469ReservdS));
   	}
         int localIp65504P469ReservdLCounter = -1;
         public boolean isIp65504P469ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P469ReservdLCounter != sharedCounter;
            localIp65504P469ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_469_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P469ReservdL
	 */
	protected void serializeIp65504P469ReservdL(short ip65504P469ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P469ReservdL,IP_65504_P_469_RESERVD_L_LEN)
                  ,beginIp65504P469ReservdL
                  ,IP_65504_P_469_RESERVD_L_LEN
                 );
            localIp65504P469ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P469ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P469ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P469ReservdL() {	 
			return (getShort(beginIp65504P469ReservdL));
   	}
         int localIp65504P470ReservdSCounter = -1;
         public boolean isIp65504P470ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P470ReservdSCounter != sharedCounter;
            localIp65504P470ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_470_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P470ReservdS
	 */
	protected void serializeIp65504P470ReservdS(short ip65504P470ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P470ReservdS,IP_65504_P_470_RESERVD_S_LEN)
                  ,beginIp65504P470ReservdS
                  ,IP_65504_P_470_RESERVD_S_LEN
                 );
            localIp65504P470ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P470ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P470ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P470ReservdS() {	 
			return (getShort(beginIp65504P470ReservdS));
   	}
         int localIp65504P470ReservdLCounter = -1;
         public boolean isIp65504P470ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P470ReservdLCounter != sharedCounter;
            localIp65504P470ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_470_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P470ReservdL
	 */
	protected void serializeIp65504P470ReservdL(short ip65504P470ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P470ReservdL,IP_65504_P_470_RESERVD_L_LEN)
                  ,beginIp65504P470ReservdL
                  ,IP_65504_P_470_RESERVD_L_LEN
                 );
            localIp65504P470ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P470ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P470ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P470ReservdL() {	 
			return (getShort(beginIp65504P470ReservdL));
   	}
         int localIp65504P471ReservdSCounter = -1;
         public boolean isIp65504P471ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P471ReservdSCounter != sharedCounter;
            localIp65504P471ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_471_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P471ReservdS
	 */
	protected void serializeIp65504P471ReservdS(short ip65504P471ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P471ReservdS,IP_65504_P_471_RESERVD_S_LEN)
                  ,beginIp65504P471ReservdS
                  ,IP_65504_P_471_RESERVD_S_LEN
                 );
            localIp65504P471ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P471ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P471ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P471ReservdS() {	 
			return (getShort(beginIp65504P471ReservdS));
   	}
         int localIp65504P471ReservdLCounter = -1;
         public boolean isIp65504P471ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P471ReservdLCounter != sharedCounter;
            localIp65504P471ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_471_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P471ReservdL
	 */
	protected void serializeIp65504P471ReservdL(short ip65504P471ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P471ReservdL,IP_65504_P_471_RESERVD_L_LEN)
                  ,beginIp65504P471ReservdL
                  ,IP_65504_P_471_RESERVD_L_LEN
                 );
            localIp65504P471ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P471ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P471ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P471ReservdL() {	 
			return (getShort(beginIp65504P471ReservdL));
   	}
         int localIp65504P472ReservdSCounter = -1;
         public boolean isIp65504P472ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P472ReservdSCounter != sharedCounter;
            localIp65504P472ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_472_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P472ReservdS
	 */
	protected void serializeIp65504P472ReservdS(short ip65504P472ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P472ReservdS,IP_65504_P_472_RESERVD_S_LEN)
                  ,beginIp65504P472ReservdS
                  ,IP_65504_P_472_RESERVD_S_LEN
                 );
            localIp65504P472ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P472ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P472ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P472ReservdS() {	 
			return (getShort(beginIp65504P472ReservdS));
   	}
         int localIp65504P472ReservdLCounter = -1;
         public boolean isIp65504P472ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P472ReservdLCounter != sharedCounter;
            localIp65504P472ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_472_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P472ReservdL
	 */
	protected void serializeIp65504P472ReservdL(short ip65504P472ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P472ReservdL,IP_65504_P_472_RESERVD_L_LEN)
                  ,beginIp65504P472ReservdL
                  ,IP_65504_P_472_RESERVD_L_LEN
                 );
            localIp65504P472ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P472ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P472ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P472ReservdL() {	 
			return (getShort(beginIp65504P472ReservdL));
   	}
         int localIp65504P473ReservdSCounter = -1;
         public boolean isIp65504P473ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P473ReservdSCounter != sharedCounter;
            localIp65504P473ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_473_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P473ReservdS
	 */
	protected void serializeIp65504P473ReservdS(short ip65504P473ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P473ReservdS,IP_65504_P_473_RESERVD_S_LEN)
                  ,beginIp65504P473ReservdS
                  ,IP_65504_P_473_RESERVD_S_LEN
                 );
            localIp65504P473ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P473ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P473ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P473ReservdS() {	 
			return (getShort(beginIp65504P473ReservdS));
   	}
         int localIp65504P473ReservdLCounter = -1;
         public boolean isIp65504P473ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P473ReservdLCounter != sharedCounter;
            localIp65504P473ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_473_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P473ReservdL
	 */
	protected void serializeIp65504P473ReservdL(short ip65504P473ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P473ReservdL,IP_65504_P_473_RESERVD_L_LEN)
                  ,beginIp65504P473ReservdL
                  ,IP_65504_P_473_RESERVD_L_LEN
                 );
            localIp65504P473ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P473ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P473ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P473ReservdL() {	 
			return (getShort(beginIp65504P473ReservdL));
   	}
         int localIp65504P474ReservdSCounter = -1;
         public boolean isIp65504P474ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P474ReservdSCounter != sharedCounter;
            localIp65504P474ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_474_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P474ReservdS
	 */
	protected void serializeIp65504P474ReservdS(short ip65504P474ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P474ReservdS,IP_65504_P_474_RESERVD_S_LEN)
                  ,beginIp65504P474ReservdS
                  ,IP_65504_P_474_RESERVD_S_LEN
                 );
            localIp65504P474ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P474ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P474ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P474ReservdS() {	 
			return (getShort(beginIp65504P474ReservdS));
   	}
         int localIp65504P474ReservdLCounter = -1;
         public boolean isIp65504P474ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P474ReservdLCounter != sharedCounter;
            localIp65504P474ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_474_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P474ReservdL
	 */
	protected void serializeIp65504P474ReservdL(short ip65504P474ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P474ReservdL,IP_65504_P_474_RESERVD_L_LEN)
                  ,beginIp65504P474ReservdL
                  ,IP_65504_P_474_RESERVD_L_LEN
                 );
            localIp65504P474ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P474ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P474ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P474ReservdL() {	 
			return (getShort(beginIp65504P474ReservdL));
   	}
         int localIp65504P475ReservdSCounter = -1;
         public boolean isIp65504P475ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P475ReservdSCounter != sharedCounter;
            localIp65504P475ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_475_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P475ReservdS
	 */
	protected void serializeIp65504P475ReservdS(short ip65504P475ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P475ReservdS,IP_65504_P_475_RESERVD_S_LEN)
                  ,beginIp65504P475ReservdS
                  ,IP_65504_P_475_RESERVD_S_LEN
                 );
            localIp65504P475ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P475ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P475ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P475ReservdS() {	 
			return (getShort(beginIp65504P475ReservdS));
   	}
         int localIp65504P475ReservdLCounter = -1;
         public boolean isIp65504P475ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P475ReservdLCounter != sharedCounter;
            localIp65504P475ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_475_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P475ReservdL
	 */
	protected void serializeIp65504P475ReservdL(short ip65504P475ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P475ReservdL,IP_65504_P_475_RESERVD_L_LEN)
                  ,beginIp65504P475ReservdL
                  ,IP_65504_P_475_RESERVD_L_LEN
                 );
            localIp65504P475ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P475ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P475ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P475ReservdL() {	 
			return (getShort(beginIp65504P475ReservdL));
   	}
         int localIp65504P476ReservdSCounter = -1;
         public boolean isIp65504P476ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P476ReservdSCounter != sharedCounter;
            localIp65504P476ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_476_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P476ReservdS
	 */
	protected void serializeIp65504P476ReservdS(short ip65504P476ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P476ReservdS,IP_65504_P_476_RESERVD_S_LEN)
                  ,beginIp65504P476ReservdS
                  ,IP_65504_P_476_RESERVD_S_LEN
                 );
            localIp65504P476ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P476ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P476ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P476ReservdS() {	 
			return (getShort(beginIp65504P476ReservdS));
   	}
         int localIp65504P476ReservdLCounter = -1;
         public boolean isIp65504P476ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P476ReservdLCounter != sharedCounter;
            localIp65504P476ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_476_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P476ReservdL
	 */
	protected void serializeIp65504P476ReservdL(short ip65504P476ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P476ReservdL,IP_65504_P_476_RESERVD_L_LEN)
                  ,beginIp65504P476ReservdL
                  ,IP_65504_P_476_RESERVD_L_LEN
                 );
            localIp65504P476ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P476ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P476ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P476ReservdL() {	 
			return (getShort(beginIp65504P476ReservdL));
   	}
         int localIp65504P477ReservdSCounter = -1;
         public boolean isIp65504P477ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P477ReservdSCounter != sharedCounter;
            localIp65504P477ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_477_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P477ReservdS
	 */
	protected void serializeIp65504P477ReservdS(short ip65504P477ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P477ReservdS,IP_65504_P_477_RESERVD_S_LEN)
                  ,beginIp65504P477ReservdS
                  ,IP_65504_P_477_RESERVD_S_LEN
                 );
            localIp65504P477ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P477ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P477ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P477ReservdS() {	 
			return (getShort(beginIp65504P477ReservdS));
   	}
         int localIp65504P477ReservdLCounter = -1;
         public boolean isIp65504P477ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P477ReservdLCounter != sharedCounter;
            localIp65504P477ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_477_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P477ReservdL
	 */
	protected void serializeIp65504P477ReservdL(short ip65504P477ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P477ReservdL,IP_65504_P_477_RESERVD_L_LEN)
                  ,beginIp65504P477ReservdL
                  ,IP_65504_P_477_RESERVD_L_LEN
                 );
            localIp65504P477ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P477ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P477ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P477ReservdL() {	 
			return (getShort(beginIp65504P477ReservdL));
   	}
         int localIp65504P478ReservdSCounter = -1;
         public boolean isIp65504P478ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P478ReservdSCounter != sharedCounter;
            localIp65504P478ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_478_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P478ReservdS
	 */
	protected void serializeIp65504P478ReservdS(short ip65504P478ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P478ReservdS,IP_65504_P_478_RESERVD_S_LEN)
                  ,beginIp65504P478ReservdS
                  ,IP_65504_P_478_RESERVD_S_LEN
                 );
            localIp65504P478ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P478ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P478ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P478ReservdS() {	 
			return (getShort(beginIp65504P478ReservdS));
   	}
         int localIp65504P478ReservdLCounter = -1;
         public boolean isIp65504P478ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P478ReservdLCounter != sharedCounter;
            localIp65504P478ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_478_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P478ReservdL
	 */
	protected void serializeIp65504P478ReservdL(short ip65504P478ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P478ReservdL,IP_65504_P_478_RESERVD_L_LEN)
                  ,beginIp65504P478ReservdL
                  ,IP_65504_P_478_RESERVD_L_LEN
                 );
            localIp65504P478ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P478ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P478ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P478ReservdL() {	 
			return (getShort(beginIp65504P478ReservdL));
   	}
         int localIp65504P479ReservdSCounter = -1;
         public boolean isIp65504P479ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P479ReservdSCounter != sharedCounter;
            localIp65504P479ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_479_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P479ReservdS
	 */
	protected void serializeIp65504P479ReservdS(short ip65504P479ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P479ReservdS,IP_65504_P_479_RESERVD_S_LEN)
                  ,beginIp65504P479ReservdS
                  ,IP_65504_P_479_RESERVD_S_LEN
                 );
            localIp65504P479ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P479ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P479ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P479ReservdS() {	 
			return (getShort(beginIp65504P479ReservdS));
   	}
         int localIp65504P479ReservdLCounter = -1;
         public boolean isIp65504P479ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P479ReservdLCounter != sharedCounter;
            localIp65504P479ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_479_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P479ReservdL
	 */
	protected void serializeIp65504P479ReservdL(short ip65504P479ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P479ReservdL,IP_65504_P_479_RESERVD_L_LEN)
                  ,beginIp65504P479ReservdL
                  ,IP_65504_P_479_RESERVD_L_LEN
                 );
            localIp65504P479ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P479ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P479ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P479ReservdL() {	 
			return (getShort(beginIp65504P479ReservdL));
   	}
         int localIp65504P480ReservdSCounter = -1;
         public boolean isIp65504P480ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P480ReservdSCounter != sharedCounter;
            localIp65504P480ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_480_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P480ReservdS
	 */
	protected void serializeIp65504P480ReservdS(short ip65504P480ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P480ReservdS,IP_65504_P_480_RESERVD_S_LEN)
                  ,beginIp65504P480ReservdS
                  ,IP_65504_P_480_RESERVD_S_LEN
                 );
            localIp65504P480ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P480ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P480ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P480ReservdS() {	 
			return (getShort(beginIp65504P480ReservdS));
   	}
         int localIp65504P480ReservdLCounter = -1;
         public boolean isIp65504P480ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P480ReservdLCounter != sharedCounter;
            localIp65504P480ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_480_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P480ReservdL
	 */
	protected void serializeIp65504P480ReservdL(short ip65504P480ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P480ReservdL,IP_65504_P_480_RESERVD_L_LEN)
                  ,beginIp65504P480ReservdL
                  ,IP_65504_P_480_RESERVD_L_LEN
                 );
            localIp65504P480ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P480ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P480ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P480ReservdL() {	 
			return (getShort(beginIp65504P480ReservdL));
   	}
         int localIp65504P481ReservdSCounter = -1;
         public boolean isIp65504P481ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P481ReservdSCounter != sharedCounter;
            localIp65504P481ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_481_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P481ReservdS
	 */
	protected void serializeIp65504P481ReservdS(short ip65504P481ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P481ReservdS,IP_65504_P_481_RESERVD_S_LEN)
                  ,beginIp65504P481ReservdS
                  ,IP_65504_P_481_RESERVD_S_LEN
                 );
            localIp65504P481ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P481ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P481ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P481ReservdS() {	 
			return (getShort(beginIp65504P481ReservdS));
   	}
         int localIp65504P481ReservdLCounter = -1;
         public boolean isIp65504P481ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P481ReservdLCounter != sharedCounter;
            localIp65504P481ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_481_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P481ReservdL
	 */
	protected void serializeIp65504P481ReservdL(short ip65504P481ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P481ReservdL,IP_65504_P_481_RESERVD_L_LEN)
                  ,beginIp65504P481ReservdL
                  ,IP_65504_P_481_RESERVD_L_LEN
                 );
            localIp65504P481ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P481ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P481ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P481ReservdL() {	 
			return (getShort(beginIp65504P481ReservdL));
   	}
         int localIp65504P482ReservdSCounter = -1;
         public boolean isIp65504P482ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P482ReservdSCounter != sharedCounter;
            localIp65504P482ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_482_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P482ReservdS
	 */
	protected void serializeIp65504P482ReservdS(short ip65504P482ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P482ReservdS,IP_65504_P_482_RESERVD_S_LEN)
                  ,beginIp65504P482ReservdS
                  ,IP_65504_P_482_RESERVD_S_LEN
                 );
            localIp65504P482ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P482ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P482ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P482ReservdS() {	 
			return (getShort(beginIp65504P482ReservdS));
   	}
         int localIp65504P482ReservdLCounter = -1;
         public boolean isIp65504P482ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P482ReservdLCounter != sharedCounter;
            localIp65504P482ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_482_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P482ReservdL
	 */
	protected void serializeIp65504P482ReservdL(short ip65504P482ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P482ReservdL,IP_65504_P_482_RESERVD_L_LEN)
                  ,beginIp65504P482ReservdL
                  ,IP_65504_P_482_RESERVD_L_LEN
                 );
            localIp65504P482ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P482ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P482ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P482ReservdL() {	 
			return (getShort(beginIp65504P482ReservdL));
   	}
         int localIp65504P483ReservdSCounter = -1;
         public boolean isIp65504P483ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P483ReservdSCounter != sharedCounter;
            localIp65504P483ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_483_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P483ReservdS
	 */
	protected void serializeIp65504P483ReservdS(short ip65504P483ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P483ReservdS,IP_65504_P_483_RESERVD_S_LEN)
                  ,beginIp65504P483ReservdS
                  ,IP_65504_P_483_RESERVD_S_LEN
                 );
            localIp65504P483ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P483ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P483ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P483ReservdS() {	 
			return (getShort(beginIp65504P483ReservdS));
   	}
         int localIp65504P483ReservdLCounter = -1;
         public boolean isIp65504P483ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P483ReservdLCounter != sharedCounter;
            localIp65504P483ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_483_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P483ReservdL
	 */
	protected void serializeIp65504P483ReservdL(short ip65504P483ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P483ReservdL,IP_65504_P_483_RESERVD_L_LEN)
                  ,beginIp65504P483ReservdL
                  ,IP_65504_P_483_RESERVD_L_LEN
                 );
            localIp65504P483ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P483ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P483ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P483ReservdL() {	 
			return (getShort(beginIp65504P483ReservdL));
   	}
         int localIp65504P484ReservdSCounter = -1;
         public boolean isIp65504P484ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P484ReservdSCounter != sharedCounter;
            localIp65504P484ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_484_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P484ReservdS
	 */
	protected void serializeIp65504P484ReservdS(short ip65504P484ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P484ReservdS,IP_65504_P_484_RESERVD_S_LEN)
                  ,beginIp65504P484ReservdS
                  ,IP_65504_P_484_RESERVD_S_LEN
                 );
            localIp65504P484ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P484ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P484ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P484ReservdS() {	 
			return (getShort(beginIp65504P484ReservdS));
   	}
         int localIp65504P484ReservdLCounter = -1;
         public boolean isIp65504P484ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P484ReservdLCounter != sharedCounter;
            localIp65504P484ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_484_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P484ReservdL
	 */
	protected void serializeIp65504P484ReservdL(short ip65504P484ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P484ReservdL,IP_65504_P_484_RESERVD_L_LEN)
                  ,beginIp65504P484ReservdL
                  ,IP_65504_P_484_RESERVD_L_LEN
                 );
            localIp65504P484ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P484ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P484ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P484ReservdL() {	 
			return (getShort(beginIp65504P484ReservdL));
   	}
         int localIp65504P485ReservdSCounter = -1;
         public boolean isIp65504P485ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P485ReservdSCounter != sharedCounter;
            localIp65504P485ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_485_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P485ReservdS
	 */
	protected void serializeIp65504P485ReservdS(short ip65504P485ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P485ReservdS,IP_65504_P_485_RESERVD_S_LEN)
                  ,beginIp65504P485ReservdS
                  ,IP_65504_P_485_RESERVD_S_LEN
                 );
            localIp65504P485ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P485ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P485ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P485ReservdS() {	 
			return (getShort(beginIp65504P485ReservdS));
   	}
         int localIp65504P485ReservdLCounter = -1;
         public boolean isIp65504P485ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P485ReservdLCounter != sharedCounter;
            localIp65504P485ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_485_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P485ReservdL
	 */
	protected void serializeIp65504P485ReservdL(short ip65504P485ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P485ReservdL,IP_65504_P_485_RESERVD_L_LEN)
                  ,beginIp65504P485ReservdL
                  ,IP_65504_P_485_RESERVD_L_LEN
                 );
            localIp65504P485ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P485ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P485ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P485ReservdL() {	 
			return (getShort(beginIp65504P485ReservdL));
   	}
         int localIp65504P486ReservdSCounter = -1;
         public boolean isIp65504P486ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P486ReservdSCounter != sharedCounter;
            localIp65504P486ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_486_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P486ReservdS
	 */
	protected void serializeIp65504P486ReservdS(short ip65504P486ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P486ReservdS,IP_65504_P_486_RESERVD_S_LEN)
                  ,beginIp65504P486ReservdS
                  ,IP_65504_P_486_RESERVD_S_LEN
                 );
            localIp65504P486ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P486ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P486ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P486ReservdS() {	 
			return (getShort(beginIp65504P486ReservdS));
   	}
         int localIp65504P486ReservdLCounter = -1;
         public boolean isIp65504P486ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P486ReservdLCounter != sharedCounter;
            localIp65504P486ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_486_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P486ReservdL
	 */
	protected void serializeIp65504P486ReservdL(short ip65504P486ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P486ReservdL,IP_65504_P_486_RESERVD_L_LEN)
                  ,beginIp65504P486ReservdL
                  ,IP_65504_P_486_RESERVD_L_LEN
                 );
            localIp65504P486ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P486ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P486ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P486ReservdL() {	 
			return (getShort(beginIp65504P486ReservdL));
   	}
         int localIp65504P487ReservdSCounter = -1;
         public boolean isIp65504P487ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P487ReservdSCounter != sharedCounter;
            localIp65504P487ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_487_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P487ReservdS
	 */
	protected void serializeIp65504P487ReservdS(short ip65504P487ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P487ReservdS,IP_65504_P_487_RESERVD_S_LEN)
                  ,beginIp65504P487ReservdS
                  ,IP_65504_P_487_RESERVD_S_LEN
                 );
            localIp65504P487ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P487ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P487ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P487ReservdS() {	 
			return (getShort(beginIp65504P487ReservdS));
   	}
         int localIp65504P487ReservdLCounter = -1;
         public boolean isIp65504P487ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P487ReservdLCounter != sharedCounter;
            localIp65504P487ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_487_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P487ReservdL
	 */
	protected void serializeIp65504P487ReservdL(short ip65504P487ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P487ReservdL,IP_65504_P_487_RESERVD_L_LEN)
                  ,beginIp65504P487ReservdL
                  ,IP_65504_P_487_RESERVD_L_LEN
                 );
            localIp65504P487ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P487ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P487ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P487ReservdL() {	 
			return (getShort(beginIp65504P487ReservdL));
   	}
         int localIp65504P488ReservdSCounter = -1;
         public boolean isIp65504P488ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P488ReservdSCounter != sharedCounter;
            localIp65504P488ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_488_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P488ReservdS
	 */
	protected void serializeIp65504P488ReservdS(short ip65504P488ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P488ReservdS,IP_65504_P_488_RESERVD_S_LEN)
                  ,beginIp65504P488ReservdS
                  ,IP_65504_P_488_RESERVD_S_LEN
                 );
            localIp65504P488ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P488ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P488ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P488ReservdS() {	 
			return (getShort(beginIp65504P488ReservdS));
   	}
         int localIp65504P488ReservdLCounter = -1;
         public boolean isIp65504P488ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P488ReservdLCounter != sharedCounter;
            localIp65504P488ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_488_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P488ReservdL
	 */
	protected void serializeIp65504P488ReservdL(short ip65504P488ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P488ReservdL,IP_65504_P_488_RESERVD_L_LEN)
                  ,beginIp65504P488ReservdL
                  ,IP_65504_P_488_RESERVD_L_LEN
                 );
            localIp65504P488ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P488ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P488ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P488ReservdL() {	 
			return (getShort(beginIp65504P488ReservdL));
   	}
         int localIp65504P489ReservdSCounter = -1;
         public boolean isIp65504P489ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P489ReservdSCounter != sharedCounter;
            localIp65504P489ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_489_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P489ReservdS
	 */
	protected void serializeIp65504P489ReservdS(short ip65504P489ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P489ReservdS,IP_65504_P_489_RESERVD_S_LEN)
                  ,beginIp65504P489ReservdS
                  ,IP_65504_P_489_RESERVD_S_LEN
                 );
            localIp65504P489ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P489ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P489ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P489ReservdS() {	 
			return (getShort(beginIp65504P489ReservdS));
   	}
         int localIp65504P489ReservdLCounter = -1;
         public boolean isIp65504P489ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P489ReservdLCounter != sharedCounter;
            localIp65504P489ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_489_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P489ReservdL
	 */
	protected void serializeIp65504P489ReservdL(short ip65504P489ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P489ReservdL,IP_65504_P_489_RESERVD_L_LEN)
                  ,beginIp65504P489ReservdL
                  ,IP_65504_P_489_RESERVD_L_LEN
                 );
            localIp65504P489ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P489ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P489ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P489ReservdL() {	 
			return (getShort(beginIp65504P489ReservdL));
   	}
         int localIp65504P490ReservdSCounter = -1;
         public boolean isIp65504P490ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P490ReservdSCounter != sharedCounter;
            localIp65504P490ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_490_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P490ReservdS
	 */
	protected void serializeIp65504P490ReservdS(short ip65504P490ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P490ReservdS,IP_65504_P_490_RESERVD_S_LEN)
                  ,beginIp65504P490ReservdS
                  ,IP_65504_P_490_RESERVD_S_LEN
                 );
            localIp65504P490ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P490ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P490ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P490ReservdS() {	 
			return (getShort(beginIp65504P490ReservdS));
   	}
         int localIp65504P490ReservdLCounter = -1;
         public boolean isIp65504P490ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P490ReservdLCounter != sharedCounter;
            localIp65504P490ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_490_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P490ReservdL
	 */
	protected void serializeIp65504P490ReservdL(short ip65504P490ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P490ReservdL,IP_65504_P_490_RESERVD_L_LEN)
                  ,beginIp65504P490ReservdL
                  ,IP_65504_P_490_RESERVD_L_LEN
                 );
            localIp65504P490ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P490ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P490ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P490ReservdL() {	 
			return (getShort(beginIp65504P490ReservdL));
   	}
         int localIp65504P491ReservdSCounter = -1;
         public boolean isIp65504P491ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P491ReservdSCounter != sharedCounter;
            localIp65504P491ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_491_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P491ReservdS
	 */
	protected void serializeIp65504P491ReservdS(short ip65504P491ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P491ReservdS,IP_65504_P_491_RESERVD_S_LEN)
                  ,beginIp65504P491ReservdS
                  ,IP_65504_P_491_RESERVD_S_LEN
                 );
            localIp65504P491ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P491ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P491ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P491ReservdS() {	 
			return (getShort(beginIp65504P491ReservdS));
   	}
         int localIp65504P491ReservdLCounter = -1;
         public boolean isIp65504P491ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P491ReservdLCounter != sharedCounter;
            localIp65504P491ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_491_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P491ReservdL
	 */
	protected void serializeIp65504P491ReservdL(short ip65504P491ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P491ReservdL,IP_65504_P_491_RESERVD_L_LEN)
                  ,beginIp65504P491ReservdL
                  ,IP_65504_P_491_RESERVD_L_LEN
                 );
            localIp65504P491ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P491ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P491ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P491ReservdL() {	 
			return (getShort(beginIp65504P491ReservdL));
   	}
         int localIp65504P492ReservdSCounter = -1;
         public boolean isIp65504P492ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P492ReservdSCounter != sharedCounter;
            localIp65504P492ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_492_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P492ReservdS
	 */
	protected void serializeIp65504P492ReservdS(short ip65504P492ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P492ReservdS,IP_65504_P_492_RESERVD_S_LEN)
                  ,beginIp65504P492ReservdS
                  ,IP_65504_P_492_RESERVD_S_LEN
                 );
            localIp65504P492ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P492ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P492ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P492ReservdS() {	 
			return (getShort(beginIp65504P492ReservdS));
   	}
         int localIp65504P492ReservdLCounter = -1;
         public boolean isIp65504P492ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P492ReservdLCounter != sharedCounter;
            localIp65504P492ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_492_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P492ReservdL
	 */
	protected void serializeIp65504P492ReservdL(short ip65504P492ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P492ReservdL,IP_65504_P_492_RESERVD_L_LEN)
                  ,beginIp65504P492ReservdL
                  ,IP_65504_P_492_RESERVD_L_LEN
                 );
            localIp65504P492ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P492ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P492ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P492ReservdL() {	 
			return (getShort(beginIp65504P492ReservdL));
   	}
         int localIp65504P493ReservdSCounter = -1;
         public boolean isIp65504P493ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P493ReservdSCounter != sharedCounter;
            localIp65504P493ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_493_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P493ReservdS
	 */
	protected void serializeIp65504P493ReservdS(short ip65504P493ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P493ReservdS,IP_65504_P_493_RESERVD_S_LEN)
                  ,beginIp65504P493ReservdS
                  ,IP_65504_P_493_RESERVD_S_LEN
                 );
            localIp65504P493ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P493ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P493ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P493ReservdS() {	 
			return (getShort(beginIp65504P493ReservdS));
   	}
         int localIp65504P493ReservdLCounter = -1;
         public boolean isIp65504P493ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P493ReservdLCounter != sharedCounter;
            localIp65504P493ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_493_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P493ReservdL
	 */
	protected void serializeIp65504P493ReservdL(short ip65504P493ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P493ReservdL,IP_65504_P_493_RESERVD_L_LEN)
                  ,beginIp65504P493ReservdL
                  ,IP_65504_P_493_RESERVD_L_LEN
                 );
            localIp65504P493ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P493ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P493ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P493ReservdL() {	 
			return (getShort(beginIp65504P493ReservdL));
   	}
         int localIp65504P494ReservdSCounter = -1;
         public boolean isIp65504P494ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P494ReservdSCounter != sharedCounter;
            localIp65504P494ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_494_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P494ReservdS
	 */
	protected void serializeIp65504P494ReservdS(short ip65504P494ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P494ReservdS,IP_65504_P_494_RESERVD_S_LEN)
                  ,beginIp65504P494ReservdS
                  ,IP_65504_P_494_RESERVD_S_LEN
                 );
            localIp65504P494ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P494ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P494ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P494ReservdS() {	 
			return (getShort(beginIp65504P494ReservdS));
   	}
         int localIp65504P494ReservdLCounter = -1;
         public boolean isIp65504P494ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P494ReservdLCounter != sharedCounter;
            localIp65504P494ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_494_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P494ReservdL
	 */
	protected void serializeIp65504P494ReservdL(short ip65504P494ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P494ReservdL,IP_65504_P_494_RESERVD_L_LEN)
                  ,beginIp65504P494ReservdL
                  ,IP_65504_P_494_RESERVD_L_LEN
                 );
            localIp65504P494ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P494ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P494ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P494ReservdL() {	 
			return (getShort(beginIp65504P494ReservdL));
   	}
         int localIp65504P495ReservdSCounter = -1;
         public boolean isIp65504P495ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P495ReservdSCounter != sharedCounter;
            localIp65504P495ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_495_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P495ReservdS
	 */
	protected void serializeIp65504P495ReservdS(short ip65504P495ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P495ReservdS,IP_65504_P_495_RESERVD_S_LEN)
                  ,beginIp65504P495ReservdS
                  ,IP_65504_P_495_RESERVD_S_LEN
                 );
            localIp65504P495ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P495ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P495ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P495ReservdS() {	 
			return (getShort(beginIp65504P495ReservdS));
   	}
         int localIp65504P495ReservdLCounter = -1;
         public boolean isIp65504P495ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P495ReservdLCounter != sharedCounter;
            localIp65504P495ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_495_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P495ReservdL
	 */
	protected void serializeIp65504P495ReservdL(short ip65504P495ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P495ReservdL,IP_65504_P_495_RESERVD_L_LEN)
                  ,beginIp65504P495ReservdL
                  ,IP_65504_P_495_RESERVD_L_LEN
                 );
            localIp65504P495ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P495ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P495ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P495ReservdL() {	 
			return (getShort(beginIp65504P495ReservdL));
   	}
         int localIp65504P496ReservdSCounter = -1;
         public boolean isIp65504P496ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P496ReservdSCounter != sharedCounter;
            localIp65504P496ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_496_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P496ReservdS
	 */
	protected void serializeIp65504P496ReservdS(short ip65504P496ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P496ReservdS,IP_65504_P_496_RESERVD_S_LEN)
                  ,beginIp65504P496ReservdS
                  ,IP_65504_P_496_RESERVD_S_LEN
                 );
            localIp65504P496ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P496ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P496ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P496ReservdS() {	 
			return (getShort(beginIp65504P496ReservdS));
   	}
         int localIp65504P496ReservdLCounter = -1;
         public boolean isIp65504P496ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P496ReservdLCounter != sharedCounter;
            localIp65504P496ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_496_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P496ReservdL
	 */
	protected void serializeIp65504P496ReservdL(short ip65504P496ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P496ReservdL,IP_65504_P_496_RESERVD_L_LEN)
                  ,beginIp65504P496ReservdL
                  ,IP_65504_P_496_RESERVD_L_LEN
                 );
            localIp65504P496ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P496ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P496ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P496ReservdL() {	 
			return (getShort(beginIp65504P496ReservdL));
   	}




}
  
