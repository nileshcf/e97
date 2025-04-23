package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup80Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup80Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup80Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_80_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2450S;
            protected  int beginIp65504P2450L;
            protected  int beginIp65504P2451S;
            protected  int beginIp65504P2451L;
            protected  int beginIp65504P2452S;
            protected  int beginIp65504P2452L;
            protected  int beginIp65504P2453S;
            protected  int beginIp65504P2453L;
            protected  int beginIp65504P2454S;
            protected  int beginIp65504P2454L;
            protected  int beginIp65504P2455S;
            protected  int beginIp65504P2455L;
            protected  int beginIp65504P2456S;
            protected  int beginIp65504P2456L;
            protected  int beginIp65504P2457S;
            protected  int beginIp65504P2457L;
            protected  int beginIp65504P2458S;
            protected  int beginIp65504P2458L;
            protected  int beginIp65504P2459S;
            protected  int beginIp65504P2459L;
            protected  int beginIp65504P2460S;
            protected  int beginIp65504P2460L;
            protected  int beginIp65504P2461S;
            protected  int beginIp65504P2461L;
            protected  int beginIp65504P2462S;
            protected  int beginIp65504P2462L;
            protected  int beginIp65504P2463S;
            protected  int beginIp65504P2463L;
            protected  int beginIp65504P2464S;
            protected  int beginIp65504P2464L;
            protected  int beginIp65504P2465S;
            protected  int beginIp65504P2465L;
            protected  int beginIp65504P2466S;
            protected  int beginIp65504P2466L;
            protected  int beginIp65504P2467S;
            protected  int beginIp65504P2467L;
            protected  int beginIp65504P2468S;
            protected  int beginIp65504P2468L;
            protected  int beginIp65504P2469S;
            protected  int beginIp65504P2469L;
            protected  int beginIp65504P2470S;
            protected  int beginIp65504P2470L;
            protected  int beginIp65504P2471S;
            protected  int beginIp65504P2471L;
            protected  int beginIp65504P2472S;
            protected  int beginIp65504P2472L;
            protected  int beginIp65504P2473S;
            protected  int beginIp65504P2473L;
            protected  int beginIp65504P2474S;
            protected  int beginIp65504P2474L;
            protected  int beginIp65504P2475S;
            protected  int beginIp65504P2475L;
            protected  int beginIp65504P2476S;
            protected  int beginIp65504P2476L;
            protected  int beginIp65504P2477S;
            protected  int beginIp65504P2477L;
            protected  int beginIp65504P2478S;
            protected  int beginIp65504P2478L;
            protected  int beginIp65504P2479S;
            protected  int beginIp65504P2479L;
            protected  int beginIp65504P2480S;
            protected  int beginIp65504P2480L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup80Serialized
	**/
    public Ip65504PdsNamesLargeGroup80Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup80Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup80Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup80Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19588); // serialize this field at offset 19588 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup80Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19588 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup80Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_80_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2450S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2450L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2451S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2451L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2452S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2452L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2453S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2453L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2454S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2454L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2455S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2455L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2456S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2456L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2457S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2457L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2458S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2458L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2459S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2459L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2460S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2460L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2461S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2461L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2462S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2462L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2463S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2463L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2464S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2464L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2465S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2465L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2466S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2466L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2467S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2467L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2468S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2468L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2469S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2469L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2470S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2470L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2471S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2471L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2472S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2472L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2473S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2473L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2474S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2474L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2475S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2475L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2476S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2476L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2477S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2477L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2478S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2478L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2479S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2479L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2480S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2480L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2450SCounter = -1;
         public boolean isIp65504P2450SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2450SCounter != sharedCounter;
            localIp65504P2450SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2450_S_LEN = 2;
  	/**
	 * serializeIp65504P2450S
	 */
	protected void serializeIp65504P2450S(short ip65504P2450S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2450S,IP_65504_P_2450_S_LEN)
                  ,beginIp65504P2450S
                  ,IP_65504_P_2450_S_LEN
                 );
            localIp65504P2450SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2450SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2450S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2450S() {	 
			return (getShort(beginIp65504P2450S));
   	}
         int localIp65504P2450LCounter = -1;
         public boolean isIp65504P2450LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2450LCounter != sharedCounter;
            localIp65504P2450LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2450_L_LEN = 2;
  	/**
	 * serializeIp65504P2450L
	 */
	protected void serializeIp65504P2450L(short ip65504P2450L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2450L,IP_65504_P_2450_L_LEN)
                  ,beginIp65504P2450L
                  ,IP_65504_P_2450_L_LEN
                 );
            localIp65504P2450LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2450LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2450L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2450L() {	 
			return (getShort(beginIp65504P2450L));
   	}
         int localIp65504P2451SCounter = -1;
         public boolean isIp65504P2451SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2451SCounter != sharedCounter;
            localIp65504P2451SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2451_S_LEN = 2;
  	/**
	 * serializeIp65504P2451S
	 */
	protected void serializeIp65504P2451S(short ip65504P2451S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2451S,IP_65504_P_2451_S_LEN)
                  ,beginIp65504P2451S
                  ,IP_65504_P_2451_S_LEN
                 );
            localIp65504P2451SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2451SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2451S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2451S() {	 
			return (getShort(beginIp65504P2451S));
   	}
         int localIp65504P2451LCounter = -1;
         public boolean isIp65504P2451LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2451LCounter != sharedCounter;
            localIp65504P2451LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2451_L_LEN = 2;
  	/**
	 * serializeIp65504P2451L
	 */
	protected void serializeIp65504P2451L(short ip65504P2451L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2451L,IP_65504_P_2451_L_LEN)
                  ,beginIp65504P2451L
                  ,IP_65504_P_2451_L_LEN
                 );
            localIp65504P2451LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2451LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2451L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2451L() {	 
			return (getShort(beginIp65504P2451L));
   	}
         int localIp65504P2452SCounter = -1;
         public boolean isIp65504P2452SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2452SCounter != sharedCounter;
            localIp65504P2452SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2452_S_LEN = 2;
  	/**
	 * serializeIp65504P2452S
	 */
	protected void serializeIp65504P2452S(short ip65504P2452S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2452S,IP_65504_P_2452_S_LEN)
                  ,beginIp65504P2452S
                  ,IP_65504_P_2452_S_LEN
                 );
            localIp65504P2452SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2452SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2452S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2452S() {	 
			return (getShort(beginIp65504P2452S));
   	}
         int localIp65504P2452LCounter = -1;
         public boolean isIp65504P2452LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2452LCounter != sharedCounter;
            localIp65504P2452LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2452_L_LEN = 2;
  	/**
	 * serializeIp65504P2452L
	 */
	protected void serializeIp65504P2452L(short ip65504P2452L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2452L,IP_65504_P_2452_L_LEN)
                  ,beginIp65504P2452L
                  ,IP_65504_P_2452_L_LEN
                 );
            localIp65504P2452LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2452LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2452L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2452L() {	 
			return (getShort(beginIp65504P2452L));
   	}
         int localIp65504P2453SCounter = -1;
         public boolean isIp65504P2453SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2453SCounter != sharedCounter;
            localIp65504P2453SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2453_S_LEN = 2;
  	/**
	 * serializeIp65504P2453S
	 */
	protected void serializeIp65504P2453S(short ip65504P2453S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2453S,IP_65504_P_2453_S_LEN)
                  ,beginIp65504P2453S
                  ,IP_65504_P_2453_S_LEN
                 );
            localIp65504P2453SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2453SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2453S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2453S() {	 
			return (getShort(beginIp65504P2453S));
   	}
         int localIp65504P2453LCounter = -1;
         public boolean isIp65504P2453LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2453LCounter != sharedCounter;
            localIp65504P2453LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2453_L_LEN = 2;
  	/**
	 * serializeIp65504P2453L
	 */
	protected void serializeIp65504P2453L(short ip65504P2453L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2453L,IP_65504_P_2453_L_LEN)
                  ,beginIp65504P2453L
                  ,IP_65504_P_2453_L_LEN
                 );
            localIp65504P2453LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2453LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2453L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2453L() {	 
			return (getShort(beginIp65504P2453L));
   	}
         int localIp65504P2454SCounter = -1;
         public boolean isIp65504P2454SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2454SCounter != sharedCounter;
            localIp65504P2454SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2454_S_LEN = 2;
  	/**
	 * serializeIp65504P2454S
	 */
	protected void serializeIp65504P2454S(short ip65504P2454S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2454S,IP_65504_P_2454_S_LEN)
                  ,beginIp65504P2454S
                  ,IP_65504_P_2454_S_LEN
                 );
            localIp65504P2454SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2454SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2454S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2454S() {	 
			return (getShort(beginIp65504P2454S));
   	}
         int localIp65504P2454LCounter = -1;
         public boolean isIp65504P2454LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2454LCounter != sharedCounter;
            localIp65504P2454LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2454_L_LEN = 2;
  	/**
	 * serializeIp65504P2454L
	 */
	protected void serializeIp65504P2454L(short ip65504P2454L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2454L,IP_65504_P_2454_L_LEN)
                  ,beginIp65504P2454L
                  ,IP_65504_P_2454_L_LEN
                 );
            localIp65504P2454LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2454LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2454L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2454L() {	 
			return (getShort(beginIp65504P2454L));
   	}
         int localIp65504P2455SCounter = -1;
         public boolean isIp65504P2455SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2455SCounter != sharedCounter;
            localIp65504P2455SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2455_S_LEN = 2;
  	/**
	 * serializeIp65504P2455S
	 */
	protected void serializeIp65504P2455S(short ip65504P2455S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2455S,IP_65504_P_2455_S_LEN)
                  ,beginIp65504P2455S
                  ,IP_65504_P_2455_S_LEN
                 );
            localIp65504P2455SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2455SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2455S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2455S() {	 
			return (getShort(beginIp65504P2455S));
   	}
         int localIp65504P2455LCounter = -1;
         public boolean isIp65504P2455LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2455LCounter != sharedCounter;
            localIp65504P2455LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2455_L_LEN = 2;
  	/**
	 * serializeIp65504P2455L
	 */
	protected void serializeIp65504P2455L(short ip65504P2455L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2455L,IP_65504_P_2455_L_LEN)
                  ,beginIp65504P2455L
                  ,IP_65504_P_2455_L_LEN
                 );
            localIp65504P2455LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2455LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2455L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2455L() {	 
			return (getShort(beginIp65504P2455L));
   	}
         int localIp65504P2456SCounter = -1;
         public boolean isIp65504P2456SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2456SCounter != sharedCounter;
            localIp65504P2456SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2456_S_LEN = 2;
  	/**
	 * serializeIp65504P2456S
	 */
	protected void serializeIp65504P2456S(short ip65504P2456S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2456S,IP_65504_P_2456_S_LEN)
                  ,beginIp65504P2456S
                  ,IP_65504_P_2456_S_LEN
                 );
            localIp65504P2456SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2456SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2456S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2456S() {	 
			return (getShort(beginIp65504P2456S));
   	}
         int localIp65504P2456LCounter = -1;
         public boolean isIp65504P2456LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2456LCounter != sharedCounter;
            localIp65504P2456LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2456_L_LEN = 2;
  	/**
	 * serializeIp65504P2456L
	 */
	protected void serializeIp65504P2456L(short ip65504P2456L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2456L,IP_65504_P_2456_L_LEN)
                  ,beginIp65504P2456L
                  ,IP_65504_P_2456_L_LEN
                 );
            localIp65504P2456LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2456LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2456L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2456L() {	 
			return (getShort(beginIp65504P2456L));
   	}
         int localIp65504P2457SCounter = -1;
         public boolean isIp65504P2457SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2457SCounter != sharedCounter;
            localIp65504P2457SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2457_S_LEN = 2;
  	/**
	 * serializeIp65504P2457S
	 */
	protected void serializeIp65504P2457S(short ip65504P2457S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2457S,IP_65504_P_2457_S_LEN)
                  ,beginIp65504P2457S
                  ,IP_65504_P_2457_S_LEN
                 );
            localIp65504P2457SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2457SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2457S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2457S() {	 
			return (getShort(beginIp65504P2457S));
   	}
         int localIp65504P2457LCounter = -1;
         public boolean isIp65504P2457LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2457LCounter != sharedCounter;
            localIp65504P2457LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2457_L_LEN = 2;
  	/**
	 * serializeIp65504P2457L
	 */
	protected void serializeIp65504P2457L(short ip65504P2457L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2457L,IP_65504_P_2457_L_LEN)
                  ,beginIp65504P2457L
                  ,IP_65504_P_2457_L_LEN
                 );
            localIp65504P2457LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2457LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2457L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2457L() {	 
			return (getShort(beginIp65504P2457L));
   	}
         int localIp65504P2458SCounter = -1;
         public boolean isIp65504P2458SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2458SCounter != sharedCounter;
            localIp65504P2458SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2458_S_LEN = 2;
  	/**
	 * serializeIp65504P2458S
	 */
	protected void serializeIp65504P2458S(short ip65504P2458S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2458S,IP_65504_P_2458_S_LEN)
                  ,beginIp65504P2458S
                  ,IP_65504_P_2458_S_LEN
                 );
            localIp65504P2458SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2458SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2458S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2458S() {	 
			return (getShort(beginIp65504P2458S));
   	}
         int localIp65504P2458LCounter = -1;
         public boolean isIp65504P2458LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2458LCounter != sharedCounter;
            localIp65504P2458LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2458_L_LEN = 2;
  	/**
	 * serializeIp65504P2458L
	 */
	protected void serializeIp65504P2458L(short ip65504P2458L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2458L,IP_65504_P_2458_L_LEN)
                  ,beginIp65504P2458L
                  ,IP_65504_P_2458_L_LEN
                 );
            localIp65504P2458LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2458LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2458L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2458L() {	 
			return (getShort(beginIp65504P2458L));
   	}
         int localIp65504P2459SCounter = -1;
         public boolean isIp65504P2459SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2459SCounter != sharedCounter;
            localIp65504P2459SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2459_S_LEN = 2;
  	/**
	 * serializeIp65504P2459S
	 */
	protected void serializeIp65504P2459S(short ip65504P2459S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2459S,IP_65504_P_2459_S_LEN)
                  ,beginIp65504P2459S
                  ,IP_65504_P_2459_S_LEN
                 );
            localIp65504P2459SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2459SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2459S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2459S() {	 
			return (getShort(beginIp65504P2459S));
   	}
         int localIp65504P2459LCounter = -1;
         public boolean isIp65504P2459LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2459LCounter != sharedCounter;
            localIp65504P2459LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2459_L_LEN = 2;
  	/**
	 * serializeIp65504P2459L
	 */
	protected void serializeIp65504P2459L(short ip65504P2459L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2459L,IP_65504_P_2459_L_LEN)
                  ,beginIp65504P2459L
                  ,IP_65504_P_2459_L_LEN
                 );
            localIp65504P2459LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2459LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2459L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2459L() {	 
			return (getShort(beginIp65504P2459L));
   	}
         int localIp65504P2460SCounter = -1;
         public boolean isIp65504P2460SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2460SCounter != sharedCounter;
            localIp65504P2460SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2460_S_LEN = 2;
  	/**
	 * serializeIp65504P2460S
	 */
	protected void serializeIp65504P2460S(short ip65504P2460S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2460S,IP_65504_P_2460_S_LEN)
                  ,beginIp65504P2460S
                  ,IP_65504_P_2460_S_LEN
                 );
            localIp65504P2460SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2460SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2460S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2460S() {	 
			return (getShort(beginIp65504P2460S));
   	}
         int localIp65504P2460LCounter = -1;
         public boolean isIp65504P2460LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2460LCounter != sharedCounter;
            localIp65504P2460LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2460_L_LEN = 2;
  	/**
	 * serializeIp65504P2460L
	 */
	protected void serializeIp65504P2460L(short ip65504P2460L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2460L,IP_65504_P_2460_L_LEN)
                  ,beginIp65504P2460L
                  ,IP_65504_P_2460_L_LEN
                 );
            localIp65504P2460LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2460LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2460L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2460L() {	 
			return (getShort(beginIp65504P2460L));
   	}
         int localIp65504P2461SCounter = -1;
         public boolean isIp65504P2461SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2461SCounter != sharedCounter;
            localIp65504P2461SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2461_S_LEN = 2;
  	/**
	 * serializeIp65504P2461S
	 */
	protected void serializeIp65504P2461S(short ip65504P2461S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2461S,IP_65504_P_2461_S_LEN)
                  ,beginIp65504P2461S
                  ,IP_65504_P_2461_S_LEN
                 );
            localIp65504P2461SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2461SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2461S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2461S() {	 
			return (getShort(beginIp65504P2461S));
   	}
         int localIp65504P2461LCounter = -1;
         public boolean isIp65504P2461LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2461LCounter != sharedCounter;
            localIp65504P2461LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2461_L_LEN = 2;
  	/**
	 * serializeIp65504P2461L
	 */
	protected void serializeIp65504P2461L(short ip65504P2461L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2461L,IP_65504_P_2461_L_LEN)
                  ,beginIp65504P2461L
                  ,IP_65504_P_2461_L_LEN
                 );
            localIp65504P2461LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2461LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2461L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2461L() {	 
			return (getShort(beginIp65504P2461L));
   	}
         int localIp65504P2462SCounter = -1;
         public boolean isIp65504P2462SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2462SCounter != sharedCounter;
            localIp65504P2462SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2462_S_LEN = 2;
  	/**
	 * serializeIp65504P2462S
	 */
	protected void serializeIp65504P2462S(short ip65504P2462S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2462S,IP_65504_P_2462_S_LEN)
                  ,beginIp65504P2462S
                  ,IP_65504_P_2462_S_LEN
                 );
            localIp65504P2462SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2462SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2462S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2462S() {	 
			return (getShort(beginIp65504P2462S));
   	}
         int localIp65504P2462LCounter = -1;
         public boolean isIp65504P2462LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2462LCounter != sharedCounter;
            localIp65504P2462LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2462_L_LEN = 2;
  	/**
	 * serializeIp65504P2462L
	 */
	protected void serializeIp65504P2462L(short ip65504P2462L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2462L,IP_65504_P_2462_L_LEN)
                  ,beginIp65504P2462L
                  ,IP_65504_P_2462_L_LEN
                 );
            localIp65504P2462LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2462LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2462L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2462L() {	 
			return (getShort(beginIp65504P2462L));
   	}
         int localIp65504P2463SCounter = -1;
         public boolean isIp65504P2463SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2463SCounter != sharedCounter;
            localIp65504P2463SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2463_S_LEN = 2;
  	/**
	 * serializeIp65504P2463S
	 */
	protected void serializeIp65504P2463S(short ip65504P2463S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2463S,IP_65504_P_2463_S_LEN)
                  ,beginIp65504P2463S
                  ,IP_65504_P_2463_S_LEN
                 );
            localIp65504P2463SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2463SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2463S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2463S() {	 
			return (getShort(beginIp65504P2463S));
   	}
         int localIp65504P2463LCounter = -1;
         public boolean isIp65504P2463LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2463LCounter != sharedCounter;
            localIp65504P2463LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2463_L_LEN = 2;
  	/**
	 * serializeIp65504P2463L
	 */
	protected void serializeIp65504P2463L(short ip65504P2463L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2463L,IP_65504_P_2463_L_LEN)
                  ,beginIp65504P2463L
                  ,IP_65504_P_2463_L_LEN
                 );
            localIp65504P2463LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2463LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2463L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2463L() {	 
			return (getShort(beginIp65504P2463L));
   	}
         int localIp65504P2464SCounter = -1;
         public boolean isIp65504P2464SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2464SCounter != sharedCounter;
            localIp65504P2464SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2464_S_LEN = 2;
  	/**
	 * serializeIp65504P2464S
	 */
	protected void serializeIp65504P2464S(short ip65504P2464S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2464S,IP_65504_P_2464_S_LEN)
                  ,beginIp65504P2464S
                  ,IP_65504_P_2464_S_LEN
                 );
            localIp65504P2464SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2464SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2464S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2464S() {	 
			return (getShort(beginIp65504P2464S));
   	}
         int localIp65504P2464LCounter = -1;
         public boolean isIp65504P2464LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2464LCounter != sharedCounter;
            localIp65504P2464LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2464_L_LEN = 2;
  	/**
	 * serializeIp65504P2464L
	 */
	protected void serializeIp65504P2464L(short ip65504P2464L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2464L,IP_65504_P_2464_L_LEN)
                  ,beginIp65504P2464L
                  ,IP_65504_P_2464_L_LEN
                 );
            localIp65504P2464LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2464LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2464L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2464L() {	 
			return (getShort(beginIp65504P2464L));
   	}
         int localIp65504P2465SCounter = -1;
         public boolean isIp65504P2465SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2465SCounter != sharedCounter;
            localIp65504P2465SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2465_S_LEN = 2;
  	/**
	 * serializeIp65504P2465S
	 */
	protected void serializeIp65504P2465S(short ip65504P2465S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2465S,IP_65504_P_2465_S_LEN)
                  ,beginIp65504P2465S
                  ,IP_65504_P_2465_S_LEN
                 );
            localIp65504P2465SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2465SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2465S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2465S() {	 
			return (getShort(beginIp65504P2465S));
   	}
         int localIp65504P2465LCounter = -1;
         public boolean isIp65504P2465LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2465LCounter != sharedCounter;
            localIp65504P2465LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2465_L_LEN = 2;
  	/**
	 * serializeIp65504P2465L
	 */
	protected void serializeIp65504P2465L(short ip65504P2465L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2465L,IP_65504_P_2465_L_LEN)
                  ,beginIp65504P2465L
                  ,IP_65504_P_2465_L_LEN
                 );
            localIp65504P2465LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2465LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2465L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2465L() {	 
			return (getShort(beginIp65504P2465L));
   	}
         int localIp65504P2466SCounter = -1;
         public boolean isIp65504P2466SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2466SCounter != sharedCounter;
            localIp65504P2466SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2466_S_LEN = 2;
  	/**
	 * serializeIp65504P2466S
	 */
	protected void serializeIp65504P2466S(short ip65504P2466S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2466S,IP_65504_P_2466_S_LEN)
                  ,beginIp65504P2466S
                  ,IP_65504_P_2466_S_LEN
                 );
            localIp65504P2466SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2466SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2466S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2466S() {	 
			return (getShort(beginIp65504P2466S));
   	}
         int localIp65504P2466LCounter = -1;
         public boolean isIp65504P2466LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2466LCounter != sharedCounter;
            localIp65504P2466LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2466_L_LEN = 2;
  	/**
	 * serializeIp65504P2466L
	 */
	protected void serializeIp65504P2466L(short ip65504P2466L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2466L,IP_65504_P_2466_L_LEN)
                  ,beginIp65504P2466L
                  ,IP_65504_P_2466_L_LEN
                 );
            localIp65504P2466LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2466LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2466L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2466L() {	 
			return (getShort(beginIp65504P2466L));
   	}
         int localIp65504P2467SCounter = -1;
         public boolean isIp65504P2467SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2467SCounter != sharedCounter;
            localIp65504P2467SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2467_S_LEN = 2;
  	/**
	 * serializeIp65504P2467S
	 */
	protected void serializeIp65504P2467S(short ip65504P2467S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2467S,IP_65504_P_2467_S_LEN)
                  ,beginIp65504P2467S
                  ,IP_65504_P_2467_S_LEN
                 );
            localIp65504P2467SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2467SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2467S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2467S() {	 
			return (getShort(beginIp65504P2467S));
   	}
         int localIp65504P2467LCounter = -1;
         public boolean isIp65504P2467LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2467LCounter != sharedCounter;
            localIp65504P2467LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2467_L_LEN = 2;
  	/**
	 * serializeIp65504P2467L
	 */
	protected void serializeIp65504P2467L(short ip65504P2467L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2467L,IP_65504_P_2467_L_LEN)
                  ,beginIp65504P2467L
                  ,IP_65504_P_2467_L_LEN
                 );
            localIp65504P2467LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2467LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2467L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2467L() {	 
			return (getShort(beginIp65504P2467L));
   	}
         int localIp65504P2468SCounter = -1;
         public boolean isIp65504P2468SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2468SCounter != sharedCounter;
            localIp65504P2468SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2468_S_LEN = 2;
  	/**
	 * serializeIp65504P2468S
	 */
	protected void serializeIp65504P2468S(short ip65504P2468S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2468S,IP_65504_P_2468_S_LEN)
                  ,beginIp65504P2468S
                  ,IP_65504_P_2468_S_LEN
                 );
            localIp65504P2468SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2468SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2468S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2468S() {	 
			return (getShort(beginIp65504P2468S));
   	}
         int localIp65504P2468LCounter = -1;
         public boolean isIp65504P2468LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2468LCounter != sharedCounter;
            localIp65504P2468LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2468_L_LEN = 2;
  	/**
	 * serializeIp65504P2468L
	 */
	protected void serializeIp65504P2468L(short ip65504P2468L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2468L,IP_65504_P_2468_L_LEN)
                  ,beginIp65504P2468L
                  ,IP_65504_P_2468_L_LEN
                 );
            localIp65504P2468LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2468LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2468L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2468L() {	 
			return (getShort(beginIp65504P2468L));
   	}
         int localIp65504P2469SCounter = -1;
         public boolean isIp65504P2469SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2469SCounter != sharedCounter;
            localIp65504P2469SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2469_S_LEN = 2;
  	/**
	 * serializeIp65504P2469S
	 */
	protected void serializeIp65504P2469S(short ip65504P2469S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2469S,IP_65504_P_2469_S_LEN)
                  ,beginIp65504P2469S
                  ,IP_65504_P_2469_S_LEN
                 );
            localIp65504P2469SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2469SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2469S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2469S() {	 
			return (getShort(beginIp65504P2469S));
   	}
         int localIp65504P2469LCounter = -1;
         public boolean isIp65504P2469LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2469LCounter != sharedCounter;
            localIp65504P2469LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2469_L_LEN = 2;
  	/**
	 * serializeIp65504P2469L
	 */
	protected void serializeIp65504P2469L(short ip65504P2469L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2469L,IP_65504_P_2469_L_LEN)
                  ,beginIp65504P2469L
                  ,IP_65504_P_2469_L_LEN
                 );
            localIp65504P2469LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2469LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2469L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2469L() {	 
			return (getShort(beginIp65504P2469L));
   	}
         int localIp65504P2470SCounter = -1;
         public boolean isIp65504P2470SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2470SCounter != sharedCounter;
            localIp65504P2470SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2470_S_LEN = 2;
  	/**
	 * serializeIp65504P2470S
	 */
	protected void serializeIp65504P2470S(short ip65504P2470S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2470S,IP_65504_P_2470_S_LEN)
                  ,beginIp65504P2470S
                  ,IP_65504_P_2470_S_LEN
                 );
            localIp65504P2470SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2470SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2470S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2470S() {	 
			return (getShort(beginIp65504P2470S));
   	}
         int localIp65504P2470LCounter = -1;
         public boolean isIp65504P2470LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2470LCounter != sharedCounter;
            localIp65504P2470LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2470_L_LEN = 2;
  	/**
	 * serializeIp65504P2470L
	 */
	protected void serializeIp65504P2470L(short ip65504P2470L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2470L,IP_65504_P_2470_L_LEN)
                  ,beginIp65504P2470L
                  ,IP_65504_P_2470_L_LEN
                 );
            localIp65504P2470LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2470LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2470L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2470L() {	 
			return (getShort(beginIp65504P2470L));
   	}
         int localIp65504P2471SCounter = -1;
         public boolean isIp65504P2471SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2471SCounter != sharedCounter;
            localIp65504P2471SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2471_S_LEN = 2;
  	/**
	 * serializeIp65504P2471S
	 */
	protected void serializeIp65504P2471S(short ip65504P2471S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2471S,IP_65504_P_2471_S_LEN)
                  ,beginIp65504P2471S
                  ,IP_65504_P_2471_S_LEN
                 );
            localIp65504P2471SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2471SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2471S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2471S() {	 
			return (getShort(beginIp65504P2471S));
   	}
         int localIp65504P2471LCounter = -1;
         public boolean isIp65504P2471LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2471LCounter != sharedCounter;
            localIp65504P2471LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2471_L_LEN = 2;
  	/**
	 * serializeIp65504P2471L
	 */
	protected void serializeIp65504P2471L(short ip65504P2471L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2471L,IP_65504_P_2471_L_LEN)
                  ,beginIp65504P2471L
                  ,IP_65504_P_2471_L_LEN
                 );
            localIp65504P2471LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2471LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2471L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2471L() {	 
			return (getShort(beginIp65504P2471L));
   	}
         int localIp65504P2472SCounter = -1;
         public boolean isIp65504P2472SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2472SCounter != sharedCounter;
            localIp65504P2472SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2472_S_LEN = 2;
  	/**
	 * serializeIp65504P2472S
	 */
	protected void serializeIp65504P2472S(short ip65504P2472S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2472S,IP_65504_P_2472_S_LEN)
                  ,beginIp65504P2472S
                  ,IP_65504_P_2472_S_LEN
                 );
            localIp65504P2472SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2472SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2472S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2472S() {	 
			return (getShort(beginIp65504P2472S));
   	}
         int localIp65504P2472LCounter = -1;
         public boolean isIp65504P2472LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2472LCounter != sharedCounter;
            localIp65504P2472LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2472_L_LEN = 2;
  	/**
	 * serializeIp65504P2472L
	 */
	protected void serializeIp65504P2472L(short ip65504P2472L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2472L,IP_65504_P_2472_L_LEN)
                  ,beginIp65504P2472L
                  ,IP_65504_P_2472_L_LEN
                 );
            localIp65504P2472LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2472LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2472L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2472L() {	 
			return (getShort(beginIp65504P2472L));
   	}
         int localIp65504P2473SCounter = -1;
         public boolean isIp65504P2473SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2473SCounter != sharedCounter;
            localIp65504P2473SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2473_S_LEN = 2;
  	/**
	 * serializeIp65504P2473S
	 */
	protected void serializeIp65504P2473S(short ip65504P2473S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2473S,IP_65504_P_2473_S_LEN)
                  ,beginIp65504P2473S
                  ,IP_65504_P_2473_S_LEN
                 );
            localIp65504P2473SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2473SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2473S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2473S() {	 
			return (getShort(beginIp65504P2473S));
   	}
         int localIp65504P2473LCounter = -1;
         public boolean isIp65504P2473LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2473LCounter != sharedCounter;
            localIp65504P2473LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2473_L_LEN = 2;
  	/**
	 * serializeIp65504P2473L
	 */
	protected void serializeIp65504P2473L(short ip65504P2473L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2473L,IP_65504_P_2473_L_LEN)
                  ,beginIp65504P2473L
                  ,IP_65504_P_2473_L_LEN
                 );
            localIp65504P2473LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2473LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2473L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2473L() {	 
			return (getShort(beginIp65504P2473L));
   	}
         int localIp65504P2474SCounter = -1;
         public boolean isIp65504P2474SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2474SCounter != sharedCounter;
            localIp65504P2474SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2474_S_LEN = 2;
  	/**
	 * serializeIp65504P2474S
	 */
	protected void serializeIp65504P2474S(short ip65504P2474S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2474S,IP_65504_P_2474_S_LEN)
                  ,beginIp65504P2474S
                  ,IP_65504_P_2474_S_LEN
                 );
            localIp65504P2474SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2474SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2474S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2474S() {	 
			return (getShort(beginIp65504P2474S));
   	}
         int localIp65504P2474LCounter = -1;
         public boolean isIp65504P2474LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2474LCounter != sharedCounter;
            localIp65504P2474LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2474_L_LEN = 2;
  	/**
	 * serializeIp65504P2474L
	 */
	protected void serializeIp65504P2474L(short ip65504P2474L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2474L,IP_65504_P_2474_L_LEN)
                  ,beginIp65504P2474L
                  ,IP_65504_P_2474_L_LEN
                 );
            localIp65504P2474LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2474LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2474L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2474L() {	 
			return (getShort(beginIp65504P2474L));
   	}
         int localIp65504P2475SCounter = -1;
         public boolean isIp65504P2475SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2475SCounter != sharedCounter;
            localIp65504P2475SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2475_S_LEN = 2;
  	/**
	 * serializeIp65504P2475S
	 */
	protected void serializeIp65504P2475S(short ip65504P2475S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2475S,IP_65504_P_2475_S_LEN)
                  ,beginIp65504P2475S
                  ,IP_65504_P_2475_S_LEN
                 );
            localIp65504P2475SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2475SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2475S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2475S() {	 
			return (getShort(beginIp65504P2475S));
   	}
         int localIp65504P2475LCounter = -1;
         public boolean isIp65504P2475LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2475LCounter != sharedCounter;
            localIp65504P2475LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2475_L_LEN = 2;
  	/**
	 * serializeIp65504P2475L
	 */
	protected void serializeIp65504P2475L(short ip65504P2475L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2475L,IP_65504_P_2475_L_LEN)
                  ,beginIp65504P2475L
                  ,IP_65504_P_2475_L_LEN
                 );
            localIp65504P2475LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2475LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2475L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2475L() {	 
			return (getShort(beginIp65504P2475L));
   	}
         int localIp65504P2476SCounter = -1;
         public boolean isIp65504P2476SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2476SCounter != sharedCounter;
            localIp65504P2476SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2476_S_LEN = 2;
  	/**
	 * serializeIp65504P2476S
	 */
	protected void serializeIp65504P2476S(short ip65504P2476S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2476S,IP_65504_P_2476_S_LEN)
                  ,beginIp65504P2476S
                  ,IP_65504_P_2476_S_LEN
                 );
            localIp65504P2476SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2476SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2476S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2476S() {	 
			return (getShort(beginIp65504P2476S));
   	}
         int localIp65504P2476LCounter = -1;
         public boolean isIp65504P2476LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2476LCounter != sharedCounter;
            localIp65504P2476LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2476_L_LEN = 2;
  	/**
	 * serializeIp65504P2476L
	 */
	protected void serializeIp65504P2476L(short ip65504P2476L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2476L,IP_65504_P_2476_L_LEN)
                  ,beginIp65504P2476L
                  ,IP_65504_P_2476_L_LEN
                 );
            localIp65504P2476LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2476LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2476L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2476L() {	 
			return (getShort(beginIp65504P2476L));
   	}
         int localIp65504P2477SCounter = -1;
         public boolean isIp65504P2477SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2477SCounter != sharedCounter;
            localIp65504P2477SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2477_S_LEN = 2;
  	/**
	 * serializeIp65504P2477S
	 */
	protected void serializeIp65504P2477S(short ip65504P2477S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2477S,IP_65504_P_2477_S_LEN)
                  ,beginIp65504P2477S
                  ,IP_65504_P_2477_S_LEN
                 );
            localIp65504P2477SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2477SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2477S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2477S() {	 
			return (getShort(beginIp65504P2477S));
   	}
         int localIp65504P2477LCounter = -1;
         public boolean isIp65504P2477LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2477LCounter != sharedCounter;
            localIp65504P2477LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2477_L_LEN = 2;
  	/**
	 * serializeIp65504P2477L
	 */
	protected void serializeIp65504P2477L(short ip65504P2477L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2477L,IP_65504_P_2477_L_LEN)
                  ,beginIp65504P2477L
                  ,IP_65504_P_2477_L_LEN
                 );
            localIp65504P2477LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2477LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2477L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2477L() {	 
			return (getShort(beginIp65504P2477L));
   	}
         int localIp65504P2478SCounter = -1;
         public boolean isIp65504P2478SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2478SCounter != sharedCounter;
            localIp65504P2478SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2478_S_LEN = 2;
  	/**
	 * serializeIp65504P2478S
	 */
	protected void serializeIp65504P2478S(short ip65504P2478S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2478S,IP_65504_P_2478_S_LEN)
                  ,beginIp65504P2478S
                  ,IP_65504_P_2478_S_LEN
                 );
            localIp65504P2478SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2478SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2478S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2478S() {	 
			return (getShort(beginIp65504P2478S));
   	}
         int localIp65504P2478LCounter = -1;
         public boolean isIp65504P2478LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2478LCounter != sharedCounter;
            localIp65504P2478LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2478_L_LEN = 2;
  	/**
	 * serializeIp65504P2478L
	 */
	protected void serializeIp65504P2478L(short ip65504P2478L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2478L,IP_65504_P_2478_L_LEN)
                  ,beginIp65504P2478L
                  ,IP_65504_P_2478_L_LEN
                 );
            localIp65504P2478LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2478LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2478L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2478L() {	 
			return (getShort(beginIp65504P2478L));
   	}
         int localIp65504P2479SCounter = -1;
         public boolean isIp65504P2479SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2479SCounter != sharedCounter;
            localIp65504P2479SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2479_S_LEN = 2;
  	/**
	 * serializeIp65504P2479S
	 */
	protected void serializeIp65504P2479S(short ip65504P2479S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2479S,IP_65504_P_2479_S_LEN)
                  ,beginIp65504P2479S
                  ,IP_65504_P_2479_S_LEN
                 );
            localIp65504P2479SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2479SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2479S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2479S() {	 
			return (getShort(beginIp65504P2479S));
   	}
         int localIp65504P2479LCounter = -1;
         public boolean isIp65504P2479LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2479LCounter != sharedCounter;
            localIp65504P2479LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2479_L_LEN = 2;
  	/**
	 * serializeIp65504P2479L
	 */
	protected void serializeIp65504P2479L(short ip65504P2479L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2479L,IP_65504_P_2479_L_LEN)
                  ,beginIp65504P2479L
                  ,IP_65504_P_2479_L_LEN
                 );
            localIp65504P2479LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2479LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2479L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2479L() {	 
			return (getShort(beginIp65504P2479L));
   	}
         int localIp65504P2480SCounter = -1;
         public boolean isIp65504P2480SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2480SCounter != sharedCounter;
            localIp65504P2480SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2480_S_LEN = 2;
  	/**
	 * serializeIp65504P2480S
	 */
	protected void serializeIp65504P2480S(short ip65504P2480S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2480S,IP_65504_P_2480_S_LEN)
                  ,beginIp65504P2480S
                  ,IP_65504_P_2480_S_LEN
                 );
            localIp65504P2480SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2480SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2480S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2480S() {	 
			return (getShort(beginIp65504P2480S));
   	}
         int localIp65504P2480LCounter = -1;
         public boolean isIp65504P2480LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2480LCounter != sharedCounter;
            localIp65504P2480LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2480_L_LEN = 2;
  	/**
	 * serializeIp65504P2480L
	 */
	protected void serializeIp65504P2480L(short ip65504P2480L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2480L,IP_65504_P_2480_L_LEN)
                  ,beginIp65504P2480L
                  ,IP_65504_P_2480_L_LEN
                 );
            localIp65504P2480LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2480LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2480L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2480L() {	 
			return (getShort(beginIp65504P2480L));
   	}




}
  
