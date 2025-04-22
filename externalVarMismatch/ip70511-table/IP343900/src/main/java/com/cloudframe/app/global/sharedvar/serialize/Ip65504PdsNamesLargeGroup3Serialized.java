package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_3_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P063ReservdS;
            protected  int beginIp65504P063ReservdL;
            protected  int beginIp65504P064ReservdS;
            protected  int beginIp65504P064ReservdL;
            protected  int beginIp65504P065ReservdS;
            protected  int beginIp65504P065ReservdL;
            protected  int beginIp65504P066ReservdS;
            protected  int beginIp65504P066ReservdL;
            protected  int beginIp65504P067ReservdS;
            protected  int beginIp65504P067ReservdL;
            protected  int beginIp65504P068ReservdS;
            protected  int beginIp65504P068ReservdL;
            protected  int beginIp65504P069ReservdS;
            protected  int beginIp65504P069ReservdL;
            protected  int beginIp65504P070ReservdS;
            protected  int beginIp65504P070ReservdL;
            protected  int beginIp65504P071ReservdS;
            protected  int beginIp65504P071ReservdL;
            protected  int beginIp65504P072ReservdS;
            protected  int beginIp65504P072ReservdL;
            protected  int beginIp65504P073ReservdS;
            protected  int beginIp65504P073ReservdL;
            protected  int beginIp65504P074ReservdS;
            protected  int beginIp65504P074ReservdL;
            protected  int beginIp65504P075ReservdS;
            protected  int beginIp65504P075ReservdL;
            protected  int beginIp65504P076ReservdS;
            protected  int beginIp65504P076ReservdL;
            protected  int beginIp65504P077ReservdS;
            protected  int beginIp65504P077ReservdL;
            protected  int beginIp65504P078ReservdS;
            protected  int beginIp65504P078ReservdL;
            protected  int beginIp65504P079ReservdS;
            protected  int beginIp65504P079ReservdL;
            protected  int beginIp65504P080ReservdS;
            protected  int beginIp65504P080ReservdL;
            protected  int beginIp65504P081ReservdS;
            protected  int beginIp65504P081ReservdL;
            protected  int beginIp65504P082ReservdS;
            protected  int beginIp65504P082ReservdL;
            protected  int beginIp65504P083AvsRspS;
            protected  int beginIp65504P083AvsRspL;
            protected  int beginIp65504P084AimMerS;
            protected  int beginIp65504P084AimMerL;
            protected  int beginIp65504P085AimFrdS;
            protected  int beginIp65504P085AimFrdL;
            protected  int beginIp65504P086AimOrdS;
            protected  int beginIp65504P086AimOrdL;
            protected  int beginIp65504P087ReservdS;
            protected  int beginIp65504P087ReservdL;
            protected  int beginIp65504P088CrdSecS;
            protected  int beginIp65504P088CrdSecL;
            protected  int beginIp65504P089ReservdS;
            protected  int beginIp65504P089ReservdL;
            protected  int beginIp65504P090ReservdS;
            protected  int beginIp65504P090ReservdL;
            protected  int beginIp65504P091ReservdS;
            protected  int beginIp65504P091ReservdL;
            protected  int beginIp65504P092ReservdS;
            protected  int beginIp65504P092ReservdL;
            protected  int beginIp65504P093AimRspS;
            protected  int beginIp65504P093AimRspL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup3Serialized
	**/
    public Ip65504PdsNamesLargeGroup3Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup3Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup3Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup3Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,492); // serialize this field at offset 492 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup3Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 492 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P063ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P063ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P064ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P064ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P065ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P065ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P066ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P066ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P067ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P067ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P068ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P068ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P069ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P069ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P070ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P070ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P071ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P071ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P072ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P072ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P073ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P073ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P074ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P074ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P075ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P075ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P076ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P076ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P077ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P077ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P078ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P078ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P079ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P079ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P080ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P080ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P081ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P081ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P082ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P082ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P083AvsRspS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P083AvsRspL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P084AimMerS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P084AimMerL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P085AimFrdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P085AimFrdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P086AimOrdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P086AimOrdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P087ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P087ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P088CrdSecS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P088CrdSecL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P089ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P089ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P090ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P090ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P091ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P091ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P092ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P092ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P093AimRspS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P093AimRspL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P063ReservdSCounter = -1;
         public boolean isIp65504P063ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P063ReservdSCounter != sharedCounter;
            localIp65504P063ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_063_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P063ReservdS
	 */
	protected void serializeIp65504P063ReservdS(short ip65504P063ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P063ReservdS,IP_65504_P_063_RESERVD_S_LEN)
                  ,beginIp65504P063ReservdS
                  ,IP_65504_P_063_RESERVD_S_LEN
                 );
            localIp65504P063ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P063ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P063ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P063ReservdS() {	 
			return (getShort(beginIp65504P063ReservdS));
   	}
         int localIp65504P063ReservdLCounter = -1;
         public boolean isIp65504P063ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P063ReservdLCounter != sharedCounter;
            localIp65504P063ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_063_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P063ReservdL
	 */
	protected void serializeIp65504P063ReservdL(short ip65504P063ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P063ReservdL,IP_65504_P_063_RESERVD_L_LEN)
                  ,beginIp65504P063ReservdL
                  ,IP_65504_P_063_RESERVD_L_LEN
                 );
            localIp65504P063ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P063ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P063ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P063ReservdL() {	 
			return (getShort(beginIp65504P063ReservdL));
   	}
         int localIp65504P064ReservdSCounter = -1;
         public boolean isIp65504P064ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P064ReservdSCounter != sharedCounter;
            localIp65504P064ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_064_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P064ReservdS
	 */
	protected void serializeIp65504P064ReservdS(short ip65504P064ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P064ReservdS,IP_65504_P_064_RESERVD_S_LEN)
                  ,beginIp65504P064ReservdS
                  ,IP_65504_P_064_RESERVD_S_LEN
                 );
            localIp65504P064ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P064ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P064ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P064ReservdS() {	 
			return (getShort(beginIp65504P064ReservdS));
   	}
         int localIp65504P064ReservdLCounter = -1;
         public boolean isIp65504P064ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P064ReservdLCounter != sharedCounter;
            localIp65504P064ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_064_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P064ReservdL
	 */
	protected void serializeIp65504P064ReservdL(short ip65504P064ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P064ReservdL,IP_65504_P_064_RESERVD_L_LEN)
                  ,beginIp65504P064ReservdL
                  ,IP_65504_P_064_RESERVD_L_LEN
                 );
            localIp65504P064ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P064ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P064ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P064ReservdL() {	 
			return (getShort(beginIp65504P064ReservdL));
   	}
         int localIp65504P065ReservdSCounter = -1;
         public boolean isIp65504P065ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P065ReservdSCounter != sharedCounter;
            localIp65504P065ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_065_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P065ReservdS
	 */
	protected void serializeIp65504P065ReservdS(short ip65504P065ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P065ReservdS,IP_65504_P_065_RESERVD_S_LEN)
                  ,beginIp65504P065ReservdS
                  ,IP_65504_P_065_RESERVD_S_LEN
                 );
            localIp65504P065ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P065ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P065ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P065ReservdS() {	 
			return (getShort(beginIp65504P065ReservdS));
   	}
         int localIp65504P065ReservdLCounter = -1;
         public boolean isIp65504P065ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P065ReservdLCounter != sharedCounter;
            localIp65504P065ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_065_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P065ReservdL
	 */
	protected void serializeIp65504P065ReservdL(short ip65504P065ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P065ReservdL,IP_65504_P_065_RESERVD_L_LEN)
                  ,beginIp65504P065ReservdL
                  ,IP_65504_P_065_RESERVD_L_LEN
                 );
            localIp65504P065ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P065ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P065ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P065ReservdL() {	 
			return (getShort(beginIp65504P065ReservdL));
   	}
         int localIp65504P066ReservdSCounter = -1;
         public boolean isIp65504P066ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P066ReservdSCounter != sharedCounter;
            localIp65504P066ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_066_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P066ReservdS
	 */
	protected void serializeIp65504P066ReservdS(short ip65504P066ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P066ReservdS,IP_65504_P_066_RESERVD_S_LEN)
                  ,beginIp65504P066ReservdS
                  ,IP_65504_P_066_RESERVD_S_LEN
                 );
            localIp65504P066ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P066ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P066ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P066ReservdS() {	 
			return (getShort(beginIp65504P066ReservdS));
   	}
         int localIp65504P066ReservdLCounter = -1;
         public boolean isIp65504P066ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P066ReservdLCounter != sharedCounter;
            localIp65504P066ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_066_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P066ReservdL
	 */
	protected void serializeIp65504P066ReservdL(short ip65504P066ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P066ReservdL,IP_65504_P_066_RESERVD_L_LEN)
                  ,beginIp65504P066ReservdL
                  ,IP_65504_P_066_RESERVD_L_LEN
                 );
            localIp65504P066ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P066ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P066ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P066ReservdL() {	 
			return (getShort(beginIp65504P066ReservdL));
   	}
         int localIp65504P067ReservdSCounter = -1;
         public boolean isIp65504P067ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P067ReservdSCounter != sharedCounter;
            localIp65504P067ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_067_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P067ReservdS
	 */
	protected void serializeIp65504P067ReservdS(short ip65504P067ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P067ReservdS,IP_65504_P_067_RESERVD_S_LEN)
                  ,beginIp65504P067ReservdS
                  ,IP_65504_P_067_RESERVD_S_LEN
                 );
            localIp65504P067ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P067ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P067ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P067ReservdS() {	 
			return (getShort(beginIp65504P067ReservdS));
   	}
         int localIp65504P067ReservdLCounter = -1;
         public boolean isIp65504P067ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P067ReservdLCounter != sharedCounter;
            localIp65504P067ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_067_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P067ReservdL
	 */
	protected void serializeIp65504P067ReservdL(short ip65504P067ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P067ReservdL,IP_65504_P_067_RESERVD_L_LEN)
                  ,beginIp65504P067ReservdL
                  ,IP_65504_P_067_RESERVD_L_LEN
                 );
            localIp65504P067ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P067ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P067ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P067ReservdL() {	 
			return (getShort(beginIp65504P067ReservdL));
   	}
         int localIp65504P068ReservdSCounter = -1;
         public boolean isIp65504P068ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P068ReservdSCounter != sharedCounter;
            localIp65504P068ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_068_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P068ReservdS
	 */
	protected void serializeIp65504P068ReservdS(short ip65504P068ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P068ReservdS,IP_65504_P_068_RESERVD_S_LEN)
                  ,beginIp65504P068ReservdS
                  ,IP_65504_P_068_RESERVD_S_LEN
                 );
            localIp65504P068ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P068ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P068ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P068ReservdS() {	 
			return (getShort(beginIp65504P068ReservdS));
   	}
         int localIp65504P068ReservdLCounter = -1;
         public boolean isIp65504P068ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P068ReservdLCounter != sharedCounter;
            localIp65504P068ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_068_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P068ReservdL
	 */
	protected void serializeIp65504P068ReservdL(short ip65504P068ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P068ReservdL,IP_65504_P_068_RESERVD_L_LEN)
                  ,beginIp65504P068ReservdL
                  ,IP_65504_P_068_RESERVD_L_LEN
                 );
            localIp65504P068ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P068ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P068ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P068ReservdL() {	 
			return (getShort(beginIp65504P068ReservdL));
   	}
         int localIp65504P069ReservdSCounter = -1;
         public boolean isIp65504P069ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P069ReservdSCounter != sharedCounter;
            localIp65504P069ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_069_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P069ReservdS
	 */
	protected void serializeIp65504P069ReservdS(short ip65504P069ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P069ReservdS,IP_65504_P_069_RESERVD_S_LEN)
                  ,beginIp65504P069ReservdS
                  ,IP_65504_P_069_RESERVD_S_LEN
                 );
            localIp65504P069ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P069ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P069ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P069ReservdS() {	 
			return (getShort(beginIp65504P069ReservdS));
   	}
         int localIp65504P069ReservdLCounter = -1;
         public boolean isIp65504P069ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P069ReservdLCounter != sharedCounter;
            localIp65504P069ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_069_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P069ReservdL
	 */
	protected void serializeIp65504P069ReservdL(short ip65504P069ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P069ReservdL,IP_65504_P_069_RESERVD_L_LEN)
                  ,beginIp65504P069ReservdL
                  ,IP_65504_P_069_RESERVD_L_LEN
                 );
            localIp65504P069ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P069ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P069ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P069ReservdL() {	 
			return (getShort(beginIp65504P069ReservdL));
   	}
         int localIp65504P070ReservdSCounter = -1;
         public boolean isIp65504P070ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P070ReservdSCounter != sharedCounter;
            localIp65504P070ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_070_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P070ReservdS
	 */
	protected void serializeIp65504P070ReservdS(short ip65504P070ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P070ReservdS,IP_65504_P_070_RESERVD_S_LEN)
                  ,beginIp65504P070ReservdS
                  ,IP_65504_P_070_RESERVD_S_LEN
                 );
            localIp65504P070ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P070ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P070ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P070ReservdS() {	 
			return (getShort(beginIp65504P070ReservdS));
   	}
         int localIp65504P070ReservdLCounter = -1;
         public boolean isIp65504P070ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P070ReservdLCounter != sharedCounter;
            localIp65504P070ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_070_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P070ReservdL
	 */
	protected void serializeIp65504P070ReservdL(short ip65504P070ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P070ReservdL,IP_65504_P_070_RESERVD_L_LEN)
                  ,beginIp65504P070ReservdL
                  ,IP_65504_P_070_RESERVD_L_LEN
                 );
            localIp65504P070ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P070ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P070ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P070ReservdL() {	 
			return (getShort(beginIp65504P070ReservdL));
   	}
         int localIp65504P071ReservdSCounter = -1;
         public boolean isIp65504P071ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P071ReservdSCounter != sharedCounter;
            localIp65504P071ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_071_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P071ReservdS
	 */
	protected void serializeIp65504P071ReservdS(short ip65504P071ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P071ReservdS,IP_65504_P_071_RESERVD_S_LEN)
                  ,beginIp65504P071ReservdS
                  ,IP_65504_P_071_RESERVD_S_LEN
                 );
            localIp65504P071ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P071ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P071ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P071ReservdS() {	 
			return (getShort(beginIp65504P071ReservdS));
   	}
         int localIp65504P071ReservdLCounter = -1;
         public boolean isIp65504P071ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P071ReservdLCounter != sharedCounter;
            localIp65504P071ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_071_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P071ReservdL
	 */
	protected void serializeIp65504P071ReservdL(short ip65504P071ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P071ReservdL,IP_65504_P_071_RESERVD_L_LEN)
                  ,beginIp65504P071ReservdL
                  ,IP_65504_P_071_RESERVD_L_LEN
                 );
            localIp65504P071ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P071ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P071ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P071ReservdL() {	 
			return (getShort(beginIp65504P071ReservdL));
   	}
         int localIp65504P072ReservdSCounter = -1;
         public boolean isIp65504P072ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P072ReservdSCounter != sharedCounter;
            localIp65504P072ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_072_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P072ReservdS
	 */
	protected void serializeIp65504P072ReservdS(short ip65504P072ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P072ReservdS,IP_65504_P_072_RESERVD_S_LEN)
                  ,beginIp65504P072ReservdS
                  ,IP_65504_P_072_RESERVD_S_LEN
                 );
            localIp65504P072ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P072ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P072ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P072ReservdS() {	 
			return (getShort(beginIp65504P072ReservdS));
   	}
         int localIp65504P072ReservdLCounter = -1;
         public boolean isIp65504P072ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P072ReservdLCounter != sharedCounter;
            localIp65504P072ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_072_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P072ReservdL
	 */
	protected void serializeIp65504P072ReservdL(short ip65504P072ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P072ReservdL,IP_65504_P_072_RESERVD_L_LEN)
                  ,beginIp65504P072ReservdL
                  ,IP_65504_P_072_RESERVD_L_LEN
                 );
            localIp65504P072ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P072ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P072ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P072ReservdL() {	 
			return (getShort(beginIp65504P072ReservdL));
   	}
         int localIp65504P073ReservdSCounter = -1;
         public boolean isIp65504P073ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P073ReservdSCounter != sharedCounter;
            localIp65504P073ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_073_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P073ReservdS
	 */
	protected void serializeIp65504P073ReservdS(short ip65504P073ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P073ReservdS,IP_65504_P_073_RESERVD_S_LEN)
                  ,beginIp65504P073ReservdS
                  ,IP_65504_P_073_RESERVD_S_LEN
                 );
            localIp65504P073ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P073ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P073ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P073ReservdS() {	 
			return (getShort(beginIp65504P073ReservdS));
   	}
         int localIp65504P073ReservdLCounter = -1;
         public boolean isIp65504P073ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P073ReservdLCounter != sharedCounter;
            localIp65504P073ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_073_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P073ReservdL
	 */
	protected void serializeIp65504P073ReservdL(short ip65504P073ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P073ReservdL,IP_65504_P_073_RESERVD_L_LEN)
                  ,beginIp65504P073ReservdL
                  ,IP_65504_P_073_RESERVD_L_LEN
                 );
            localIp65504P073ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P073ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P073ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P073ReservdL() {	 
			return (getShort(beginIp65504P073ReservdL));
   	}
         int localIp65504P074ReservdSCounter = -1;
         public boolean isIp65504P074ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P074ReservdSCounter != sharedCounter;
            localIp65504P074ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_074_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P074ReservdS
	 */
	protected void serializeIp65504P074ReservdS(short ip65504P074ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P074ReservdS,IP_65504_P_074_RESERVD_S_LEN)
                  ,beginIp65504P074ReservdS
                  ,IP_65504_P_074_RESERVD_S_LEN
                 );
            localIp65504P074ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P074ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P074ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P074ReservdS() {	 
			return (getShort(beginIp65504P074ReservdS));
   	}
         int localIp65504P074ReservdLCounter = -1;
         public boolean isIp65504P074ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P074ReservdLCounter != sharedCounter;
            localIp65504P074ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_074_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P074ReservdL
	 */
	protected void serializeIp65504P074ReservdL(short ip65504P074ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P074ReservdL,IP_65504_P_074_RESERVD_L_LEN)
                  ,beginIp65504P074ReservdL
                  ,IP_65504_P_074_RESERVD_L_LEN
                 );
            localIp65504P074ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P074ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P074ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P074ReservdL() {	 
			return (getShort(beginIp65504P074ReservdL));
   	}
         int localIp65504P075ReservdSCounter = -1;
         public boolean isIp65504P075ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P075ReservdSCounter != sharedCounter;
            localIp65504P075ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_075_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P075ReservdS
	 */
	protected void serializeIp65504P075ReservdS(short ip65504P075ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P075ReservdS,IP_65504_P_075_RESERVD_S_LEN)
                  ,beginIp65504P075ReservdS
                  ,IP_65504_P_075_RESERVD_S_LEN
                 );
            localIp65504P075ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P075ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P075ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P075ReservdS() {	 
			return (getShort(beginIp65504P075ReservdS));
   	}
         int localIp65504P075ReservdLCounter = -1;
         public boolean isIp65504P075ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P075ReservdLCounter != sharedCounter;
            localIp65504P075ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_075_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P075ReservdL
	 */
	protected void serializeIp65504P075ReservdL(short ip65504P075ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P075ReservdL,IP_65504_P_075_RESERVD_L_LEN)
                  ,beginIp65504P075ReservdL
                  ,IP_65504_P_075_RESERVD_L_LEN
                 );
            localIp65504P075ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P075ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P075ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P075ReservdL() {	 
			return (getShort(beginIp65504P075ReservdL));
   	}
         int localIp65504P076ReservdSCounter = -1;
         public boolean isIp65504P076ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P076ReservdSCounter != sharedCounter;
            localIp65504P076ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_076_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P076ReservdS
	 */
	protected void serializeIp65504P076ReservdS(short ip65504P076ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P076ReservdS,IP_65504_P_076_RESERVD_S_LEN)
                  ,beginIp65504P076ReservdS
                  ,IP_65504_P_076_RESERVD_S_LEN
                 );
            localIp65504P076ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P076ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P076ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P076ReservdS() {	 
			return (getShort(beginIp65504P076ReservdS));
   	}
         int localIp65504P076ReservdLCounter = -1;
         public boolean isIp65504P076ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P076ReservdLCounter != sharedCounter;
            localIp65504P076ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_076_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P076ReservdL
	 */
	protected void serializeIp65504P076ReservdL(short ip65504P076ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P076ReservdL,IP_65504_P_076_RESERVD_L_LEN)
                  ,beginIp65504P076ReservdL
                  ,IP_65504_P_076_RESERVD_L_LEN
                 );
            localIp65504P076ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P076ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P076ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P076ReservdL() {	 
			return (getShort(beginIp65504P076ReservdL));
   	}
         int localIp65504P077ReservdSCounter = -1;
         public boolean isIp65504P077ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P077ReservdSCounter != sharedCounter;
            localIp65504P077ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_077_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P077ReservdS
	 */
	protected void serializeIp65504P077ReservdS(short ip65504P077ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P077ReservdS,IP_65504_P_077_RESERVD_S_LEN)
                  ,beginIp65504P077ReservdS
                  ,IP_65504_P_077_RESERVD_S_LEN
                 );
            localIp65504P077ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P077ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P077ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P077ReservdS() {	 
			return (getShort(beginIp65504P077ReservdS));
   	}
         int localIp65504P077ReservdLCounter = -1;
         public boolean isIp65504P077ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P077ReservdLCounter != sharedCounter;
            localIp65504P077ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_077_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P077ReservdL
	 */
	protected void serializeIp65504P077ReservdL(short ip65504P077ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P077ReservdL,IP_65504_P_077_RESERVD_L_LEN)
                  ,beginIp65504P077ReservdL
                  ,IP_65504_P_077_RESERVD_L_LEN
                 );
            localIp65504P077ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P077ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P077ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P077ReservdL() {	 
			return (getShort(beginIp65504P077ReservdL));
   	}
         int localIp65504P078ReservdSCounter = -1;
         public boolean isIp65504P078ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P078ReservdSCounter != sharedCounter;
            localIp65504P078ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_078_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P078ReservdS
	 */
	protected void serializeIp65504P078ReservdS(short ip65504P078ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P078ReservdS,IP_65504_P_078_RESERVD_S_LEN)
                  ,beginIp65504P078ReservdS
                  ,IP_65504_P_078_RESERVD_S_LEN
                 );
            localIp65504P078ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P078ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P078ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P078ReservdS() {	 
			return (getShort(beginIp65504P078ReservdS));
   	}
         int localIp65504P078ReservdLCounter = -1;
         public boolean isIp65504P078ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P078ReservdLCounter != sharedCounter;
            localIp65504P078ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_078_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P078ReservdL
	 */
	protected void serializeIp65504P078ReservdL(short ip65504P078ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P078ReservdL,IP_65504_P_078_RESERVD_L_LEN)
                  ,beginIp65504P078ReservdL
                  ,IP_65504_P_078_RESERVD_L_LEN
                 );
            localIp65504P078ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P078ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P078ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P078ReservdL() {	 
			return (getShort(beginIp65504P078ReservdL));
   	}
         int localIp65504P079ReservdSCounter = -1;
         public boolean isIp65504P079ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P079ReservdSCounter != sharedCounter;
            localIp65504P079ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_079_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P079ReservdS
	 */
	protected void serializeIp65504P079ReservdS(short ip65504P079ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P079ReservdS,IP_65504_P_079_RESERVD_S_LEN)
                  ,beginIp65504P079ReservdS
                  ,IP_65504_P_079_RESERVD_S_LEN
                 );
            localIp65504P079ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P079ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P079ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P079ReservdS() {	 
			return (getShort(beginIp65504P079ReservdS));
   	}
         int localIp65504P079ReservdLCounter = -1;
         public boolean isIp65504P079ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P079ReservdLCounter != sharedCounter;
            localIp65504P079ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_079_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P079ReservdL
	 */
	protected void serializeIp65504P079ReservdL(short ip65504P079ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P079ReservdL,IP_65504_P_079_RESERVD_L_LEN)
                  ,beginIp65504P079ReservdL
                  ,IP_65504_P_079_RESERVD_L_LEN
                 );
            localIp65504P079ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P079ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P079ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P079ReservdL() {	 
			return (getShort(beginIp65504P079ReservdL));
   	}
         int localIp65504P080ReservdSCounter = -1;
         public boolean isIp65504P080ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P080ReservdSCounter != sharedCounter;
            localIp65504P080ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_080_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P080ReservdS
	 */
	protected void serializeIp65504P080ReservdS(short ip65504P080ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P080ReservdS,IP_65504_P_080_RESERVD_S_LEN)
                  ,beginIp65504P080ReservdS
                  ,IP_65504_P_080_RESERVD_S_LEN
                 );
            localIp65504P080ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P080ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P080ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P080ReservdS() {	 
			return (getShort(beginIp65504P080ReservdS));
   	}
         int localIp65504P080ReservdLCounter = -1;
         public boolean isIp65504P080ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P080ReservdLCounter != sharedCounter;
            localIp65504P080ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_080_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P080ReservdL
	 */
	protected void serializeIp65504P080ReservdL(short ip65504P080ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P080ReservdL,IP_65504_P_080_RESERVD_L_LEN)
                  ,beginIp65504P080ReservdL
                  ,IP_65504_P_080_RESERVD_L_LEN
                 );
            localIp65504P080ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P080ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P080ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P080ReservdL() {	 
			return (getShort(beginIp65504P080ReservdL));
   	}
         int localIp65504P081ReservdSCounter = -1;
         public boolean isIp65504P081ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P081ReservdSCounter != sharedCounter;
            localIp65504P081ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_081_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P081ReservdS
	 */
	protected void serializeIp65504P081ReservdS(short ip65504P081ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P081ReservdS,IP_65504_P_081_RESERVD_S_LEN)
                  ,beginIp65504P081ReservdS
                  ,IP_65504_P_081_RESERVD_S_LEN
                 );
            localIp65504P081ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P081ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P081ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P081ReservdS() {	 
			return (getShort(beginIp65504P081ReservdS));
   	}
         int localIp65504P081ReservdLCounter = -1;
         public boolean isIp65504P081ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P081ReservdLCounter != sharedCounter;
            localIp65504P081ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_081_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P081ReservdL
	 */
	protected void serializeIp65504P081ReservdL(short ip65504P081ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P081ReservdL,IP_65504_P_081_RESERVD_L_LEN)
                  ,beginIp65504P081ReservdL
                  ,IP_65504_P_081_RESERVD_L_LEN
                 );
            localIp65504P081ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P081ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P081ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P081ReservdL() {	 
			return (getShort(beginIp65504P081ReservdL));
   	}
         int localIp65504P082ReservdSCounter = -1;
         public boolean isIp65504P082ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P082ReservdSCounter != sharedCounter;
            localIp65504P082ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_082_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P082ReservdS
	 */
	protected void serializeIp65504P082ReservdS(short ip65504P082ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P082ReservdS,IP_65504_P_082_RESERVD_S_LEN)
                  ,beginIp65504P082ReservdS
                  ,IP_65504_P_082_RESERVD_S_LEN
                 );
            localIp65504P082ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P082ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P082ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P082ReservdS() {	 
			return (getShort(beginIp65504P082ReservdS));
   	}
         int localIp65504P082ReservdLCounter = -1;
         public boolean isIp65504P082ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P082ReservdLCounter != sharedCounter;
            localIp65504P082ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_082_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P082ReservdL
	 */
	protected void serializeIp65504P082ReservdL(short ip65504P082ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P082ReservdL,IP_65504_P_082_RESERVD_L_LEN)
                  ,beginIp65504P082ReservdL
                  ,IP_65504_P_082_RESERVD_L_LEN
                 );
            localIp65504P082ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P082ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P082ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P082ReservdL() {	 
			return (getShort(beginIp65504P082ReservdL));
   	}
         int localIp65504P083AvsRspSCounter = -1;
         public boolean isIp65504P083AvsRspSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P083AvsRspSCounter != sharedCounter;
            localIp65504P083AvsRspSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_083_AVS_RSP_S_LEN = 2;
  	/**
	 * serializeIp65504P083AvsRspS
	 */
	protected void serializeIp65504P083AvsRspS(short ip65504P083AvsRspS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P083AvsRspS,IP_65504_P_083_AVS_RSP_S_LEN)
                  ,beginIp65504P083AvsRspS
                  ,IP_65504_P_083_AVS_RSP_S_LEN
                 );
            localIp65504P083AvsRspSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P083AvsRspSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P083AvsRspS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P083AvsRspS() {	 
			return (getShort(beginIp65504P083AvsRspS));
   	}
         int localIp65504P083AvsRspLCounter = -1;
         public boolean isIp65504P083AvsRspLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P083AvsRspLCounter != sharedCounter;
            localIp65504P083AvsRspLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_083_AVS_RSP_L_LEN = 2;
  	/**
	 * serializeIp65504P083AvsRspL
	 */
	protected void serializeIp65504P083AvsRspL(short ip65504P083AvsRspL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P083AvsRspL,IP_65504_P_083_AVS_RSP_L_LEN)
                  ,beginIp65504P083AvsRspL
                  ,IP_65504_P_083_AVS_RSP_L_LEN
                 );
            localIp65504P083AvsRspLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P083AvsRspLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P083AvsRspL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P083AvsRspL() {	 
			return (getShort(beginIp65504P083AvsRspL));
   	}
         int localIp65504P084AimMerSCounter = -1;
         public boolean isIp65504P084AimMerSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P084AimMerSCounter != sharedCounter;
            localIp65504P084AimMerSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_084_AIM_MER_S_LEN = 2;
  	/**
	 * serializeIp65504P084AimMerS
	 */
	protected void serializeIp65504P084AimMerS(short ip65504P084AimMerS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P084AimMerS,IP_65504_P_084_AIM_MER_S_LEN)
                  ,beginIp65504P084AimMerS
                  ,IP_65504_P_084_AIM_MER_S_LEN
                 );
            localIp65504P084AimMerSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P084AimMerSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P084AimMerS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P084AimMerS() {	 
			return (getShort(beginIp65504P084AimMerS));
   	}
         int localIp65504P084AimMerLCounter = -1;
         public boolean isIp65504P084AimMerLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P084AimMerLCounter != sharedCounter;
            localIp65504P084AimMerLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_084_AIM_MER_L_LEN = 2;
  	/**
	 * serializeIp65504P084AimMerL
	 */
	protected void serializeIp65504P084AimMerL(short ip65504P084AimMerL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P084AimMerL,IP_65504_P_084_AIM_MER_L_LEN)
                  ,beginIp65504P084AimMerL
                  ,IP_65504_P_084_AIM_MER_L_LEN
                 );
            localIp65504P084AimMerLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P084AimMerLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P084AimMerL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P084AimMerL() {	 
			return (getShort(beginIp65504P084AimMerL));
   	}
         int localIp65504P085AimFrdSCounter = -1;
         public boolean isIp65504P085AimFrdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P085AimFrdSCounter != sharedCounter;
            localIp65504P085AimFrdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_085_AIM_FRD_S_LEN = 2;
  	/**
	 * serializeIp65504P085AimFrdS
	 */
	protected void serializeIp65504P085AimFrdS(short ip65504P085AimFrdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P085AimFrdS,IP_65504_P_085_AIM_FRD_S_LEN)
                  ,beginIp65504P085AimFrdS
                  ,IP_65504_P_085_AIM_FRD_S_LEN
                 );
            localIp65504P085AimFrdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P085AimFrdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P085AimFrdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P085AimFrdS() {	 
			return (getShort(beginIp65504P085AimFrdS));
   	}
         int localIp65504P085AimFrdLCounter = -1;
         public boolean isIp65504P085AimFrdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P085AimFrdLCounter != sharedCounter;
            localIp65504P085AimFrdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_085_AIM_FRD_L_LEN = 2;
  	/**
	 * serializeIp65504P085AimFrdL
	 */
	protected void serializeIp65504P085AimFrdL(short ip65504P085AimFrdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P085AimFrdL,IP_65504_P_085_AIM_FRD_L_LEN)
                  ,beginIp65504P085AimFrdL
                  ,IP_65504_P_085_AIM_FRD_L_LEN
                 );
            localIp65504P085AimFrdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P085AimFrdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P085AimFrdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P085AimFrdL() {	 
			return (getShort(beginIp65504P085AimFrdL));
   	}
         int localIp65504P086AimOrdSCounter = -1;
         public boolean isIp65504P086AimOrdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P086AimOrdSCounter != sharedCounter;
            localIp65504P086AimOrdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_086_AIM_ORD_S_LEN = 2;
  	/**
	 * serializeIp65504P086AimOrdS
	 */
	protected void serializeIp65504P086AimOrdS(short ip65504P086AimOrdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P086AimOrdS,IP_65504_P_086_AIM_ORD_S_LEN)
                  ,beginIp65504P086AimOrdS
                  ,IP_65504_P_086_AIM_ORD_S_LEN
                 );
            localIp65504P086AimOrdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P086AimOrdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P086AimOrdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P086AimOrdS() {	 
			return (getShort(beginIp65504P086AimOrdS));
   	}
         int localIp65504P086AimOrdLCounter = -1;
         public boolean isIp65504P086AimOrdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P086AimOrdLCounter != sharedCounter;
            localIp65504P086AimOrdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_086_AIM_ORD_L_LEN = 2;
  	/**
	 * serializeIp65504P086AimOrdL
	 */
	protected void serializeIp65504P086AimOrdL(short ip65504P086AimOrdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P086AimOrdL,IP_65504_P_086_AIM_ORD_L_LEN)
                  ,beginIp65504P086AimOrdL
                  ,IP_65504_P_086_AIM_ORD_L_LEN
                 );
            localIp65504P086AimOrdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P086AimOrdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P086AimOrdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P086AimOrdL() {	 
			return (getShort(beginIp65504P086AimOrdL));
   	}
         int localIp65504P087ReservdSCounter = -1;
         public boolean isIp65504P087ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P087ReservdSCounter != sharedCounter;
            localIp65504P087ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_087_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P087ReservdS
	 */
	protected void serializeIp65504P087ReservdS(short ip65504P087ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P087ReservdS,IP_65504_P_087_RESERVD_S_LEN)
                  ,beginIp65504P087ReservdS
                  ,IP_65504_P_087_RESERVD_S_LEN
                 );
            localIp65504P087ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P087ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P087ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P087ReservdS() {	 
			return (getShort(beginIp65504P087ReservdS));
   	}
         int localIp65504P087ReservdLCounter = -1;
         public boolean isIp65504P087ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P087ReservdLCounter != sharedCounter;
            localIp65504P087ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_087_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P087ReservdL
	 */
	protected void serializeIp65504P087ReservdL(short ip65504P087ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P087ReservdL,IP_65504_P_087_RESERVD_L_LEN)
                  ,beginIp65504P087ReservdL
                  ,IP_65504_P_087_RESERVD_L_LEN
                 );
            localIp65504P087ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P087ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P087ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P087ReservdL() {	 
			return (getShort(beginIp65504P087ReservdL));
   	}
         int localIp65504P088CrdSecSCounter = -1;
         public boolean isIp65504P088CrdSecSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P088CrdSecSCounter != sharedCounter;
            localIp65504P088CrdSecSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_088_CRD_SEC_S_LEN = 2;
  	/**
	 * serializeIp65504P088CrdSecS
	 */
	protected void serializeIp65504P088CrdSecS(short ip65504P088CrdSecS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P088CrdSecS,IP_65504_P_088_CRD_SEC_S_LEN)
                  ,beginIp65504P088CrdSecS
                  ,IP_65504_P_088_CRD_SEC_S_LEN
                 );
            localIp65504P088CrdSecSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P088CrdSecSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P088CrdSecS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P088CrdSecS() {	 
			return (getShort(beginIp65504P088CrdSecS));
   	}
         int localIp65504P088CrdSecLCounter = -1;
         public boolean isIp65504P088CrdSecLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P088CrdSecLCounter != sharedCounter;
            localIp65504P088CrdSecLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_088_CRD_SEC_L_LEN = 2;
  	/**
	 * serializeIp65504P088CrdSecL
	 */
	protected void serializeIp65504P088CrdSecL(short ip65504P088CrdSecL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P088CrdSecL,IP_65504_P_088_CRD_SEC_L_LEN)
                  ,beginIp65504P088CrdSecL
                  ,IP_65504_P_088_CRD_SEC_L_LEN
                 );
            localIp65504P088CrdSecLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P088CrdSecLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P088CrdSecL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P088CrdSecL() {	 
			return (getShort(beginIp65504P088CrdSecL));
   	}
         int localIp65504P089ReservdSCounter = -1;
         public boolean isIp65504P089ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P089ReservdSCounter != sharedCounter;
            localIp65504P089ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_089_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P089ReservdS
	 */
	protected void serializeIp65504P089ReservdS(short ip65504P089ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P089ReservdS,IP_65504_P_089_RESERVD_S_LEN)
                  ,beginIp65504P089ReservdS
                  ,IP_65504_P_089_RESERVD_S_LEN
                 );
            localIp65504P089ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P089ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P089ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P089ReservdS() {	 
			return (getShort(beginIp65504P089ReservdS));
   	}
         int localIp65504P089ReservdLCounter = -1;
         public boolean isIp65504P089ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P089ReservdLCounter != sharedCounter;
            localIp65504P089ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_089_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P089ReservdL
	 */
	protected void serializeIp65504P089ReservdL(short ip65504P089ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P089ReservdL,IP_65504_P_089_RESERVD_L_LEN)
                  ,beginIp65504P089ReservdL
                  ,IP_65504_P_089_RESERVD_L_LEN
                 );
            localIp65504P089ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P089ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P089ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P089ReservdL() {	 
			return (getShort(beginIp65504P089ReservdL));
   	}
         int localIp65504P090ReservdSCounter = -1;
         public boolean isIp65504P090ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P090ReservdSCounter != sharedCounter;
            localIp65504P090ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_090_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P090ReservdS
	 */
	protected void serializeIp65504P090ReservdS(short ip65504P090ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P090ReservdS,IP_65504_P_090_RESERVD_S_LEN)
                  ,beginIp65504P090ReservdS
                  ,IP_65504_P_090_RESERVD_S_LEN
                 );
            localIp65504P090ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P090ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P090ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P090ReservdS() {	 
			return (getShort(beginIp65504P090ReservdS));
   	}
         int localIp65504P090ReservdLCounter = -1;
         public boolean isIp65504P090ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P090ReservdLCounter != sharedCounter;
            localIp65504P090ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_090_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P090ReservdL
	 */
	protected void serializeIp65504P090ReservdL(short ip65504P090ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P090ReservdL,IP_65504_P_090_RESERVD_L_LEN)
                  ,beginIp65504P090ReservdL
                  ,IP_65504_P_090_RESERVD_L_LEN
                 );
            localIp65504P090ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P090ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P090ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P090ReservdL() {	 
			return (getShort(beginIp65504P090ReservdL));
   	}
         int localIp65504P091ReservdSCounter = -1;
         public boolean isIp65504P091ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P091ReservdSCounter != sharedCounter;
            localIp65504P091ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_091_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P091ReservdS
	 */
	protected void serializeIp65504P091ReservdS(short ip65504P091ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P091ReservdS,IP_65504_P_091_RESERVD_S_LEN)
                  ,beginIp65504P091ReservdS
                  ,IP_65504_P_091_RESERVD_S_LEN
                 );
            localIp65504P091ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P091ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P091ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P091ReservdS() {	 
			return (getShort(beginIp65504P091ReservdS));
   	}
         int localIp65504P091ReservdLCounter = -1;
         public boolean isIp65504P091ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P091ReservdLCounter != sharedCounter;
            localIp65504P091ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_091_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P091ReservdL
	 */
	protected void serializeIp65504P091ReservdL(short ip65504P091ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P091ReservdL,IP_65504_P_091_RESERVD_L_LEN)
                  ,beginIp65504P091ReservdL
                  ,IP_65504_P_091_RESERVD_L_LEN
                 );
            localIp65504P091ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P091ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P091ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P091ReservdL() {	 
			return (getShort(beginIp65504P091ReservdL));
   	}
         int localIp65504P092ReservdSCounter = -1;
         public boolean isIp65504P092ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P092ReservdSCounter != sharedCounter;
            localIp65504P092ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_092_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P092ReservdS
	 */
	protected void serializeIp65504P092ReservdS(short ip65504P092ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P092ReservdS,IP_65504_P_092_RESERVD_S_LEN)
                  ,beginIp65504P092ReservdS
                  ,IP_65504_P_092_RESERVD_S_LEN
                 );
            localIp65504P092ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P092ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P092ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P092ReservdS() {	 
			return (getShort(beginIp65504P092ReservdS));
   	}
         int localIp65504P092ReservdLCounter = -1;
         public boolean isIp65504P092ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P092ReservdLCounter != sharedCounter;
            localIp65504P092ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_092_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P092ReservdL
	 */
	protected void serializeIp65504P092ReservdL(short ip65504P092ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P092ReservdL,IP_65504_P_092_RESERVD_L_LEN)
                  ,beginIp65504P092ReservdL
                  ,IP_65504_P_092_RESERVD_L_LEN
                 );
            localIp65504P092ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P092ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P092ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P092ReservdL() {	 
			return (getShort(beginIp65504P092ReservdL));
   	}
         int localIp65504P093AimRspSCounter = -1;
         public boolean isIp65504P093AimRspSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P093AimRspSCounter != sharedCounter;
            localIp65504P093AimRspSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_093_AIM_RSP_S_LEN = 2;
  	/**
	 * serializeIp65504P093AimRspS
	 */
	protected void serializeIp65504P093AimRspS(short ip65504P093AimRspS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P093AimRspS,IP_65504_P_093_AIM_RSP_S_LEN)
                  ,beginIp65504P093AimRspS
                  ,IP_65504_P_093_AIM_RSP_S_LEN
                 );
            localIp65504P093AimRspSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P093AimRspSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P093AimRspS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P093AimRspS() {	 
			return (getShort(beginIp65504P093AimRspS));
   	}
         int localIp65504P093AimRspLCounter = -1;
         public boolean isIp65504P093AimRspLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P093AimRspLCounter != sharedCounter;
            localIp65504P093AimRspLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_093_AIM_RSP_L_LEN = 2;
  	/**
	 * serializeIp65504P093AimRspL
	 */
	protected void serializeIp65504P093AimRspL(short ip65504P093AimRspL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P093AimRspL,IP_65504_P_093_AIM_RSP_L_LEN)
                  ,beginIp65504P093AimRspL
                  ,IP_65504_P_093_AIM_RSP_L_LEN
                 );
            localIp65504P093AimRspLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P093AimRspLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P093AimRspL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P093AimRspL() {	 
			return (getShort(beginIp65504P093AimRspL));
   	}




}
  
