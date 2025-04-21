package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup78Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup78Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup78Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_78_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2388S;
            protected  int beginIp65504P2388L;
            protected  int beginIp65504P2389S;
            protected  int beginIp65504P2389L;
            protected  int beginIp65504P2390S;
            protected  int beginIp65504P2390L;
            protected  int beginIp65504P2391S;
            protected  int beginIp65504P2391L;
            protected  int beginIp65504P2392S;
            protected  int beginIp65504P2392L;
            protected  int beginIp65504P2393S;
            protected  int beginIp65504P2393L;
            protected  int beginIp65504P2394S;
            protected  int beginIp65504P2394L;
            protected  int beginIp65504P2395S;
            protected  int beginIp65504P2395L;
            protected  int beginIp65504P2396S;
            protected  int beginIp65504P2396L;
            protected  int beginIp65504P2397S;
            protected  int beginIp65504P2397L;
            protected  int beginIp65504P2398S;
            protected  int beginIp65504P2398L;
            protected  int beginIp65504P2399S;
            protected  int beginIp65504P2399L;
            protected  int beginIp65504P2400S;
            protected  int beginIp65504P2400L;
            protected  int beginIp65504P2401S;
            protected  int beginIp65504P2401L;
            protected  int beginIp65504P2402S;
            protected  int beginIp65504P2402L;
            protected  int beginIp65504P2403S;
            protected  int beginIp65504P2403L;
            protected  int beginIp65504P2404S;
            protected  int beginIp65504P2404L;
            protected  int beginIp65504P2405S;
            protected  int beginIp65504P2405L;
            protected  int beginIp65504P2406S;
            protected  int beginIp65504P2406L;
            protected  int beginIp65504P2407S;
            protected  int beginIp65504P2407L;
            protected  int beginIp65504P2408S;
            protected  int beginIp65504P2408L;
            protected  int beginIp65504P2409S;
            protected  int beginIp65504P2409L;
            protected  int beginIp65504P2410S;
            protected  int beginIp65504P2410L;
            protected  int beginIp65504P2411S;
            protected  int beginIp65504P2411L;
            protected  int beginIp65504P2412S;
            protected  int beginIp65504P2412L;
            protected  int beginIp65504P2413S;
            protected  int beginIp65504P2413L;
            protected  int beginIp65504P2414S;
            protected  int beginIp65504P2414L;
            protected  int beginIp65504P2415S;
            protected  int beginIp65504P2415L;
            protected  int beginIp65504P2416S;
            protected  int beginIp65504P2416L;
            protected  int beginIp65504P2417S;
            protected  int beginIp65504P2417L;
            protected  int beginIp65504P2418S;
            protected  int beginIp65504P2418L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup78Serialized
	**/
    public Ip65504PdsNamesLargeGroup78Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup78Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup78Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup78Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19092); // serialize this field at offset 19092 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup78Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19092 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup78Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_78_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2388S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2388L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2389S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2389L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2390S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2390L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2391S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2391L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2392S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2392L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2393S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2393L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2394S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2394L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2395S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2395L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2396S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2396L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2397S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2397L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2398S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2398L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2399S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2399L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2400S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2400L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2401S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2401L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2402S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2402L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2403S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2403L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2404S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2404L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2405S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2405L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2406S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2406L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2407S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2407L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2408S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2408L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2409S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2409L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2410S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2410L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2411S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2411L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2412S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2412L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2413S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2413L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2414S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2414L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2415S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2415L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2416S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2416L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2417S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2417L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2418S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2418L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2388SCounter = -1;
         public boolean isIp65504P2388SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2388SCounter != sharedCounter;
            localIp65504P2388SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2388_S_LEN = 2;
  	/**
	 * serializeIp65504P2388S
	 */
	protected void serializeIp65504P2388S(short ip65504P2388S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2388S,IP_65504_P_2388_S_LEN)
                  ,beginIp65504P2388S
                  ,IP_65504_P_2388_S_LEN
                 );
            localIp65504P2388SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2388SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2388S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2388S() {	 
			return (getShort(beginIp65504P2388S));
   	}
         int localIp65504P2388LCounter = -1;
         public boolean isIp65504P2388LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2388LCounter != sharedCounter;
            localIp65504P2388LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2388_L_LEN = 2;
  	/**
	 * serializeIp65504P2388L
	 */
	protected void serializeIp65504P2388L(short ip65504P2388L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2388L,IP_65504_P_2388_L_LEN)
                  ,beginIp65504P2388L
                  ,IP_65504_P_2388_L_LEN
                 );
            localIp65504P2388LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2388LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2388L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2388L() {	 
			return (getShort(beginIp65504P2388L));
   	}
         int localIp65504P2389SCounter = -1;
         public boolean isIp65504P2389SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2389SCounter != sharedCounter;
            localIp65504P2389SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2389_S_LEN = 2;
  	/**
	 * serializeIp65504P2389S
	 */
	protected void serializeIp65504P2389S(short ip65504P2389S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2389S,IP_65504_P_2389_S_LEN)
                  ,beginIp65504P2389S
                  ,IP_65504_P_2389_S_LEN
                 );
            localIp65504P2389SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2389SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2389S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2389S() {	 
			return (getShort(beginIp65504P2389S));
   	}
         int localIp65504P2389LCounter = -1;
         public boolean isIp65504P2389LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2389LCounter != sharedCounter;
            localIp65504P2389LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2389_L_LEN = 2;
  	/**
	 * serializeIp65504P2389L
	 */
	protected void serializeIp65504P2389L(short ip65504P2389L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2389L,IP_65504_P_2389_L_LEN)
                  ,beginIp65504P2389L
                  ,IP_65504_P_2389_L_LEN
                 );
            localIp65504P2389LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2389LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2389L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2389L() {	 
			return (getShort(beginIp65504P2389L));
   	}
         int localIp65504P2390SCounter = -1;
         public boolean isIp65504P2390SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2390SCounter != sharedCounter;
            localIp65504P2390SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2390_S_LEN = 2;
  	/**
	 * serializeIp65504P2390S
	 */
	protected void serializeIp65504P2390S(short ip65504P2390S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2390S,IP_65504_P_2390_S_LEN)
                  ,beginIp65504P2390S
                  ,IP_65504_P_2390_S_LEN
                 );
            localIp65504P2390SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2390SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2390S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2390S() {	 
			return (getShort(beginIp65504P2390S));
   	}
         int localIp65504P2390LCounter = -1;
         public boolean isIp65504P2390LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2390LCounter != sharedCounter;
            localIp65504P2390LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2390_L_LEN = 2;
  	/**
	 * serializeIp65504P2390L
	 */
	protected void serializeIp65504P2390L(short ip65504P2390L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2390L,IP_65504_P_2390_L_LEN)
                  ,beginIp65504P2390L
                  ,IP_65504_P_2390_L_LEN
                 );
            localIp65504P2390LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2390LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2390L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2390L() {	 
			return (getShort(beginIp65504P2390L));
   	}
         int localIp65504P2391SCounter = -1;
         public boolean isIp65504P2391SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2391SCounter != sharedCounter;
            localIp65504P2391SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2391_S_LEN = 2;
  	/**
	 * serializeIp65504P2391S
	 */
	protected void serializeIp65504P2391S(short ip65504P2391S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2391S,IP_65504_P_2391_S_LEN)
                  ,beginIp65504P2391S
                  ,IP_65504_P_2391_S_LEN
                 );
            localIp65504P2391SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2391SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2391S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2391S() {	 
			return (getShort(beginIp65504P2391S));
   	}
         int localIp65504P2391LCounter = -1;
         public boolean isIp65504P2391LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2391LCounter != sharedCounter;
            localIp65504P2391LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2391_L_LEN = 2;
  	/**
	 * serializeIp65504P2391L
	 */
	protected void serializeIp65504P2391L(short ip65504P2391L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2391L,IP_65504_P_2391_L_LEN)
                  ,beginIp65504P2391L
                  ,IP_65504_P_2391_L_LEN
                 );
            localIp65504P2391LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2391LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2391L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2391L() {	 
			return (getShort(beginIp65504P2391L));
   	}
         int localIp65504P2392SCounter = -1;
         public boolean isIp65504P2392SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2392SCounter != sharedCounter;
            localIp65504P2392SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2392_S_LEN = 2;
  	/**
	 * serializeIp65504P2392S
	 */
	protected void serializeIp65504P2392S(short ip65504P2392S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2392S,IP_65504_P_2392_S_LEN)
                  ,beginIp65504P2392S
                  ,IP_65504_P_2392_S_LEN
                 );
            localIp65504P2392SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2392SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2392S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2392S() {	 
			return (getShort(beginIp65504P2392S));
   	}
         int localIp65504P2392LCounter = -1;
         public boolean isIp65504P2392LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2392LCounter != sharedCounter;
            localIp65504P2392LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2392_L_LEN = 2;
  	/**
	 * serializeIp65504P2392L
	 */
	protected void serializeIp65504P2392L(short ip65504P2392L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2392L,IP_65504_P_2392_L_LEN)
                  ,beginIp65504P2392L
                  ,IP_65504_P_2392_L_LEN
                 );
            localIp65504P2392LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2392LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2392L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2392L() {	 
			return (getShort(beginIp65504P2392L));
   	}
         int localIp65504P2393SCounter = -1;
         public boolean isIp65504P2393SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2393SCounter != sharedCounter;
            localIp65504P2393SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2393_S_LEN = 2;
  	/**
	 * serializeIp65504P2393S
	 */
	protected void serializeIp65504P2393S(short ip65504P2393S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2393S,IP_65504_P_2393_S_LEN)
                  ,beginIp65504P2393S
                  ,IP_65504_P_2393_S_LEN
                 );
            localIp65504P2393SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2393SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2393S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2393S() {	 
			return (getShort(beginIp65504P2393S));
   	}
         int localIp65504P2393LCounter = -1;
         public boolean isIp65504P2393LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2393LCounter != sharedCounter;
            localIp65504P2393LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2393_L_LEN = 2;
  	/**
	 * serializeIp65504P2393L
	 */
	protected void serializeIp65504P2393L(short ip65504P2393L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2393L,IP_65504_P_2393_L_LEN)
                  ,beginIp65504P2393L
                  ,IP_65504_P_2393_L_LEN
                 );
            localIp65504P2393LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2393LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2393L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2393L() {	 
			return (getShort(beginIp65504P2393L));
   	}
         int localIp65504P2394SCounter = -1;
         public boolean isIp65504P2394SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2394SCounter != sharedCounter;
            localIp65504P2394SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2394_S_LEN = 2;
  	/**
	 * serializeIp65504P2394S
	 */
	protected void serializeIp65504P2394S(short ip65504P2394S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2394S,IP_65504_P_2394_S_LEN)
                  ,beginIp65504P2394S
                  ,IP_65504_P_2394_S_LEN
                 );
            localIp65504P2394SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2394SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2394S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2394S() {	 
			return (getShort(beginIp65504P2394S));
   	}
         int localIp65504P2394LCounter = -1;
         public boolean isIp65504P2394LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2394LCounter != sharedCounter;
            localIp65504P2394LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2394_L_LEN = 2;
  	/**
	 * serializeIp65504P2394L
	 */
	protected void serializeIp65504P2394L(short ip65504P2394L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2394L,IP_65504_P_2394_L_LEN)
                  ,beginIp65504P2394L
                  ,IP_65504_P_2394_L_LEN
                 );
            localIp65504P2394LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2394LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2394L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2394L() {	 
			return (getShort(beginIp65504P2394L));
   	}
         int localIp65504P2395SCounter = -1;
         public boolean isIp65504P2395SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2395SCounter != sharedCounter;
            localIp65504P2395SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2395_S_LEN = 2;
  	/**
	 * serializeIp65504P2395S
	 */
	protected void serializeIp65504P2395S(short ip65504P2395S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2395S,IP_65504_P_2395_S_LEN)
                  ,beginIp65504P2395S
                  ,IP_65504_P_2395_S_LEN
                 );
            localIp65504P2395SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2395SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2395S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2395S() {	 
			return (getShort(beginIp65504P2395S));
   	}
         int localIp65504P2395LCounter = -1;
         public boolean isIp65504P2395LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2395LCounter != sharedCounter;
            localIp65504P2395LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2395_L_LEN = 2;
  	/**
	 * serializeIp65504P2395L
	 */
	protected void serializeIp65504P2395L(short ip65504P2395L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2395L,IP_65504_P_2395_L_LEN)
                  ,beginIp65504P2395L
                  ,IP_65504_P_2395_L_LEN
                 );
            localIp65504P2395LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2395LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2395L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2395L() {	 
			return (getShort(beginIp65504P2395L));
   	}
         int localIp65504P2396SCounter = -1;
         public boolean isIp65504P2396SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2396SCounter != sharedCounter;
            localIp65504P2396SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2396_S_LEN = 2;
  	/**
	 * serializeIp65504P2396S
	 */
	protected void serializeIp65504P2396S(short ip65504P2396S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2396S,IP_65504_P_2396_S_LEN)
                  ,beginIp65504P2396S
                  ,IP_65504_P_2396_S_LEN
                 );
            localIp65504P2396SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2396SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2396S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2396S() {	 
			return (getShort(beginIp65504P2396S));
   	}
         int localIp65504P2396LCounter = -1;
         public boolean isIp65504P2396LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2396LCounter != sharedCounter;
            localIp65504P2396LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2396_L_LEN = 2;
  	/**
	 * serializeIp65504P2396L
	 */
	protected void serializeIp65504P2396L(short ip65504P2396L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2396L,IP_65504_P_2396_L_LEN)
                  ,beginIp65504P2396L
                  ,IP_65504_P_2396_L_LEN
                 );
            localIp65504P2396LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2396LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2396L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2396L() {	 
			return (getShort(beginIp65504P2396L));
   	}
         int localIp65504P2397SCounter = -1;
         public boolean isIp65504P2397SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2397SCounter != sharedCounter;
            localIp65504P2397SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2397_S_LEN = 2;
  	/**
	 * serializeIp65504P2397S
	 */
	protected void serializeIp65504P2397S(short ip65504P2397S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2397S,IP_65504_P_2397_S_LEN)
                  ,beginIp65504P2397S
                  ,IP_65504_P_2397_S_LEN
                 );
            localIp65504P2397SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2397SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2397S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2397S() {	 
			return (getShort(beginIp65504P2397S));
   	}
         int localIp65504P2397LCounter = -1;
         public boolean isIp65504P2397LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2397LCounter != sharedCounter;
            localIp65504P2397LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2397_L_LEN = 2;
  	/**
	 * serializeIp65504P2397L
	 */
	protected void serializeIp65504P2397L(short ip65504P2397L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2397L,IP_65504_P_2397_L_LEN)
                  ,beginIp65504P2397L
                  ,IP_65504_P_2397_L_LEN
                 );
            localIp65504P2397LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2397LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2397L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2397L() {	 
			return (getShort(beginIp65504P2397L));
   	}
         int localIp65504P2398SCounter = -1;
         public boolean isIp65504P2398SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2398SCounter != sharedCounter;
            localIp65504P2398SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2398_S_LEN = 2;
  	/**
	 * serializeIp65504P2398S
	 */
	protected void serializeIp65504P2398S(short ip65504P2398S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2398S,IP_65504_P_2398_S_LEN)
                  ,beginIp65504P2398S
                  ,IP_65504_P_2398_S_LEN
                 );
            localIp65504P2398SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2398SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2398S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2398S() {	 
			return (getShort(beginIp65504P2398S));
   	}
         int localIp65504P2398LCounter = -1;
         public boolean isIp65504P2398LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2398LCounter != sharedCounter;
            localIp65504P2398LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2398_L_LEN = 2;
  	/**
	 * serializeIp65504P2398L
	 */
	protected void serializeIp65504P2398L(short ip65504P2398L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2398L,IP_65504_P_2398_L_LEN)
                  ,beginIp65504P2398L
                  ,IP_65504_P_2398_L_LEN
                 );
            localIp65504P2398LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2398LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2398L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2398L() {	 
			return (getShort(beginIp65504P2398L));
   	}
         int localIp65504P2399SCounter = -1;
         public boolean isIp65504P2399SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2399SCounter != sharedCounter;
            localIp65504P2399SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2399_S_LEN = 2;
  	/**
	 * serializeIp65504P2399S
	 */
	protected void serializeIp65504P2399S(short ip65504P2399S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2399S,IP_65504_P_2399_S_LEN)
                  ,beginIp65504P2399S
                  ,IP_65504_P_2399_S_LEN
                 );
            localIp65504P2399SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2399SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2399S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2399S() {	 
			return (getShort(beginIp65504P2399S));
   	}
         int localIp65504P2399LCounter = -1;
         public boolean isIp65504P2399LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2399LCounter != sharedCounter;
            localIp65504P2399LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2399_L_LEN = 2;
  	/**
	 * serializeIp65504P2399L
	 */
	protected void serializeIp65504P2399L(short ip65504P2399L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2399L,IP_65504_P_2399_L_LEN)
                  ,beginIp65504P2399L
                  ,IP_65504_P_2399_L_LEN
                 );
            localIp65504P2399LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2399LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2399L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2399L() {	 
			return (getShort(beginIp65504P2399L));
   	}
         int localIp65504P2400SCounter = -1;
         public boolean isIp65504P2400SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2400SCounter != sharedCounter;
            localIp65504P2400SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2400_S_LEN = 2;
  	/**
	 * serializeIp65504P2400S
	 */
	protected void serializeIp65504P2400S(short ip65504P2400S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2400S,IP_65504_P_2400_S_LEN)
                  ,beginIp65504P2400S
                  ,IP_65504_P_2400_S_LEN
                 );
            localIp65504P2400SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2400SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2400S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2400S() {	 
			return (getShort(beginIp65504P2400S));
   	}
         int localIp65504P2400LCounter = -1;
         public boolean isIp65504P2400LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2400LCounter != sharedCounter;
            localIp65504P2400LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2400_L_LEN = 2;
  	/**
	 * serializeIp65504P2400L
	 */
	protected void serializeIp65504P2400L(short ip65504P2400L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2400L,IP_65504_P_2400_L_LEN)
                  ,beginIp65504P2400L
                  ,IP_65504_P_2400_L_LEN
                 );
            localIp65504P2400LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2400LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2400L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2400L() {	 
			return (getShort(beginIp65504P2400L));
   	}
         int localIp65504P2401SCounter = -1;
         public boolean isIp65504P2401SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2401SCounter != sharedCounter;
            localIp65504P2401SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2401_S_LEN = 2;
  	/**
	 * serializeIp65504P2401S
	 */
	protected void serializeIp65504P2401S(short ip65504P2401S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2401S,IP_65504_P_2401_S_LEN)
                  ,beginIp65504P2401S
                  ,IP_65504_P_2401_S_LEN
                 );
            localIp65504P2401SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2401SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2401S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2401S() {	 
			return (getShort(beginIp65504P2401S));
   	}
         int localIp65504P2401LCounter = -1;
         public boolean isIp65504P2401LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2401LCounter != sharedCounter;
            localIp65504P2401LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2401_L_LEN = 2;
  	/**
	 * serializeIp65504P2401L
	 */
	protected void serializeIp65504P2401L(short ip65504P2401L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2401L,IP_65504_P_2401_L_LEN)
                  ,beginIp65504P2401L
                  ,IP_65504_P_2401_L_LEN
                 );
            localIp65504P2401LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2401LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2401L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2401L() {	 
			return (getShort(beginIp65504P2401L));
   	}
         int localIp65504P2402SCounter = -1;
         public boolean isIp65504P2402SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2402SCounter != sharedCounter;
            localIp65504P2402SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2402_S_LEN = 2;
  	/**
	 * serializeIp65504P2402S
	 */
	protected void serializeIp65504P2402S(short ip65504P2402S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2402S,IP_65504_P_2402_S_LEN)
                  ,beginIp65504P2402S
                  ,IP_65504_P_2402_S_LEN
                 );
            localIp65504P2402SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2402SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2402S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2402S() {	 
			return (getShort(beginIp65504P2402S));
   	}
         int localIp65504P2402LCounter = -1;
         public boolean isIp65504P2402LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2402LCounter != sharedCounter;
            localIp65504P2402LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2402_L_LEN = 2;
  	/**
	 * serializeIp65504P2402L
	 */
	protected void serializeIp65504P2402L(short ip65504P2402L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2402L,IP_65504_P_2402_L_LEN)
                  ,beginIp65504P2402L
                  ,IP_65504_P_2402_L_LEN
                 );
            localIp65504P2402LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2402LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2402L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2402L() {	 
			return (getShort(beginIp65504P2402L));
   	}
         int localIp65504P2403SCounter = -1;
         public boolean isIp65504P2403SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2403SCounter != sharedCounter;
            localIp65504P2403SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2403_S_LEN = 2;
  	/**
	 * serializeIp65504P2403S
	 */
	protected void serializeIp65504P2403S(short ip65504P2403S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2403S,IP_65504_P_2403_S_LEN)
                  ,beginIp65504P2403S
                  ,IP_65504_P_2403_S_LEN
                 );
            localIp65504P2403SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2403SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2403S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2403S() {	 
			return (getShort(beginIp65504P2403S));
   	}
         int localIp65504P2403LCounter = -1;
         public boolean isIp65504P2403LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2403LCounter != sharedCounter;
            localIp65504P2403LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2403_L_LEN = 2;
  	/**
	 * serializeIp65504P2403L
	 */
	protected void serializeIp65504P2403L(short ip65504P2403L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2403L,IP_65504_P_2403_L_LEN)
                  ,beginIp65504P2403L
                  ,IP_65504_P_2403_L_LEN
                 );
            localIp65504P2403LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2403LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2403L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2403L() {	 
			return (getShort(beginIp65504P2403L));
   	}
         int localIp65504P2404SCounter = -1;
         public boolean isIp65504P2404SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2404SCounter != sharedCounter;
            localIp65504P2404SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2404_S_LEN = 2;
  	/**
	 * serializeIp65504P2404S
	 */
	protected void serializeIp65504P2404S(short ip65504P2404S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2404S,IP_65504_P_2404_S_LEN)
                  ,beginIp65504P2404S
                  ,IP_65504_P_2404_S_LEN
                 );
            localIp65504P2404SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2404SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2404S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2404S() {	 
			return (getShort(beginIp65504P2404S));
   	}
         int localIp65504P2404LCounter = -1;
         public boolean isIp65504P2404LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2404LCounter != sharedCounter;
            localIp65504P2404LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2404_L_LEN = 2;
  	/**
	 * serializeIp65504P2404L
	 */
	protected void serializeIp65504P2404L(short ip65504P2404L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2404L,IP_65504_P_2404_L_LEN)
                  ,beginIp65504P2404L
                  ,IP_65504_P_2404_L_LEN
                 );
            localIp65504P2404LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2404LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2404L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2404L() {	 
			return (getShort(beginIp65504P2404L));
   	}
         int localIp65504P2405SCounter = -1;
         public boolean isIp65504P2405SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2405SCounter != sharedCounter;
            localIp65504P2405SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2405_S_LEN = 2;
  	/**
	 * serializeIp65504P2405S
	 */
	protected void serializeIp65504P2405S(short ip65504P2405S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2405S,IP_65504_P_2405_S_LEN)
                  ,beginIp65504P2405S
                  ,IP_65504_P_2405_S_LEN
                 );
            localIp65504P2405SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2405SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2405S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2405S() {	 
			return (getShort(beginIp65504P2405S));
   	}
         int localIp65504P2405LCounter = -1;
         public boolean isIp65504P2405LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2405LCounter != sharedCounter;
            localIp65504P2405LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2405_L_LEN = 2;
  	/**
	 * serializeIp65504P2405L
	 */
	protected void serializeIp65504P2405L(short ip65504P2405L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2405L,IP_65504_P_2405_L_LEN)
                  ,beginIp65504P2405L
                  ,IP_65504_P_2405_L_LEN
                 );
            localIp65504P2405LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2405LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2405L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2405L() {	 
			return (getShort(beginIp65504P2405L));
   	}
         int localIp65504P2406SCounter = -1;
         public boolean isIp65504P2406SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2406SCounter != sharedCounter;
            localIp65504P2406SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2406_S_LEN = 2;
  	/**
	 * serializeIp65504P2406S
	 */
	protected void serializeIp65504P2406S(short ip65504P2406S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2406S,IP_65504_P_2406_S_LEN)
                  ,beginIp65504P2406S
                  ,IP_65504_P_2406_S_LEN
                 );
            localIp65504P2406SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2406SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2406S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2406S() {	 
			return (getShort(beginIp65504P2406S));
   	}
         int localIp65504P2406LCounter = -1;
         public boolean isIp65504P2406LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2406LCounter != sharedCounter;
            localIp65504P2406LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2406_L_LEN = 2;
  	/**
	 * serializeIp65504P2406L
	 */
	protected void serializeIp65504P2406L(short ip65504P2406L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2406L,IP_65504_P_2406_L_LEN)
                  ,beginIp65504P2406L
                  ,IP_65504_P_2406_L_LEN
                 );
            localIp65504P2406LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2406LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2406L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2406L() {	 
			return (getShort(beginIp65504P2406L));
   	}
         int localIp65504P2407SCounter = -1;
         public boolean isIp65504P2407SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2407SCounter != sharedCounter;
            localIp65504P2407SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2407_S_LEN = 2;
  	/**
	 * serializeIp65504P2407S
	 */
	protected void serializeIp65504P2407S(short ip65504P2407S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2407S,IP_65504_P_2407_S_LEN)
                  ,beginIp65504P2407S
                  ,IP_65504_P_2407_S_LEN
                 );
            localIp65504P2407SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2407SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2407S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2407S() {	 
			return (getShort(beginIp65504P2407S));
   	}
         int localIp65504P2407LCounter = -1;
         public boolean isIp65504P2407LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2407LCounter != sharedCounter;
            localIp65504P2407LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2407_L_LEN = 2;
  	/**
	 * serializeIp65504P2407L
	 */
	protected void serializeIp65504P2407L(short ip65504P2407L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2407L,IP_65504_P_2407_L_LEN)
                  ,beginIp65504P2407L
                  ,IP_65504_P_2407_L_LEN
                 );
            localIp65504P2407LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2407LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2407L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2407L() {	 
			return (getShort(beginIp65504P2407L));
   	}
         int localIp65504P2408SCounter = -1;
         public boolean isIp65504P2408SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2408SCounter != sharedCounter;
            localIp65504P2408SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2408_S_LEN = 2;
  	/**
	 * serializeIp65504P2408S
	 */
	protected void serializeIp65504P2408S(short ip65504P2408S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2408S,IP_65504_P_2408_S_LEN)
                  ,beginIp65504P2408S
                  ,IP_65504_P_2408_S_LEN
                 );
            localIp65504P2408SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2408SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2408S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2408S() {	 
			return (getShort(beginIp65504P2408S));
   	}
         int localIp65504P2408LCounter = -1;
         public boolean isIp65504P2408LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2408LCounter != sharedCounter;
            localIp65504P2408LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2408_L_LEN = 2;
  	/**
	 * serializeIp65504P2408L
	 */
	protected void serializeIp65504P2408L(short ip65504P2408L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2408L,IP_65504_P_2408_L_LEN)
                  ,beginIp65504P2408L
                  ,IP_65504_P_2408_L_LEN
                 );
            localIp65504P2408LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2408LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2408L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2408L() {	 
			return (getShort(beginIp65504P2408L));
   	}
         int localIp65504P2409SCounter = -1;
         public boolean isIp65504P2409SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2409SCounter != sharedCounter;
            localIp65504P2409SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2409_S_LEN = 2;
  	/**
	 * serializeIp65504P2409S
	 */
	protected void serializeIp65504P2409S(short ip65504P2409S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2409S,IP_65504_P_2409_S_LEN)
                  ,beginIp65504P2409S
                  ,IP_65504_P_2409_S_LEN
                 );
            localIp65504P2409SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2409SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2409S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2409S() {	 
			return (getShort(beginIp65504P2409S));
   	}
         int localIp65504P2409LCounter = -1;
         public boolean isIp65504P2409LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2409LCounter != sharedCounter;
            localIp65504P2409LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2409_L_LEN = 2;
  	/**
	 * serializeIp65504P2409L
	 */
	protected void serializeIp65504P2409L(short ip65504P2409L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2409L,IP_65504_P_2409_L_LEN)
                  ,beginIp65504P2409L
                  ,IP_65504_P_2409_L_LEN
                 );
            localIp65504P2409LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2409LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2409L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2409L() {	 
			return (getShort(beginIp65504P2409L));
   	}
         int localIp65504P2410SCounter = -1;
         public boolean isIp65504P2410SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2410SCounter != sharedCounter;
            localIp65504P2410SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2410_S_LEN = 2;
  	/**
	 * serializeIp65504P2410S
	 */
	protected void serializeIp65504P2410S(short ip65504P2410S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2410S,IP_65504_P_2410_S_LEN)
                  ,beginIp65504P2410S
                  ,IP_65504_P_2410_S_LEN
                 );
            localIp65504P2410SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2410SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2410S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2410S() {	 
			return (getShort(beginIp65504P2410S));
   	}
         int localIp65504P2410LCounter = -1;
         public boolean isIp65504P2410LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2410LCounter != sharedCounter;
            localIp65504P2410LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2410_L_LEN = 2;
  	/**
	 * serializeIp65504P2410L
	 */
	protected void serializeIp65504P2410L(short ip65504P2410L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2410L,IP_65504_P_2410_L_LEN)
                  ,beginIp65504P2410L
                  ,IP_65504_P_2410_L_LEN
                 );
            localIp65504P2410LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2410LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2410L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2410L() {	 
			return (getShort(beginIp65504P2410L));
   	}
         int localIp65504P2411SCounter = -1;
         public boolean isIp65504P2411SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2411SCounter != sharedCounter;
            localIp65504P2411SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2411_S_LEN = 2;
  	/**
	 * serializeIp65504P2411S
	 */
	protected void serializeIp65504P2411S(short ip65504P2411S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2411S,IP_65504_P_2411_S_LEN)
                  ,beginIp65504P2411S
                  ,IP_65504_P_2411_S_LEN
                 );
            localIp65504P2411SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2411SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2411S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2411S() {	 
			return (getShort(beginIp65504P2411S));
   	}
         int localIp65504P2411LCounter = -1;
         public boolean isIp65504P2411LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2411LCounter != sharedCounter;
            localIp65504P2411LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2411_L_LEN = 2;
  	/**
	 * serializeIp65504P2411L
	 */
	protected void serializeIp65504P2411L(short ip65504P2411L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2411L,IP_65504_P_2411_L_LEN)
                  ,beginIp65504P2411L
                  ,IP_65504_P_2411_L_LEN
                 );
            localIp65504P2411LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2411LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2411L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2411L() {	 
			return (getShort(beginIp65504P2411L));
   	}
         int localIp65504P2412SCounter = -1;
         public boolean isIp65504P2412SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2412SCounter != sharedCounter;
            localIp65504P2412SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2412_S_LEN = 2;
  	/**
	 * serializeIp65504P2412S
	 */
	protected void serializeIp65504P2412S(short ip65504P2412S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2412S,IP_65504_P_2412_S_LEN)
                  ,beginIp65504P2412S
                  ,IP_65504_P_2412_S_LEN
                 );
            localIp65504P2412SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2412SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2412S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2412S() {	 
			return (getShort(beginIp65504P2412S));
   	}
         int localIp65504P2412LCounter = -1;
         public boolean isIp65504P2412LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2412LCounter != sharedCounter;
            localIp65504P2412LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2412_L_LEN = 2;
  	/**
	 * serializeIp65504P2412L
	 */
	protected void serializeIp65504P2412L(short ip65504P2412L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2412L,IP_65504_P_2412_L_LEN)
                  ,beginIp65504P2412L
                  ,IP_65504_P_2412_L_LEN
                 );
            localIp65504P2412LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2412LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2412L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2412L() {	 
			return (getShort(beginIp65504P2412L));
   	}
         int localIp65504P2413SCounter = -1;
         public boolean isIp65504P2413SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2413SCounter != sharedCounter;
            localIp65504P2413SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2413_S_LEN = 2;
  	/**
	 * serializeIp65504P2413S
	 */
	protected void serializeIp65504P2413S(short ip65504P2413S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2413S,IP_65504_P_2413_S_LEN)
                  ,beginIp65504P2413S
                  ,IP_65504_P_2413_S_LEN
                 );
            localIp65504P2413SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2413SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2413S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2413S() {	 
			return (getShort(beginIp65504P2413S));
   	}
         int localIp65504P2413LCounter = -1;
         public boolean isIp65504P2413LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2413LCounter != sharedCounter;
            localIp65504P2413LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2413_L_LEN = 2;
  	/**
	 * serializeIp65504P2413L
	 */
	protected void serializeIp65504P2413L(short ip65504P2413L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2413L,IP_65504_P_2413_L_LEN)
                  ,beginIp65504P2413L
                  ,IP_65504_P_2413_L_LEN
                 );
            localIp65504P2413LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2413LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2413L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2413L() {	 
			return (getShort(beginIp65504P2413L));
   	}
         int localIp65504P2414SCounter = -1;
         public boolean isIp65504P2414SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2414SCounter != sharedCounter;
            localIp65504P2414SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2414_S_LEN = 2;
  	/**
	 * serializeIp65504P2414S
	 */
	protected void serializeIp65504P2414S(short ip65504P2414S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2414S,IP_65504_P_2414_S_LEN)
                  ,beginIp65504P2414S
                  ,IP_65504_P_2414_S_LEN
                 );
            localIp65504P2414SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2414SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2414S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2414S() {	 
			return (getShort(beginIp65504P2414S));
   	}
         int localIp65504P2414LCounter = -1;
         public boolean isIp65504P2414LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2414LCounter != sharedCounter;
            localIp65504P2414LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2414_L_LEN = 2;
  	/**
	 * serializeIp65504P2414L
	 */
	protected void serializeIp65504P2414L(short ip65504P2414L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2414L,IP_65504_P_2414_L_LEN)
                  ,beginIp65504P2414L
                  ,IP_65504_P_2414_L_LEN
                 );
            localIp65504P2414LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2414LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2414L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2414L() {	 
			return (getShort(beginIp65504P2414L));
   	}
         int localIp65504P2415SCounter = -1;
         public boolean isIp65504P2415SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2415SCounter != sharedCounter;
            localIp65504P2415SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2415_S_LEN = 2;
  	/**
	 * serializeIp65504P2415S
	 */
	protected void serializeIp65504P2415S(short ip65504P2415S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2415S,IP_65504_P_2415_S_LEN)
                  ,beginIp65504P2415S
                  ,IP_65504_P_2415_S_LEN
                 );
            localIp65504P2415SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2415SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2415S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2415S() {	 
			return (getShort(beginIp65504P2415S));
   	}
         int localIp65504P2415LCounter = -1;
         public boolean isIp65504P2415LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2415LCounter != sharedCounter;
            localIp65504P2415LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2415_L_LEN = 2;
  	/**
	 * serializeIp65504P2415L
	 */
	protected void serializeIp65504P2415L(short ip65504P2415L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2415L,IP_65504_P_2415_L_LEN)
                  ,beginIp65504P2415L
                  ,IP_65504_P_2415_L_LEN
                 );
            localIp65504P2415LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2415LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2415L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2415L() {	 
			return (getShort(beginIp65504P2415L));
   	}
         int localIp65504P2416SCounter = -1;
         public boolean isIp65504P2416SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2416SCounter != sharedCounter;
            localIp65504P2416SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2416_S_LEN = 2;
  	/**
	 * serializeIp65504P2416S
	 */
	protected void serializeIp65504P2416S(short ip65504P2416S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2416S,IP_65504_P_2416_S_LEN)
                  ,beginIp65504P2416S
                  ,IP_65504_P_2416_S_LEN
                 );
            localIp65504P2416SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2416SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2416S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2416S() {	 
			return (getShort(beginIp65504P2416S));
   	}
         int localIp65504P2416LCounter = -1;
         public boolean isIp65504P2416LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2416LCounter != sharedCounter;
            localIp65504P2416LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2416_L_LEN = 2;
  	/**
	 * serializeIp65504P2416L
	 */
	protected void serializeIp65504P2416L(short ip65504P2416L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2416L,IP_65504_P_2416_L_LEN)
                  ,beginIp65504P2416L
                  ,IP_65504_P_2416_L_LEN
                 );
            localIp65504P2416LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2416LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2416L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2416L() {	 
			return (getShort(beginIp65504P2416L));
   	}
         int localIp65504P2417SCounter = -1;
         public boolean isIp65504P2417SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2417SCounter != sharedCounter;
            localIp65504P2417SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2417_S_LEN = 2;
  	/**
	 * serializeIp65504P2417S
	 */
	protected void serializeIp65504P2417S(short ip65504P2417S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2417S,IP_65504_P_2417_S_LEN)
                  ,beginIp65504P2417S
                  ,IP_65504_P_2417_S_LEN
                 );
            localIp65504P2417SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2417SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2417S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2417S() {	 
			return (getShort(beginIp65504P2417S));
   	}
         int localIp65504P2417LCounter = -1;
         public boolean isIp65504P2417LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2417LCounter != sharedCounter;
            localIp65504P2417LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2417_L_LEN = 2;
  	/**
	 * serializeIp65504P2417L
	 */
	protected void serializeIp65504P2417L(short ip65504P2417L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2417L,IP_65504_P_2417_L_LEN)
                  ,beginIp65504P2417L
                  ,IP_65504_P_2417_L_LEN
                 );
            localIp65504P2417LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2417LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2417L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2417L() {	 
			return (getShort(beginIp65504P2417L));
   	}
         int localIp65504P2418SCounter = -1;
         public boolean isIp65504P2418SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2418SCounter != sharedCounter;
            localIp65504P2418SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2418_S_LEN = 2;
  	/**
	 * serializeIp65504P2418S
	 */
	protected void serializeIp65504P2418S(short ip65504P2418S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2418S,IP_65504_P_2418_S_LEN)
                  ,beginIp65504P2418S
                  ,IP_65504_P_2418_S_LEN
                 );
            localIp65504P2418SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2418SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2418S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2418S() {	 
			return (getShort(beginIp65504P2418S));
   	}
         int localIp65504P2418LCounter = -1;
         public boolean isIp65504P2418LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2418LCounter != sharedCounter;
            localIp65504P2418LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2418_L_LEN = 2;
  	/**
	 * serializeIp65504P2418L
	 */
	protected void serializeIp65504P2418L(short ip65504P2418L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2418L,IP_65504_P_2418_L_LEN)
                  ,beginIp65504P2418L
                  ,IP_65504_P_2418_L_LEN
                 );
            localIp65504P2418LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2418LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2418L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2418L() {	 
			return (getShort(beginIp65504P2418L));
   	}




}
  
